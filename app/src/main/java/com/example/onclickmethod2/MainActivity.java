package com.example.onclickmethod2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button obj1,obj2,obj3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obj1=findViewById(R.id.button1);
        obj2=findViewById(R.id.button2);
        obj3=findViewById(R.id.button3);

        obj1.setOnClickListener(this);
        obj2.setOnClickListener(this);
        obj3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Intent intent=new Intent(MainActivity.this,First.class);
                startActivity(intent);
                break;

            case R.id.button2:
                Intent intent1=new Intent(MainActivity.this,Second.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent2=new Intent(MainActivity.this,Third.class);
                startActivity(intent2);
                break;


        }
    }
}