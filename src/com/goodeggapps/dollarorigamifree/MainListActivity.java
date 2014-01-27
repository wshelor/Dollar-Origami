package com.goodeggapps.dollarorigamifree;
import com.goodeggapps.dollarorigamifree.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainListActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
	    
	    
	    boolean firstrun = getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("firstrun", true);
	    if (firstrun){
			AlertDialog.Builder alertbox = new AlertDialog.Builder(MainListActivity.this);
			alertbox.setTitle("Thanks!");
			alertbox.setCancelable(false);
		    alertbox.setMessage("\t         Thanks for trying out\n" +
		    		"\t  Three Minute Dollar Origami!\n" +
		    		"\t      If you like it, check out the\n" +
		    		"\t     full version on Google Play!");
	        alertbox.setPositiveButton("Close",
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
						}
	        });
		    alertbox.setNegativeButton("Go There!", 
	    			new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.goodeggapps.dollarorigami")));
					}
		    });
	        alertbox.show();
		    

	    	getSharedPreferences("PREFERENCE", MODE_PRIVATE)
	            .edit()
	            .putBoolean("firstrun", false)
	            .commit();
	    }

	    
	    
        //sets up the font
        Typeface font = Typeface.createFromAsset(getAssets(),"font/castelar.TTF");


	    //sets up buttons to start the main activity.
	    final Button OrigamiSelector = (Button) findViewById(R.id.startbutton);
	    OrigamiSelector.setTypeface(font);
	    
        OrigamiSelector.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
                Intent tab = new Intent(MainListActivity.this, OrigamiListActivity.class);
				startActivity(tab);
			}
		});
        //Sets up an about button.
	    Button HelpImg = (Button) findViewById(R.id.aboutbutton);
	    HelpImg.setTypeface(font);
	   
        HelpImg.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog.Builder alertbox = new AlertDialog.Builder(MainListActivity.this);
				alertbox.setTitle("CREDITS");
				alertbox.setCancelable(false);
			    alertbox.setMessage("" +
	            		"  Concept and Programming by: \n" +
	            		"                     Will Shelor\n\n"+
	            		"                 Special Thanks: \n" +
	            		"                  Maggie Shelor \n" +
	            		"             Deborah Hemingway \n" +
	            		"        Origami Research Center\n" +
	            		"                  The Buck Book\n" +
	            		"                  Origami Sensei");
	            alertbox.setPositiveButton("Close",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
							}
	            });
	            alertbox.show();
			}
		});
	}
		

}


