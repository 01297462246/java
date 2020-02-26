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
public class QuanDoc extends MemBasic{
    private int soLuongNV;

    public QuanDoc(){
        
    }
    public QuanDoc( String hoTen, String ngaySinh, int heSoLuong, int soLuongNV) {
        super(hoTen, ngaySinh, heSoLuong);
        this.soLuongNV = soLuongNV;
    }

    public int getSoLuongNV() {
        return soLuongNV;
    }

    public void setSoLuongNV(int soLuongNV) {
        this.soLuongNV = soLuongNV;
    }
    
    private void inputQD(){
        System.out.println("Nhap so NV quan ly: ");
        Scanner sc = new Scanner(System.in);
        soLuongNV = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+"QuanDoc{" + "soLuongNV=" + soLuongNV + '}';
    }

    
}
