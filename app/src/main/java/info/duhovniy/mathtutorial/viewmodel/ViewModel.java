package info.duhovniy.mathtutorial.viewmodel;


public interface ViewModel {

    void onResume();

    void onPause();

    void handleError(Throwable throwable);
}
