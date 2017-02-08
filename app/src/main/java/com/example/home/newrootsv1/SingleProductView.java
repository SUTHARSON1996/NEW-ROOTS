package com.example.home.newrootsv1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.home.newrootsv1.Adapter.FragmentChanger;

/**
 * Created by home on 30/9/16.
 */
public class SingleProductView extends Fragment {

    View view;
    FragmentChanger fragmentChanger;
    private static int pic;
    Button orderOnline;
    Button orderByPhone;
    ImageView imageViewProduct;
    ImageView retailerImage;
    Button postReview;
    TextView retailerName;

    public static SingleProductView newInstance(int picId){
        pic = picId;
        return new SingleProductView();

    }

    public SingleProductView(){

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
        view = inflater.inflate(R.layout.single_product_details_view,container,false);

        imageViewProduct = (ImageView)view.findViewById(R.id.product_image);
        orderByPhone= (Button) view.findViewById(R.id.order_by_phone);
        orderOnline = (Button) view.findViewById(R.id.order_online_button);
        retailerImage = (ImageView) view.findViewById(R.id.product_page_reseller_image);
        retailerName = (TextView) view.findViewById(R.id.product_page_reseller_name);
        postReview = (Button) view.findViewById(R.id.product_page_post_review_product);

        retailerName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"name clicked",Toast.LENGTH_LONG).show();
                fragmentChanger.changeToResellerDetails();
            }
        });

        retailerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"image clicked",Toast.LENGTH_LONG).show();
                fragmentChanger.changeToResellerDetails();
            }
        });

        postReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Review button clicked",Toast.LENGTH_LONG).show();
                fragmentChanger.postReviewOfProduct();
            }
        });

        imageViewProduct.setImageResource(pic);
        imageViewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.changeToProductsImage(pic);
            }
        });
        orderOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.changeToOrderOnline();
            }
        });

        orderByPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentChanger.changeToOrderByPhone();
            }
        });



        return view;
    }
}
