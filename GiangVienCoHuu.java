/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newdemo;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class GiangVienCoHuu extends GiangVien{
    private double heSoLuong;
    private double luongCB;

    public GiangVienCoHuu(double heSoLuong, double luongCB, String hoTen, String ngaySinh, String ngayBatDauCongTac, String hocHam, String hocVi, double soGioLam) throws ParseException {
        super(hoTen, ngaySinh, ngayBatDauCongTac, hocHam, hocVi, soGioLam);
        this.heSoLuong = heSoLuong;
        this.luongCB = luongCB;
    }

    @Override
    public double tinhLuong() {
        return this.getSoGioLam()*90000 + this.getLuongCB()* this.getHeSoLuong();
    }

    /**
     * @return the heSoLuong
     */
    public double getHeSoLuong() {
        return heSoLuong;
    }

    /**
     * @param heSoLuong the heSoLuong to set
     */
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    /**
     * @return the luongCB
     */
    public double getLuongCB() {
        return luongCB;
    }

    /**
     * @param luongCB the luongCB to set
     */
    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }
    
}
