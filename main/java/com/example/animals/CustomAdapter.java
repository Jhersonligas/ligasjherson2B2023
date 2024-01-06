package com.example.animals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] pic;
    String[]animalsName;

    private LayoutInflater inflater;

    CustomAdapter(Context context,String[]animalsName, int[]pic){
        this.context=context;
        this.animalsName=animalsName;
        this.pic=pic;

    }
    @Override
    public int getCount() {
        return animalsName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view=inflater.inflate(R.layout.sample_view,viewGroup,false);
        }
        ImageView imageView = (ImageView)view.findViewById(R.id.imageViewId);
        TextView textView = (TextView)view.findViewById(R.id.textViewId);
        imageView.setImageResource(pic[i]);
        textView.setText(animalsName[i]);
        return view;
    }
}
