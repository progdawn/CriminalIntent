package com.progdawn.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Dawn Myers on 5/1/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
