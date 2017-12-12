package com.example.chineduoty.aroundme.ticket;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chineduoty.aroundme.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayTicketsFragment extends Fragment {


    public DisplayTicketsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display_tickets, container, false);
    }

}
