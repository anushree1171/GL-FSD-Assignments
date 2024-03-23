package com.TicketTrackerApplication.service;

import com.TicketTrackerApplication.dao.TicketDao;
import com.TicketTrackerApplication.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{
    @Autowired
    TicketDao ticketDao;

    @Override
    public void saveTicket(Ticket ticket) {
        ticketDao.save(ticket);
    }

    @Override
    public Ticket getTicketById(int id) {
        return ticketDao.getReferenceById(id);
    }

    @Override
    public List<Ticket> getTicketByTitle(String name) {
        return ticketDao.findByTitle(name);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketDao.findAll();
    }

    @Override
    public void updateTicketById(Ticket ticket) {
        ticketDao.save(ticket);
    }

    @Override
    public void deleteTicketById(int id) {
        ticketDao.deleteById(id);
    }
}
