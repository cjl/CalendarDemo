package com.dcs.test.Activity;

import com.dcs.test.R;

import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.LinearLayout;

/************************************************************************
 *	项目名字	:带手势滑动功能的日历 
 * @author  angelの慧
 * @version 2012-10-08
 * 
 * 添加农历、传统节日、西方节日、固定节日功能
 * 由左右滑动变为上下滑动
 * @author 彩虹之西
 * @version 2013-4-17 　*
************************************************************************/
public class CalendarGridView extends GridView{
	
	private Context mContext;

	public CalendarGridView(Context context) {
		super(context);
		mContext = context;
		
		setGirdView();
	}

	private void setGirdView() {
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		
		setLayoutParams(params);
		setNumColumns(7);// 设置每行列数
		setGravity(Gravity.CENTER_VERTICAL);// 位置居中
		setVerticalSpacing(1);// 垂直间隔
		setHorizontalSpacing(1);// 水平间隔
		//设置背景
		setBackgroundColor(getResources().getColor(R.color.calendar_background));
	//设置参数
		WindowManager windowManager = ((Activity)mContext).getWindowManager();
		Display display = windowManager.getDefaultDisplay();
		int i = display.getWidth() / 7;
		int j = display.getWidth() - (i * 7);
		int x = j / 2;
		setPadding(x, 0, 0, 0);// 居中
	}
}
