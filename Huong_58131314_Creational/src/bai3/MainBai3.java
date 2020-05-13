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
public class MainBai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory rectangle = new ShapeFactory();
        rectangle.createShape(ShapeType.rectangle);
        System.out.println(rectangle.createShape(ShapeType.rectangle).draw());
        
        ShapeFactory triangle = new ShapeFactory();
        triangle.createShape(ShapeType.rectangle);
        System.out.println(triangle.createShape(ShapeType.triangle).draw());
        
        ShapeFactory circle = new ShapeFactory();
        circle.createShape(ShapeType.rectangle);
        System.out.println(circle.createShape(ShapeType.circle).draw());
    }
    
}
