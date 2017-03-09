package info.duhovniy.mathtutorial.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import info.duhovniy.mathtutorial.viewmodel.MainViewModel;


public class FragmentAdapter extends FragmentPagerAdapter {

    private final MainViewModel viewModel;

    public FragmentAdapter(FragmentManager fm, MainViewModel viewModel) {
        super(fm);
        this.viewModel = viewModel;
    }

    @Override
    public Fragment getItem(int position) {
        return viewModel.getFragment(position);
    }

    @Override
    public int getCount() {
        return viewModel.getFragmentCount();
    }
}
