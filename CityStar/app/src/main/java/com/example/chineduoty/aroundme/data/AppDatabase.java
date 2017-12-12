package com.example.chineduoty.aroundme.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.chineduoty.aroundme.data.models.Ticket;

/**
 * Created by chineduoty on 03/12/2017.
 */

@Database(entities = {Ticket.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE;

    public abstract TicketDao ticketDao();

    private static final Object sLock = new Object();
    public static AppDatabase getInstance(Context context){
        synchronized (sLock) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        AppDatabase.class,"citystar.db").build();
            }
            return INSTANCE;
        }
    }
}
