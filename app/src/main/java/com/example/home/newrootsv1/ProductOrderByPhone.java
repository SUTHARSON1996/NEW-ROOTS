package com.example.home.newrootsv1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by home on 30/9/16.
 */
public class ProductOrderByPhone extends Fragment {

    View view;

    public static ProductOrderByPhone newInstance(){


        return new ProductOrderByPhone();
    }

    public ProductOrderByPhone(){

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.product_order_by_phone,container,false);



        return view;

    }



}
