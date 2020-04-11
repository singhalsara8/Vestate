package com.example.android.vestate;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
public class PropertyCheckoutFragment extends Fragment {
    EditText sharesEditText;
    TextView sharesCount, totalAmnt, address, city, price, priceUnit;
    ImageView preview;
    PropertyModel property;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_property_checkout, container, false);
        property = getArguments().getParcelable("property");
        sharesEditText = view.findViewById(R.id.property_checkout_shares);
        sharesCount = view.findViewById(R.id.property_checkout_shares_tv);
        totalAmnt = view.findViewById(R.id.checkout_total_amnt);
        preview = view.findViewById(R.id.checkout_preview);
        address = view.findViewById(R.id.checkout_address);
        city = view.findViewById(R.id.checkout_city);
        price = view.findViewById(R.id.property_checkout_price);
        priceUnit = view.findViewById(R.id.property_checkout_price_unit);
        preview.setImageDrawable(property.getPreview());
        String p = property.getPrice();
        p = "₹" + p.substring(2,p.length()-1);
        price.setText(p);
        priceUnit.setText(p);
        address.setText(property.getAddress());
        city.setText(property.getCity());
        final int pricePerUnit = Integer.parseInt(p.substring(1));
        Log.d("check", ""+pricePerUnit);
        sharesEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @SuppressLint("SetTextI18n")
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int cnt = 0;
                if(s.length()!=0) cnt = Integer.parseInt(s.toString());
                sharesCount.setText(String.valueOf(cnt));
                totalAmnt.setText("₹" + (cnt*pricePerUnit));
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        return view;
    }
}