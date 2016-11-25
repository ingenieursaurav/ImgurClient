package com.randap.imgurclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by shenanigan on 25/10/16.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<String> mImageUrlList;

    public ImageAdapter(Context mContext, ArrayList<String> mImageUrlList) {
        this.mContext = mContext;
        this.mImageUrlList = mImageUrlList;
    }

    @Override
    public int getCount() {
        return mImageUrlList.size();
    }

    @Override
    public Object getItem(int position) {
        return mImageUrlList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ImageView imageView = (ImageView) convertView;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            // if it's not recycled, initialize some attributes

            View view= inflater.inflate(R.layout.grid_images, null, true);
            imageView = (ImageView) view.findViewById(R.id.image);


        }


//        ArrayList<String> apple = new ArrayList<>();
//        apple = images;
//        if(imageUrlList.get(position)==null) {
//            imageView.setImageResource(R.mipmap.poster_not_available);
//        }
//        else{
            Picasso.with(mContext).load(mImageUrlList.get(position).getPosterPath()).into(imageView);
//        }

        return imageView;
    }
}
