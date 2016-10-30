package com.app.esettings;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * Created by pcuco on 30/10/2016.
 */
public class SIMCard {

        // GET SIM Card NUmber
        public static String getNumber(Context mContext){
            TelephonyManager mTelephonyManager = (TelephonyManager) mContext.getSystemService(Context.TELEPHONY_SERVICE);
            String simNumber = mTelephonyManager.getLine1Number();

            if (simNumber != null)
                Toast.makeText(mContext,simNumber, Toast.LENGTH_SHORT).show();
            return simNumber;
        }
}
