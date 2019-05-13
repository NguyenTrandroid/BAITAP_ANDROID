package com.example.baitaptuan4.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.baitaptuan4.R;
import com.example.baitaptuan4.adapters.DoanAdapter;
import com.example.baitaptuan4.models.DoAn;

import java.util.ArrayList;

public class ThuAnActivity extends AppCompatActivity {
    ArrayList<DoAn> doAns;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thu_an);
        init();
    }

    private void init() {
        recyclerView=findViewById(R.id.rv_thucan);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        doAns = new ArrayList<>();
        doAns.add(new DoAn(R.drawable.ic_bbh, "Bún Bò Huế"));
        doAns.add(new DoAn(R.drawable.ic_phn, "Phở"));
        doAns.add(new DoAn(R.drawable.ic_mq, "Mì Quảng"));
        doAns.add(new DoAn(R.drawable.ic_htnv, "Hủ Tiếu Nam Vang"));
        DoanAdapter doanAdapter = new DoanAdapter(this,doAns);
        recyclerView.setAdapter(doanAdapter);

    }
}
