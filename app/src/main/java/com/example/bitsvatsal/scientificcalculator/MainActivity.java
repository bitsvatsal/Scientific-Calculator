package com.example.bitsvatsal.scientificcalculator;

import android.support.annotation.IntegerRes;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, bequal, bperc,bc,bdec,bsign;
    private static TextView tv;
    private static float n1 = 0,res;
    private static int flag=0,flag1=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero();
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
        nine();
        add();
        sub();
        mul();
        div();
        perc();
        dec();
        sign();
        equal();
        clear();
    }

    public void zero() {
        b0 = (Button) findViewById(R.id.b0);
        tv = (TextView) findViewById(R.id.textView);
        b0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (flag1==6) {
                            tv.setText(tv.getText().toString() + b0.getText().toString());
                        }
                        else if (Float.parseFloat(tv.getText().toString()) == 0 )
                           tv.setText(b0.getText().toString());
                       else if(res!=0)
                           tv.setText(b0.getText().toString());

                        else
                           tv.setText(tv.getText().toString()+ b0.getText().toString());
                    }
                }
        );
    }
    public void one() {
        b1 = (Button) findViewById(R.id.b1);
        tv = (TextView) findViewById(R.id.textView);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if((res==0 && Float.parseFloat(tv.getText().toString()) != 0)
                                ||flag1==6 ){
                            flag1=0;
                            tv.setText(tv.getText().toString()+ b1.getText().toString());}
                        else if (Float.parseFloat(tv.getText().toString()) != 0 && res!=0) {
                            n1=0;
                            res=0;
                            tv.setText(b1.getText().toString());
                        }

                        else
                            tv.setText(b1.getText().toString());
                    }
                }
        );
    }
    public void two() {
        b2 = (Button) findViewById(R.id.b2);
        tv = (TextView) findViewById(R.id.textView);
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if((res==0 && Float.parseFloat(tv.getText().toString()) != 0)||flag1==6 ) {
                            flag1 = 0;
                            tv.setText(tv.getText().toString() + b2.getText().toString());
                        }
                        else if (Float.parseFloat(tv.getText().toString()) != 0 && res!=0) {
                            n1=0;
                            res=0;
                            tv.setText(b2.getText().toString());}

                        else
                            tv.setText(b2.getText().toString());
                    }
                }
        );
    }
    public void three() {
        b3 = (Button) findViewById(R.id.b3);
        tv = (TextView) findViewById(R.id.textView);
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if((res==0 && Float.parseFloat(tv.getText().toString()) != 0)||flag1==6 ){
                            flag1=0;
                            tv.setText(tv.getText().toString()+ b3.getText().toString());}

                        else if (Float.parseFloat(tv.getText().toString()) != 0 && res!=0) {
                            n1=0;
                            res=0;
                            tv.setText(b3.getText().toString());}

                        else
                            tv.setText(b3.getText().toString());
                    }
                }
        );
    }
    public void four() {
        b4 = (Button) findViewById(R.id.b4);
        tv = (TextView) findViewById(R.id.textView);
        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if((res==0 && Float.parseFloat(tv.getText().toString()) != 0)||flag1==6 ){
                            flag1=0;
                            tv.setText(tv.getText().toString()+ b4.getText().toString());}

                        else if (Float.parseFloat(tv.getText().toString()) != 0 && res!=0) {
                            n1=0;
                            res=0;
                            tv.setText(b4.getText().toString());}

                        else
                            tv.setText(b4.getText().toString());


                    }
                }
        );
    }
    public void five() {
        b5 = (Button) findViewById(R.id.b5);
        tv = (TextView) findViewById(R.id.textView);
        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if((res==0 && Float.parseFloat(tv.getText().toString()) != 0)||flag1==6){
                            flag1=0;
                            tv.setText(tv.getText().toString()+ b5.getText().toString());}

                        else if (Float.parseFloat(tv.getText().toString()) != 0 && res!=0) {
                            n1=0;
                            res=0;
                            tv.setText(b5.getText().toString());}

                        else
                            tv.setText(b5.getText().toString());
                    }
                }
        );
    }
    public void six() {
        b6 = (Button) findViewById(R.id.b6);
        tv = (TextView) findViewById(R.id.textView);
        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if((res==0 && Float.parseFloat(tv.getText().toString()) != 0)||flag1==6){
                            flag1=0;
                            tv.setText(tv.getText().toString()+ b6.getText().toString());}

                        else if (Float.parseFloat(tv.getText().toString()) != 0 && res!=0) {
                            n1=0;
                            res=0;
                            tv.setText(b6.getText().toString());}

                        else
                            tv.setText(b6.getText().toString());
                    }
                }
        );
    }
    public void seven() {
        b7 = (Button) findViewById(R.id.b7);
        tv = (TextView) findViewById(R.id.textView);
        b7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if((res==0 && Float.parseFloat(tv.getText().toString()) != 0)||flag1==6){
                            flag1=0;
                            tv.setText(tv.getText().toString()+ b7.getText().toString());}

                        else if (Float.parseFloat(tv.getText().toString()) != 0 && res!=0) {
                            n1=0;
                            res=0;
                            tv.setText(b7.getText().toString());}

                        else
                            tv.setText(b7.getText().toString());
                    }
                }
        );
    }
    public void eight() {
        b8 = (Button) findViewById(R.id.b8);
        tv = (TextView) findViewById(R.id.textView);
        b8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if((res==0 && Float.parseFloat(tv.getText().toString()) != 0)||flag1==6 ){
                            flag1=0;
                            tv.setText(tv.getText().toString()+ b8.getText().toString());}


                        else if (Float.parseFloat(tv.getText().toString()) != 0 && res!=0) {
                            n1=0;
                            res=0;
                            tv.setText(b8.getText().toString());}

                        else
                            tv.setText(b8.getText().toString());
                    }
                }
        );
    }
    public void nine() {
        b9 = (Button) findViewById(R.id.b9);
        tv = (TextView) findViewById(R.id.textView);
        b9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if((res==0 && Float.parseFloat(tv.getText().toString()) != 0)||flag1==6 ){
                            flag1=0;
                            tv.setText(tv.getText().toString()+ b9.getText().toString());}

                        else if (Float.parseFloat(tv.getText().toString()) != 0 && res!=0) {
                            n1=0;
                            res=0;
                            tv.setText(b9.getText().toString());}

                        else
                            tv.setText(b9.getText().toString());
                    }
                }
        );
    }
    public void add() {
        badd = (Button) findViewById(R.id.badd);
        tv = (TextView) findViewById(R.id.textView);
        badd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       if(res==0)
                           n1 += Float.parseFloat(tv.getText().toString());
                        else
                          n1=res;
                        tv.setText("0");
                        flag=1;
                    }
                }

        );
    }
    public void sub() {
        bsub = (Button) findViewById(R.id.bsub);
        tv = (TextView) findViewById(R.id.textView);
        bsub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(n1==0 && res==0)
                        {
                            n1+=Float.parseFloat(tv.getText().toString());
                        }
                        else if(res==0){
                            n1-=Float.parseFloat(tv.getText().toString());

                        }
                        else
                          n1=res;
                        tv.setText("0");
                        flag=2;


                    }
                }

        );
    }
    public void mul() {
        bmul = (Button) findViewById(R.id.bmul);
        tv = (TextView) findViewById(R.id.textView);
        bmul.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(n1==0 && res==0)
                        {
                            n1=Float.parseFloat(tv.getText().toString());
                        }
                        else if (res==0){
                            n1*=Float.parseFloat(tv.getText().toString());

                        }
                        else
                        n1=res;
                        tv.setText("0");
                        flag=3;

                    }
                }

        );
    }
    public void div() {
        bdiv = (Button) findViewById(R.id.bdiv);
        tv = (TextView) findViewById(R.id.textView);
        bdiv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(n1==0&&res==0)
                        {
                            n1+=Float.parseFloat(tv.getText().toString());
                        }
                        else if(res==0){
                            n1/=Float.parseFloat(tv.getText().toString());
                        }
                        else
                         n1=res;
                        tv.setText("0");
                        flag=4;

                    }
                }

        );
    }
    public void clear() {
        bc = (Button) findViewById(R.id.bc);
        tv = (TextView) findViewById(R.id.textView);
        bc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        n1=0;
                        res=0;
                        tv.setText("0");
                        flag=0;

                    }
                }

        );
    }
    public void sign(){
        bsign=(Button)findViewById(R.id.bsign);
        tv = (TextView) findViewById(R.id.textView);
        bsign.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Float s =Float.parseFloat(tv.getText().toString());
                        if(s >= 0){
                            s-=s*2;
                            tv.setText(Float.toString(s));
                        }
                        else{
                            s+=s*(-2);
                            tv.setText(Float.toString(s));
                        }
                    }
                }
        );
    }
    public void dec(){
        bdec=(Button)findViewById(R.id.bdec);
        tv = (TextView) findViewById(R.id.textView);
        bdec.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        flag1=6;
                      tv.setText(tv.getText().toString() + ".");
                    }
                }
        );
    }
    public void perc(){
        bperc=(Button)findViewById(R.id.bperc);
        tv = (TextView) findViewById(R.id.textView);
        bperc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(n1==0&&res==0)
                        {
                            n1+=Float.parseFloat(tv.getText().toString());
                        }
                        else if(res==0){
                            n1=n1%Float.parseFloat(tv.getText().toString())*100;
                        }
                        else
                            n1=res;
                        tv.setText("0");
                        flag=5;
                    }
                });
    }
    public void equal() {
        bequal = (Button) findViewById(R.id.bequal);
        tv = (TextView) findViewById(R.id.textView);
        bequal.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(flag==1){
                           Float n2 = Float.parseFloat(tv.getText().toString());
                           res = n2 + n1;
                       }
                       else if(flag==2){
                           Float n2 = Float.parseFloat(tv.getText().toString());
                           res = n1 - n2;
                       }

                       else if(flag==3){
                           Float n2 = Float.parseFloat(tv.getText().toString());
                           res = n2 * n1;
                       }

                       else if(flag==4){
                           Float n2 = Float.parseFloat(tv.getText().toString());
                           res = n1 / n2;
                       }
                        else if(flag==5){
                            Float n2 = Float.parseFloat(tv.getText().toString());
                            res = n1 % n2;
                        }

                        tv.setText(Float.toString(res));
                        n1=res;
                        flag=0;

                    }
                }

        );
    }

    }



