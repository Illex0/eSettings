package com.app.esettings;

import android.bluetooth.BluetoothClass;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import static com.app.esettings.R.id.info;
import static com.app.esettings.R.string.error;

/**
 * Created by Luís Ferreira on 14/11/2016.
 */

public class DeviceModel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DeviceName.with(this.getApplicationContext()).request(new DeviceName.Callback() {

            @Override
            public void onFinished(DeviceName.DeviceInfo info, Exception error) {
                String manufacturer = info.manufacturer;  // "Samsung"
                String name = info.marketName;            // "Galaxy S7 Edge"
                String model = info.model;                // "SAMSUNG-SM-G935A"
                String codename = info.codename;          // "hero2lte"
                String deviceName = info.getName();       // "Galaxy S7 Edge"
                // FYI: We are on the UI thread.
            }
        });

    }

}
