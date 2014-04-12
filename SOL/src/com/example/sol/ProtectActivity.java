package com.example.sol;

import android.app.Activity;
import android.os.Bundle;

public class ProtectActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.protect_main);

}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
	}

}