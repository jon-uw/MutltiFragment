package me.r.fragment;

import android.graphics.Color;

public class HelpFragment extends BaseFragment {
	@Override  
    public String initContent() {  
        return "帮助";  
    }

	@Override
	public int getBgColor() {
		return Color.RED;
	}
}
