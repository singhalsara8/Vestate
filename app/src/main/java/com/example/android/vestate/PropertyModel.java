package com.example.android.vestate;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
public class PropertyModel implements Parcelable {
    public Drawable preview, fundedChart;
    public String category, address, irr, price, rentalYield, city;
    public PropertyModel(Drawable preview, Drawable fundedChart, String category, String address, String irr, String price, String rentalYield, String city) {
        this.preview = preview;
        this.fundedChart = fundedChart;
        this.category = category;
        this.address = address;
        this.irr = irr;
        this.price = price;
        this.rentalYield = rentalYield;
        this.city = city;
    }
    protected PropertyModel(Parcel in) {
        Bitmap bitmap = (Bitmap)in.readParcelable(getClass().getClassLoader());
        preview = new BitmapDrawable(bitmap);
        category = in.readString();
        address = in.readString();
        irr = in.readString();
        price = in.readString();
        rentalYield = in.readString();
        city = in.readString();
    }
    public static final Creator<PropertyModel> CREATOR = new Creator<PropertyModel>() {
        @Override
        public PropertyModel createFromParcel(Parcel in) {
            return new PropertyModel(in);
        }
        @Override
        public PropertyModel[] newArray(int size) {
            return new PropertyModel[size];
        }
    };
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
    public String getCity() {
        return city;
    }
    @Override
    public int describeContents() {
        return hashCode();
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        Bitmap bitmap = (Bitmap)((BitmapDrawable) preview).getBitmap();
        dest.writeParcelable(bitmap,flags);
        dest.writeString(category);
        dest.writeString(address);
        dest.writeString(irr);
        dest.writeString(price);
        dest.writeString(rentalYield);
        dest.writeString(city);
    }
}