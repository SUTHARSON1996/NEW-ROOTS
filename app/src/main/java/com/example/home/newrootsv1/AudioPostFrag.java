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

/**
 * Created by home on 27/9/16.
 */
public class AudioPostFrag extends Fragment {

    private View view;
    Button captureAudio;
    Button chooseAudio;
    FragmentChanger fragmentChanger;



    public static AudioPostFrag newInstance(){

        return new AudioPostFrag();

    }

    public AudioPostFrag(){


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
        view = inflater.inflate(R.layout.article_audio_post,container,false);

        captureAudio =(Button)view.findViewById(R.id.record_audio_button);
        chooseAudio =(Button)view.findViewById(R.id.choose_audio_button);


        captureAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.captureAudio();
            }
        });


        chooseAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.chooseAudio();
            }
        });

        return view;
    }
}
