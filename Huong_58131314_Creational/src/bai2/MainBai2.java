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
public class MainBai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuider myStringBuider = new MyStringBuider.Buider()
                .addString("Đây là một chuỗi")
                .addFloat(12)
                .addBool(true)
                .buider();
        System.out.println(myStringBuider.toString());
                
    }
    
}
