package com.progdawn.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by dsmye on 5/1/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
