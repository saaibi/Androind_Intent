package com.example.saaibi.androind_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void onStart() {
        super.onStart();
        texto.setText("Paso por el onStart");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        texto.setText("Paso por el onRestart");
    }

    @Override
    public void onResume() {
        super.onResume();
        texto.setText("Paso por el onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        texto.setText("Paso por el onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        texto.setText("Paso por el onStop");
    }

    @Override
    public void onDestroy() {
        super.onStop();
        texto.setText("Paso por el onDestroy");
    }
}
