package com.example.student.thuhuong_tuan2_bai1application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ListView lvw_TenSV;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lvw_TenSV=(ListView) findViewById(R.id.lvw_1);
        arrayList=new ArrayList<>();
        arrayList.add("Vu Thi Loan");
        arrayList.add("Vu Thi Thu Huong");
        arrayList.add("Nguyen Duc Hung");
        arrayList.add("Tran Quang Khanh");
        arrayList.add("Nguyen Phuoc Dat");
        arrayList.add("Pham Trung Hieu");

        ArrayAdapter adapter=new ArrayAdapter(ListViewActivity.this,android.R.layout.simple_list_item_1,arrayList);
        lvw_TenSV.setAdapter(adapter);

    }
}
