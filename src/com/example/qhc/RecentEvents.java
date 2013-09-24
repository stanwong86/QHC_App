package com.example.qhc;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RecentEvents extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recent_events);
		
		addRecentEvents();
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.recent_events, menu);
		return true;
	}
	
	private void addRecentEvents() {
		
		EditText title1 = (EditText) findViewById(R.id.editTitle1);
		title1.setText("Blood Drive");
		title1.setTypeface(Typeface.DEFAULT_BOLD);
		title1.setTextSize(10);
		
		EditText date1 = (EditText) findViewById(R.id.editDate1);
		date1.setText("September 22, 2013");
		date1.setTextSize(8);
		
		EditText title2 = (EditText) findViewById(R.id.editTitle2);
		title2.setText("October Missions Month 2013");
		title2.setTypeface(Typeface.DEFAULT_BOLD);
		title2.setTextSize(10);
		
		EditText date2 = (EditText) findViewById(R.id.editDate2);
		date2.setText("10/6 - Lily Leen\n10/13 - The Rev. David Schroeder");
		date2.setTextSize(8);
		
		/***
		View linearLayout = findViewById(R.id.listView);
		ImageView img2 = new ImageView(this);
		img2.setImageResource(R.drawable.stewardship);
		((LinearLayout) linearLayout).addView(img2);
		***/
	}

}
