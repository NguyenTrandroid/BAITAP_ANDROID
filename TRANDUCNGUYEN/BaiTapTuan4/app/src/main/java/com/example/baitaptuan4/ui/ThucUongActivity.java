package com.example.baitaptuan4.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.baitaptuan4.R;
import com.example.baitaptuan4.adapters.DoanAdapter;
import com.example.baitaptuan4.adapters.ThucUongAdapter;
import com.example.baitaptuan4.models.DoAn;

import java.util.ArrayList;

public class ThucUongActivity extends AppCompatActivity {
    ArrayList<DoAn> doAns;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thuc_uong);
        init();
    }

    private void init() {
        recyclerView = findViewById(R.id.rv_thucuong);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        doAns = new ArrayList<>();
        doAns.add(new DoAn(R.drawable.ic_coca, "Coca"));
        doAns.add(new DoAn(R.drawable.ic_pepsi, "Pepsi"));
        doAns.add(new DoAn(R.drawable.ic_heniken, "Heniken"));
        doAns.add(new DoAn(R.drawable.ic_aquafina, "Aquafina"));
        ThucUongAdapter thucUongAdapter = new ThucUongAdapter(this, doAns);
        recyclerView.setAdapter(thucUongAdapter);
    }
}
