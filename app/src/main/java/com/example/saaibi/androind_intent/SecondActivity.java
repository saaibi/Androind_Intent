package com.example.saaibi.androind_intent;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import fr.ganfra.materialspinner.MaterialSpinner;

public class SecondActivity extends AppCompatActivity {
    MaterialSpinner spinnerGuess;
    TextView txtLifeCycle;
    RelativeLayout layout;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        spinnerGuess = (MaterialSpinner) findViewById(R.id.spinerGuess);
        txtLifeCycle = (TextView) findViewById(R.id.txtLifeCycle);
        layout = (RelativeLayout) findViewById(R.id.layout);             //obtienes la referencia del Layout.

        String[] opciones = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinnerGuess.setAdapter(adapter);

        spinnerGuess.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int numRandom = (int) (Math.random() * 9) + 1;
                if (i != -1) {
                    count++;
                    int numSelect = Integer.parseInt(adapterView.getItemAtPosition(i).toString());
                    spinnerGuess.setErrorColor(Color.parseColor("#ffffff"));
                    if (numSelect == numRandom) {
                        spinnerGuess.setError("Felicitaciones Adivinaste!! Intento # " + count);
                        layout.setBackgroundColor(Color.parseColor("#12cc15"));
                    } else {
                        layout.setBackgroundColor(Color.parseColor("#db1515"));//aplicas color.
                        spinnerGuess.setError("Inténtalo de nuevo!!  Intento # " + count);
                    }

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

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
