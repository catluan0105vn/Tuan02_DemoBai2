package com.example.student.thuhuong_tuan2_bai1application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {
    GridView gridv_1;
    ArrayList<String> ls ;
    ArrayAdapter<String> arrLs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        //Anh Xa :
        gridv_1 = findViewById(R.id.gridv_1);
        //Thiet Lap gia tri cho GridView
        ls = new ArrayList<>();
        ls.add("Nguyen Duc Hung");
        ls.add("Vu Thi Thu Huong");
        ls.add("Vu Thi Loan");
        ls.add("Nguyen Ngoc Minh");
        ls.add("Le Hong Anh");
        ls.add("Nguyen Anh Duc");
        ls.add("Le Thi Tuyet Minh");

        arrLs = new ArrayAdapter<String>(GridViewActivity.this, android.R.layout.simple_list_item_1,ls);
        gridv_1.setAdapter(arrLs);


    }
}
