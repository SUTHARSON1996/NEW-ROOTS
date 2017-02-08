package com.example.home.newrootsv1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.home.newrootsv1.Adapter.CustomGridAdapter;
import com.example.home.newrootsv1.Adapter.FragmentChanger;


public class EquipSalesFrag extends Fragment {



    FragmentChanger fragmentChanger;
    View view;
    GridView gridView;

    String[] prodTitle = {
            "Product0 Title Here",
            "Product1 Title Here",
            "Product2 Title Here",
            "Product3 Title Here",
            "Product4 Title Here",
            "Product5 Title Here",
            "Product6 Title Here",
            "Product7 Title Here",
            "Product8 Title Here",
            "Product9 Title Here"
    };

    String[] prodDesc={
            "A short description about the product",
            "A short description about the product",
            "A short description about the product",
            "A short description about the product",
            "A short description about the product",
            "A short description about the product",
            "A short description about the product",
            "A short description about the product",
            "A short description about the product",
            "A short description about the product"
    };



    String[] prodPrice = {

            "RS : 450 / box",
            "RS : 450 / box",
            "RS : 450 / box",
            "RS : 450 / box",
            "RS : 450 / box",
            "RS : 450 / box",
            "RS : 450 / box",
            "RS : 450 / box",
            "RS : 450 / box",
            "RS : 450 / box"


    };

    int[] imageId = {
            R.drawable.dscn2105s,
            R.drawable.dscn2132s,
            R.drawable.dscn2150s,
            R.drawable.dscn2152s,
            R.drawable.dscn2154s,
            R.drawable.dscn2156s,
            R.drawable.dscn2154s,
            R.drawable.dscn2152s,
            R.drawable.dscn2132s,
            R.drawable.dscn2156s
    };



    public static EquipSalesFrag newInstance(){

        return new EquipSalesFrag();

    }

    public EquipSalesFrag(){

    }





    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof FragmentChanger){
            fragmentChanger = (FragmentChanger)context;
        }
        else{
            throw new ClassCastException(context.toString()+" must implement listener");

        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflating the view and returning
        view =  inflater.inflate(R.layout.activity_equipment_sales_frag, container, false);

        CustomGridAdapter adapter = new CustomGridAdapter(getActivity(),prodTitle,prodDesc,prodPrice,imageId);
        Toast.makeText(getActivity(),"adapter created",Toast.LENGTH_LONG).show();

        gridView = (GridView)view.findViewById(R.id.gridView);
        gridView.setAdapter(adapter);

        Toast.makeText(getActivity(),"grid view called",Toast.LENGTH_LONG).show();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),prodTitle[position]+" clicked",Toast.LENGTH_LONG).show();
                fragmentChanger.changeToSingleProduct(imageId[position]);
            }
        });



        return view;
    }

}
