package com.example.home.newrootsv1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.example.home.newrootsv1.Adapter.FragmentChanger;
import com.example.home.newrootsv1.Adapter.ServicesListAdapter;


public class ServicesFrag extends Fragment {

    View view;
    FragmentChanger fragmentChanger;
    ListView listView;
    ImageButton postServicesButton;

    String[] servicesHead={
            "Services1 Heading .....",
            "Services2 Heading .....",
            "Services3 Heading .....",
            "Services4 Heading .....",
            "Services5 Heading .....",
            "Services6 Heading .....",
            "Services7 Heading .....",
            "Services8 Heading .....",
            "Services9 Heading .....",
            "Services10 Heading ....."

    };

    String[] servicesDesc={
            "      This services1 is based on so and so..................",
            "      This services2 is based on so and so..................",
            "      This services3 is based on so and so..................",
            "      This services4 is based on so and so..................",
            "      This services5 is based on so and so..................",
            "      This services6 is based on so and so..................",
            "      This services7 is based on so and so..................",
            "      This services8 is based on so and so..................",
            "      This services9 is based on so and so..................",
            "      This services10 is based on so and so.................."

    };

    String[] servicesDate = {
            "Sept 24 2016",
            "Sept 24 2016",
            "Sept 24 2016",
            "Sept 24 2016",
            "Sept 24 2016",
            "Sept 24 2016",
            "Sept 24 2016",
            "Sept 24 2016",
            "Sept 24 2016",
            "Sept 24 2016"
    };

    Integer[] imgID = {
            R.drawable.ic_nature_people_black_48dp,
            R.drawable.ic_contacts_black_48dp,
            R.drawable.ic_audiotrack_black_24dp,
            R.drawable.ic_group_black_48dp,
            R.drawable.ic_mic_black_24dp,
            R.drawable.ic_videocam_black_24dp,
            R.drawable.ic_home_black_48dp,
            R.drawable.ic_nature_people_black_48dp,
            R.drawable.ic_contacts_black_48dp,
            R.drawable.ic_audiotrack_black_24dp
    };



    public static ServicesFrag newInstance(){

        return new ServicesFrag();
    }

    public ServicesFrag(){

    }

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
        view = inflater.inflate(R.layout.services_frag,container,false);

        listView = (ListView) view.findViewById(R.id.services_list_view);
        ServicesListAdapter servicesListAdapter = new ServicesListAdapter(getActivity(),servicesHead,imgID,servicesDate,servicesDesc);
        listView.setAdapter(servicesListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                fragmentChanger.changeToFullScreenServices(servicesHead[position],servicesDate[position], imgID[position]);
            }
        });

        postServicesButton =(ImageButton) view.findViewById(R.id.post_services_button);
        postServicesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked111",Toast.LENGTH_LONG).show();
                fragmentChanger.changeToServicesPostFrag();
            }
        });

        return view;
    }
}

