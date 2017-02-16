package info.duhovniy.mathtutorial.viewmodel;


import android.support.annotation.NonNull;

import info.duhovniy.mathtutorial.model.DataModel;
import info.duhovniy.mathtutorial.model.SchedulerProvider;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MainViewModel implements ViewModel {

    @NonNull
    private final DataModel dataModel;

    @NonNull
    private final SchedulerProvider schedulerProvider;


}
