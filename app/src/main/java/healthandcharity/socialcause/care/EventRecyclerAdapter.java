package healthandcharity.socialcause.care;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ayush Gupta on 2/19/2017.
 */

public class EventRecyclerAdapter extends RecyclerView.Adapter<EventRecyclerAdapter.EventViewHolder> {
    ArrayList<Event> eventList = new ArrayList<>();
    EventRecyclerAdapter(ArrayList<Event> eventList){
        this.eventList = eventList;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event,parent,false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        if(position%2==0)
            holder.layout.setBackgroundResource(R.color.colorPrimaryTransparent);
        else
            holder.layout.setBackgroundResource(R.color.colorAccent);

        holder.eventName.setText(eventList.get(position).getEventName());
        holder.eventLocation.setText(eventList.get(position).getEventLocation());
        holder.eventDate.setText(eventList.get(position).getEventDate());
        holder.eventCrowdNumber.setText(eventList.get(position).getEventCrowdNumber());
        holder.eventMonth.setText(eventList.get(position).getEventMonth());
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder{
        TextView eventName,eventDate,eventLocation,eventCrowdNumber,eventMonth;
        LinearLayout layout;
        EventViewHolder(View view){
            super(view);
            layout = (LinearLayout) view.findViewById(R.id.event_date_view);
            eventName = (TextView)view.findViewById(R.id.event_name);
            eventDate = (TextView) view.findViewById(R.id.event_date);
            eventMonth = (TextView) view.findViewById(R.id.event_month);
            eventLocation = (TextView) view.findViewById(R.id.event_location_textView);
            eventCrowdNumber = (TextView) view.findViewById(R.id.event_crowd_textView);
        }

    }
}
