package com.ngtrdai.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private RadioGroup rdb_group;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.changeImage();
    }

    protected void changeImage(){
        rdb_group = findViewById(R.id.radioGroup);
        imageView = findViewById(R.id.imageView);
        rdb_group.check(R.id.rdBtn_bird);
        imageView.setImageResource(R.drawable.bird);

        Toast.makeText(MainActivity.this, ""+R.id.rdBtn_bird, Toast.LENGTH_SHORT).show();
        rdb_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rdBtn_cat){
                    imageView.setImageResource(R.drawable.cat);
                }else if(checkedId == R.id.rdBtn_dog){
                    imageView.setImageResource(R.drawable.dog);
                }else if(checkedId == R.id.rdBtn_rabbit){
                    imageView.setImageResource(R.drawable.rabbit);
                }else if(checkedId == R.id.rdBtn_bird){
                    imageView.setImageResource(R.drawable.bird);
                }else{
                    imageView.setImageResource(R.drawable.pig);
                }
            }
        });
    }

}
