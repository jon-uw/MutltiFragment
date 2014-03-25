package me.r;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

public class FragmentAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;
    FragmentManager fm;
    
	public FragmentAdapter(FragmentManager fm) {
		super(fm);
		this.fm = fm;
	}
	
	public FragmentAdapter(FragmentManager fm, List<Fragment> fragments) {
		this(fm);
		this.fragments = fragments;
	}
	
	@Override 
	public float getPageWidth(int position) {
		return(0.5f); 
	}

	@Override
	public Fragment getItem(int position) {
		Log.i("ADAPTER", "in pager: " + position);
		return fragments.get(position);
	}

	@Override
	public int getCount() {
		return 3;
	}

}
