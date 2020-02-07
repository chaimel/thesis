package com.example.outeam2.Models;

import java.sql.Time;

public class Venue {
    private int v_no;
    private String v_img,v_name,v_type;
    private double  v_rph;
    private String v_status;
    private String v_address;
    private Float v_lat;
    private Float v_lng;
    private String v_description;
    private Time v_otime,v_ctime;
    private String business_permit,business_per_img;
    private int vs_id;

    public Venue(String v_name) {
        this.v_name = v_name;
    }

    public Venue(String v_img, String v_name, String v_type, double v_rph, String v_status, float v_lat, float v_lng, String v_description, Time v_otime, Time v_ctime, String business_permit, String business_per_img) {
        this.v_img = v_img;
        this.v_name = v_name;
        this.v_type = v_type;
        this.v_rph = v_rph;
        this.v_status = v_status;
        this.v_lat = v_lat;
        this.v_lng = v_lng;
        this.v_description = v_description;
        this.v_otime = v_otime;
        this.v_ctime = v_ctime;
        this.business_permit = business_permit;
        this.business_per_img = business_per_img;
    }

    public Venue(int v_no, String v_img, String v_name, String v_description, double v_rph, Float v_lat, Float v_lng, Time v_otime, Time v_ctime) {
        this.v_no = v_no;
        this.v_img = v_img;
        this.v_name = v_name;
        this.v_description = v_description;
        this.v_rph = v_rph;
        this.v_lat = v_lat;
        this.v_lng = v_lng;
        this.v_description = v_description;
        this.v_otime = v_otime;
        this.v_ctime = v_ctime;
    }

    public Venue(String v_img, String v_name, String v_description, String v_address, double v_rph) {
        this.v_img = v_img;
        this.v_name = v_name;
        this.v_description = v_description;
        this.v_address = v_address;
        this.v_rph = v_rph;
    }

    public Venue(int v_no, String v_img, String v_name, String v_description, double v_rph, Float v_lat, Float v_lng, Time v_otime, Time v_ctime, int vs_id) {
        this.v_no = v_no;
        this.v_img = v_img;
        this.v_name = v_name;

        this.v_rph = v_rph;

        this.v_lat = v_lat;
        this.v_lng = v_lng;
        this.v_description = v_description;
        this.v_otime = v_otime;
        this.v_ctime = v_ctime;
        this.vs_id = vs_id;
    }

    public String getV_address() {
        return v_address;
    }

    public void setV_address(String v_address) {
        this.v_address = v_address;
    }

    public int getVs_id() {
        return vs_id;
    }

    public void setVs_id(int vs_id) {
        this.vs_id = vs_id;
    }

    public Float getV_lat() {
        return v_lat;
    }

    public void setV_lat(Float v_lat) {
        this.v_lat = v_lat;
    }

    public Float getV_lng() {
        return v_lng;
    }

    public void setV_lng(Float v_lng) {
        this.v_lng = v_lng;
    }

    public int getV_no() {
        return v_no;
    }

    public void setV_no(int v_no) {
        this.v_no = v_no;
    }

    public String getV_img() {
        return v_img;
    }

    public void setV_img(String v_img) {
        this.v_img = v_img;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public String getV_type() {
        return v_type;
    }

    public void setV_type(String v_type) {
        this.v_type = v_type;
    }

    public double getV_rph() {
        return v_rph;
    }

    public void setV_rph(double v_rph) {
        this.v_rph = v_rph;
    }

    public String getV_status() {
        return v_status;
    }

    public void setV_status(String v_status) {
        this.v_status = v_status;
    }


    public String getV_description() {
        return v_description;
    }

    public void setV_description(String v_description) {
        this.v_description = v_description;
    }

    public Time getV_otime() {
        return v_otime;
    }

    public void setV_otime(Time v_otime) {
        this.v_otime = v_otime;
    }

    public Time getV_ctime() {
        return v_ctime;
    }

    public void setV_ctime(Time v_ctime) {
        this.v_ctime = v_ctime;
    }

    public String getBusiness_permit() {
        return business_permit;
    }

    public void setBusiness_permit(String business_permit) {
        this.business_permit = business_permit;
    }

    public String getBusiness_per_img() {
        return business_per_img;
    }

    public void setBusiness_per_img(String business_per_img) {
        this.business_per_img = business_per_img;
    }
}
