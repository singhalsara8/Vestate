package com.example.android.vestate;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class BusinessFeaturedAdapter extends RecyclerView.Adapter<BusinessFeaturedAdapter.BusinessFeaturedViewHolder> {
    List<PropertyModel> propertyList;
    public BusinessFeaturedAdapter(List<PropertyModel> propertyList) {
        this.propertyList = propertyList;
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
        PropertyModel property = propertyList.get(position);
        holder.preview.setImageDrawable(property.getPreview());
        holder.fundedChart.setImageDrawable(property.getFundedChart());
        holder.category.setText(property.getCategory());
        holder.address.setText(property.getAddress());
        holder.irr.setText(property.getIrr());
        holder.price.setText(property.getPrice());
        holder.rentalYield.setText(property.getRentalYield());
    }
    @Override
    public int getItemCount() {
        return propertyList.size();
    }
    class BusinessFeaturedViewHolder extends RecyclerView.ViewHolder {
        ImageView preview, fundedChart;
        TextView category, address, irr, price, rentalYield;
        public BusinessFeaturedViewHolder(@NonNull View itemView) {
            super(itemView);
            preview = itemView.findViewById(R.id.list_item_preview);
            fundedChart = itemView.findViewById(R.id.list_item_funded_chart);
            category = itemView.findViewById(R.id.list_item_category);
            address = itemView.findViewById(R.id.list_item_address);
            irr = itemView.findViewById(R.id.list_item_irr);
            price = itemView.findViewById(R.id.list_item_price);
            rentalYield = itemView.findViewById(R.id.list_item_rentalYield);
        }
    }
}

