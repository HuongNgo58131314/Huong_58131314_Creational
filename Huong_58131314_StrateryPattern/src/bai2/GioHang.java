/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class GioHang {
    ArrayList<HangHoa> hangHoas;

    public GioHang() {
        ArrayList<HangHoa> hangHoas = new ArrayList<>();
        this.hangHoas = hangHoas;
    }
    
    public void themHangHoa(HangHoa hangHoa)
    {
        this.hangHoas.add(hangHoa);
    }
    //Hiển thị thông tin hàng hóa 
    public void HienThiTT()
    {
        for(int i=0; i<hangHoas.size(); i++)
        {
            hangHoas.get(i).hienThiTT();
        }
    }
    //Tính tổng hàng hóa
    public int tongTienHang()
    {
        int tongTienHang = 0;
        for(int i=0; i<hangHoas.size(); i++)
        {
            tongTienHang += hangHoas.get(i).getGia();
        }
        return tongTienHang;
    }
    
    public double thanhToan(IThanhToan hinhThucTT, int tongTienHang)
    {
        return hinhThucTT.thanhToan(tongTienHang);
    }
}
