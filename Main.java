/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newdemo;

import java.text.ParseException;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        GiangVien g1 = new GiangVienCoHuu(5, 500000, "Nguyen Van A", "27/09/2003", "19/2/2023", "TienSi", "TienSi", 50);
        GiangVien g2 = new GiangVienThinhGiang("TP.HCM", "Le Van C", "29/1/2003", "1/5/2021", "Tien si", "Giao su", 10);
        GiangVien g3 = new GiangVienCoHuu(7, 400000, "Tran Thi B", "26/10/2003", "10/11/2022", "Tien si", "Khong", 9);
        QuanLyGiangVien Q = new QuanLyGiangVien();
        Q.them(g1,g2,g3);
        Q.hienThi();
//        System.out.println("-----------");
//        Q.xoa("Chu");
        Q.hienThi();
        System.out.println("-----TIM------");
        System.out.println(Q.tim("Tien si"));
    }
}
