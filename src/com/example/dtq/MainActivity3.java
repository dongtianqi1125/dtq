package com.example.dtq;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;
//弹出式菜单
public class MainActivity3 extends Activity implements OnMenuItemClickListener{

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity3);
	}
	public void showPopupMenu(View v) {
		//创建弹出式菜单对象（最低版本11）
		PopupMenu popup=new PopupMenu(this, v);
		//获取菜单填充器
		MenuInflater inflater=popup.getMenuInflater();
		//填充菜单
		inflater.inflate(R.menu.main_activity3, popup.getMenu());
		//设置菜单项的单击事件
		popup.setOnMenuItemClickListener(this);
		
		popup.show();
	}
	//弹出式菜单的单击事件处理
	public boolean onMenuItemClick(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.copy:
			Toast.makeText(this, "复制。。。", Toast.LENGTH_LONG).show();
			break;
		case R.id.past:
			Toast.makeText(this, "删除。。。", Toast.LENGTH_LONG).show();
			break;
		default:
			break;
		}

		return false;
	}

}
