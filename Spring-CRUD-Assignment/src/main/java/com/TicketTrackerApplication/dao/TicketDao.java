package com.TicketTrackerApplication.dao;

import com.TicketTrackerApplication.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketDao extends JpaRepository<Ticket, Integer> {

    @Query(value = "Select * from ticket_details where ticket_title like %:title% or ticket_description= %:title%", nativeQuery = true)
    public List<Ticket> findByTitle(@Param("title") String title);

}
