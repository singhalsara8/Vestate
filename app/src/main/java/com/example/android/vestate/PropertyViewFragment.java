package com.example.android.vestate;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.os.Parcel;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class PropertyViewFragment extends Fragment {
    Button investButton;
    NavController navController;
    PropertyModel property;
    TextView category, address, price, rentalYield;
    ImageView preview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_property_view, container, false);
        property = getArguments().getParcelable("property");
        navController = Navigation.findNavController(getActivity(), R.id.my_nav_host_fragment);
        investButton = view.findViewById(R.id.property_view_invest_button);
        category = view.findViewById(R.id.property_view_category);
        address = view.findViewById(R.id.property_view_address);
        price = view.findViewById(R.id.property_view_price);
        rentalYield = view.findViewById(R.id.property_view_rental_yield);
        preview = view.findViewById(R.id.property_view_preview);
        category.setText(property.getCategory());
        address.setText(property.getAddress());
        preview.setImageDrawable(property.getPreview());
        String p = property.getPrice();
        price.setText(p.substring(2,p.length()-1));
        String r = property.getRentalYield();
        rentalYield.setText(r.substring(2,r.length()-1));
        investButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("property",property);
                navController.navigate(R.id.action_propertyViewFragment_to_propertyCheckoutFragment,bundle);
            }
        });
        return view;
    }
}
