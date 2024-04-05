package com.example.lab2_20200241;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    String suma = "+";
    String resta = "-";
    String mult = "*";
    String div = "/";

    String operacionActual = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        Button num0 = findViewById(R.id.num0);
        Button num1 = findViewById(R.id.num1);
        Button num2 = findViewById(R.id.num2);
        Button num3 = findViewById(R.id.num3);
        Button num4 = findViewById(R.id.num4);
        Button num5 = findViewById(R.id.num5);
        Button num6 = findViewById(R.id.num6);
        Button num7 = findViewById(R.id.num7);
        Button num8 = findViewById(R.id.num8);
        Button num9 = findViewById(R.id.num9);

        Button division = findViewById(R.id.division);
        Button multiplicacion = findViewById(R.id.multiplicacion);
        Button suma = findViewById(R.id.suma);
        Button resta = findViewById(R.id.resta);
        Button igual = findViewById(R.id.igual);
        Button CLR = findViewById(R.id.CLR);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_calcular,menu);
        return super.onCreateOptionsMenu(menu);
    }

}