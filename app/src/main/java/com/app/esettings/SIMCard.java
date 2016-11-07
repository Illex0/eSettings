package com.app.esettings;

import android.content.Context;
import android.telephony.TelephonyManager;

/**
 * Created by pcuco on 30/10/2016.
 */

// @TODO - Android 6 permissions
// @TODO - Dual SIM

public class SIMCard {

    // GET SIM Card NUmber
    public static String getNumber(Context mContext){
        String simNumber;
        TelephonyManager mTelephonyManager = (TelephonyManager) mContext.getSystemService(Context.TELEPHONY_SERVICE);

        if (mTelephonyManager.getLine1Number() != null) {
            simNumber = mTelephonyManager.getLine1Number();
        } else
            simNumber = mContext.getString(R.string.NO_SIMCard);

        return simNumber;
    }

    //GET MCC(country)
    public static String getMCC (Context mContext){

        String mcc;
        TelephonyManager mTelephonyManager = (TelephonyManager) mContext.getSystemService(Context.TELEPHONY_SERVICE);

        if (mTelephonyManager.getSimCountryIso() != null) {
            mcc = mTelephonyManager.getSimCountryIso();

        } else {
            mcc = mContext.getString(R.string.NO_SIMCard);
        }
        return mcc;
    }

    // GET MNC(Operator)
    public static String getMNC (Context mContext){

        String mnc;
        TelephonyManager mTelephonyManager = (TelephonyManager) mContext.getSystemService(Context.TELEPHONY_SERVICE);

        if (mTelephonyManager.getSimOperator() != null) {
            mnc = mTelephonyManager.getSimOperator();

        } else {
            mnc = mContext.getString(R.string.NO_SIMCard);
        }
        return mnc;
    }

    // GET SIM Serial Number
    public static String getSerialNumber (Context mContext){

        String simSerialNumber;
        TelephonyManager mTelephonyManager = (TelephonyManager) mContext.getSystemService(Context.TELEPHONY_SERVICE);

        if (mTelephonyManager.getSimSerialNumber() != null) {
            simSerialNumber = mTelephonyManager.getSimSerialNumber();

        } else {
            simSerialNumber = mContext.getString(R.string.NO_SIMCard);
        }
        return simSerialNumber;
    }
}
