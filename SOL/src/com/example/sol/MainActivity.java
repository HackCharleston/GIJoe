package com.example.sol;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;

@SuppressWarnings("deprecation")
public class MainActivity extends Activity {

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		
		Button protectButton = (Button) findViewById(R.id.protectButton);
		protectButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Intent intent = new Intent(MainActivity.this, ProtectActivity.class);
				startActivity(intent);
			}
		});
		
		Button raiseButton = (Button) findViewById(R.id.raiseButton);
		raiseButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Intent intent = new Intent(MainActivity.this, RaiseActivity.class);
				startActivity(intent);
			}
		});
		
		Button promoteButton = (Button) findViewById(R.id.promoteButton);
		promoteButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Intent intent = new Intent(MainActivity.this, PromoteActivity.class);
				startActivity(intent);
				
			}
		});
		
//		Button recognizeButton = (Button) findViewById(R.id.recognizeButton);
//		recognizeButton.setOnClickListener(new View.OnClickListener() {
//			public void onClick(View v) {
//
//				Intent intent = new Intent(MainActivity.this, RecognizeActivity.class);
//				startActivity(intent);
//			}
//		});
		
		Button donateButton = (Button) findViewById(R.id.donateButton);
		donateButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Uri uri = Uri.parse("https://16213.thankyou4caring.org/"); 
				Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
				startActivity(intent);
				
				
			}
		});
		
		 // Reference the Gallery view
        Gallery g = (Gallery) findViewById(R.id.gallery1);
        g.setSpacing(2);
        
        // Set the adapter to our custom adapter (below)
        g.setAdapter(new ImageAdapter(this));
	}
public class ImageAdapter extends BaseAdapter {
        
        public ImageAdapter(Context c) {
            mContext = c;
        }

        public int getCount() {
            return mImageIds.length;
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        @SuppressWarnings("deprecation")
		public View getView(int position, View convertView, ViewGroup parent) {
      	
        	ImageView i = new ImageView(mContext);

            i.setImageResource(mImageIds[position]);
            i.setScaleType(ImageView.ScaleType.FIT_XY);
            i.setLayoutParams(new Gallery.LayoutParams(200, 200));
            return i;
        }

        private Context mContext;

        private Integer[] mImageIds = {
                R.drawable.leadenwah_kevin,
                R.drawable.img_intro2,
                R.drawable.img_role,
                R.drawable.img_owl,
                R.drawable.values_2,
                R.drawable.values_3
               
        };
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
