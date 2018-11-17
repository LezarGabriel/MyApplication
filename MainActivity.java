package com.example.y700.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper flipermotor;
    TextView text1;
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipermotor = (ViewFlipper) findViewById(R.id.flipermotor);
        text1       = (TextView) findViewById(R.id.text1);
        button1     = (Button)findViewById(R.id.btn1);
        button2     = (Button)findViewById(R.id.btn2);
        button3     = (Button) findViewById(R.id.btn3);

        /*------------------------MULAI FUNGSI FLIPPER--------------------*/
        int datamotor[] = {
                R.drawable.img1,
                R.drawable.img2,
                R.drawable.img3};
        for (int i=0;i < datamotor.length; i++){
            flipper(datamotor[i]);

        }
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"TEXTVIEW TELAH DI CLICK",Toast.LENGTH_SHORT).show();
            }
        });
        /*------------------------AKHIR FUNGSI FLIPPER--------------------*/

        /*------------------------AWAL FUNGSI TENTANG BUTTON------------------*/



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menujulanding1 = new Intent(MainActivity.this,Landing_Activity.class);
                menujulanding1.putExtra("DATA1","BUTTON 1");
                startActivity(menujulanding1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menujulanding2 = new Intent(MainActivity.this,Landing_Activity.class);
                menujulanding2.putExtra("DATA2", "YANGKE2");
                startActivity(menujulanding2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menujulanding3 = new Intent(MainActivity.this,Landing_Activity.class);
                menujulanding3.putExtra("DATA3", "YANGKE3");
                startActivity(menujulanding3);
            }
        });

        /*------------------------AKHIR FUNGSI TENTANG BUTTON------------------*/
    }

    public void flipper(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        flipermotor.addView(imageView);
        flipermotor.setFlipInterval(2000);
        flipermotor.setAutoStart(true);
    }
}

