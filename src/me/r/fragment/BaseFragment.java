package me.r.fragment;

import me.r.R;
import me.r.R.id;
import me.r.R.layout;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("NewApi")
public abstract class BaseFragment extends Fragment {
    @Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
        View view = inflater.inflate(R.layout.fragment, null);  
        view.setBackgroundColor(getBgColor());
        TextView textView = (TextView) view.findViewById(R.id.txt_content);  
        textView.setText(initContent());
        return view;  
    } 

	public abstract String initContent();  
    
    public abstract int getBgColor();
}