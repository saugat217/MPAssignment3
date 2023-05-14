package com.example.saugatassignment3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListViewWithImageAdapter  extends ArrayAdapter<ListData> {
    public ListViewWithImageAdapter(@NonNull Context context,  ArrayList<ListData>data) {
        super(context, 0,data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        ListData  getDataPosition = getItem(position);
        ImageView ig =v.findViewById(R.id.iV);
        TextView tv = v.findViewById(R.id.titleTextView);
        ig.setImageResource(getDataPosition.images);
        tv.setText(getDataPosition.text);
        return v;

    }
}
