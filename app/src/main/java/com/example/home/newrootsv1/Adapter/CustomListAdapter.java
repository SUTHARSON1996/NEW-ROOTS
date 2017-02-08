package com.example.home.newrootsv1.Adapter;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.home.newrootsv1.R;

public class CustomListAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] artHeading;
    private final Integer[] imgageId;
    private final String[] description;
    private final String[] postDate;

    public CustomListAdapter(Activity context, String[] artHeading, Integer[] imgageId, String[] description, String[] postDate){
        super(context,R.layout.articles_list_view,artHeading);

        this.context = context;
        this.artHeading = artHeading;
        this.imgageId = imgageId;
        this.description = description;
        this.postDate = postDate;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.articles_list_view,null,true);

        TextView title = (TextView)rowView.findViewById(R.id.list_view_title);
        TextView desc = (TextView)rowView.findViewById(R.id.listview_desc);
        TextView date = (TextView)rowView.findViewById(R.id.listview_date);
        ImageView artPic = (ImageView) rowView.findViewById(R.id.list_view_image);


        title.setText(artHeading[position]);
        desc.setText(description[position]);
        artPic.setImageResource(imgageId[position]);
        date.setText(postDate[position]);




        return rowView;
    }
}
