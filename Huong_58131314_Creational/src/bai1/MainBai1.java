/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Admin
 */
public class MainBai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    HoaDon hoaDonHeader = new HoaDon.HoaDonHeader()
            .addMaHoaDon("HD01")
            .addTenKhachHang("Nguyễn Văn An")
            .addNgayBan("12/12/2017")
            .buidHoaDonHeader();
    System.out.println(hoaDonHeader.toString());
    
    HoaDon cthd = new HoaDon.CTHD()
            .addSanPham("Mì tôm ba miền")
            .addDonGia(3500)
            .addSoLuong(12)
            .addChietKhau(1)
            .buidCTHD();
    System.out.println(cthd.toString());        
    }
    
}
