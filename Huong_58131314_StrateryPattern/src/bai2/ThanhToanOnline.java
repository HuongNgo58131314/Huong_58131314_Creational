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
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        double tienThanhToan = 0;
        if(tienHang < 1000000)
        {
            tienThanhToan = tienHang - tienHang*0.05;
        }
        else if(tienHang >= 1000000)
        {
            tienThanhToan = tienHang - tienHang*0.07;
        }
        return tienThanhToan;
    }
    
}
