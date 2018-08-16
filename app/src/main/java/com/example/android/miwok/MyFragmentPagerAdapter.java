package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private Context mContext;


    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getResources().getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getResources().getString(R.string.category_family);
        } else if (position == 2) {
            return mContext.getResources().getString(R.string.category_colors);
        } else {
            return mContext.getResources().getString(R.string.category_phrases);
        }
    }
}
