package com.TicketTrackerApplication.controller;

import com.TicketTrackerApplication.entity.Ticket;
import com.TicketTrackerApplication.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;

@Controller
@RequestMapping("/admin")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping({"/tickets", "/search"})
    public String newTicket(@RequestParam(value="searchString", required = false)String query,  Model model){
        if(query == null){
            model.addAttribute("allTickets", ticketService.getAllTickets());
        }
        else{
            model.addAttribute("allTickets", ticketService.getTicketByTitle(query));
        }

        return "allTickets-home";
    }

    @GetMapping("/newTicket")
    public String makeNewTicket(Model model){
        model.addAttribute("newTicket", new Ticket());
        return "createTicket";
    }

    @PostMapping("/saveTicket")
    public String saveTicket(@ModelAttribute("newTicket") Ticket ticket){
        Date date = Date.valueOf(LocalDate.now());
        ticket.setCreationDate(date);
        ticketService.saveTicket(ticket);
        return "redirect:/admin/tickets";
    }

    @GetMapping("/editTicket/{id}")
    public String editTicket(@PathVariable("id") int id, Model model){
        Ticket ticket = ticketService.getTicketById(id);
        model.addAttribute("ticketToEdit", ticket);
        return "updateTicket";
    }

    @GetMapping("/deleteTicket/{id}")
    public String deleteTicket(@PathVariable("id") int id){
        ticketService.deleteTicketById(id);
        return "redirect:/admin/tickets";
    }

    @GetMapping("/viewTicket/{id}")
    public String viewTicketById(@PathVariable("id") int id, Model model){
        model.addAttribute("ticket", ticketService.getTicketById(id));
        return "viewTicketById";
    }

}
