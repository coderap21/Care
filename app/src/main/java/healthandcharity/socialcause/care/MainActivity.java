package healthandcharity.socialcause.care;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.toggle;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    ActionBarDrawerToggle actionBarDrawerToggle;
    private CollapsingToolbarLayout collapsingToolbarLayout = null;
    ViewPager viewPager;
    public static final String POST_FRAGMENT = "post_fragment";
    public static final String PHOTO_FRAGMENT = "photo_fragment";
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle toggle;
    private TabLayout tabLayout;
    private MyAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_container_view);

        mDrawerLayout= (DrawerLayout)findViewById(R.id.nav_drawer);
        String[] menu = {"Hello","Hi"};
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }
        navigationView.setItemTextColor(ColorStateList.valueOf(Color.WHITE));
        //ListView mDrawerList = (ListView)findViewById(R.id.nav_drawer_list);

        //ArrayAdapter<String> drawerAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
        //mDrawerList.setAdapter(drawerAdapter);
      /*  actionBarDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close){
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getSupportActionBar().setTitle("Navigation Drawer");
                invalidateOptionsMenu();
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle("Ayush");
            }
        };
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(actionBarDrawerToggle);
       */ //mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle(getResources().getString(R.string.user_name));

        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimary));
        collapsingToolbarLayout.setStatusBarScrimColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimaryDark));

        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.collapsedBar);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.expandedBar);

        //MLRoundedImageView user_dp = (MLRoundedImageView)findViewById(R.id.user_dp);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
       // tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        mAdapter = new MyAdapter(getSupportFragmentManager());
        ViewPager mPager = (ViewPager) findViewById(R.id.viewPager);
        mPager.setAdapter(mAdapter);
        tabLayout.setupWithViewPager(mPager);

    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        mDrawerLayout.closeDrawers();
                        menuItem.setChecked(true);
                        getSupportActionBar().setTitle(menuItem.getTitle());
                        return true;
                    }
                });
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }


    public static class MyAdapter extends FragmentStatePagerAdapter {
        private static final int NUM_ITEMS = 4;

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return new AboutFragment();
                case 1: return new AboutFragmentM();
            }
            return null;
        }

    }

}

