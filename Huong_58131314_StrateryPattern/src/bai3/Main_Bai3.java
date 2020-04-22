/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author Admin
 */
public class Main_Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tạo danh sách sinh viên
        SinhVien sinhVien1 = new SinhVien("Nguyễn Văn Yên", "12/2/1998", (float) 6.9);
        SinhVien sinhVien2 = new SinhVien("Hồ Kim Lan", "22/4/1998", (float) 7.7);
        SinhVien sinhVien3 = new SinhVien("Trần Danh Phượng", "23/2/1997", (float) 8.5);
        //Thêm sinh viên vào dssv
        QLSV qlsv = new QLSV();
        qlsv.themSV(sinhVien1);
        qlsv.themSV(sinhVien2);
        qlsv.themSV(sinhVien3);
        
        //Hiển thị thông tin đã sắp xếp theo tên sinh viên
        System.out.println("----------------Thông tin sinh viên được sắp xếp theo tên--------------------");
        qlsv.setiSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.hienThiTT();
        
        //Hiển thị thông tin đã sắp xếp theo điểm sinh viên
        System.out.println("--------------Thông tin sinh viên được sắp xếp theo điểm--------------------");
        qlsv.setiSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.hienThiTT();
    }
    
}
