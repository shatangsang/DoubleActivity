package com.example.doubleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_acitivity);
        Button button = (Button)findViewById(R.id.btn2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Integer age = intent.getIntExtra("age",20);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String name = intent.getStringExtra("name");
                Integer age = intent.getIntExtra("age",20);

                intent.putExtra("result","姓名："+name+"年龄"+age);
                setResult(0,intent);
                finish();
            }
        });
        Toast.makeText(this,name+age,Toast.LENGTH_LONG).show();
    }

}