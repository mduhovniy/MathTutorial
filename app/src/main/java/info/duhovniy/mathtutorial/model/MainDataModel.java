package info.duhovniy.mathtutorial.model;


import android.support.v4.app.Fragment;

import java.util.List;

import info.duhovniy.mathtutorial.dto.Expression;

public class MainDataModel implements DataModel {

    private List<Fragment> slideFragments;

    private Expression expression;

    @Override
    public Fragment getFragment(int pos) {
        return slideFragments.get(pos);
    }

    @Override
    public int getFragmentCount() {
        return slideFragments.size();
    }
}
