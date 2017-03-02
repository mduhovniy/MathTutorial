package info.duhovniy.mathtutorial.schedulers;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class RealSchedulerProvider implements SchedulerProvider {

    @Nullable
    private static RealSchedulerProvider INSTANCE;

    // Prevent direct instantiation.
    private RealSchedulerProvider() {
    }

    public static RealSchedulerProvider getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RealSchedulerProvider();
        }
        return INSTANCE;
    }

    @NonNull
    @Override
    public Scheduler computation() {
        return Schedulers.computation();
    }

    @NonNull
    @Override
    public Scheduler ui() {
        return AndroidSchedulers.mainThread();
    }
}
