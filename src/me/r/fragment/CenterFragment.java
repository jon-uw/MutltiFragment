package me.r.fragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import me.r.R;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.SyncStateContract.Helpers;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class CenterFragment extends BaseFragment {  
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.center_fragment, null);  
        view.setBackgroundColor(getBgColor());
        Button guideBtn = (Button)view.findViewById(R.id.guideBtn);
        Button helpBtn = (Button)view.findViewById(R.id.helpBtn);
		return view;
	}
	
    @Override  
    public String initContent() {  
        return "个人中心";  
    }

	@Override
	public int getBgColor() {
		// TODO Auto-generated method stub
		return Color.BLUE;
	} 
}