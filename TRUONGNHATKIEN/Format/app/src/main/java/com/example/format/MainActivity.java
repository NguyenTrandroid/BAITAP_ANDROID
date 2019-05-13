package com.example.format;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtChu, edtNumber;
    CheckBox cbBgr, cbColor, cbCenter;
    RadioGroup radioGroup;
    Button btnResult;
    TextView tvResult;
    String s = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initAction();
    }

    private void initAction() {
        btnResult.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                if (radioGroup.getCheckedRadioButtonId() == R.id.num_both) {
                    s = "";
                    s += edtNumber.getText().toString();
                } else if (radioGroup.getCheckedRadioButtonId() == R.id.num_even) {
                    //so chan
                    s = "";
                    if (Integer.parseInt(edtNumber.getText().toString()) % 2 == 0) {
                        s += edtNumber.getText().toString();
                    } else {
                        Toast.makeText(MainActivity.this, "Số không hợp lệ", Toast.LENGTH_SHORT).show();
                    }

                } else if (radioGroup.getCheckedRadioButtonId() == R.id.num_odd) {
                    //so le
                    s="";
                    if (Integer.parseInt(edtNumber.getText().toString()) % 2 != 0) {
                        s += edtNumber.getText().toString();
                    } else {
                        Toast.makeText(MainActivity.this, "Số không hợp lệ", Toast.LENGTH_SHORT).show();
                    }

                }
                if (cbCenter.isChecked()) {
                    tvResult.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

                } else {
                    tvResult.setGravity(View.TEXT_ALIGNMENT_TEXT_START);
                }
                if (cbBgr.isChecked()) {
                    tvResult.setBackgroundColor(Color.parseColor("#FFFF00"));
                } else {
                    tvResult.setBackgroundColor(Color.parseColor("#D3D3B7"));

                }
                if (cbColor.isChecked()) {
                    tvResult.setTextColor(Color.parseColor("#FF0000"));
                } else {
                    tvResult.setTextColor(Color.parseColor("#000000"));
                }
                tvResult.setText(edtChu.getText().toString() + " " + s);
            }

        });

    }

    private void init() {
        edtChu = findViewById(R.id.edt_chu);
        edtNumber = findViewById(R.id.edt_number);
        cbBgr = findViewById(R.id.cb_bgr);
        cbColor = findViewById(R.id.cb_color);
        cbCenter = findViewById(R.id.cb_center);
        radioGroup = findViewById(R.id.rg_number);
        btnResult = findViewById(R.id.bt_result);
        tvResult = findViewById(R.id.tv_result);


    }
}
