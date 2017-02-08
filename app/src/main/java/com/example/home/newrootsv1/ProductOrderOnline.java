package com.example.home.newrootsv1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ProductOrderOnline extends Fragment {


    View view;

    public static ProductOrderOnline newInstance(){

        return new ProductOrderOnline();
    }

    public ProductOrderOnline(){

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.product_order_online,container,false);



        return view;
    }
}
