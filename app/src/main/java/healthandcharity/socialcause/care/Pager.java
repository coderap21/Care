package healthandcharity.socialcause.care;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Ayush Gupta on 2/16/2017.
 */

public class Pager extends FragmentStatePagerAdapter {
    int tabcount;
    Pager(FragmentManager fm,int TabCount){
        super(fm);
        this.tabcount=TabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new AboutFragment();
            case 1: return new AboutFragmentM();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
