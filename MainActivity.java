package com.geenbedrijf.actualapp_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button fantasyButton;
    private Button historyButton;
    private Button surpriseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // If fantasyButton is clicked, then openWelcome2() will run.
        fantasyButton = findViewById(R.id.fantasyButton);
        fantasyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWelcome2(v);
            }
        });

        // If historyButton is clicked, then openWelcome2() will run.
        historyButton = findViewById(R.id.historyButton);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWelcome2(v);
            }
        });

        // If surpriseButton is clicked, then openWelcome2() will run.
        surpriseButton = findViewById(R.id.surpriseButton);
        surpriseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWelcome2(v);
            }
        });

    }

    // This will lead all the buttons of the welcome screen to the next welcome screen
    public void openWelcome2(View v) {
        switch (v.getId()) {

            case R.id.fantasyButton:
                Intent fantasyIntent = new Intent(getApplicationContext(), fantasy2Activity.class);
                startActivity(fantasyIntent);
                break;

            case R.id.historyButton:
                Intent historyIntent = new Intent(getApplicationContext(), history2Activity.class);
                startActivity(historyIntent);
                break;

            case R.id.surpriseButton:
                // do your code
                break;

            default:
                break;
        }
    }

}
