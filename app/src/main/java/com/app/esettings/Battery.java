package com.app.esettings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Luís Ferreira on 02/11/2016.
 */

public class Battery {

    //Get battery temperature
    public static String batteryTemperature(Context context) {
        Intent intent = context.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        float temp = ((float) intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, 0)) / 10;

        return String.valueOf(temp) + "ºC";
    }

    //Get battery voltage
    public static String batteryVoltage(Context context) {
        Intent intent = context.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        double voltage = intent.getIntExtra(BatteryManager.EXTRA_VOLTAGE, -1);
        voltage = voltage * 0.001;
        return String.valueOf(voltage) + "V";
    }

    //Check if device is plugged or not
    public static String isConnected(Context context) {
        String on = "Yes";
        String off = "Your device is unplugged";
        Intent intent = context.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        int plugged = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
        Integer.toString(plugged);
        if (plugged == 0)
            return on;
        else
            return off;
    }

    public static boolean isConnected2(Context context) {
        boolean isPlugged = false;
        Intent intent = context.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        int plugged = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
        isPlugged = plugged == BatteryManager.BATTERY_PLUGGED_AC || plugged == BatteryManager.BATTERY_PLUGGED_USB;
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN) {
            isPlugged = isPlugged || plugged == BatteryManager.BATTERY_PLUGGED_WIRELESS;
        }
        return isPlugged;
    }
}



