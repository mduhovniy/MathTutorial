package info.duhovniy.mathtutorial.viewmodel;


import android.support.annotation.NonNull;

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

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void handleError(Throwable throwable) {

    }
}
