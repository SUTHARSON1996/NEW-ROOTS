package com.example.home.newrootsv1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by home on 26/11/16.
 */

public class EquipSalesReviewProduct extends Fragment {
    View view;
    EditText reviewCaption;
    EditText reviewDescription;
    Button reviewPost;



    public static EquipSalesReviewProduct newInstance(){

        return new EquipSalesReviewProduct();
    }

    public EquipSalesReviewProduct(){

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.equip_sales_product_review,container,false);

        reviewCaption =(EditText) view.findViewById(R.id.review_caption);
        reviewDescription =(EditText)view.findViewById(R.id.review_desc);
        reviewPost = (Button)view.findViewById(R.id.post_review_product_button);


        reviewPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Review post recieved",Toast.LENGTH_LONG).show();
            }
        });


        return view;
    }
}
