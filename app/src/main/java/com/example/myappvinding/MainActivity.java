package com.example.myappvinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.myappvinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //declarar las variable Binding
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // inflar la vista
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent passSecond = getIntent();


        binding.Name.setText("Jaunito Los palotes");
        binding.Mail.setText("Condorito123@gmail.com");
        binding.Phone.setText("+5698345678");


        binding.Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // recibir la variables

                String name = binding.Name.getText().toString();
                String Correo = binding.Mail.getText().toString();
                String Phone = binding.Phone.getText().toString();
                Log.d("Prueba", name + "  " + Correo);
                passSecond(name, Correo, Phone);


            }
        });

    }



    private void passSecond ( String name, String Correo, String Phone){

        Intent passSecond = new Intent(MainActivity.this,MainActivity2.class);
        Log.d("Prueba2", name + "  " + Correo +"");

        passSecond.putExtra("Name",name);
        passSecond.putExtra("Correo",Correo);
        passSecond.putExtra("Phone",Phone);
        startActivity(passSecond);
    }



}