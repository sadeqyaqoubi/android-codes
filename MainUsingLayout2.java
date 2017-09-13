package com.example.usinglayouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainUsingLayout2 extends Activity{
	
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainusiglayout2);
		
		btn2 = (Button) findViewById(R.id.button1);
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent main3 = new Intent(MainUsingLayout2.this,Main3.class);
				startActivity(main3);
			}
		});
		
		btn3 = (Button) findViewById(R.id.button2);
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent main4 = new Intent(MainUsingLayout2.this,Main4.class);
				startActivity(main4);
			}
		});
		
		btn4 = (Button) findViewById(R.id.button3);
		btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent main5 = new Intent(MainUsingLayout2.this,Main5.class);
				startActivity(main5);
			}
		});
		
		btn5 = (Button) findViewById(R.id.button4);
		btn5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent main6 = new Intent(MainUsingLayout2.this,Main6.class);
				startActivity(main6);
			}
		});
		
		
	}

}
