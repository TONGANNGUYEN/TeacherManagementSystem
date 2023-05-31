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
public class GiangVienThinhGiang extends GiangVien{
    private String noiCongTac;

    public GiangVienThinhGiang(String noiCongTac, String hoTen, String ngaySinh, String ngayBatDauCongTac, String hocHam, String hocVi, double soGioLam) throws ParseException {
        super(hoTen, ngaySinh, ngayBatDauCongTac, hocHam, hocVi, soGioLam);
        this.noiCongTac = noiCongTac;
    }

    

    @Override
    public double tinhLuong() {
        return this.getSoGioLam()*90000; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    /**
     * @return the noiCongTac
     */
    public String getNoiCongTac() {
        return noiCongTac;
    }

    /**
     * @param noiCongTac the noiCongTac to set
     */
    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }
    
    
}
