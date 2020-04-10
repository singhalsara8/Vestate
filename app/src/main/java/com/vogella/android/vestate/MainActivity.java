package com.vogella.android.vestate;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
public class MainActivity extends AppCompatActivity {
    NavController navController;
    MaterialToolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        navController = Navigation.findNavController(this, R.id.my_nav_host_fragment);
        toolbar = findViewById(R.id.toolbar);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                if(destination.getId() == R.id.loginFragment) toolbar.setVisibility(View.GONE);
                else toolbar.setVisibility(View.VISIBLE);
            }
        });
    }
}