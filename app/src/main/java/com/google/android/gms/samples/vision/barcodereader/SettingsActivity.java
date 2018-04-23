package com.google.android.gms.samples.vision.barcodereader;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by user on 23/04/2018.
 */

public class SettingsActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
