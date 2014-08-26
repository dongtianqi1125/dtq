package com.example.dtq;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends Activity {
	private Button btn1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
		//��ȡbutton
		btn1=(Button)findViewById(R.id.button1);
		//��Button��ע�������Ĳ˵�
		registerForContextMenu(btn1);
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}
	//���������Ĳ˵��¼�����
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		getMenuInflater().inflate(R.menu.main_activity2, menu);
	}
	//�����Ĳ˵�����¼�
	@Override
	public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
          case R.id.start:
        	  Toast.makeText(this, "��ʼ��������", Toast.LENGTH_SHORT).show();
	      break;
          case R.id.over:
        	  Toast.makeText(this, "������������", Toast.LENGTH_SHORT).show();
    	      break;

          default:
	      break;
        }
		return super.onContextItemSelected(item);
	}

}
