package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.multicontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    int CT;
    int C1;
    int C2;
    int C3;
    int C4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Botones +1
        binding.Mas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C1++;
                CT++;
                binding.Contador1.setText(String.valueOf(C1));
                binding.ContadorTotal.setText(String.valueOf(CT));
            }
        });

        binding.Mas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C2++;
                CT++;
                binding.Contador2.setText(String.valueOf(C2));
                binding.ContadorTotal.setText(String.valueOf(CT));
            }
        });

        binding.Mas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C3++;
                CT++;
                binding.Contador3.setText(String.valueOf(C3));
                binding.ContadorTotal.setText(String.valueOf(CT));
            }
        });

        binding.Mas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C4++;
                CT++;
                binding.Contador4.setText(String.valueOf(C4));
                binding.ContadorTotal.setText(String.valueOf(CT));
            }
        });

        // Botones RESET

        binding.ResetTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CT = 0;
                C1 = 0;
                C2 = 0;
                C3 = 0;
                C4 = 0;
                binding.ContadorTotal.setText(String.valueOf(CT));
                binding.Contador1.setText(String.valueOf(C1));
                binding.Contador2.setText(String.valueOf(C2));
                binding.Contador3.setText(String.valueOf(C3));
                binding.Contador4.setText(String.valueOf(C4));
            }
        });

        binding.Reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CT = CT - C1;
                binding.ContadorTotal.setText(String.valueOf(CT));
                C1 = 0;
                binding.Contador1.setText(String.valueOf(C1));
            }
        });

        binding.Reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CT = CT - C2;
                binding.ContadorTotal.setText(String.valueOf(CT));
                C2 = 0;
                binding.Contador2.setText(String.valueOf(C2));
            }
        });

        binding.Reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CT = CT - C3;
                binding.ContadorTotal.setText(String.valueOf(CT));
                C3 = 0;
                binding.Contador3.setText(String.valueOf(C3));
            }
        });

        binding.Reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CT = CT - C4;
                binding.ContadorTotal.setText(String.valueOf(CT));
                C4 = 0;
                binding.Contador4.setText(String.valueOf(C4));
            }
        });
    }
}