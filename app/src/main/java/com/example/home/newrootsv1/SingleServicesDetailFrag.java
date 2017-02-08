package com.example.home.newrootsv1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by home on 7/10/16.
 */
public class SingleServicesDetailFrag extends Fragment{

    View view;


    private static final String IMAGE_RES_ID = "imageId";
    private static final String  SERVICES_HEADING= "servicesHead";
    private static final String SERVICES_DESCRIPTION = "servicesDesc";


    public static SingleServicesDetailFrag newInstance(String serviceHead, String desc, int imgId){
        final Bundle args = new Bundle();

        args.putInt(IMAGE_RES_ID,imgId);
        args.putString(SERVICES_HEADING,serviceHead);
        args.putString(SERVICES_DESCRIPTION,desc);

        final SingleServicesDetailFrag frag = new SingleServicesDetailFrag();
        frag.setArguments(args);

        return frag;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.single_details_services,container,false);


        TextView servicesHead =  (TextView) view.findViewById(R.id.text_service_post_head);
        ImageView serviceImage = (ImageView) view.findViewById(R.id.services_image_detailsfrag);

        final Bundle args = getArguments();

        serviceImage.setImageResource(args.getInt(IMAGE_RES_ID));
        servicesHead.setText(args.getString(SERVICES_HEADING));

        return view;
    }
}
