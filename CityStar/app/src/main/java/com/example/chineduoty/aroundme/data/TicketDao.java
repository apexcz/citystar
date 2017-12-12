package com.example.chineduoty.aroundme.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.chineduoty.aroundme.data.models.Ticket;

import java.util.List;

/**
 * Created by chineduoty on 03/12/2017.
 */

@Dao
public interface TicketDao {

    @Query("SELECT * FROM tickets")
    List<Ticket> getTickets();

    @Query("SELECT * FROM tickets WHERE ticketRef = :ref")
    Ticket getTicketByRef(String ref);

    @Query("SELECT * FROM tickets WHERE description LIKE :keyword OR ticketRef LIKE :keyword")
    List<Ticket> searchTickets(String keyword);

    @Query("SELECT COUNT(*) FROM tickets")
    int countTickets();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTicket(Ticket ticket);

    @Update
    int updateTicket(Ticket ticket);

    @Query("UPDATE tickets SET isUsed = :used WHERE ticketRef = :ref")
    void updateUsed(String ref,boolean used);

    @Query("DELETE FROM tickets WHERE ticketRef = :ref")
    int deleteTicketByRef(String ref);

    @Query("DELETE FROM tickets")
    void deleteTickets();

}
