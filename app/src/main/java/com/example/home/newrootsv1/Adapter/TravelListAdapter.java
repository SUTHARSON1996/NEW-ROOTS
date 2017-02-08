package com.example.home.newrootsv1.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.home.newrootsv1.R;


public class TravelListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] tour_village_name;
    private final Integer[] tour_place_pic;
    private final String[] tour_place_name;
    private final String[] tour_place_desc;


    public TravelListAdapter(Activity context, String[] tour_village_name, Integer[] tour_place_pic, String[] tour_place_name, String[] tour_place_desc) {
        super(context,R.layout.single_list_design_travel,tour_village_name);

        this.context = context;
        this.tour_village_name = tour_village_name;
        this.tour_place_pic = tour_place_pic;
        this.tour_place_name = tour_place_name;
        this.tour_place_desc = tour_place_desc;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.single_list_design_travel,null,true);

        TextView tourVillage = (TextView) rowView.findViewById(R.id.tour_heading);
        TextView tourPlaceName = (TextView) rowView.findViewById(R.id.tour_place_title);
        TextView tourPlaceDesc = (TextView) rowView.findViewById(R.id.tour_place_desc);
        ImageView tourVillagePic = (ImageView) rowView.findViewById(R.id.tour_place_pic);


        tourVillage.setText(tour_village_name[position]);
        tourPlaceName.setText(tour_place_name[position]);
        tourPlaceDesc.setText(tour_place_desc[position]);
        tourVillagePic.setImageResource(tour_place_pic[position]);


        return rowView;
    }
}
