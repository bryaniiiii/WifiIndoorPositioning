package com.talentica.wifiindoorpositioning.wifiindoorpositioning.ui;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.talentica.wifiindoorpositioning.wifiindoorpositioning.ui.frags.PrefsFragment;

import org.jetbrains.annotations.Nullable;

/**
 * Created by suyashg on 10/09/17.
 */

public class UnifiedNavigationActivity extends PreferenceActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new PrefsFragment()).commit();

    }
}
