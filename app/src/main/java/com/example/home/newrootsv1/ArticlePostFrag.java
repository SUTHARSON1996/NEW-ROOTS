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
public class ArticlePostFrag extends Fragment {

    private View view;
    Button capturePic;
    Button choosePic;
    FragmentChanger fragmentChanger;

    public static ArticlePostFrag newInstance(){

        return new ArticlePostFrag();
    }

    public ArticlePostFrag(){

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
        view=inflater.inflate(R.layout.article_article_post,container,false);

        capturePic = (Button)view.findViewById(R.id.capture_artimage_button);
        choosePic = (Button) view.findViewById(R.id.choose_artimage_button);

        capturePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(),"onclick",Toast.LENGTH_SHORT).show();
                fragmentChanger.capturePic();

            }
        });

        choosePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.choosePic();
            }
        });




        return view;
    }
}
