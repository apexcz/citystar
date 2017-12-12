package com.example.chineduoty.aroundme.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chineduoty.aroundme.R;
import com.example.chineduoty.aroundme.fragments.EventsAroundFragment.OnListFragmentInteractionListener;
import com.example.chineduoty.aroundme.fragments.dummy.DummyContent.DummyItem;
import com.example.chineduoty.aroundme.data.models.Event;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyEventsRecyclerViewAdapter extends RecyclerView.Adapter<MyEventsRecyclerViewAdapter.EventViewHolder> {

    //private Context context;
    private List<Event> eventList;
    //private OnListFragmentInteractionListener mListener;

    public MyEventsRecyclerViewAdapter(List<Event> items){ //, OnListFragmentInteractionListener listener) {
        //this.context = context;
        eventList = items;
        //mListener = listener;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_events, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final EventViewHolder holder, int position) {
        Event event = eventList.get(position);
        String[] eventDateComponent = event.getEventDate().split(",");

        holder.textEventTitle.setText(event.getTitle());
        holder.textEventAddress.setText(event.getAddress());
        holder.textEventMonth.setText(eventDateComponent[1]);
        holder.textEventDate.setText(eventDateComponent[0]);
    }

    @Override
    public int getItemCount() {
        return (eventList == null) ? 0 : eventList.size();
    }

    public void updateEvent(List<Event> events) {
        eventList = events;
        notifyDataSetChanged();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.event_title_text)
        TextView textEventTitle;
        @BindView(R.id.event_address_text)
        TextView textEventAddress;
        @BindView(R.id.event_month)
        TextView textEventMonth;
        @BindView(R.id.event_date)
        TextView textEventDate;

        public EventViewHolder(View view) {
            super(view);
            ButterKnife.bind(this,view);
        }
    }
}
