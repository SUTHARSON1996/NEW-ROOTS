package com.example.home.newrootsv1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.home.newrootsv1.Adapter.FragmentChanger;

import org.w3c.dom.Text;

/**
 * Created by home on 17/9/16.
 */
public class ArticlesFrag extends Fragment {

    View view;

    //image buttons for posting the contents
    ImageButton picPostButton;
    ImageButton videoPostButton;
    ImageButton audoiPostButton;
    ImageButton articlePostButton;
    TextView name;
    TextView status;
    ImageView acc_image;

    //interface for fragment jumping
    FragmentChanger fragmentChanger;



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
        view = inflater.inflate(R.layout.activity_articles_frag, container, false);

        picPostButton = (ImageButton) view.findViewById(R.id.pic_post_button);
        videoPostButton = (ImageButton) view.findViewById(R.id.video_post_button);
        audoiPostButton = (ImageButton) view.findViewById(R.id.audoi_post_button);
        articlePostButton = (ImageButton) view.findViewById(R.id.article_post_button);
        name = (TextView)view.findViewById(R.id.article_abt_you_name);
        status = (TextView)view.findViewById(R.id.article_abt_you_status);
        acc_image = (ImageView) view.findViewById(R.id.article_abt_you_image);

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked name",Toast.LENGTH_LONG).show();
                fragmentChanger.changeToBasicProfileInfo();
            }
        });

        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked status",Toast.LENGTH_LONG).show();
                fragmentChanger.changeToBasicProfileInfo();
            }
        });

        acc_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked image",Toast.LENGTH_LONG).show();
                fragmentChanger.changeToBasicProfileInfo();
            }
        });

        picPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.switchToPicPost();
            }
        });

        videoPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.switchToVideoPost();
            }
        });


        audoiPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.switchToAudioPost();
            }
        });


        articlePostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.switchToArticlePost();
            }
        });


        return view;
    }









}
