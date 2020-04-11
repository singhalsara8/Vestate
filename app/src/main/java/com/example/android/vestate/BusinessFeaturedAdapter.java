package com.example.android.vestate;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.vestate.R;

import java.util.List;
public class BusinessFeaturedAdapter extends RecyclerView.Adapter<BusinessFeaturedAdapter.BusinessFeaturedViewHolder> {
    List<PropertyModel> propertyList;
    NavController navController;
    public BusinessFeaturedAdapter(Activity activity, List<PropertyModel> propertyList) {
        this.propertyList = propertyList;
        navController = Navigation.findNavController(activity, R.id.my_nav_host_fragment);
    }
    @NonNull
    @Override
    public BusinessFeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_property,parent,false);
        BusinessFeaturedViewHolder holder = new BusinessFeaturedViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull BusinessFeaturedViewHolder holder, int position) {
        final PropertyModel property = propertyList.get(position);
        holder.preview.setImageDrawable(property.getPreview());
        holder.fundedChart.setImageDrawable(property.getFundedChart());
        holder.category.setText(property.getCategory());
        holder.address.setText(property.getAddress());
        holder.irr.setText(property.getIrr());
        holder.price.setText(property.getPrice());
        holder.rentalYield.setText(property.getRentalYield());
        holder.propertyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("property",property);
                navController.navigate(R.id.action_landingFragment_to_propertyViewFragment,bundle);
            }
        });
    }
    @Override
    public int getItemCount() {
        return propertyList.size();
    }
    class BusinessFeaturedViewHolder extends RecyclerView.ViewHolder {
        ImageView preview, fundedChart;
        TextView category, address, irr, price, rentalYield;
        CardView propertyCard;
        public BusinessFeaturedViewHolder(@NonNull View itemView) {
            super(itemView);
            preview = itemView.findViewById(R.id.list_item_preview);
            fundedChart = itemView.findViewById(R.id.list_item_funded_chart);
            category = itemView.findViewById(R.id.list_item_category);
            address = itemView.findViewById(R.id.list_item_address);
            irr = itemView.findViewById(R.id.list_item_irr);
            price = itemView.findViewById(R.id.list_item_price);
            rentalYield = itemView.findViewById(R.id.list_item_rentalYield);
            propertyCard = itemView.findViewById(R.id.property_card);
        }
    }
}