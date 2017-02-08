package com.example.home.newrootsv1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.home.newrootsv1.Adapter.FragmentChanger;

public class VideoPostFrag extends android.support.v4.app.Fragment {



    private View view;
    Button captureVideo;
    Button chooseVideo;
    FragmentChanger fragmentChanger;


    public static VideoPostFrag newInstance(){

        return new VideoPostFrag();
    }

    public VideoPostFrag(){


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
        view= inflater.inflate(R.layout.article_video_post,container,false);

        captureVideo=(Button) view.findViewById(R.id.capture_video_button);
        chooseVideo=(Button)view.findViewById(R.id.choose_video_button);

        captureVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.captureVideo();
            }
        });


        chooseVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.chooseVideo();
            }
        });


        return view;
    }





}
