package healthandcharity.socialcause.care;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * This java file was created by Ayush Gupta.
 This file is a part of Care app.
 Care is an app developed for project in curriculum, to be submitted to
 the college. The college holds no rights, whatsoever, on the distribution
 or the modification of the content of the app in neither of the
 app GUI, the database, not the functionality.
 */

public class AboutFragment extends Fragment {
    public AboutFragment(){};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.about_fragment,container,false);
    }
}
