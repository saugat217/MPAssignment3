package com.example.saugatassignment3;

import androidx.annotation.NonNull;

import android.app.Dialog;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ImageListViewDialog extends Dialog {
    private GridImageAdapter gridImageAdapter;
    ArrayList<ListData> imgList = new ArrayList<ListData>();
    private ListView listView;
    private Button btnOK;
    ListViewWithImageAdapter listViewWithImageAdapter;


    public ImageListViewDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.activity_image_list_view_dialog);
        listView = findViewById(R.id.dialogListView);
        btnOK = findViewById(R.id.btnDialogOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        populateData();

        listViewWithImageAdapter=new ListViewWithImageAdapter(context,imgList);
        listView.setAdapter(listViewWithImageAdapter);



    }

    void populateData(){
        imgList.add(new ListData(R.drawable.img2,"Image 1"));
        imgList.add(new ListData(R.drawable.img3,"Image 2"));
        imgList.add(new ListData(R.drawable.img4,"Image 3"));
        imgList.add(new ListData(R.drawable.img1,"Image 4"));
        imgList.add(new ListData(R.drawable.img5,"Image 5"));
    }
}