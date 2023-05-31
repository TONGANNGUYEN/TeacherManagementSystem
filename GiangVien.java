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
public class  GiangVien {
    private String hoTen;
    private Date ngaySinh,ngayBatDauCongTac;
    private String hocHam, hocVi;
    private double soGioLam;
    

    public GiangVien(String hoTen, Date ngaySinh, Date ngayBatDauCongTac, String hocHam, String hocVi, double soGioLam) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngayBatDauCongTac = ngayBatDauCongTac;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.soGioLam = soGioLam;
    }
    
    public GiangVien(String hoTen, String ngaySinh, String ngayBatDauCongTac, String hocHam, String hocVi, double soGioLam) throws ParseException {
        this.hoTen = hoTen;
        this.ngaySinh = CauHinh.SDF.parse(ngaySinh);
        this.ngayBatDauCongTac = CauHinh.SDF.parse(ngayBatDauCongTac);
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.soGioLam = soGioLam;
    }
    
    public double tinhLuong(){
        return 0;
    }

    @Override
    public String toString() {
        return String.format("\nHo va ten: " + this.hoTen+ "\nNgay sinh: " + CauHinh.SDF.format(this.ngaySinh) + "\nHoc ham: " + this.hocHam + "\nHoc vi: " + this.hocVi+ "\nNgay bat dau cong tac: " +CauHinh.SDF.format(this.ngayBatDauCongTac)+"\nLuong: " + this.tinhLuong()+"\n");
    }
    
    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayBatDauCongTac
     */
    public Date getNgayBatDauCongTac() {
        return ngayBatDauCongTac;
    }

    /**
     * @param ngayBatDauCongTac the ngayBatDauCongTac to set
     */
    public void setNgayBatDauCongTac(Date ngayBatDauCongTac) {
        this.ngayBatDauCongTac = ngayBatDauCongTac;
    }

    /**
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the soGioLam
     */
    public double getSoGioLam() {
        return soGioLam;
    }

    /**
     * @param soGioLam the soGioLam to set
     */
    public void setSoGioLam(double soGioLam) {
        this.soGioLam = soGioLam;
    }
}
