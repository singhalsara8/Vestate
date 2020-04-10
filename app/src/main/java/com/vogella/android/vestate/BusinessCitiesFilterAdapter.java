package com.vogella.android.vestate;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class BusinessCitiesFilterAdapter extends RecyclerView.Adapter<BusinessCitiesFilterAdapter.BusinessCitiesFilterViewHolder> {
    List<CitiesFilterModel> cityList;
    Context context;
    public BusinessCitiesFilterAdapter(Context context, List<CitiesFilterModel> cityList) {
        this.context = context;
        this.cityList = cityList;
    }
    @NonNull
    @Override
    public BusinessCitiesFilterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_cities_filter, parent, false);
        BusinessCitiesFilterViewHolder holder = new BusinessCitiesFilterViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull BusinessCitiesFilterViewHolder holder, int position) {
        CitiesFilterModel citiesFilterModel = cityList.get(position);
        holder.city.setText(citiesFilterModel.getCity());
        if (citiesFilterModel.getType() == CitiesFilterModel.TYPE_BUTTON) {
            holder.city.setTextColor(context.getResources().getColor(R.color.white));
            holder.icon.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_add));
            holder.cardView.setCardBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        }
    }
    @Override
    public int getItemViewType(int position) {
        switch (cityList.get(position).type) {
            case 1:
                return CitiesFilterModel.TYPE_CITY;
            case 2:
                return CitiesFilterModel.TYPE_BUTTON;
            default:
                return -1;
        }
    }
    @Override
    public int getItemCount() {
        return cityList.size();
    }
    class BusinessCitiesFilterViewHolder extends RecyclerView.ViewHolder {
        TextView city;
        ImageView icon;
        CardView cardView;
        public BusinessCitiesFilterViewHolder(@NonNull View itemView) {
            super(itemView);
            city = itemView.findViewById(R.id.list_item_city);
            icon = itemView.findViewById(R.id.list_item_icon);
            cardView = itemView.findViewById(R.id.list_item_card);
        }
    }
}
