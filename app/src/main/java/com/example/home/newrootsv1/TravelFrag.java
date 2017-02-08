package com.example.home.newrootsv1;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.home.newrootsv1.Adapter.FragmentChanger;
import com.example.home.newrootsv1.Adapter.TravelListAdapter;

public class TravelFrag extends Fragment {

    View view;
    FragmentChanger fragmentChanger;
    ListView listView;


    String[] tour_village_name = {
            "Village Name0",
            "Village Name1",
            "Village Name2",
            "Village Name3",
            "Village Name4",
            "Village Name5",
            "Village Name6",
            "Village Name7",
            "Village Name8",
            "Village Name9"
    };

    String[] tour_place_name={
            "Welcome to ------------",
            "Welcome to ------------",
            "Welcome to ------------",
            "Welcome to ------------",
            "Welcome to ------------",
            "Welcome to ------------",
            "Welcome to ------------",
            "Welcome to ------------",
            "Welcome to ------------",
            "Welcome to ------------"


    };

    String[] tour_place_desc={
            "      This place is so and so ans so and so and so ans so and so and so ans so and so and so ans so and so",
            "      This place is so and so ans so and so and so ans so and so and so ans so and so and so ans so and so",
            "      This place is so and so ans so and so and so ans so and so and so ans so and so and so ans so and so",
            "      This place is so and so ans so and so and so ans so and so and so ans so and so and so ans so and so",
            "      This place is so and so ans so and so and so ans so and so and so ans so and so and so ans so and so",
            "      This place is so and so ans so and so and so ans so and so and so ans so and so and so ans so and so",
            "      This place is so and so ans so and so and so ans so and so and so ans so and so and so ans so and so",
            "      This place is so and so ans so and so and so ans so and so and so ans so and so and so ans so and so",
            "      This place is so and so ans so and so and so ans so and so and so ans so and so and so ans so and so",
            "      This place is so and so ans so and so and so ans so and so and so ans so and so and so ans so and so"


    };



   Integer[] tour_place_pic = {
            R.drawable.tour1,
            R.drawable.tour1,
            R.drawable.tour1,
            R.drawable.tour1,
            R.drawable.tour1,
            R.drawable.tour1,
            R.drawable.tour1,
            R.drawable.tour1,
            R.drawable.tour1,
            R.drawable.tour1
    };

    public static TravelFrag newInstance(){

        return new TravelFrag();

    }
    public TravelFrag(){

    }

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
        view = inflater.inflate(R.layout.travel_frag,container,false);

        listView = (ListView) view.findViewById(R.id.travel_list_view);
        TravelListAdapter travelListAdapter = new TravelListAdapter(getActivity(),tour_village_name,tour_place_pic,tour_place_name,tour_place_desc);

        listView.setAdapter(travelListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),tour_village_name[position],Toast.LENGTH_LONG).show();
                fragmentChanger.changeToFullScreenTravel(tour_village_name[position],tour_place_name[position],tour_place_desc[position],tour_place_pic[position]);
            }
        });


        return view;
    }



}
