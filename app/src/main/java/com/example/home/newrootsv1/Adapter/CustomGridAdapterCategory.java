package com.example.home.newrootsv1.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.home.newrootsv1.R;

/**
 * Created by home on 25/11/16.
 */

public class CustomGridAdapterCategory extends BaseAdapter {

    private Activity mActivity;
    private final String[] categoryName;
    private final int[] resId;

    public CustomGridAdapterCategory(Activity mActivity,String[] categoryName,int[] resId){
        this.mActivity = mActivity;
        this.categoryName = categoryName;
        this.resId = resId;

    }


    @Override
    public int getCount() {
        return categoryName.length;
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
        LayoutInflater inflater=mActivity.getLayoutInflater();
        gridView = inflater.inflate(R.layout.equipsales_single_category_view, null, true);

        ImageView icon = (ImageView)gridView.findViewById(R.id.equip_grid_categry_icon);
        icon.setImageResource(resId[position]);

        return gridView;
    }
}
