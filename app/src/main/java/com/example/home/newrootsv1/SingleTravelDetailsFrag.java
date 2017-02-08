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
 * Created by home on 2/10/16.
 */
public class SingleTravelDetailsFrag extends Fragment{

    View view;

    private static final String IMAGE_RES_ID = "imageId";
    private static final String  TRAVEL_HEADING= "travelHead";
    private static final String TRAVEL_DESCRIPTION = "travelDesc";
    private static final String VILLAGE_NAME = "villageName";

    public static SingleTravelDetailsFrag newInstance(String villageName, String placeName, String placeDesc, int imgId){

        final Bundle args = new Bundle();
        args.putInt(IMAGE_RES_ID,imgId);
        args.putString(TRAVEL_HEADING,placeName);
        args.putString(TRAVEL_DESCRIPTION,placeDesc);
        args.putString(VILLAGE_NAME,villageName);

        final SingleTravelDetailsFrag frag = new SingleTravelDetailsFrag();
        frag.setArguments(args);

        return frag;

    }



    public SingleTravelDetailsFrag(){


    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.single_travel_details_frag,container,false);
        TextView tourVillage = (TextView) view.findViewById(R.id.travel_head);
        TextView tourPlaceName = (TextView) view.findViewById(R.id.village_name);
        TextView tourPlaceDesc = (TextView) view.findViewById(R.id.tour_desc);
        ImageView tourVillagePic = (ImageView) view.findViewById(R.id.travel_pic);


        final Bundle args = getArguments();
        tourVillage.setText(args.getString(VILLAGE_NAME));
        tourPlaceName.setText(args.getString(TRAVEL_HEADING));
        tourPlaceDesc.setText(args.getString(TRAVEL_DESCRIPTION));
        tourVillagePic.setImageResource(args.getInt(IMAGE_RES_ID));





        return view;
    }
}
