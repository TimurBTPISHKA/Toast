package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

    }

    public void buttonClicked(View view) {
        button.setText("Кнопка");
       Toast myToast = Toast.makeText(getApplicationContext(),
                "Ура! Всплывающий поплавок работает", Toast.LENGTH_LONG);
        myToast.show();


    }
}