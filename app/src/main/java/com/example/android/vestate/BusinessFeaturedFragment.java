package com.example.android.vestate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
public class BusinessFeaturedFragment extends Fragment {
    RecyclerView recyclerView;
    List<PropertyModel> propertyList;
    BusinessFeaturedAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_business_featured, container, false);
        recyclerView = view.findViewById(R.id.business_featured_recyclerview);
        propertyList = new ArrayList<>();
        adapter = new BusinessFeaturedAdapter(getActivity(), propertyList);
        PropertyModel propertyModel1 = new PropertyModel(
                getResources().getDrawable(R.drawable.property1),
                getResources().getDrawable(R.drawable.perc1),
                "A1","78 /a, Maker Arcade, G.d.somani Marg, Nr Wtc., Cuffe Parade, Mumbai",
                ": 17%",": 520₹",": 6%","Mumbai");
        PropertyModel propertyModel2 = new PropertyModel(
                getResources().getDrawable(R.drawable.property2),
                getResources().getDrawable(R.drawable.perc2),
                "B1","Pacific Mall, Tagore Garden, G.d.somani Marg, New Delhi",
                ": 16% ",": 620₹",": 9%", "New Delhi");
        PropertyModel propertyModel3 = new PropertyModel(
                getResources().getDrawable(R.drawable.property3),
                getResources().getDrawable(R.drawable.perc3),
                "B2","The Great Indian Place, Sector 38, Uttar Pradesh 201301, Noida",
                ": 18%",": 740₹",": 8%","Noida");
        propertyList.add(propertyModel1);
        propertyList.add(propertyModel2);
        propertyList.add(propertyModel3);
        adapter.notifyDataSetChanged();
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
}