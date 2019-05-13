package com.example.baitaptuan4.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.baitaptuan4.R;

public class Main2Activity extends AppCompatActivity {
    public static String doan = "";
    public static String douong = "";
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_country);
        init();
        initAction();

    }

    private void initAction() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void init() {
        textView = findViewById(R.id.tv_kq);
        button = findViewById(R.id.thoat);


    }

    public void thucan(View view) {

        startActivity(new Intent(Main2Activity.this, ThuAnActivity.class));
    }

    public void douong(View view) {

        startActivity(new Intent(Main2Activity.this, ThucUongActivity.class));
    }

    @Override
    protected void onResume() {
        textView.setText(doan + "  " + douong);
        super.onResume();
    }
}
