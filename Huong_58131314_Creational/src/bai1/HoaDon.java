/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDon {
    String maHoaDon, tenKhachHang, ngayBan;
    String sanPham;
    int soLuong;
    float donGia, chietKhau;
    ArrayList<CTHD> cthd = new ArrayList<>();

    protected HoaDon(HoaDonHeader hoaDonHeader) {
        this.maHoaDon = hoaDonHeader.maHoaDon;
        this.tenKhachHang = hoaDonHeader.tenKhachHang;
        this.ngayBan = hoaDonHeader.ngayBan;
    }

    protected HoaDon(CTHD cthd) {
        this.sanPham = cthd.sanPham;
        this.soLuong = cthd.soLuong;
        this.donGia = cthd.donGia;
        this.chietKhau = cthd.chietKhau;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", tenKhachHang=" + tenKhachHang + ", ngayBan=" + ngayBan + ", sanPham=" + sanPham + ", soLuong=" + soLuong + ", donGia=" + donGia + ", chietKhau=" + chietKhau + ", cthd=" + cthd + '}';
    }

    
    public static class HoaDonHeader {
        String maHoaDon, tenKhachHang, ngayBan;

        public HoaDonHeader() {
        }
        
        public HoaDonHeader addMaHoaDon(String maHoaDon)
        {
            this.maHoaDon = maHoaDon;
            return this;
        }
        public HoaDonHeader addTenKhachHang(String tenKhachHang)
        {
            this.tenKhachHang = tenKhachHang;
            return this;
        }
        public HoaDonHeader addNgayBan(String ngayBan)
        {
            this.ngayBan = ngayBan;
            return this;
        }
        public HoaDon buidHoaDonHeader()
        {
            return new HoaDon(this);
        }
    }

    public static class CTHD {
        String sanPham;
        int soLuong;
        float donGia, chietKhau;
        ArrayList<CTHD> cthd = new ArrayList<>();
        
        public CTHD() {
        }
        
        public CTHD addSanPham(String sanPham)
        {
            this.sanPham = sanPham;
            return this;
        }
        public CTHD addSoLuong(int soLuong)
        {
            this.soLuong = soLuong;
            return this;
        }
        public CTHD addDonGia(float donGia)
        {
            this.donGia = donGia;
            return this;
        }
        public CTHD addChietKhau(float chietKhau)
        {
            this.chietKhau = chietKhau;
            return this;
        }
        public HoaDon buidCTHD()
        {
            return new HoaDon(this);
        }
    }
    
}
