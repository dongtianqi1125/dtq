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
//����ʽ�˵�
public class MainActivity3 extends Activity implements OnMenuItemClickListener{

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity3);
	}
	public void showPopupMenu(View v) {
		//��������ʽ�˵�������Ͱ汾11��
		PopupMenu popup=new PopupMenu(this, v);
		//��ȡ�˵������
		MenuInflater inflater=popup.getMenuInflater();
		//���˵�
		inflater.inflate(R.menu.main_activity3, popup.getMenu());
		//���ò˵���ĵ����¼�
		popup.setOnMenuItemClickListener(this);
		
		popup.show();
	}
	//����ʽ�˵��ĵ����¼�����
	public boolean onMenuItemClick(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.copy:
			Toast.makeText(this, "���ơ�����", Toast.LENGTH_LONG).show();
			break;
		case R.id.past:
			Toast.makeText(this, "ɾ��������", Toast.LENGTH_LONG).show();
			break;
		default:
			break;
		}

		return false;
	}

}
