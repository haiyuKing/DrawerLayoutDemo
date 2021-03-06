package com.why.project.drawerlayoutdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by HaiyuKing
 * Used 首页右侧侧边栏碎片界面
 */

public class MainMenuRightFragment extends Fragment {
	private static final String TAG = "MainMenuRightFragment";
	/**View实例*/
	private View myView;
	//
	private TextView tv_show;

	//重写
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Log.d(TAG,"onCreateView");
		myView = inflater.inflate(R.layout.fragment_home_right_menu, container, false);

		return myView;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Log.d(TAG,"onActivityCreated");
		//初始化控件以及设置
		initView();
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d(TAG,"onResume");
		//初始化监听事件
		initEvent();
	}

	/**初始化控件*/
	private void initView(){
		Log.d(TAG,"initView");
		tv_show = myView.findViewById(R.id.tv_show);
	}

	/**初始化监听事件*/
	private void initEvent(){

	}
}
