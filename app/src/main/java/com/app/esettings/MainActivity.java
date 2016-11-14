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

        //BatteryTemperature test
        String batTemp = Battery.batteryTemperature(this.getApplicationContext());
        if (batTemp != null)
            Toast.makeText(this, batTemp, Toast.LENGTH_SHORT).show();

        //BatteryVoltage test
        String batVolt = Battery.batteryVoltage(this.getApplicationContext());
        if (batVolt != null)
            Toast.makeText(this, batVolt, Toast.LENGTH_SHORT).show();

        //Plugged or not?
        boolean plugged = Battery.isConnected(this.getApplicationContext());
        if (plugged == true)
            Toast.makeText(this, "Device is plugged via " + plugged, Toast.LENGTH_SHORT).show();
    }

    // Launch activity_sim_card
    public void onClicSIMCard(View v)
    {
        Intent intent = new Intent(this, SimCardActivity.class);
        this.startActivity(intent);
    }
}
