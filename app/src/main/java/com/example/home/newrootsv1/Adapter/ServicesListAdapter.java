package com.example.home.newrootsv1.Adapter;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.home.newrootsv1.R;

public class ServicesListAdapter extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] service_heading;
    private final Integer[] service_pic;
    private final String[] service_date;
    private final String[] service_desc;


    public ServicesListAdapter(Activity context, String[] service_heading, Integer[] service_pic, String[] service_date, String[] service_desc) {
        super(context, R.layout.single_details_services,service_heading);
        this.context = context;
        this.service_heading = service_heading;
        this.service_pic = service_pic;
        this.service_date = service_date;
        this.service_desc = service_desc;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.single_list_design_services,null,true);

        TextView serviceHead = (TextView)rowView.findViewById(R.id.service_heading_list);
        TextView serviceDesc = (TextView)rowView.findViewById(R.id.services_desc_list);
        TextView serviceDate = (TextView)rowView.findViewById(R.id.services_date_list);
        ImageView serviceImg = (ImageView)rowView.findViewById(R.id.service_img_list);

        serviceHead.setText(service_heading[position]);
        serviceDesc.setText(service_desc[position]);
        serviceImg.setImageResource(service_pic[position]);
        serviceDate.setText(service_date[position]);

        return rowView;

    }
}
