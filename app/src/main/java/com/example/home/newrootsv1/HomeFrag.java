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

import com.example.home.newrootsv1.Adapter.CustomListAdapter;
import com.example.home.newrootsv1.Adapter.FragmentChanger;

/**
 * Created by home on 17/9/16.
 */
public class HomeFrag extends Fragment {

    public View view;
    ListView listView;
    FragmentChanger fragmentChanger;


    String[] artTitle= {
            "Android Picasso Image Loader0",
            "Android Picasso Image Loader1",
            "Android Picasso Image Loader2",
            "Android Picasso Image Loader3",
            "Android Picasso Image Loader4",
            "Android Picasso Image Loader5",
            "Android Picasso Image Loader6",
    };


    String[] artDesc={
            "Load images in android using picasso image loader library.",
            "Load images in android using picasso image loader library.",
            "Load images in android using picasso image loader library.",
            "Load images in android using picasso image loader library.",
            "Load images in android using picasso image loader library.",
            "Load images in android using picasso image loader library.",
            "Load images in android using picasso image loader library."


    };

    String[] artDate={
            "Sept 24 2016","Sept 24 2016","Sept 24 2016","Sept 24 2016","Sept 24 2016","Sept 24 2016","Sept 24 2016"
    };

    Integer[] artImgId={
            R.drawable.ic_nature_people_black_48dp,
            R.drawable.ic_contacts_black_48dp,
            R.drawable.ic_audiotrack_black_24dp,
            R.drawable.ic_group_black_48dp,
            R.drawable.ic_mic_black_24dp,
            R.drawable.ic_videocam_black_24dp,
            R.drawable.ic_home_black_48dp


    };


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
        view = inflater.inflate(R.layout.activity_home_frag, container, false);
        CustomListAdapter customListAdapter = new CustomListAdapter(getActivity(),artTitle,artImgId,artDesc,artDate);

        listView=(ListView) view.findViewById(R.id.article_list_view);
        listView.setAdapter(customListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = artTitle[position];
                Toast.makeText(getActivity(),selected,Toast.LENGTH_SHORT).show();
                fragmentChanger.changeToSingleArticle(artImgId[position],
                        artTitle[position],
                        artDesc[position],
                        artDate[position]
                        );

            }
        });

        return view;

    }


}
