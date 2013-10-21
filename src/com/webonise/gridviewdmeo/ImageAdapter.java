package com.webonise.gridviewdmeo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	Context mContext;
	private int[] images = { R.drawable.image1, R.drawable.image2,
			R.drawable.image3, R.drawable.image4, R.drawable.image5,
			R.drawable.image6, R.drawable.image7, R.drawable.image8 };

	// R.drawable.image9, R.drawable.image10, R.drawable.image11};
	// R.drawable.image12 };

	public ImageAdapter(Context context) {
		mContext = context;
	}

	@Override
	public int getCount() {
		return images.length;
	}

	@Override
	public Object getItem(int position) {
		return images[position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) mContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.gallary_item, null);
		ImageView imageView = (ImageView) view.findViewById(R.id.imageViewItem);
		CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkBoxItem);
		checkBox.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.v(null,  "");
				
			}
		});
		imageView.setImageResource(images[position]);
		return view;
	}
}
