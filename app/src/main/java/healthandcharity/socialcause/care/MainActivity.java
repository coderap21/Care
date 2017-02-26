package healthandcharity.socialcause.care;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Ayush Gupta on 2/19/2017.
 */

public class MainActivity extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar;
    RecyclerView recyclerView;
   public  ArrayList<Donation> donationList = new ArrayList<>();
    DonationRecyclerAdapter mAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donation_history);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitle("Donation");


        collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("Donation");
        recyclerView = (RecyclerView) findViewById(R.id.donation_history_recyclerview);
        mAdapter = new DonationRecyclerAdapter(donationList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        initialiseDonationList();
    }
    void initialiseDonationList(){
        String[] organisationName = {"Bhumi","Smile","MJ Fox","Bhumi","Smile","MJ Fox","Bhumi","Smile","MJ Fox","Bhumi","Smile","MJ Fox"};
        String[] donationamount = {"23","223","13","23","223","13","23","223","13","23","223","13"};
        String[] donationStatus = {"Pending","Done","done","Pending","Done","done","Pending","Done","done","Pending","Done","done"};
        for (int i =0;i<organisationName.length;i++)
        donationList.add(new Donation(organisationName[i],donationStatus[i],donationamount[i]));
    }
}
