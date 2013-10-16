package com.webonise.gridviewdmeo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	Context mContext;
	private int[] images = { R.drawable.image1, R.drawable.image2,
			R.drawable.image3, R.drawable.image4, R.drawable.image5,
			R.drawable.image6, R.drawable.image7, R.drawable.image8,
			R.drawable.image9, R.drawable.image10, R.drawable.image11,
			R.drawable.image12 };

	// R.drawable.image13, R.drawable.image14,
	// R.drawable.image15, R.drawable.image16, R.drawable.image17,
	// R.drawable.image18, R.drawable.image19, R.drawable.image20};
	// R.drawable.image21, R.drawable.image22, R.drawable.image23,
	// R.drawable.image24, R.drawable.image25, R.drawable.image26,
	// R.drawable.image27, R.drawable.image28, R.drawable.image29,
	// R.drawable.image30, R.drawable.image31, R.drawable.image32 };

	public ImageAdapter(Context context) {
		mContext = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return images.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return images[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView = new ImageView(mContext);
		imageView.setImageResource(images[position]);
		imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
		imageView.setLayoutParams(new GridView.LayoutParams(210, 210));
		return imageView;
	}
}
