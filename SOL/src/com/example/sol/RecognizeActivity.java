package com.example.sol;

import android.app.Activity;
import android.os.Bundle;

public class RecognizeActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recognize_main);

	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
	}

}
