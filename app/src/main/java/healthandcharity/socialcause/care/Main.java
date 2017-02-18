package healthandcharity.socialcause.care;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ayush Gupta on 2/19/2017.
 */
public class Main extends Fragment {

    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Review> reviewList = new ArrayList<>();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.review_fragment,container,false);
        recyclerView = (RecyclerView)view.findViewById(R.id.review_recycler_view);
        adapter = new RecyclerAdapter(reviewList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        initialiseReviewList();
        return view;
    }

    void initialiseReviewList(){
        String[] users = {"Ayush","Avani","Astha","Harsh","Ayush","Avani","Astha","Harsh"};
        String[] reviews = {"One character farts glitter and another poops cupcakes. You could not ask for better in-movie metaphors.",
        "Despite the tiresome story, it's a hard film to dislike.","Exuberant, busy and sometimes funny, DreamWorks Animation's \"Trolls\" is determined to amuse.",
        "You simply will walk out -- or perhaps dance out -- of the theater feeling very happy yourself.","One character farts glitter and another poops cupcakes. You could not ask for better in-movie metaphors.",
                "Despite the tiresome story, it's a hard film to dislike.","Exuberant, busy and sometimes funny, DreamWorks Animation's \"Trolls\" is determined to amuse.",
                "You simply will walk out -- or perhaps dance out -- of the theater feeling very happy yourself."};

        for(int i =0 ; i< users.length;i++){
            Review review = new Review(i,users[i],reviews[i]);
            reviewList.add(review);
        }

        adapter.notifyDataSetChanged();
    }
}
