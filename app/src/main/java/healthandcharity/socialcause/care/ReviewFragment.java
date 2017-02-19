package healthandcharity.socialcause.care;

import android.support.v4.app.Fragment;
import android.os.Bundle;
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
    ListView lv;
    ReviewAdapter adapter;

    public ReviewFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.review_fragment,container,false);
        lv = (ListView)view.findViewById(R.id.review_list);
        adapter = new ReviewAdapter(this.getActivity(),initialiseReviews());
        lv.setAdapter(adapter);
        return view;
    }


    ArrayList<Review> initialiseReviews(){

        String[] users = {"Ayush","Avani","Astha","Harsh","Ayush","Avani","Astha","Harsh"};
        String[] reviews = {"One character farts glitter and another poops cupcakes. You could not ask for better in-movie metaphors.",
                "Despite the tiresome story, it's a hard film to dislike.","Exuberant, busy and sometimes funny, DreamWorks Animation's \"Trolls\" is determined to amuse.",
                "You simply will walk out -- or perhaps dance out -- of the theater feeling very happy yourself.","One character farts glitter and another poops cupcakes. You could not ask for better in-movie metaphors.",
                "Despite the tiresome story, it's a hard film to dislike.","Exuberant, busy and sometimes funny, DreamWorks Animation's \"Trolls\" is determined to amuse.",
                "You simply will walk out -- or perhaps dance out -- of the theater feeling very happy yourself."};
        for(int i =0;i<users.length;i++)
            reviewList.add(new Review(R.drawable.dummy_profile_pic,users[i],reviews[i]));
        return reviewList;
    }
}
