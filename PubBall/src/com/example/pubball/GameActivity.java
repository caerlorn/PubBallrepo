package com.example.pubball;

//PubBall.GameActivity main activity which game runs on
//Author: Cem S�zen
//Date: 10.07.2013
//Condition: Under Development...

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.Menu;
import android.view.Window;

public class GameActivity extends Activity {

	//Data Field
	private CanvasSurface gameSurface;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_layout);
		
		gameSurface = new CanvasSurface(getApplicationContext());
	}
	

	
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.activity_game_layout, menu);
//		return true;
//	}

}
