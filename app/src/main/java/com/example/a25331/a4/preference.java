package com.example.a25331.a4;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;


public class preference extends PreferenceFragment {
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference);
    }

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        if("yesno_save_individual_info".equals(preference.getKey())) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference)findPreference("yesno_save_individual_info");
            EditTextPreference editTextPreference = (EditTextPreference)findPreference("individual_name");
            editTextPreference.setEnabled(checkBoxPreference.isChecked());
        }
        // TODO Auto-generated method stub
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }
}
