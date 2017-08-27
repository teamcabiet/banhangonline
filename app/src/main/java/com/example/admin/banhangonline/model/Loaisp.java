package com.example.admin.banhangonline.model;

/**
 * Created by Admin on 7/11/2017.
 */

public class Loaisp {
    public int id;
    public String Tenlaoisp;
    public String Hinhanhloaisp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenlaoisp() {
        return Tenlaoisp;
    }

    public void setTenlaoisp(String tenlaoisp) {
        Tenlaoisp = tenlaoisp;
    }

    public String getHinhanhloaisp() {
        return Hinhanhloaisp;
    }

    public void setHinhanhloaisp(String hinhanhloaisp) {
        Hinhanhloaisp = hinhanhloaisp;
    }

    public Loaisp(int id, String tenlaoisp, String hinhanhloaisp) {
        this.id = id;
        Tenlaoisp = tenlaoisp;
        Hinhanhloaisp = hinhanhloaisp;
    }
}
