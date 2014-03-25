package me.r;

import java.util.ArrayList;
import java.util.List;

import me.r.fragment.BookFragment;
import me.r.fragment.CenterFragment;
import me.r.fragment.GuideFragment;
import me.r.fragment.HelpFragment;
import me.r.fragment.ThirdFragment;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends FragmentActivity implements OnClickListener {
	private CustomViewPager vp;
	private List<Fragment> fragments;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		vp = (CustomViewPager)findViewById(R.id.vp);
		fragments = new ArrayList<Fragment>();
		fragments.add(new BookFragment());
		fragments.add(new CenterFragment());
		fragments.add(new ThirdFragment());
		vp.setOffscreenPageLimit(2);
		vp.setAdapter(new FragmentAdapter(getSupportFragmentManager(), fragments));
	}
	
	public void guide(View v) {
		FragmentTransaction trans = getSupportFragmentManager()
				.beginTransaction();
		trans.replace(R.id.root_frame, new GuideFragment());

		/*
		 * IMPORTANT: The following lines allow us to add the fragment
		 * to the stack and return to it later, by pressing back
		 */
		trans.setTransition(FragmentTransaction.TRANSIT_NONE);
		trans.addToBackStack(null);

		trans.commit();
		vp.setCurrentItem(2);
	}
	
	public void help(View v) {
		FragmentTransaction trans = getSupportFragmentManager()
				.beginTransaction();
		trans.replace(R.id.root_frame, new HelpFragment());
		trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
		trans.addToBackStack(null);

		trans.commit();
		vp.setCurrentItem(2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		Log.i("MA", v.getId() + " " + v.getClass());
	}
}
