package com.example.giiphngtrnh;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class bac2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pt_bac_2);
        addControls();
    }
    private EditText edtA,edtB,edtC;
    private Button btnResult;
    private ImageView imgB2;
    private void addControls(){
        edtA = (EditText) findViewById(R.id.edtA);
        edtB = (EditText) findViewById(R.id.edtB);
        edtC = (EditText) findViewById(R.id.edtC);
        btnResult =(Button) findViewById(R.id.btnResult);
        imgB2 = (ImageView) findViewById(R.id.imgBac2);
        imgB2.setImageResource(R.drawable.bac2);
    }

}
