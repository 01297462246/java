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
public class NhanVien extends MemBasic{
    private String tenQDPhongBan;

    public NhanVien(){
        
    }
    public NhanVien( String hoTen, String ngaySinh, int heSoLuong,String tenQDPhongBan) {
        super(hoTen, ngaySinh, heSoLuong);
        this.tenQDPhongBan = tenQDPhongBan;
    }

    public String getTenQDPhongBan() {
        return tenQDPhongBan;
    }

    public void setTenQDPhongBan(String tenQDPhongBan) {
        this.tenQDPhongBan = tenQDPhongBan;
    }
    
    private void inputNV(){
        System.out.println("Nhap ten quan doc quan ly phong ban: ");
        Scanner sc = new Scanner(System.in);
        tenQDPhongBan = sc.next();
    } 

    @Override
    public String toString() {
        return super.toString()+"NhanVien{" + "tenQDPhongBan=" + tenQDPhongBan + '}';
    }
}
