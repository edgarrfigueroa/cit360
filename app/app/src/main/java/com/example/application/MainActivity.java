package com.example.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;




import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> arr= new ArrayList();

    Button Add=findViewById(R.id.button);
    Button View=findViewById(R.id.view);
    Button Sort=findViewById(R.id.sort);

    TextView result=findViewById(R.id.output);

    EditText number=findViewById(R.id.Number);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num= number.getText().toString();
                int n=Integer.parseInt(num);

                arr.add(n);



            }
        });


        View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i=0;i<arr.size();i++)
                {
                    int n=arr.get(i);
                    result.setText(i+" , ");

                }



            }
        });


        Sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Thread(new Runnable() {
                    public void run(){

                        result.setText("  ");
                        Collections.sort(arr);

                        for(int i=0;i<arr.size();i++)
                        {
                            int n=arr.get(i);
                            result.setText(i+" , ");

                        }

                    }
                }).start();



            }
        });

    }
}
