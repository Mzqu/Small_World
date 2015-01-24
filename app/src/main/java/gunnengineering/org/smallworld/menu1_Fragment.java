package gunnengineering.org.smallworld;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.support.annotation.Nullable;

/**
 * Created by Michael on 1/24/15.
 */
public class menu1_Fragment extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootview = inflater.inflate(R.layout.menu1_layout, container, false);
        return rootview;
    }
}
