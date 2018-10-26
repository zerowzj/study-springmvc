package com.company.project;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DIBean {

    //=============
    private String str;
    private Integer aInteger;
    private Boolean aBoolean;

    //=============
    private String[] strs;
    private List<String> list;
    private Map<String, String> map;
    private Properties prop;


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getaInteger() {
        return aInteger;
    }

    public void setaInteger(Integer aInteger) {
        this.aInteger = aInteger;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public String[] getStrs() {
        return strs;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
}
