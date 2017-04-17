package com.coolweather.android.db;

/**
 * Created by WDA on 2017/4/17.
 */

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvincename(){
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}

