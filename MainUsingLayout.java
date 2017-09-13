package com.example.usinglayouts;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainUsingLayout extends Activity {
	
	private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainusinglayouts);
        
        btn = (Button) findViewById(R.id.btn_main);
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent main2 = new Intent(MainUsingLayout.this, MainUsingLayout2.class);
			
				startActivity(main2);
			}
		});
    }

    
}
