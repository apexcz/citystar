package com.example.chineduoty.aroundme.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.chineduoty.aroundme.R;
import com.example.chineduoty.aroundme.data.models.Event;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.bclogic.pulsator4droid.library.PulsatorLayout;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class EventsAroundFragment extends Fragment {

    @BindView(R.id.events_rv)
    RecyclerView eventsRV;

    @BindView(R.id.pulsator_box)
    LinearLayout pulsatorBox;

    @BindView(R.id.pulsator)
    PulsatorLayout pulsator;

    private MyEventsRecyclerViewAdapter adapter;

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    //private OnListFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public EventsAroundFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static EventsAroundFragment newInstance(int columnCount) {
        EventsAroundFragment fragment = new EventsAroundFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_events_list, container, false);

        ButterKnife.bind(this, view);
        pulsator.start();

        eventsRV.setHasFixedSize(true);
        if (mColumnCount <= 1) {
            eventsRV.setLayoutManager(new LinearLayoutManager(getActivity()));
        } else {
            eventsRV.setLayoutManager(new GridLayoutManager(getActivity(), mColumnCount));
        }
        eventsRV.setAdapter(new MyEventsRecyclerViewAdapter(generateEvents()));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pulsatorBox.setVisibility(View.GONE);
                eventsRV.setVisibility(View.VISIBLE);
            }
        },5000);
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        //mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(Event item);
    }

    private List<Event> generateEvents() {
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            events.add(new Event("",
                    "Bristol Christmas party " + i,
                    i + " Wills Memorial Building, BS8 1TH",
                    "27,Nov"));
        }
        return events;
    }
}
