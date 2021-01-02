package com.example.androidstudiotutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity implements  View.OnClickListener{
  Button btnComplier,btnTutorial;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        btnComplier=(Button)findViewById(R.id.btnSqlCompiler);
        btnTutorial=(Button)findViewById(R.id.btnSqlTutorial);
        btnTutorial.setOnClickListener(this);
        btnComplier.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSqlCompiler: {
                Intent send = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(send);
            }
            case R.id.btnSqlTutorial: {
                Intent send = new Intent(HomeActivity.this, SQLTutorialActivity.class);
                startActivity(send);
            }


        }
    }
}