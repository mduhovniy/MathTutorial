package info.duhovniy.mathtutorial.model;


import android.support.v4.app.Fragment;

public interface DataModel {

    Fragment getFragment(int pos);

    int getFragmentCount();
}
