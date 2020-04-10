package com.vogella.android.vestate;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;
import java.util.ArrayList;
import java.util.List;
public class LandingFragment extends Fragment {
    BottomNavigationView bottomNavigationView;
    CustomViewPager viewPager;
    FragmentAdapter fragmentAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_landing, container, false);
        final List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new BusinessFragment());
        fragmentList.add(new ProfileFragment());
        fragmentList.add(new StatsFragment());
        fragmentAdapter = new FragmentAdapter(getChildFragmentManager(), fragmentList);
        viewPager = view.findViewById(R.id.bottom_nav_viewpager);
        viewPager.setAdapter(fragmentAdapter);
        bottomNavigationView = view.findViewById(R.id.bottom_nav_view);
        bottomNavigationView.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_UNLABELED);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.business_menu_item:
                        viewPager.setCurrentItem(0);
                        return true;
                    case R.id.profile_menu_item:
                        viewPager.setCurrentItem(1);
                        return true;
                    case R.id.stats_menu_item:
                        viewPager.setCurrentItem(2);
                        return true;
                }
                return false;
            }
        });
        return view;
    }
}