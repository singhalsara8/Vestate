package com.vogella.android.vestate;
import android.graphics.drawable.Drawable;
public class PropertyModel {
    public Drawable preview, fundedChart;
    public String category, address, irr, price, rentalYield;
    public PropertyModel(Drawable preview, Drawable fundedChart, String category, String address, String irr, String price, String rentalYield) {
        this.preview = preview;
        this.fundedChart = fundedChart;
        this.category = category;
        this.address = address;
        this.irr = irr;
        this.price = price;
        this.rentalYield = rentalYield;
    }
    public Drawable getPreview() {
        return preview;
    }
    public Drawable getFundedChart() {
        return fundedChart;
    }
    public String getCategory() {
        return category;
    }
    public String getAddress() {
        return address;
    }
    public String getIrr() {
        return irr;
    }
    public String getPrice() {
        return price;
    }
    public String getRentalYield() {
        return rentalYield;
    }
}