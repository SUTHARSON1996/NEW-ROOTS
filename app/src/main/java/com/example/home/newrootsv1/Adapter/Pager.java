package com.example.home.newrootsv1.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.home.newrootsv1.AboutUsFrag;
import com.example.home.newrootsv1.EquipSalesCategoryFrag;
import com.example.home.newrootsv1.VideoLessonsFrag;
import com.example.home.newrootsv1.ServicesAndTravelHostFrag;
import com.example.home.newrootsv1.EquipSalesFrag;
import com.example.home.newrootsv1.HomeFrag;
import com.example.home.newrootsv1.ArticlesFrag;

/**
 * Created by home on 17/9/16.
 */
public class Pager extends FragmentStatePagerAdapter {

    int tabCount;//no of tabs in the toolbar

    public Pager(FragmentManager fm,int tabCount){

        super(fm);
        //initializing the no of tabs
        this.tabCount = tabCount;

    }


    @Override
    public Fragment getItem(int position) {

        switch(position){

            case 0:
                return  new HomeFrag();
            case 1:
                return new ArticlesFrag();
            case 2:
                return new EquipSalesCategoryFrag();
            case 3:
                return new VideoLessonsFrag();
            case 4:
                return new ServicesAndTravelHostFrag();
            case 5:
                return new AboutUsFrag();

            default:
                return null;

        }

    }

    @Override
    public int getCount() {

        return tabCount;

    }
}
