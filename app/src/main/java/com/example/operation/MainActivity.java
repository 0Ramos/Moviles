package com.example.operation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit_nro1, edit_nro2;
    EditText btn_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edit_nro1 =findViewById(R.id.edit_nro1);
        edit_nro2 =findViewById(R.id.edit_nro2);
        btn_enviar =findViewById(R.id.btn_enviar);


        int nro1 = edit_nro1.getText().toString
    }
}