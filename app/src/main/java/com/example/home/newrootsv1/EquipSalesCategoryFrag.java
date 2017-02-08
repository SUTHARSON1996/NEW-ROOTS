package com.example.home.newrootsv1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.home.newrootsv1.Adapter.CustomGridAdapterCategory;
import com.example.home.newrootsv1.Adapter.FragmentChanger;

/**
 * Created by home on 25/11/16.
 */

public class EquipSalesCategoryFrag extends Fragment {

    FragmentChanger fragmentChanger;
    View view;
    SearchView searchView;
    GridView gridView;

    String[] categoryName={
            "category1",
            "category2",
            "category3",
            "category4",
            "category5",
            "category6",
    };

    int[] resId={
            R.drawable.ic_camera_alt_black_24dp,
            R.drawable.ic_contacts_black_48dp,
            R.drawable.ic_home_black_48dp,
            R.drawable.ic_group_black_48dp,
            R.drawable.ic_mic_black_24dp,
            R.drawable.ic_flight_black_24dp
    };


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
        view = inflater.inflate(R.layout.activity_equipsales_category_frag, container, false);

        CustomGridAdapterCategory customGridAdapterCategory = new CustomGridAdapterCategory(getActivity(),categoryName,resId);
        gridView = (GridView)view.findViewById(R.id.equipsales_category_icons_grid);
        gridView.setAdapter(customGridAdapterCategory);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),"clicked "+position,Toast.LENGTH_LONG).show();
                fragmentChanger.switchToEquipSales();
            }
        });

        searchView = (SearchView)view.findViewById(R.id.equipsales_search_bar);
        searchView.setQueryHint("Enter a product name to search");
        searchView.onActionViewExpanded();
        searchView.clearFocus();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){

            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(getActivity(),query,Toast.LENGTH_LONG).show();
                fragmentChanger.switchToEquipSales();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //Toast.makeText(getActivity(),newText,Toast.LENGTH_LONG).show();
                return false;
            }
        });



        return view;
    }





}
