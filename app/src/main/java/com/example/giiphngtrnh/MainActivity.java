package com.example.giiphngtrnh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }
    private Button btnGPT,btnSetting,btnAbout;
    private void addControls(){
        btnAbout = (Button) findViewById(R.id.btnAbout);
        btnSetting = (Button) findViewById(R.id.btnSetting);
        btnGPT = (Button) findViewById(R.id.btnGPT);
    }
    private void addEvents(){
        btnGPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,bac2.class);
                startActivity(intent);
            }
        });
    }
}
