package com.example.chineduoty.aroundme.data.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by chineduoty on 02/12/2017.
 */

@Entity(tableName = "tickets")
public class Ticket {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String ticketRef;
    public String dateCreated;
    public String description;
    public boolean isUsed;

    @Ignore
    public Ticket(String ticketRef,String dateCreated){
        // id =  UUID.randomUUID().toString();
        this(ticketRef,dateCreated,"",false);
    }

    public Ticket(String ticketRef,String dateCreated,String description,boolean isUsed){
        this.ticketRef = ticketRef;
        this.dateCreated = dateCreated;
        this.description = description;
        this.isUsed = isUsed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicketRef() {
        return ticketRef;
    }

    public void setTicketRef(String ticketRef) {
        this.ticketRef = ticketRef;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}
