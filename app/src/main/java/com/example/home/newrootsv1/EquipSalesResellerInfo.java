package com.example.home.newrootsv1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by home on 26/11/16.
 */

public class EquipSalesResellerInfo extends Fragment {

    View view;

    public static EquipSalesResellerInfo newInstance(){
        return new EquipSalesResellerInfo();
    }

    public EquipSalesResellerInfo(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.equip_sales_retailer_details,container,false);

        return view;
    }



}
