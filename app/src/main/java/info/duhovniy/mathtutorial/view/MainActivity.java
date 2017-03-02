package info.duhovniy.mathtutorial.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import info.duhovniy.mathtutorial.MathTutorialApplication;
import info.duhovniy.mathtutorial.R;
import info.duhovniy.mathtutorial.databinding.ActivityMainBinding;
import info.duhovniy.mathtutorial.viewmodel.MainViewModel;
import io.reactivex.disposables.CompositeDisposable;

public class MainActivity extends AppCompatActivity {

    @NonNull
    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @NonNull
    private MainViewModel viewModel;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewModel = getViewModel();
        binding.setViewModel(viewModel);
        setSupportActionBar(binding.toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_fetch) {
            //mainViewModel.loadFragmentsFromFile(getString(R.string.json_static_source));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {

        super.onResume();
        bindSubscriptions();
        viewModel.onResume();
    }

    @Override
    protected void onPause() {

        viewModel.onPause();
        compositeDisposable.clear();
        super.onPause();
    }

    private void bindSubscriptions() {

    }

    @NonNull
    private MainViewModel getViewModel() {
        return ((MathTutorialApplication) getApplication()).getViewModel();
    }

    public void handleError(Throwable throwable) {
        Log.e(this.getLocalClassName(), "RX Error", throwable);
    }
}
