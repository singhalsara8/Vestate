
package com.example.android.vestate;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
public class BusinessCitiesFragment extends Fragment {
    RecyclerView filterRecyclerview, propertyRecyclerview;
    BusinessCitiesFilterAdapter filterAdapter;
    BusinessFeaturedAdapter propertyAdapter;
    List<CitiesFilterModel> cityList;
    List<PropertyModel> propertyList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_business_cities, container, false);
        filterRecyclerview = view.findViewById(R.id.cities_filter_recyclerview);
        cityList = new ArrayList<>();
        filterAdapter = new BusinessCitiesFilterAdapter(getContext(),cityList);
        cityList.add(new CitiesFilterModel("Mumbai",1));
        cityList.add(new CitiesFilterModel("Add More",2));
        filterAdapter.notifyDataSetChanged();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        filterRecyclerview.setLayoutManager(layoutManager);
        filterRecyclerview.setAdapter(filterAdapter);
        propertyRecyclerview = view.findViewById(R.id.cities_property_recyclerview);
        propertyList = new ArrayList<>();
        propertyAdapter = new BusinessFeaturedAdapter(propertyList);
        PropertyModel propertyModel1 = new PropertyModel(
                getResources().getDrawable(R.drawable.property1),
                getResources().getDrawable(R.drawable.perc1),
                "A1","78 /a, Maker Arcade, G.d.somani Marg, Nr Wtc., Cuffe Parade,Mumbai",
                ": 17%",": 520₹",": 6%");
        PropertyModel propertyModel2 = new PropertyModel(
                getResources().getDrawable(R.drawable.property4),
                getResources().getDrawable(R.drawable.perc2),
                "B1","44 , Plot No , Crown Plaza, B/h Truck Terminal, Vashi,Mumbai",
                ": 16% ",": 620₹",": 9%");
        PropertyModel propertyModel3 = new PropertyModel(
                getResources().getDrawable(R.drawable.property5),
                getResources().getDrawable(R.drawable.perc3),
                "B2","Plot No D77/1, T T C Indl Area Midc, Vashi, Navi Mumbai",
                ": 18%",": 740₹",": 8%");
        propertyList.add(propertyModel1);
        propertyList.add(propertyModel2);
        propertyList.add(propertyModel3);
        propertyAdapter.notifyDataSetChanged();
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        propertyRecyclerview.setLayoutManager(linearLayoutManager);
        propertyRecyclerview.setAdapter(propertyAdapter);
        return view;
    }
}