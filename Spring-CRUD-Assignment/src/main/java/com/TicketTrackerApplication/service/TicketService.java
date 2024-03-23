package com.TicketTrackerApplication.service;

import com.TicketTrackerApplication.entity.Ticket;

import java.util.List;

public interface TicketService {

    public void saveTicket(Ticket ticket);

    public Ticket getTicketById(int id);

    public List<Ticket> getTicketByTitle(String name);

    public List<Ticket> getAllTickets();

    public void updateTicketById(Ticket ticket);

    public void deleteTicketById(int id);
}
