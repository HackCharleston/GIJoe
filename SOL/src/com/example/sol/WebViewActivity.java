package com.example.sol;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;



public class WebViewActivity extends Activity{

private WebView webview;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
		
		webview = (WebView) findViewById(R.id.webview1);
		//webview.settings().setJavaScriptEnabled(true);
		webview.loadUrl("http://www.google.com");
	}
	
	
}
