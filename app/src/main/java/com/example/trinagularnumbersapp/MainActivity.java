package com.example.trinagularnumbersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Numbers{
        int x=1;
        int a=1;
        double number;
        public Boolean isTriangular(){


            while (x<number){
                a++;
                x+=a;
                //System.out.println(x);
            }
            if (x==number){
                return true;
            }else {
                return false;
            }

        }


    }

    public void check(View view){
        EditText number=(EditText) findViewById(R.id.number);
        String result=number.getText().toString();

        String msg1="is a perfect square";
        String msg2="is not a perfect square";



        Numbers func=new Numbers();
        func.number=Double.parseDouble(result);

        double i=Math.floor(Math.sqrt(func.number));

        if(Math.floor(Math.sqrt(func.number))==Math.sqrt(func.number)){
            Toast.makeText(this, func.number+" "+msg1, Toast.LENGTH_LONG).show();
            //System.out.println(func.number+msg1);
        }
        else{
            Toast.makeText(this, func.number+" "+msg2, Toast.LENGTH_LONG).show();
            //System.out.println(func.number+msg2);
    }    if (func.isTriangular()){
            Toast.makeText(this, func.number+" is a triangular number ", Toast.LENGTH_LONG).show();
            //System.out.println(func.number+"  is a triangular number");
        }else {
            Toast.makeText(this, func.number+" is not a triangular number ", Toast.LENGTH_LONG).show();
           // System.out.println(func.number+" This is not a triangular number");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}