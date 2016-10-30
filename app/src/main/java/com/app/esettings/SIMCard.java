package com.app.esettings;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * Created by pcuco on 30/10/2016.
 */
public class SIMCard {


    // GET SIM Card NUmber
        public static String getNumber(Context mContext){
            String simNumber;
            TelephonyManager mTelephonyManager = (TelephonyManager) mContext.getSystemService(Context.TELEPHONY_SERVICE);

            // @TODO - Aadroid 6 permissions
            // @TODO - Dual SIM

            if (mTelephonyManager.getLine1Number() != null) {
                simNumber = mTelephonyManager.getLine1Number();
            } else
                simNumber = mContext.getString(R.string.no_SIMCard);

            if (simNumber != null)
                Toast.makeText(mContext,simNumber, Toast.LENGTH_SHORT).show();
            return simNumber;
        }
}
