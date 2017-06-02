package com.mzy.demosortout.yindao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mzy.demosortout.DemoClassActivity;
import com.mzy.demosortout.R;

public class Fragment4 extends Fragment implements View.OnClickListener{
	private TextView textView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		View view = inflater.inflate(R.layout.fragment_4, container, false);
		view.findViewById(R.id.tvInNew).setOnClickListener(this);
		return view;
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()){
			case R.id.tvInNew:
				Intent intent=new Intent(getActivity(), DemoClassActivity.class);
				startActivity(intent);
				break;
		}
	}
}
