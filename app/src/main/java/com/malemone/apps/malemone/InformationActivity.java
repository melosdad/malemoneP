package com.malemone.apps.malemone;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.malemone.apps.malemone.Fragments.InformationMainFragment;
import com.malemone.apps.malemone.Models.NearByList;
import com.malemone.apps.malemone.Models.NewsList;
import com.malemone.apps.malemone.adapters.NearByAdapter;
import com.malemone.apps.malemone.adapters.NewsAdapter;

import java.util.ArrayList;
import java.util.List;

public class InformationActivity extends BaseActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    List<NearByList> list;


    //ListView list;
    String[] itemname = {
            "Safari",
            "Camera",
            "Global",
            "FireFox",
            "UC Browser",
            "Android Folder",
            "VLC Player"
    };

    Integer[] imgid = {
            R.drawable.hospital_icn,
            R.drawable.hospital_icn,
            R.drawable.hospital_icn,
            R.drawable.hospital_icn,
            R.drawable.hospital_icn,
            R.drawable.hospital_icn,
            R.drawable.hospital_icn
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        setPageHeader();

//        fragmentManager = getFragmentManager();
//        fragmentTransaction = fragmentManager.beginTransaction();
//        fragment = new InformationMainFragment();
//        fragmentTransaction.replace(R.id.information_fragments_placeholder, fragment);
//        fragmentTransaction.commit();

       /* CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid);
        list = (ListView)findViewById(R.id.list_view_home);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String Slecteditem = itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });*/


        recyclerView = (RecyclerView) findViewById(R.id.list_view_places);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        for (int i = 0; i < itemname.length; i++) {
            NearByList data = new NearByList(imgid[i], itemname[i], "Near By", "Place");
            list.add(data);
        }

        adapter = new NearByAdapter(list, this);
        recyclerView.setAdapter(adapter);

        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    void setPageHeader() {
        pageHeader = (TextView) findViewById(R.id.page_header_title);
        pageHeader.setText(R.string.title_nearby_places);
    }

    @Override
    int getContentViewId() {
        return R.layout.activity_information;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_info;
    }
}
