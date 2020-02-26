/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhanvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLyNhanVien {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int checkCEO = 0;
        int checkQD = 0;
        Scanner sc = new Scanner(System.in);
        array ar = new array();
            do {       
                int button;
                System.out.println("----------Menu---------");
                System.out.println("1: Nhap thong tin Giam Doc.");
                System.out.println("2: Nhap thong tin Quan Doc.");
                System.out.println("3: Nhap thong tin Nhan Vien.");
                System.out.println("4: Xem thong tin Giam Doc.");
                System.out.println("5: Xem thong tin Quan doc.");
                System.out.println("6: Xem thong tin Nhan Vien.");
                System.out.println("7: Xem thong tin tat ca Nhan Vien.");
                System.out.println("8: Nguoi co luong cao nhat. ");
                System.out.println("9: Nguoi co ho Nguyen. ");
                System.out.println("10: Sap xep NV theo luong. ");
                System.out.println("Nut bat ky: Exit. ");
                System.out.println("--------------------------------");
                System.out.println("Moi nhap lua chon: ");
                button = sc.nextInt();
            switch(button){
                case 1:
                    if(checkCEO < 1){
                        CEO ceo = new CEO();
                        ceo.input();
                        ar.list.add(ceo);
                        checkCEO++;
                        break;
                    }else {
                        System.out.println("CEO ko dc qua 1");
                        break;
                    }
                    
                case 2:
                    if(checkQD <2){
                        QuanDoc QD = new QuanDoc();
                        QD.input();
                        ar.list.add(QD);
                        checkQD++;
                        break;
                    }else {
                        System.out.println("QD ko dc qua 2");
                    }
                    //QuanDoc QD = new QuanDoc("QD","14",2,7);
                    
                case 3:
                    //NhanVien NV = new NhanVien("NV","4",1,"QD");
                    NhanVien NV = new NhanVien();
                    NV.input();
                    ar.list.add(NV);
                    break;
                case 4:
                    ar.outCEO();
                    break;
                case 5:
                    ar.outQD();
                    break;
                case 6:
                    ar.outNV();
                    break;
                case 7:
                    ar.outPutALL();
                    break;
                case 8:
                    ar.MaxSalary();
                    break;
                case 9:
                    ar.printfNguyen();
                    break;
                case 10:
                    ar.sortSalary();
                    break;
                default: return;
            }
        } while (true);
    }

}
