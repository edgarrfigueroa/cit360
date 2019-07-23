package com.example.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class landingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);


        Button record;
        Button addNum;
        Button viewNum;
        Button viewWord;

        final Intent r;
        final Intent a;
        final Intent vi;
        final Intent w;


        record=findViewById(R.id.button5);
        addNum=findViewById(R.id.button7);
        viewNum=findViewById(R.id.button6);
        viewWord=findViewById(R.id.button2);



        r=new Intent(this,MainActivity.class);
        a=new Intent(this,JSONparsing.class);
        vi=new Intent(this,HttpGetServletActivity.class);
        w=new Intent(this,HttpURLConnectionActivity.class);

        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(r);
            }
        });

        addNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(a);
            }
        });

        viewNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(vi);
            }
        });
        viewWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(w);
            }
        });

    }
}
