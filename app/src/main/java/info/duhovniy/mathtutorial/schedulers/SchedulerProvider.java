package info.duhovniy.mathtutorial.schedulers;

import io.reactivex.Scheduler;

/**
 * Created by nickelAdmin on 02/03/2017.
 */

public interface SchedulerProvider {

    Scheduler computation();

    Scheduler ui();
}
