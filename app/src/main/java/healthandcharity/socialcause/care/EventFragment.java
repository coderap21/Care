package healthandcharity.socialcause.care;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ayush Gupta on 2/20/2017.
 */

public class EventFragment extends Fragment {

    ListView eventList;
    ArrayList<Event> events = new ArrayList<>();
    public EventFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_fragment,container,false);
        eventList = (ListView) view.findViewById(R.id.event_list);
        eventList.setAdapter(new EventAdapter(this.getActivity(),initialiseEventList()));
        return view;
    }

    ArrayList<Event> initialiseEventList(){
        String[] eventName={"Bumshum","Golagoal","jalebi Race","Fastest First"};
        String[] eventLocation = {"Hyderabad","Goa","Indore","Mumbai"};
        String[] eventCrowdNumber = {"1223","2324","43","233"};
        String[] eventDate = {"13","2","4","25"};
        String[] eventMonth = {"Jan","Feb","Mar","Aug"};
        for(int i =0;i<eventName.length;i++){
            events.add(new Event(eventName[i],eventLocation[i],eventCrowdNumber[i],eventDate[i],eventMonth[i]));
        }
        return events;
    }
}
