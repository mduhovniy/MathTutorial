package info.duhovniy.mathtutorial.viewmodel;


import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import info.duhovniy.mathtutorial.model.DataModel;
import info.duhovniy.mathtutorial.schedulers.SchedulerProvider;

public class MainViewModel implements ViewModel {

    @NonNull
    private final DataModel dataModel;

    @NonNull
    private final SchedulerProvider schedulerProvider;

    public MainViewModel(@NonNull final DataModel dataModel,
                         @NonNull final SchedulerProvider schedulerProvider) {
        this.dataModel = dataModel;
        this.schedulerProvider = schedulerProvider;
    }

    public Fragment getFragment(int pos) {
        return dataModel.getFragment(pos);
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void handleError(Throwable throwable) {

    }

    public int getFragmentCount() {
        return dataModel.getFragmentCount();
    }
}
