package healthandcharity.socialcause.care;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ayush Gupta on 2/19/2017.
 */

public class ReviewFragment extends Fragment{
    ArrayList<Review> reviewList = new ArrayList<>();
    RecyclerAdapter adapter;
    RecyclerView recyclerView;

    public ReviewFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.review_fragment,container,false);

        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_review);
        adapter = new RecyclerAdapter(reviewList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        initialiseReviews();
        return view;
    }


   void  initialiseReviews(){
        String[] users = {"Ayush","Avani","Astha","Harsh","Ayush","Avani","Astha","Harsh"};
        String[] reviews = {"One character farts glitter and another poops cupcakes. You could not ask for better in-movie metaphors.",
                "Despite the tiresome story, it's a hard film to dislike.","Exuberant, busy and sometimes funny, DreamWorks Animation's \"Trolls\" is determined to amuse.",
                "You simply will walk out -- or perhaps dance out -- of the theater feeling very happy yourself.","One character farts glitter and another poops cupcakes. You could not ask for better in-movie metaphors.",
                "Despite the tiresome story, it's a hard film to dislike.","Exuberant, busy and sometimes funny, DreamWorks Animation's \"Trolls\" is determined to amuse.",
                "You simply will walk out -- or perhaps dance out -- of the theater feeling very happy yourself."};
        for(int i =0;i<users.length;i++)
            reviewList.add(new Review(R.drawable.dummy_profile_pic,users[i],reviews[i]));

        adapter.notifyDataSetChanged();

    }
}
