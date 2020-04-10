package com.vogella.android.vestate;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
public class BusinessFragment extends Fragment {
    FragmentAdapter fragmentAdapter;
    CustomViewPager viewPager;
    List<String> title;
    List<Fragment> fragmentList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_business, container, false);
        viewPager = view.findViewById(R.id.business_viewpager);
        title = new ArrayList<>();
        title.add("Featured");
        title.add("Cities");
        title.add("Category");
        fragmentList = new ArrayList<>();
        fragmentList.add(new BusinessFeaturedFragment());
        fragmentList.add(new BusinessCitiesFragment());
        fragmentList.add(new BusinessCategoryFragment());
        fragmentAdapter = new FragmentAdapter(getChildFragmentManager(), fragmentList, title);
        viewPager.setAdapter(fragmentAdapter);
        return view;
    }
}