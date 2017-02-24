package healthandcharity.socialcause.care;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * This java file was created by Ayush Gupta.
 This file is a part of Care app.
 Care is an app developed for project in curriculum, to be submitted to
 the college. The college holds no rights, whatsoever, on the distribution
 or the modification of the content of the app in neither of the
 app GUI, the database, not the functionality.
 */

public class EventFragment extends Fragment {

    ArrayList<Event> eventList = new ArrayList<>();
    EventRecyclerAdapter adapter;
    RecyclerView recyclerView;
    public EventFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_fragment,container,false);

        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_eventlist);
        adapter = new EventRecyclerAdapter(eventList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        initialiseEventList();
        return view;
    }

    ArrayList<Event> initialiseEventList(){
        String[] eventName={"Bumshum","Golagoal","jalebi Race","Fastest First"};
        String[] eventLocation = {"Hyderabad","Goa","Indore","Mumbai"};
        String[] eventCrowdNumber = {"1223","2324","43","233"};
        String[] eventDate = {"13","2","4","25"};
        String[] eventMonth = {"Jan","Feb","Mar","Aug"};
        for(int i =0;i<eventName.length;i++){
            eventList.add(new Event(eventName[i],eventLocation[i],eventCrowdNumber[i],eventDate[i],eventMonth[i]));
        }
        return eventList;
    }
}
