package com.example.myappvinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.myappvinding.databinding.ActivityMain2Binding;
import com.example.myappvinding.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {




    private ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        Log.d ("Prueba3 intent",intent.getStringExtra("Name"));

      if(intent !=  null){

          binding.name.setText(intent.getStringExtra("Name"));
          binding.mail.setText(intent.getStringExtra("Correo"));
          binding.phone.setText(intent.getStringExtra("Phone"));
      }



    }
}