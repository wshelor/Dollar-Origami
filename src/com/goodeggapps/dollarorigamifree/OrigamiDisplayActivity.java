package com.goodeggapps.dollarorigamifree;

import com.goodeggapps.dollarorigamifree.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OrigamiDisplayActivity extends Activity {

    public static int value;
    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.origamigallery);
        Bundle bundle = getIntent().getExtras();
        value = bundle.getInt("selection");
        MyPagerAdapter adapter = new MyPagerAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.gallery);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(0);
    }
    

    private class MyPagerAdapter extends PagerAdapter {

            public int getCount() {
            	switch (value) {
            		case 0:
            			//butterfly
            			return 9;
            		case 1:
            			//duck
            			return 12;
            		case 2:
            			//frog
            			return 15;
            		default: 
            			return 1;
            			}
            	}

            public Object instantiateItem(View collection, int position) {

                    LayoutInflater inflater = (LayoutInflater) collection.getContext()
                                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    int resId = 0;
                    
                   if (value == 0) {
                    switch (position) {
                    case 0:
                        resId = R.layout.butterfly1;
                        break;
                    case 1:
                        resId = R.layout.butterfly2;
                        break;
                    case 2:
                        resId = R.layout.butterfly3;
                        break;
                    case 3:
                        resId = R.layout.butterfly4;
                        break;
                    case 4:
                    	resId = R.layout.butterfly5;
                    	break;
                    case 5:
                    	resId = R.layout.butterfly6;
                    	break;
                    case 6:
                    	resId = R.layout.butterfly7;
                    	break;
                    case 7:
                    	resId = R.layout.butterfly8;
                    	break;
                    case 8:
                        resId = R.layout.butterfly9;
                        break;
                    }
                   } else if (value == 1) {
                       switch (position) {
                       case 0:
                           resId = R.layout.duck1;
                           break;
                       case 1:
                           resId = R.layout.duck2;
                           break;
                       case 2:
                           resId = R.layout.duck3;
                           break;
                       case 3:
                           resId = R.layout.duck4;
                           break;
                       case 4:
                       		resId = R.layout.duck5;
                       		break;
                       case 5:
                       		resId = R.layout.duck6;
                       		break;
                       case 6:
                       		resId = R.layout.duck7;
                       		break;
                       case 7:
                       		resId = R.layout.duck8;
                       		break;
                       case 8:
                           resId = R.layout.duck9;
                           break;
                       case 9:
                           resId = R.layout.duck10;
                           break;
                       case 10:
                           resId = R.layout.duck11;
                           break;
                       case 11:
                           resId = R.layout.duck12;
                           break;
                       }
                      } else if (value == 2) {
                    	   //Frog
                       switch (position) {
                       case 0:
                           resId = R.layout.frog1;
                           break;
                       case 1:
                           resId = R.layout.frog2;
                           break;
                       case 2:
                           resId = R.layout.frog3;
                           break;
                       case 3:
                           resId = R.layout.frog4;
                           break;
                       case 4:
                       		resId = R.layout.frog5;
                       		break;
                       case 5:
                       		resId = R.layout.frog6;
                       		break;
                       case 6:
                    	   resId = R.layout.frog7;
                       		break;
                       case 7:
                       		resId = R.layout.frog8;
                       		break;
                       case 8:
                           resId = R.layout.frog9;
                           break;
                       case 9:
                           resId = R.layout.frog10;
                           break;
                       case 10:
                           resId = R.layout.frog10b;
                           break;
                       case 11:
                           resId = R.layout.frog11;
                           break;
                       case 12:
                           resId = R.layout.frog12;
                           break;
                       case 13:
                           resId = R.layout.frog13;
                           break;
                       case 14:
                           resId = R.layout.frog14;
                           break;
                       }
                   }

                   
                    View view = inflater.inflate(resId, null);

                    ((ViewPager) collection).addView(view, 0);

                    return view;
            }

            @Override
            public void destroyItem(ViewGroup collection, int position, Object view) {
            	((ViewPager) collection).removeView((View) view);
            }

            @Override
            public void finishUpdate(View arg0) {
            }

            @Override
            public boolean isViewFromObject(View arg0, Object arg1) {
                    return arg0 == ((View) arg1);
            }

            @Override
            public void restoreState(Parcelable arg0, ClassLoader arg1) {
            }

            @Override
            public Parcelable saveState() {
                    return null;
            }

            @Override
            public void startUpdate(View arg0) {
            }

    }
}