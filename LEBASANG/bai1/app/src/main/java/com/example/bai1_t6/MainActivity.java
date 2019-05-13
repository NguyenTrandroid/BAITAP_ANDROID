package com.example.bai1_t6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CheckDel {
    EditText edtManv, edtTennv;
    RecyclerView recyclerView;
    Button btAdd, btDel;
    NVAdapter nvAdapter;
    List<NhanVien> nhanVienList;
    RadioGroup radioGroup;
    String sex = "Nữ";
    List<Integer> integers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initAction();
    }

    private void initAction() {
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nhanVienList.add(new NhanVien(edtManv.getText().toString(), edtTennv.getText().toString(),false));
                // Log.e("AAA",sex);
                nvAdapter.notifyDataSetChanged();
                edtManv.setText("");
                edtTennv.setText("");


            }
        });
//        btDel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                for(int i =0 ;i <nhanVienList.size();i++){
//                    for(int j =0 ;j <integers.size();j++)
//                }
//            }
//        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == 2131165222) {
                    sex = "";
                    sex = "Nam";
                } else {
                    sex = "";
                    sex = "Nữ";

                }

            }
        });


    }

    private void init() {
        edtManv = findViewById(R.id.edt_manv);
        edtTennv = findViewById(R.id.edt_tennv);
        recyclerView = findViewById(R.id.rv_nv);
        btAdd = findViewById(R.id.bt_add);
        btDel = findViewById(R.id.bt_del);
        radioGroup = findViewById(R.id.rg_sex);
        nhanVienList = new ArrayList<>();
        integers = new ArrayList<>();
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        nvAdapter = new NVAdapter(this, nhanVienList);
        recyclerView.setAdapter(nvAdapter);


    }

    @Override
    public void checkDel(boolean b, int pos) {
        if (b) {
            integers.add(pos);
        } else {
            integers.remove(pos);
        }
        Log.e("AAA",integers.size()+"");
    }
}
