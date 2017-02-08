package com.example.home.newrootsv1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.home.newrootsv1.Adapter.FragmentChanger;

/**
 * Created by home on 17/9/16.
 */
public class ServicesAndTravelHostFrag extends Fragment {

    View view;
    FragmentChanger fragmentChanger;
    ImageButton travel;
    ImageButton services;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof FragmentChanger){
            fragmentChanger = (FragmentChanger)context;
        }
        else{
            throw new ClassCastException(context.toString()+" must implement listener");

        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflating the view and returning
        view =  inflater.inflate(R.layout.activity_services_and_travel_host_frag, container, false);

        travel = (ImageButton) view.findViewById(R.id.travel_frag_button);
        services = (ImageButton) view.findViewById(R.id.services_frag_button);


        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.changeToTravelFrag();
            }
        });

        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.changeToServicesFrag();
            }
        });



        return view;

    }




}
