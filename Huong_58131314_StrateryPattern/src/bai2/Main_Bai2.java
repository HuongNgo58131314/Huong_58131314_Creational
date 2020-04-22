/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Admin
 */
public class Main_Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang gioHang1 = new GioHang();
        GioHang gioHang2 = new GioHang();
        
        //Tạo 5 hàng hóa
        HangHoa hangHoa1 = new HangHoa("Mì tôm 3 miền", 3000, "Loại đặc biệt");
        HangHoa hangHoa2 = new HangHoa("Mì tôm omachi", 6000, "Không chiên qua dầu");
        HangHoa hangHoa3 = new HangHoa("Đồng hồ đep tay", 120000, "Dành cho nữ");
        HangHoa hangHoa4 = new HangHoa("Đồng hồ nam nữ", 150000, "Dành cho cả nam và nữ");
        HangHoa hangHoa5 = new HangHoa("Dép lào", 50000, "Dép đi thoãi mãi, gon nhẹ");
        
        //Them hàng hóa vào trong giỏ hàng
        gioHang1.themHangHoa(hangHoa1);
        gioHang1.themHangHoa(hangHoa2);
        gioHang2.themHangHoa(hangHoa3);
        gioHang2.themHangHoa(hangHoa4);
        gioHang2.themHangHoa(hangHoa5);
        
        //Hiển thị thông tin giỏ hàng 1
        System.out.println("-------------Thông tin giỏ hàng 1--------------");
        gioHang1.HienThiTT();
        System.out.println("Tổng số tiền hàng là: "+gioHang1.tongTienHang());
        System.out.println("Tổng số tiền khi khách hàng thanh toán online là:"+gioHang1.thanhToan(new ThanhToanOnline(), gioHang1.tongTienHang()));
        System.out.println("Tổng số tiền khi khách hàng thanh toán bằng COD là:"+gioHang1.thanhToan(new ThanhToanCOD(), gioHang1.tongTienHang()));
        
        //Hiển thị thông tin giỏ hàng 2
        System.out.println("------------------Thông tin giỏ hàng 2-------------------");
        gioHang2.HienThiTT();
        System.out.println("Tổng số tiền hang là: "+gioHang2.tongTienHang());
        System.out.println("Tổng số tiền khi khách hàng thanh toán online là: "+gioHang2.thanhToan(new ThanhToanOnline(), gioHang2.tongTienHang()));
        System.out.println("Tổng số tiền khi khách hàng thanh toán bằng COD là:"+gioHang2.thanhToan(new ThanhToanCOD(), gioHang2.tongTienHang()));
    }
    
}
