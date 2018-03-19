package com.malemone.apps.malemone.Fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.malemone.apps.malemone.CustomListAdapter;
import com.malemone.apps.malemone.HomeActivity;
import com.malemone.apps.malemone.R;

public class HomeMainFragment extends Fragment {

    ListView list;
    String[] itemname = {
        "Safari",
        "Camera",
        "Global",
        "FireFox",
        "UC Browser",
        "Android Folder",
        "VLC Player",
        "Cold War"
    };

    Integer[] imgid = {
            R.drawable.hospital_icn,
            R.drawable.hospital_icn,
            R.drawable.hospital_icn,
            R.drawable.hospital_icn,
            R.drawable.hospital_icn,
            R.drawable.hospital_icn,
            R.drawable.hospital_icn,
            R.drawable.hospital_icn,
    };

    public HomeMainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_main, container, false);
    }

    @Override
    public void onViewCreated(View view,
                              Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CustomListAdapter adapter = new CustomListAdapter(new HomeActivity(), itemname, imgid);
        list = (ListView)view.findViewById(R.id.list_view_home);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String Slecteditem = itemname[+position];
                Toast.makeText(view.getContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
