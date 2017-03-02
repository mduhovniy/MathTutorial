package info.duhovniy.mathtutorial;


import android.app.Application;
import android.support.annotation.NonNull;

import info.duhovniy.mathtutorial.model.DataModel;
import info.duhovniy.mathtutorial.model.MainDataModel;
import info.duhovniy.mathtutorial.schedulers.RealSchedulerProvider;
import info.duhovniy.mathtutorial.schedulers.SchedulerProvider;
import info.duhovniy.mathtutorial.viewmodel.MainViewModel;

public class MathTutorialApplication extends Application {

    @NonNull
    private final DataModel mDataModel;

    public MathTutorialApplication() {
        mDataModel = new MainDataModel();
    }

    @NonNull
    public DataModel getDataModel() {
        return mDataModel;
    }

    @NonNull
    public SchedulerProvider getSchedulerProvider() {
        return RealSchedulerProvider.getInstance();
    }

    @NonNull
    public MainViewModel getViewModel() {
        return new MainViewModel(getDataModel(), getSchedulerProvider());
    }

}