package com.coolweather.android.db;

/**
 * Created by Administrator on 2019/2/11.
 */

public class country {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId() {
        this.cityId = cityId;
    }
}
