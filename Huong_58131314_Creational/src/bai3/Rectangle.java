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
public class Rectangle extends Shape{

    private static Rectangle instance;

    protected Rectangle() {
    }
    
    public static Rectangle Instance()
    {
        if(instance == null)
            instance = new Rectangle();
        return instance;
    }
    @Override
    public String draw() {
        return "Hãy vẽ một hình chữ nhật. ";
    }
    
    
}
