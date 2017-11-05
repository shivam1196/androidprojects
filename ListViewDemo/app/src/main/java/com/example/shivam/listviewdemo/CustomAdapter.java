package com.example.shivam.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by shivam on 30/10/17.
 */

public class CustomAdapter extends BaseAdapter{
    Context mContext;
    int [] images;
    String [] names;
    LayoutInflater mLayoutInflater;
    public CustomAdapter(Context context,int[] images,String [] names)
    {
        this.images=images;
        this.names=names;
        mContext=context;
        mLayoutInflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= mLayoutInflater.inflate(R.layout.listadaptor,null);
        ImageView imageView = (ImageView)view.findViewById(R.id.imgView);
        TextView textView =(TextView)view.findViewById(R.id.txtView);
        textView.setText(names[i]);
        imageView.setImageResource(images[i]);
        return  view;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }
}
