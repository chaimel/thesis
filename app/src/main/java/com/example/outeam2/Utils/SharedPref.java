package com.example.outeam2.Utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {
    public void addPrefString(Context context,String key,String value){
        SharedPreferences mPrefs = context.getSharedPreferences("outeam_credentials", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString(key, value);
        editor.commit();
    }
    public String getPrefString(Context context,String key){
        SharedPreferences mPrefs = context.getSharedPreferences("outeam_credentials",0);
        String pref=  mPrefs.getString(key, null);
        return pref;
    }
}
