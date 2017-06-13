package com.example.android.wifidirect.discovery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity 
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		
		this.setTitle("FAMEus");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() 
			{
				// TODO Auto-generated method stub
				
				
				
				
				
				try {
					Thread.sleep(3000);
					Intent intt=new Intent(Splash.this,WiFiServiceDiscoveryActivity.class);
					startActivity(intt);
					Splash.this.finish();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}



}
