package com.example.diwakar.relcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b = (Button) findViewById(R.id.button);
        //final int c=6;

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String a,b;
                int count=0,flag=0;
                int f=0,cl=0;
                EditText a_inputTxt = (EditText) findViewById(R.id.editText);
                a = a_inputTxt.getText().toString();
                EditText b_inputTxt = (EditText) findViewById(R.id.editText2);
                b = b_inputTxt.getText().toString();

                if(a.trim().isEmpty()) {
                    cl=7;
                }else if(b.trim().isEmpty()){
                    cl=8;
                }else {
                    a = a.toLowerCase();
                    b = b.toLowerCase();
                    a = a.replaceAll("\\s", "");
                    b = b.replaceAll("\\s", "");
                    if (a.equals(b)) {
                        cl = 9;
                    } else {
                        char[] a_arr = a.toCharArray();
                        char[] b_arr = b.toCharArray();
                        for (char ch : a_arr) {
                            flag = 0;
                            for (char ch1 : b_arr) {
                                if (ch == ch1) {
                                    flag = 1;

                                }
                            }
                            if (flag == 0)
                                count++;
                        }

                        for (char ch : b_arr) {
                            flag = 0;
                            for (char ch1 : a_arr) {
                                if (ch == ch1) {
                                    flag = 1;

                                }
                            }
                            if (flag == 0)
                                count++;
                        }
                        int flames[] = {1, 2, 3, 4, 5, 6};
                        int n = 6, i, c = 1;

                       if(count !=0) {

                           while (n != 1) {
                               for (i = 1; i <= n && n != 1; i++) {
                                   if (c == count) {
                                       int temp;
                                       for (int j = i; j < n; j++) {
                                           temp = flames[j - 1];
                                           flames[j - 1] = flames[j];
                                           flames[j] = temp;
                                       }
                                       c = 1;
                                       n--;
                                       i--;
                                   } else
                                       c++;
                                   if (i == n)
                                       i = 0;
                               }
                           }
                       }


                        final int cm = flames[0];
                        int cn=0;

                        if(count == 0){

                                Intent myIntent1 = new Intent(Main2Activity.this, Main12Activity.class);
                                startActivity(myIntent1);

                        }else
                        if (cm == 1) {
                            Intent myIntent1 = new Intent(Main2Activity.this, Main3Activity.class);
                            startActivity(myIntent1);
                        } else if (cm == 2) {
                            Intent myIntent1 = new Intent(Main2Activity.this, Main4Activity.class);
                            startActivity(myIntent1);
                        } else if (cm == 3) {
                            Intent myIntent1 = new Intent(Main2Activity.this, Main5Activity.class);
                            startActivity(myIntent1);
                        } else if (cm == 4) {
                            Intent myIntent1 = new Intent(Main2Activity.this, Main6Activity.class);
                            startActivity(myIntent1);
                        } else if (cm == 5) {
                            Intent myIntent1 = new Intent(Main2Activity.this, Main7Activity.class);
                            startActivity(myIntent1);
                        } else if (cm == 6) {
                            Intent myIntent1 = new Intent(Main2Activity.this, Main8Activity.class);
                            startActivity(myIntent1);
                        }

                    }
                }
                if(cl==7)
                {
                    Intent myIntent1 = new Intent(Main2Activity.this, Main9Activity.class);
                    startActivity(myIntent1);
                }else if(cl==8){
                    Intent myIntent1 = new Intent(Main2Activity.this, Main10Activity.class);
                    startActivity(myIntent1);
                }
                else if(cl==9){
                    Intent myIntent1 = new Intent(Main2Activity.this, Main11Activity.class);
                    startActivity(myIntent1);
                }

            }
        });
    }
}
