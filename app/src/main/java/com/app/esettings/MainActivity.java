package com.app.esettings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Launch activity_sim_card
    public void onClicSIMCard(View v)
    {
        Intent intent = new Intent(this, SimCardActivity.class);
        this.startActivity(intent);
    }

    public void onClicBattery(View v) {
        Intent intent = new Intent(this, BatteryActivity.class);
        this.startActivity(intent);
    }
}
