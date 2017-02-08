package com.example.home.newrootsv1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by home on 5/11/16.
 */

public class SingleProductImageView extends Fragment {

    View view;
    static int pic;
    ImageView imageView;

    public static SingleProductImageView newInstance(int resId){
        pic = resId;

        return new SingleProductImageView();
    }

    public SingleProductImageView(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.equip_sales_image_view,container,false);

        imageView=(ImageView) view.findViewById(R.id.equip_sales_image_view);
        imageView.setImageResource(pic);

        return view;
    }
}
