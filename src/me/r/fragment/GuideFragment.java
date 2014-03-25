package me.r.fragment;

import android.graphics.Color;
import android.view.View;

public class GuideFragment extends BaseFragment{
	@Override  
    public String initContent() {  
        return "导航";  
    }

	@Override
	public int getBgColor() {
		// TODO Auto-generated method stub
		return Color.MAGENTA;
	}
}
