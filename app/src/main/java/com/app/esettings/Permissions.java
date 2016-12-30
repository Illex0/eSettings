package com.app.esettings;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;



/**
 * Created by pcuco on 28/12/2016.
 */

public class Permissions {


    public static boolean checkForPermission(String permission, Activity view) {
        boolean permissionResult = false;

        if (ContextCompat.checkSelfPermission(view, permission) != PackageManager.PERMISSION_GRANTED) {
            return permissionResult;
        } else {
            permissionResult = true;
            return permissionResult;
        }
    }

    // request Permissions
    public static void askForPermission(String permission, Activity view){
        ActivityCompat.requestPermissions(view, new String[]{permission}, 2);

    }





    ///// ----------------------







}
