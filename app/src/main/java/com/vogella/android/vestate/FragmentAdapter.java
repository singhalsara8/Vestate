package com.vogella.android.vestate;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;
public class FragmentAdapter extends FragmentPagerAdapter {
    List<Fragment> fragmentList;
    List<String> title;
    public FragmentAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
        this.title = new ArrayList<>();
    }
    public FragmentAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentList, List<String> title) {
        super(fm);
        this.fragmentList = fragmentList;
        this.title = title;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }
    @Override
    public int getCount() {
        return fragmentList.size();
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String label;
        try {
            label = title.get(position);
        } catch (Exception e){
            label = "";
        }
        return label;
    }
}