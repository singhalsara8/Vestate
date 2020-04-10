package com.example.android.vestate;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public class BusinessCategoryFragment extends Fragment {
    LinearLayout commercial, residential, retail;
    TextView commercialLabel, residentialLabel, retailLabel;
    ImageView commercialImage, residentialImage, retailImage;
    Button rating1, rating2, rating3, rating4, rating5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_business_category, container, false);
        commercial = view.findViewById(R.id.category_commercial);
        commercialLabel = view.findViewById(R.id.category_commercial_label);
        commercialImage = view.findViewById(R.id.category_commercial_image);
        residential = view.findViewById(R.id.category_residential);
        residentialLabel = view.findViewById(R.id.category_residential_label);
        residentialImage = view.findViewById(R.id.category_residential_image);
        retail = view.findViewById(R.id.category_retail);
        retailLabel = view.findViewById(R.id.category_retail_label);
        retailImage = view.findViewById(R.id.category_retail_image);
        rating1 = view.findViewById(R.id.rating1);
        rating2 = view.findViewById(R.id.rating2);
        rating3 = view.findViewById(R.id.rating3);
        rating4 = view.findViewById(R.id.rating4);
        rating5 = view.findViewById(R.id.rating5);
        commercial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commercial.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                commercialImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_category1_white));
                commercialLabel.setTextColor(getResources().getColor(R.color.white));
                residential.setBackgroundColor(getResources().getColor(R.color.white));
                residentialImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_category2));
                residentialLabel.setTextColor(getResources().getColor(R.color.textColor));
                retail.setBackgroundColor(getResources().getColor(R.color.white));
                retailImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_category3));
                retailLabel.setTextColor(getResources().getColor(R.color.textColor));
            }
        });
        residential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commercial.setBackgroundColor(getResources().getColor(R.color.white));
                commercialImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_category1));
                commercialLabel.setTextColor(getResources().getColor(R.color.textColor));
                residential.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                residentialImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_category2_white));
                residentialLabel.setTextColor(getResources().getColor(R.color.white));
                retail.setBackgroundColor(getResources().getColor(R.color.white));
                retailImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_category3));
                retailLabel.setTextColor(getResources().getColor(R.color.textColor));
            }
        });
        retail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commercial.setBackgroundColor(getResources().getColor(R.color.white));
                commercialImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_category1));
                commercialLabel.setTextColor(getResources().getColor(R.color.textColor));
                residential.setBackgroundColor(getResources().getColor(R.color.white));
                residentialImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_category2));
                residentialLabel.setTextColor(getResources().getColor(R.color.textColor));
                retail.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                retailImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_category3_white));
                retailLabel.setTextColor(getResources().getColor(R.color.white));
            }
        });
        rating1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rating1.getCurrentTextColor() == getResources().getColor(R.color.textColor)){
                    rating1.setBackground(getResources().getDrawable(R.drawable.ic_buttonbgblack));
                    rating1.setTextColor(getResources().getColor(R.color.white));
                } else {
                    rating1.setBackground(getResources().getDrawable(R.drawable.ic_buttonbg));
                    rating1.setTextColor(getResources().getColor(R.color.textColor));
                }
            }
        });
        rating2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rating2.getCurrentTextColor() == getResources().getColor(R.color.textColor)){
                    rating2.setBackground(getResources().getDrawable(R.drawable.ic_buttonbgblack));
                    rating2.setTextColor(getResources().getColor(R.color.white));
                } else {
                    rating2.setBackground(getResources().getDrawable(R.drawable.ic_buttonbg));
                    rating2.setTextColor(getResources().getColor(R.color.textColor));
                }
            }
        });
        rating3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rating3.getCurrentTextColor() == getResources().getColor(R.color.textColor)){
                    rating3.setBackground(getResources().getDrawable(R.drawable.ic_buttonbgblack));
                    rating3.setTextColor(getResources().getColor(R.color.white));
                } else {
                    rating3.setBackground(getResources().getDrawable(R.drawable.ic_buttonbg));
                    rating3.setTextColor(getResources().getColor(R.color.textColor));
                }
            }
        });
        rating4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rating4.getCurrentTextColor() == getResources().getColor(R.color.textColor)){
                    rating4.setBackground(getResources().getDrawable(R.drawable.ic_buttonbgblack));
                    rating4.setTextColor(getResources().getColor(R.color.white));
                } else {
                    rating4.setBackground(getResources().getDrawable(R.drawable.ic_buttonbg));
                    rating4.setTextColor(getResources().getColor(R.color.textColor));
                }
            }
        });
        rating5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rating5.getCurrentTextColor() == getResources().getColor(R.color.textColor)){
                    rating5.setBackground(getResources().getDrawable(R.drawable.ic_buttonbgblack));
                    rating5.setTextColor(getResources().getColor(R.color.white));
                } else {
                    rating5.setBackground(getResources().getDrawable(R.drawable.ic_buttonbg));
                    rating5.setTextColor(getResources().getColor(R.color.textColor));
                }
            }
        });
        return view;
    }
}