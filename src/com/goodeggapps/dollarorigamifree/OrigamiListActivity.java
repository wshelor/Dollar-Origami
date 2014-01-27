package com.goodeggapps.dollarorigamifree;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;



public class OrigamiListActivity extends ListActivity {


	public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    //lists the values put into the adapter
    String[] values = new String[] { "Butterfly", "Duck", "Frog",
            "Turtle", "Heart", "Ring", "Fish", "Lincoln", "Shirt", "Pants"};
    OrigamiListAdapter adapter = new OrigamiListAdapter(this,
        values);
    setListAdapter(adapter);
  }

  @Override
  protected void onListItemClick(ListView l, View v, int position, long id) {
    int item = (int) getListAdapter().getItemId(position);
    if (item >= 3) {
    	AlertDialog.Builder alertbox = new AlertDialog.Builder(OrigamiListActivity.this);
		alertbox.setTitle("3 Minute Dollar Origami Complete!");
		alertbox.setCancelable(false);
	    alertbox.setMessage("For the complete set of dollar " +
	    		"origami, check out the full version " +
	    		"on Google Play!");
	    alertbox.setNegativeButton("Go There!", 
	    			new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.goodeggapps.dollarorigami")));
					}
	    });
        alertbox.setPositiveButton("Close",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
					}
					
        });
        alertbox.show();
	    
    	
    	
    } else {
    Intent tab = new Intent(OrigamiListActivity.this, OrigamiDisplayActivity.class);
    tab.putExtra("selection", item);
	startActivity(tab);
    }
  }
  @Override
  public void onDestroy() {
     super.onDestroy();
  }
} 