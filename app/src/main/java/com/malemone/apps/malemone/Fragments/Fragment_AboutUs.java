package com.malemone.apps.malemone.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.malemone.apps.malemone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_AboutUs extends Fragment {


    public Fragment_AboutUs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragement__about_us, container, false);
    }

}
