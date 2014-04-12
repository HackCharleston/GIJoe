package com.example.sol;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PromoteActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.promote_main);

//		Button instagramButton = (Button) findViewById(R.id.instagramButton);
//		instagramButton.setOnClickListener(new View.OnClickListener() {
//			public void onClick(View v) {
//
//				Uri uri = Uri.parse("http://instagram.com/loltsol"); 
//				Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
//				startActivity(intent);
//				
//			}
//		});
//		
		Button visionButton = (Button) findViewById(R.id.visionButton);
		visionButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Uri uri = Uri.parse("http://www.lolt.org/conservation-programs/visioning_process.html"); 
				Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
				startActivity(intent);
				
			}
		});
		
		Button membershipButton = (Button) findViewById(R.id.membershipButton);
		membershipButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Uri uri = Uri.parse("http://www.lolt.org/join-and-support/"); 
				Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
				startActivity(intent);
				
			}
		});
		
		Button conservationButton = (Button) findViewById(R.id.conservationButton);
		conservationButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Uri uri = Uri.parse("http://www.lolt.org/conservation-programs/"); 
				Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
				startActivity(intent);
				
			}
		});
		
//		Button donateButton2 = (Button) findViewById(R.id.donateButton);
//		donateButton2.setOnClickListener(new View.OnClickListener() {
//			public void onClick(View v) {
//
//				Uri uri = Uri.parse("https://16213.thankyou4caring.org/"); 
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
