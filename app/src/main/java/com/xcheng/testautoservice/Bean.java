package com.xcheng.testautoservice;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @projectName:
 * @author:Yao.Zhang
 * @date :2023/7/19 11:17
 * @version 1.0.0
 */
public class Bean {

    @SerializedName("wifi")
    private Boolean wifi;

    @SerializedName("bluetooth")
    private Boolean bluetooth;

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "wifi=" + wifi +
                ", bluetooth=" + bluetooth +
                '}';
    }
}
