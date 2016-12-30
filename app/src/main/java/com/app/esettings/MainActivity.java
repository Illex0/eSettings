package com.app.esettings;

import android.Manifest;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    static final Integer CALL = 0x2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Request permissions
        //Permissions.phoneState(this);
        //Permissions.askForPermission(Manifest.permission.READ_PHONE_STATE,CALL,this);


        //Validation
        //Permissions.permissionsValidation(this);



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton backButton = (ImageButton) this.findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    // Launch activity_sim_card
    public void onClicSIMCard(View v)
    {
        if (Permissions.checkForPermission(Manifest.permission.READ_PHONE_STATE,this)) {
            Intent intent = new Intent(this, SimCardActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            this.startActivity(intent);
        } else {
            Permissions.askForPermission(Manifest.permission.READ_PHONE_STATE,this);

        }
    }

    public void onClicBattery(View v) {
        if (Permissions.checkForPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE,this)) {
            Intent intent = new Intent(this, BatteryActivity.class);
            this.startActivity(intent);
        } else {
            Permissions.askForPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE,this);

        }
    }


}

