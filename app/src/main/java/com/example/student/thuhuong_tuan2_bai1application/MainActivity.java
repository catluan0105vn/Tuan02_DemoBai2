package com.example.student.thuhuong_tuan2_bai1application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ListView(View view) {
        Intent intent=new Intent(MainActivity.this,ListViewActivity.class);
        startActivity(intent);
    }

    public void CusSpin(View view) {
        Intent intent = new Intent(MainActivity.this, CusSpinnerActivity.class);
        startActivity(intent);
    }
    public void btnGridView (View view){
        Intent it = new Intent(MainActivity.this, GridViewActivity.class);
        startActivity(it);
    }

}
