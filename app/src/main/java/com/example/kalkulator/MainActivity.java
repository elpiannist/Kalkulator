package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView = findViewById(R.id.textView);
    double a=0.0; double b=0.0; boolean state=false; boolean dot=false; double dotCounter = 10; int d;
    private void createNumber(double number){

        if(!state) {
            if(!dot)
                a = a * 10 + number;
            else {
                a = a + 1 / dotCounter;
                dotCounter *=10;
            }
            textView.setText(Double.toString(a));
        }
        else {
            if(!dot)
                b = b * 10 + number;
            else {
                b = b + (number / dotCounter);
                dotCounter *=10;
            }
            textView.setText(Double.toString(b));
        }
    }
    private void calculate(int d){
        if(d==1) a=a+b;
        if(d==2) a=a-b;
        if(d==3) a=a*b;
        if(d==4) a=a/b;
        dot=false;
        dotCounter=10;
        textView.setText(Double.toString(a));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                dot =true;
            }
        }
        );
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                            createNumber(1);
                                                            }
        }
        );
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                              createNumber(2);
                                                          }
                                                      }
        );
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                              createNumber(3);
                                                          }
                                                      }
        );
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                              createNumber(4);
                                                          }
                                                      }
        );
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                              createNumber(5);
                                                          }
                                                      }
        );
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                              createNumber(6);
                                                          }
                                                      }
        );
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                              createNumber(7);
                                                          }
                                                      }
        );
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                              createNumber(8);
                                                          }
                                                      }
        );
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                              createNumber(9);
                                                          }
                                                      }
        );
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                              if(state)calculate(1);
                                                              state = true;
                                                              dot = false;
                                                              d=1;
                                                          }
                                                      }
        );
        findViewById(R.id.button13).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                              if(state)calculate(2);
                                                              dot = false;
                                                              state = true;
                                                              d=2;
                                                          }
                                                      }
        );
        findViewById(R.id.button14).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                              if(state)calculate(3);
                                                              dot = false;
                                                              state = true;
                                                              d=3;
                                                          }
                                                      }
        );
        findViewById(R.id.button15).setOnClickListener(new View.OnClickListener(){
                                                          public void onClick(View v){
                                                              if(state)calculate(4);
                                                              dot = false;
                                                              state = true;
                                                              d=4;
                                                          }
                                                      }
        );
        findViewById(R.id.button11).setOnClickListener(new View.OnClickListener(){
                                                           public void onClick(View v){
                                                               createNumber(0);
                                                           }
                                                       }
        );
        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener(){
                                                           public void onClick(View v){
                                                              calculate(d);
                                                               state = true;
                                                               dot = false;
                                                           }
                                                       }
        );
        findViewById(R.id.button16).setOnClickListener(new View.OnClickListener(){
                                                           public void onClick(View v){
                                                              a=0.0;
                                                              b=0.0;
                                                              state=false;
                                                              dot=false;
                                                              dotCounter=10;
                                                           }
                                                       }
        );
    }

}
