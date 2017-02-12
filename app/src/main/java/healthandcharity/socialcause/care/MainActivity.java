package healthandcharity.socialcause.care;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbar;

    private CollapsingToolbarLayout collapsingToolbarLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle(getResources().getString(R.string.user_name));

        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimary));
        collapsingToolbarLayout.setStatusBarScrimColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimaryDark));

        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.collapsedBar);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.expandedBar);
    }

}


