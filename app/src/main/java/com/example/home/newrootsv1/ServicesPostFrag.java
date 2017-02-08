package com.example.home.newrootsv1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.home.newrootsv1.Adapter.FragmentChanger;


public class ServicesPostFrag extends Fragment {

    View view;
    FragmentChanger fragmentChanger;
    Button capturePic;
    Button chooseImage;


    public static ServicesPostFrag newInstance(){
        return new ServicesPostFrag();
    }

    public ServicesPostFrag(){

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
        view = inflater.inflate(R.layout.services_post_frag,container,false);

        capturePic = (Button)view.findViewById(R.id.capture_services_image_button);
        chooseImage = (Button)view.findViewById(R.id.choose_choose_services_image_button);

        capturePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.capturePic();

            }
        });

        chooseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.choosePic();
            }
        });


        return view;
    }
}
