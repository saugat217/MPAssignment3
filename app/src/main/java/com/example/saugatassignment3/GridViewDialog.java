package com.example.saugatassignment3;

import androidx.annotation.NonNull;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import android.widget.TextView;

import java.util.ArrayList;

public class GridViewDialog extends Dialog {
    private GridImageAdapter gridImageAdapter;
    ArrayList<ListData> imgList = new ArrayList<ListData>();
    private TextView title;
    private GridView gridView;
    private Button btnOK;




    public GridViewDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.activity_grid_view_dialog);
        title = findViewById(R.id.titleGridViewDialog);
        gridView = findViewById(R.id.gridView);
        btnOK = findViewById(R.id.btnDialogOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        imgList.add(new ListData(R.drawable.img2,"Image Grid 1"));
        imgList.add(new ListData(R.drawable.img3,"Image Grid 2"));
        imgList.add(new ListData(R.drawable.img4,"Image Grid 3"));
        imgList.add(new ListData(R.drawable.img1,"Image Grid 4"));
        imgList.add(new ListData(R.drawable.img5,"Image Grid 5"));

        GridImageAdapter gridImageAdapter = new GridImageAdapter(context, imgList);
        gridView.setAdapter(gridImageAdapter);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, gridItems);
//        gridView.setAdapter(arrayAdapter);

    }
}