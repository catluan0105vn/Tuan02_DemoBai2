package com.example.student.thuhuong_tuan2_bai1application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class CusSpinnerActivity extends AppCompatActivity {
    TextView tvitem;
    Spinner spin;
    ArrayList<String> arr;
    ArrayAdapter<String> arrAdap = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cus_spinner);
        tvitem = findViewById(R.id.tv_ten);
        spin = findViewById(R.id.sp_item);
        arr = new ArrayList<String>();
        arr.add("mot");
        arr.add("hai");
        arr.add("ba");
        arrAdap = new ArrayAdapter<String>(CusSpinnerActivity.this, android.R.layout.simple_list_item_1,arr);
        spin.setAdapter(arrAdap);
        
    }
}
