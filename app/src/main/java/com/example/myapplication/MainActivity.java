package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etCity;
    TextView tvResult;
    private final String URL="https://api.openweathermap.org/data/2.5/weather";
    private final String APIID="e53301e27efa0b66d05045d91b2742d3";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCity.findViewById(R.id.editTextTextPersonName);
        tvResult.findViewById(R.id.textViewResult);
    }

    public void getWeatherDetails(View view) {
    }
}