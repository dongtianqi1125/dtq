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
//��дonCreateOptionsMenu��������һ�ε��ò˵�ʽʱ��������
	public boolean onCreateOptionsMenu(Menu menu) {
		//���ѡ��˵�����ȡxml�ļ������������ص�MENU����ϣ�
		getMenuInflater().inflate(R.menu.main, menu);
		SubMenu sub1=menu.addSubMenu("����");
		sub1.add("��������");
		sub1.add("��������");
		return true;
	}
	//��дonOptionsItemSelectedʵ�ֲ˵�����¼�
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.start:
			Toast.makeText(this, "��ʼ��Ϸ", Toast.LENGTH_SHORT).show();
			break;
			
		case R.id.over:
			Toast.makeText(this, "������Ϸ", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
