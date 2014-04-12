package com.example.sol;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RaiseActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.raise_main);
		
		Button individualsButton = (Button) findViewById(R.id.individualsButton);
		individualsButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Uri uri = Uri.parse("http://www.lolt.org/join-and-support/individual.html"); 
				Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
				startActivity(intent);
				
			}
		});
		
		Button businessesButton = (Button) findViewById(R.id.businessesButton);
		businessesButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Uri uri = Uri.parse("http://www.lolt.org/join-and-support/business.html"); 
				Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
				startActivity(intent);
				
			}
		});
		Button landowersButton = (Button) findViewById(R.id.landownersButton);
		landowersButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Uri uri = Uri.parse("http://www.lolt.org/landowner-resources/"); 
				Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
				startActivity(intent);
				
			}
		});
		
//		Button plannedGivingButton = (Button) findViewById(R.id.plannnedGivingButton);
//		plannedGivingButton.setOnClickListener(new View.OnClickListener() {
//			public void onClick(View v) {
//
//				Uri uri = Uri.parse("http://www.lolt.org/join-and-support/gifts.html"); 
//				Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
//				startActivity(intent);
//				
//			}
//		});

	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
	}
}
