package com.example.dtq;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
//重写onCreateOptionsMenu方法（第一次调用菜单式时被触发）
	public boolean onCreateOptionsMenu(Menu menu) {
		//填充选项菜单（读取xml文件，解析，加载到MENU组件上）
		getMenuInflater().inflate(R.menu.main, menu);
		SubMenu sub1=menu.addSubMenu("设置");
		sub1.add("设置声音");
		sub1.add("设置桌面");
		return true;
	}
	//重写onOptionsItemSelected实现菜单项的事件
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.start:
			Toast.makeText(this, "开始游戏", Toast.LENGTH_SHORT).show();
			break;
			
		case R.id.over:
			Toast.makeText(this, "结束游戏", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
