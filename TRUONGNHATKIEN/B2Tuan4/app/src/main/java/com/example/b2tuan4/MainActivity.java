package com.example.b2tuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Cauthu> cauthus;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        cauthus = new ArrayList<>();
        recyclerView = findViewById(R.id.rv_Country);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        cauthus.add(new Cauthu(R.drawable.ronaldo, "Ronaldo De Lima", "18 September 1976", R.drawable.br));
        cauthus.add(new Cauthu(R.drawable.ronaldo, "Zinedine Zidane", "23 June 1972", R.drawable.fr));
        cauthus.add(new Cauthu(R.drawable.cannavaro, "Fabio Cannavaro", "13 September 1973", R.drawable.it));
        cauthus.add(new Cauthu(R.drawable.henry, "Thierry Henry", "17 August 1977", R.drawable.fr));
        CauthuAdapter cauthuAdapter = new CauthuAdapter(this, cauthus);
        recyclerView.setAdapter(cauthuAdapter);


    }
}
