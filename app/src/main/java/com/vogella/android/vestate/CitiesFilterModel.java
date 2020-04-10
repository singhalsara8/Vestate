package com.vogella.android.vestate;
public class CitiesFilterModel {
    public String city;
    public int type;
    public static int TYPE_CITY = 1;
    public static int TYPE_BUTTON = 2;
    public CitiesFilterModel(String city, int type) {
        this.city = city;
        this.type = type;
    }
    public String getCity() {
        return city;
    }
    public int getType() {
        return type;
    }
    public static int getTypeCity() {
        return TYPE_CITY;
    }
    public static int getTypeButton() {
        return TYPE_BUTTON;
    }
}