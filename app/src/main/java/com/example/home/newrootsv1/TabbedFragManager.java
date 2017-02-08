package com.example.home.newrootsv1;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home.newrootsv1.Adapter.Pager;

public class TabbedFragManager extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    public static TabbedFragManager newInstance(){

        return new TabbedFragManager();

    }


    public TabbedFragManager(){


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_tabbedfragmanager_frag,container,false);


        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);

        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_home_black_48dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_local_florist_black_48dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_group_black_48dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_nature_people_black_48dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_local_library_black_48dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_contacts_black_48dp));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        viewPager = (ViewPager) view.findViewById(R.id.pager);

        return view;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        Pager adapter = new Pager(getChildFragmentManager(),tabLayout.getTabCount());

        //adding adapter
        viewPager.setAdapter(adapter);

        //adding listener to tab click
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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
        });

        //adding listener to swipe
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }



}
