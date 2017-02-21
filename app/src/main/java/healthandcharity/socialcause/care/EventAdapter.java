package healthandcharity.socialcause.care;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ayush Gupta on 2/20/2017.
 */

public class EventAdapter extends BaseAdapter {
    ArrayList<Event> eventList = new ArrayList<>();
    Context context;
    LayoutInflater inflater=null;

    public EventAdapter(Context context, ArrayList<Event> eventList) {
        this.context = context;
        this.eventList = eventList;
    }

    class Holder{
        TextView eventName,eventLocation,eventCrowdNumber,eventDate,eventMonth;
    }

    @Override
    public int getCount() {
        return eventList.size();
    }

    @Override
    public Object getItem(int position) {
        return eventList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Holder holder = new Holder();
        if(inflater == null){
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        }
        if (view == null){
            view = inflater.inflate(R.layout.event,viewGroup,false);
        }


        holder.eventName = (TextView)view.findViewById(R.id.event_name);
        holder.eventLocation = (TextView) view.findViewById(R.id.event_location_textView);
        holder.eventCrowdNumber =(TextView)view.findViewById(R.id.event_crowd_textView);
        //holder.eventDate = (TextView)view.findViewById(R.id.event_date);
        //holder.eventMonth = (TextView)view.findViewById(R.id.event_month);

        holder.eventName.setText(eventList.get(position).getEventName());
        holder.eventLocation.setText(eventList.get(position).getEventLocation());
        holder.eventCrowdNumber.setText(eventList.get(position).getEventCrowdNumber());
        //holder.eventDate.setText(eventList.get(position).getEventDate());
        //holder.eventMonth.setText(eventList.get(position).getEventMonth());

        return view;
    }
}
