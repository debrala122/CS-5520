package com.example.MyFirstApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private  static  final String TAG = "DemoInitialApp";
    private  Button btnClicky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnAboutMe);
        btn.setOnClickListener(this);
        btnClicky = (Button) findViewById(R.id.btnClicky);
        btnClicky.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnAboutMe:
                Log.i(TAG, "This is my name and email address!");
                Toast.makeText(getApplicationContext(), "Name: Wenqiao Xu\nEmail: xu.wenqiao@northeastern.edu", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnClicky:
                openClickActivity();
                break;
        }
    }
    public void openClickActivity(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

}