/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
/**
 *
 * @author Admin
 */
public class QuanLyGiangVien {
    private List<GiangVien> ds = new ArrayList<>();
    
    
    //Them giang vien
    public void them(GiangVien... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    
    //Hien thi thong tin giang vien
    public void hienThi(){
        this.ds.forEach(h -> System.out.println(h));
    }
    
    public void xoa(String k) {
        this.ds.removeIf(h -> h.getHoTen().contains(k));
    }
    
    
    public List<GiangVien> tim(String k) {
        return this.ds.stream().filter(h -> h.getHoTen().contains(k) || h.getHocHam().contains(k) || h.getHocVi().contains(k)).collect(Collectors.toList());
    }
    
}
