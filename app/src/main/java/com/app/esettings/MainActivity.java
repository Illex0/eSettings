package com.app.esettings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SIM Card number test
        String sim = SIMCard.getNumber(getApplicationContext());
        if (sim != null)
            Toast.makeText(getApplicationContext(),sim, Toast.LENGTH_SHORT).show();

        // MCC test
        String mcc = SIMCard.getMCC(getApplicationContext());
        if (mcc != null)
            Toast.makeText(getApplicationContext(),mcc, Toast.LENGTH_SHORT).show();

        // MNC test
        String mnc = SIMCard.getMNC(getApplicationContext());
        if (mnc != null)
            Toast.makeText(getApplicationContext(),mnc, Toast.LENGTH_SHORT).show();

        //BatteryTemperature test
        String batTemp = Battery.batteryTemperature(this.getApplicationContext());
        if (batTemp != null)
            Toast.makeText(this, batTemp, Toast.LENGTH_SHORT).show();
    }


}
