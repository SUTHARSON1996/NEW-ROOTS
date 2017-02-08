package com.example.home.newrootsv1.Adapter;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.home.newrootsv1.R;

public class CustomGridAdapter extends BaseAdapter {
    private Activity mContext;
    private final String[] productTitle;
    private final String[] productDesc;
    private final String[] productPrice;
    private final int[] imageId;

    public CustomGridAdapter(Activity mContext, String[] productTitle, String[] productDesc, String[] productPrice, int[] imageId) {
        this.mContext = mContext;
        this.productTitle = productTitle;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
        this.imageId = imageId;
    }

    @Override
    public int getCount() {
        return productTitle.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView;
        LayoutInflater inflater= mContext.getLayoutInflater();



           // gridView = new View(mContext);
            gridView = inflater.inflate(R.layout.equip_sales_single_grid, null, true);

            TextView prodTitle = (TextView) gridView.findViewById(R.id.product_title);
            TextView prodDesc = (TextView) gridView.findViewById(R.id.product_desc);
            TextView prodPrice = (TextView) gridView.findViewById(R.id.prod_price);
            ImageView prodImage = (ImageView) gridView.findViewById(R.id.product_image);

            prodTitle.setText(productTitle[position]);
            prodDesc.setText(productDesc[position]);
            prodPrice.setText(productPrice[position]);

            prodImage.setImageResource(imageId[position]);


         //Toast.makeText(mContext,"content setted",Toast.LENGTH_LONG).show();
         return gridView;

    }



}
