package com.example.home.newrootsv1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleTextArticleView extends Fragment {

    private View view;
    private static final String IMAGE_RES_ID = "imageId";
    private static final String  ARTICLE_HEADING= "artHead";
    private static final String ARTICLE_DESCRIPTION = "artDesc";
    private static final String ARTICLE_DATE = "artDate";


    public static SingleTextArticleView newInstance(int imageId,String artHead,String description,String date){

        final Bundle args = new Bundle();
        args.putInt(IMAGE_RES_ID,imageId);
        args.putString(ARTICLE_HEADING,artHead);
        args.putString(ARTICLE_DESCRIPTION,description);
        args.putString(ARTICLE_DATE,date);

        final SingleTextArticleView fragment = new SingleTextArticleView();
        fragment.setArguments(args);


        return fragment;
    }


    public SingleTextArticleView(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.single_article_content_view,container,false);

        final TextView artHeading = (TextView) view.findViewById(R.id.article_heading);
        final TextView artContent = (TextView)view.findViewById(R.id.article_content);
        final ImageView artPicture = (ImageView)view.findViewById(R.id.article_image);

        final Bundle args = getArguments();
        artPicture.setImageResource(args.getInt(IMAGE_RES_ID));
        artContent.setText(args.getString(ARTICLE_DESCRIPTION));
        artHeading.setText(args.getString(ARTICLE_HEADING));



        return view;
    }


}
