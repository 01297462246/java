/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhanvien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class array {
    ArrayList<MemBasic> list;

    public array() {
        list = new ArrayList<MemBasic>();
    }
    	public void outPutALL() {
            outCEO();
            outQD();
            outNV();
	}
        public void outCEO(){
            	System.out.println("Giam Doc :");
		for (MemBasic mem : list) {
			if(mem instanceof CEO) {
				System.out.println(mem.toString());
			}
		}
        }
        public void outQD(){
                System.out.println("Quan Doc :");
		for (MemBasic mem : list) {
			if(mem instanceof QuanDoc) {
				System.out.println(mem.toString());
			}
		}
        }
        public void outNV(){
            System.out.println("Nhan Vien :");
		for (MemBasic mem : list) {
			if(mem instanceof NhanVien) {
				System.out.println(mem.toString());
			}
		}
        }
        public void MaxSalary(){
            double Max=0;
            String name="";
        for(int i =0 ;i<list.size();i++)
        {
            if(list.get(i).getHeSoLuong()>Max)
            {
                Max = list.get(i).getHeSoLuong();
                name = list.get(i).getHoTen();
            }
        }
            System.out.println("Nguoi co luong cao nhat la: "+ name +"|"+Max*100000);
        }
        public void sortSalary(){
            Collections.sort(list, new Comparator<MemBasic>(){
                @Override
                public int compare(MemBasic t, MemBasic t1) {
                    if(t.heSoLuong > t1.heSoLuong){
                        return 1;
                    }
                    else{
                        if(t.heSoLuong < t1.heSoLuong){
                        return -1;
                        }
                        else
                            return 0;
                    }
                }
            });
            for(int i =0; i<list.size();i++){
                System.out.println("("+list.get(i).getHoTen()+"+"+list.get(i).getHeSoLuong()*100000+")");
            }
        }
        public void printfNguyen(){
            String a = "nguyen";
            for(int i = 0; i<list.size();i++)
            {
                if(list.get(i).getHoTen().toLowerCase().contains(a))
                System.out.println("" + list.get(i).getHoTen());      
            }
        }
}
