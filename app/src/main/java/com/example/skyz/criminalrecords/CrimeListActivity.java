package com.example.skyz.criminalrecords;

import android.support.v4.app.Fragment;

/**
 * Created by Skyz on 3/17/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
