package info.duhovniy.mathtutorial.view;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import info.duhovniy.mathtutorial.MathTutorialApplication;
import info.duhovniy.mathtutorial.R;
import info.duhovniy.mathtutorial.databinding.ActivityMainBinding;
import info.duhovniy.mathtutorial.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @NonNull
    private MainViewModel viewModel = getViewModel();

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
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

    @NonNull
    private MainViewModel getViewModel() {
        return ((MathTutorialApplication) getApplication()).getViewModel();
    }
}
