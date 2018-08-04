package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

import com.example.android.localtour.EventsCategory;
import com.example.android.localtour.MustdoCategory;
import com.example.android.localtour.ParksCategory;
import com.example.android.localtour.RestaurantsCategory;


public class CategoryAdapter extends FragmentPagerAdapter {


    /**
     * Context of the app
     */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        /**
         * Return the {@link Fragment} that should be displayed for the given page number.
         */
    }
    @Override
    public Fragment getItem ( int position) {
        if (position == 0) {
            return new EventsCategory();
        } else if (position == 1) {
            return new RestaurantsCategory();
        } else if (position == 2) {
            return new ParksCategory();
        } else {
            return new MustdoCategory();
        }
    }
    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle( int position){
        if (position == 0) {
            return mContext.getString(R.string.events_title);
        } else if (position == 1) {
            return mContext.getString(R.string.restuarants_title);
        } else if (position == 2) {
            return mContext.getString(R.string.parks_title);
        } else {
            return mContext.getString(R.string.mustdo_titie);
        }
    }
}

