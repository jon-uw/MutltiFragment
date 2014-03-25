package me.r;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class CustomViewPager extends ViewPager {


	public CustomViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	// 只有切到第3个fragment的时候才允许滑动(只有右滑,左滑已经到第3个了)
	public boolean enabled() {
		return getCurrentItem() == 2;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (this.enabled()) {
			return super.onTouchEvent(event);
		}

		return false;
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent event) {
		if (this.enabled()) {
			return super.onInterceptTouchEvent(event);
		}

		return false;
	}
}
