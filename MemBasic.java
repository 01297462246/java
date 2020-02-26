/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhanvien;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public abstract class MemBasic {
    public String hoTen;
    public String ngaySinh;
    public int heSoLuong;

    public MemBasic(String hoTen, String ngaySinh, int heSoLuong) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.heSoLuong = heSoLuong;
    }
    public MemBasic(){
        
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten NV: ");
        hoTen = sc.next();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh= sc.next();
        System.out.println("Nhap he so luong: ");
        heSoLuong = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Ho Ten: "+hoTen+" \nNgay Sinh: "+ngaySinh+" \n HSL: "+heSoLuong;
    }
}
