package deepdive.cnm.edu.criminalintent.controller;

import android.support.v4.app.Fragment;
import deepdive.cnm.edu.criminalintent.SingleFragmentActivity;

public class CrimeListActivity extends SingleFragmentActivity {

  @Override
  protected Fragment createFragment() {
    return new CrimeListFragment();
  }

}
