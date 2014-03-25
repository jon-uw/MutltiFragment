package me.r.fragment;

import android.graphics.Color;


public class BookFragment extends BaseFragment {  
    @Override  
    public String initContent() { 
        return "订阅";  
    }

	@Override
	public int getBgColor() {
		return Color.GRAY;
	}
}