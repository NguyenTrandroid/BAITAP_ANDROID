package com.example.playingcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv1, iv2, iv3;
    TextView tvPoin;
    Button btPlay;
    int a, b, c, sum;
    boolean check1 = true;
    boolean check2 = true;
    boolean check3 = true;

    ArrayList<Card> cardArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initAction();
    }

    private void initAction() {
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check1) {
                    a = randomNumber();
                    iv1.setImageResource(cardArrayList.get(a).getiD());
                    sum += cardArrayList.get(a).getPoint();
                    check1 = false;
                    if (!check1 && !check2 && !check3) {
                        tvPoin.setVisibility(View.VISIBLE);
                        btPlay.setVisibility(View.VISIBLE);
                        setPoin(sum);

                    }
                }

            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check2) {
                    while (true) {
                        b = randomNumber();
                        if (b != a) {
                            break;
                        }
                    }
                    iv2.setImageResource(cardArrayList.get(b).getiD());
                    sum += cardArrayList.get(b).getPoint();
                    check2 = false;
                    if (!check1 && !check2 && !check3) {
                        tvPoin.setVisibility(View.VISIBLE);
                        btPlay.setVisibility(View.VISIBLE);
                        setPoin(sum);

                    }
                }

            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check3) {
                    while (true) {
                        c = randomNumber();
                        if (c != b && c != a) {
                            break;
                        }
                    }
                    iv3.setImageResource(cardArrayList.get(c).getiD());
                    sum += cardArrayList.get(c).getPoint();
                    check3 = false;
                    if (!check1 && !check2 && !check3) {
                        tvPoin.setVisibility(View.VISIBLE);
                        btPlay.setVisibility(View.VISIBLE);
                        setPoin(sum);

                    }
                }


            }
        });
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum = 0;
                check1 = true;
                check2 = true;
                check3 = true;
                iv1.setImageResource(R.drawable.bgr);
                iv2.setImageResource(R.drawable.bgr);
                iv3.setImageResource(R.drawable.bgr);
                tvPoin.setVisibility(View.INVISIBLE);
                btPlay.setVisibility(View.INVISIBLE);
            }
        });


    }

    private void init() {
        iv1 = findViewById(R.id.iv_1);
        iv2 = findViewById(R.id.iv_2);
        iv3 = findViewById(R.id.iv_3);
        tvPoin = findViewById(R.id.tv_poin);
        btPlay = findViewById(R.id.bt_play);
        cardArrayList = new ArrayList<>();
        cardArrayList.add(new Card(R.drawable.mot, 1));
        cardArrayList.add(new Card(R.drawable.hai, 2));
        cardArrayList.add(new Card(R.drawable.ba, 3));
        cardArrayList.add(new Card(R.drawable.bon, 4));
        cardArrayList.add(new Card(R.drawable.nam, 5));
        cardArrayList.add(new Card(R.drawable.sau, 6));
        cardArrayList.add(new Card(R.drawable.bay, 7));
        cardArrayList.add(new Card(R.drawable.tam, 8));
        cardArrayList.add(new Card(R.drawable.chin, 9));
        cardArrayList.add(new Card(R.drawable.muoi, 10));
        cardArrayList.add(new Card(R.drawable.j, 0));
        cardArrayList.add(new Card(R.drawable.q, 0));
        cardArrayList.add(new Card(R.drawable.k, 0));


    }

    private int randomNumber() {
        Random rand = new Random();
        int num = rand.nextInt(cardArrayList.size());
        return num;
    }

    private void setPoin(int sum) {
        if (sum < 10) {
            if (sum == 0) {
                tvPoin.setText("WIN");
            } else {
                tvPoin.setText("Score: " + sum);
            }
        } else {
            if (sum % 10 == 0) {
                tvPoin.setText("Score: " + 0);
            } else {
                tvPoin.setText("Score: " + sum % 10);
            }

        }
    }

}
