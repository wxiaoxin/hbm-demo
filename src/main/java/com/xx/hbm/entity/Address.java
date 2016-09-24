package com.xx.hbm.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by Administrator on 2016/9/24.
 *
 * 地址
 *
 */

@Embeddable
public class Address {

    // 省
    private String province;

    // 市
    private String city;

    // 区
    private String district;

    // 县
    private String county;

    // 镇
    private String town;

    // 村
    private String village;

    // 邮编
    @Column(name = "zip_code")
    private String zipCode;


    public Address() {
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
