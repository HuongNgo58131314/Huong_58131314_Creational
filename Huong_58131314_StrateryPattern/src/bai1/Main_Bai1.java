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
public class Main_Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Phép cộng
        Context s1 = new Context();       
        s1.setTinhToan(new Cong());
        System.out.println("75 + 12 = "+ s1.tinh(75, 12));
        //Phép trừ
        Context s2 = new Context();
        s2.setTinhToan(new Tru());
        System.out.println("58 - 78 = "+s2.tinh(58, 78));
    }
    
}
