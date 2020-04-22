/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLSV {
    ArrayList<SinhVien> sinhViens = new ArrayList<>();
    ISoSanh<SinhVien> iSoSanh;

    public QLSV() {
    }

    public QLSV(ISoSanh<SinhVien> iSoSanh) {
        this.iSoSanh = iSoSanh;
    }

    public ArrayList<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(ArrayList<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public ISoSanh<SinhVien> getiSoSanh() {
        return iSoSanh;
    }

    public void setiSoSanh(ISoSanh<SinhVien> iSoSanh) {
        this.iSoSanh = iSoSanh;
    }
    public void themSV(SinhVien sinhVien){
        sinhViens.add(sinhVien);
    }
    public void hoanVi(SinhVien sv1, SinhVien sv2)
    {
        SinhVien tam = new SinhVien();
        tam.setHoTen(sv1.getHoTen());
        tam.setNgaySinh(sv1.getNgaySinh());
        tam.setDiemTB(sv1.getDiemTB());
        sv1.setHoTen(sv2.getHoTen());
        sv1.setNgaySinh(sv2.getNgaySinh());
        sv1.setDiemTB(sv2.getDiemTB());
        sv2.setHoTen(tam.getHoTen());
        sv2.setNgaySinh(tam.getNgaySinh());
        sv2.setDiemTB(tam.getDiemTB());
    }
    
    public void sapXep(){
        for(int i=0; i<sinhViens.size(); i++)
        {
            for(int j=i+1; j<sinhViens.size(); j++)
            {
                if(this.iSoSanh.soSanh(sinhViens.get(i), sinhViens.get(j)) == 1)
                {
                    hoanVi(sinhViens.get(i), sinhViens.get(j));
                }
            }
        }
    }
    
    public void hienThiTT()
    {
        for(int i=0; i<sinhViens.size(); i++)
            sinhViens.get(i).hienThiTT();
    }
    
}
