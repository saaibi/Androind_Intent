package com.example.saaibi.androind_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    TextView txtLifeCycle;
    Button btnOpenSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLifeCycle = (TextView) findViewById(R.id.textView);
        btnOpenSecondActivity = (Button) findViewById(R.id.btnOpenSecondActivity);
        btnOpenSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(second);
            }
        });
    }

    //ciclo de vida android
    @Override
    public void onStart() {
        super.onStart();
        txtLifeCycle.setText("Paso por el onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        txtLifeCycle.setText("Paso por el onResume");

    }

    @Override
    public void onRestart() {
        super.onRestart();
        txtLifeCycle.setText("Paso por el onRestart");
    }


    @Override
    public void onPause() {
        super.onPause();
        txtLifeCycle.setText("Paso por el onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        txtLifeCycle.setText("Paso por el onStop");
    }

}
