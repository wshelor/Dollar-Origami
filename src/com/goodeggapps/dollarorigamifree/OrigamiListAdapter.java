package com.goodeggapps.dollarorigamifree;

import com.goodeggapps.dollarorigamifree.R;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class OrigamiListAdapter extends ArrayAdapter<String> {
	  private final Context context;
	  private final String[] values;

	  public OrigamiListAdapter(Context context, String[] values) {
	    super(context, R.layout.origamilistlayout, values);
	    this.context = context;
	    this.values = values;
	  }


	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.origamilistlayout, parent, false);
	    TextView textView = (TextView) rowView.findViewById(R.id.label);
	  //sets up the font
        Typeface font = Typeface.createFromAsset(context.getAssets(),"font/castelar.TTF");
        textView.setTypeface(font);
	    ImageView origamiIcon = (ImageView) rowView.findViewById(R.id.icon);
	    textView.setText(values[position]);
	    ImageView difficulty = (ImageView) rowView.findViewById(R.id.difficulty);

	    // Change the icon for Windows and iPhone
	    String s = values[position];
	    if (s.equals("Turtle")) {
	    	  origamiIcon.setImageResource(R.drawable.turtleicon);
	    }else if (s.equals("Frog")) {
	    	  origamiIcon.setImageResource(R.drawable.frogicon);
	    	  difficulty.setImageResource(R.drawable.hardbutton);
	    }else if (s.equals("Fish")) {
	    	  origamiIcon.setImageResource(R.drawable.fishicon);
		}else if (s.equals("Duck")){
			  origamiIcon.setImageResource(R.drawable.duckicon);
	    	  difficulty.setImageResource(R.drawable.easybutton);
		}else if (s.equals("Heart")){
			  origamiIcon.setImageResource(R.drawable.hearticon);
		}else if (s.equals("Ring")){
			  origamiIcon.setImageResource(R.drawable.ringicon);
		} else if (s.equals("Butterfly")){
			  origamiIcon.setImageResource(R.drawable.butterflyicon);
	    	  difficulty.setImageResource(R.drawable.easybutton);
		}else if (s.equals("Shirt")){
			  origamiIcon.setImageResource(R.drawable.shirticon);
		}else if (s.equals("Pants")){
			  origamiIcon.setImageResource(R.drawable.pantsicon);
		}else if (s.equals("Lincoln")){
			  origamiIcon.setImageResource(R.drawable.lincolnicon);
		}
	    

	    return rowView;
	  }
	}