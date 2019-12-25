package com.example.android.lagosguide;


import android.content.Context;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPager extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link SimpleFragmentPager} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */

    public SimpleFragmentPager(Context context, FragmentManager fm) {
        super(fm);

        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantFragment();
        } else if (position == 1) {
            return new ArtFragment();

        } else if (position == 2) {
            return new HotelFragment();

        } else {
            return new MonumentFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.category_galleries);
        } else if (position == 2) {
            return mContext.getString(R.string.category_hotels);
        } else {
            return mContext.getString(R.string.category_monuments);
        }
    }
}
