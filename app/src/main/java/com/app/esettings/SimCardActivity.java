package com.app.esettings;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

// TODO - Back button
public class SimCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sim_card);


        TextView MSISDN=(TextView)findViewById(R.id.MSISDN);
        MSISDN.setText(SIMCard.getNumber(this));

        TextView country=(TextView)findViewById(R.id.country);
        country.setText(SIMCard.getMCC(this));

        TextView mnc=(TextView)findViewById(R.id.mnc);
        mnc.setText(SIMCard.getMNC(this));

        TextView simSerialNumber=(TextView)findViewById(R.id.SIM_serialNumber);
        simSerialNumber.setText(SIMCard.getSerialNumber(this));


    }
}
