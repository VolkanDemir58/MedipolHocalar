package com.example.hocalarhafta13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imgKapak;
RecyclerView rcvHocalar;
String resimUrl ="https://cdnuploads.aa.com.tr/uploads/sirkethaberleri/Contents/2022/11/01/thumbs_b_c_52d27ff93260d8862333d89f00fb4f5c.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kapakResminiCek();
        initRecyclerView();
    }



    private void kapakResminiCek()
    {
        imgKapak =findViewById(R.id.imgKapak);
        GlideUtil.resmiIndiripGoster(getApplicationContext(),resimUrl,imgKapak);
    }

    private void initRecyclerView(){
        {
            rcvHocalar =findViewById(R.id.rcvHocalar);
            HocaAdaptor hocaAdaptor =new HocaAdaptor(DataUtil.hocaDatasiAl(),getApplicationContext());
            rcvHocalar.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            rcvHocalar.setAdapter(hocaAdaptor);
        }

    }
}