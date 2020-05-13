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
public class MyStringBuider {
    String str;

    protected MyStringBuider(Buider buider) {
        this.str = buider.str;
    }

    @Override
    public String toString() {
        return "MyStringBuider{" + "str=" + str + '}';
    }
    

    public static class Buider {

        private String str;

        public Buider() {
        }
        
        public Buider addString(String s)
        {
            this.str = str + s;
            return this;
        }
        
        public Buider addFloat(float f)
        {
            this.str = str + f;
            return this;
        }
        
        public Buider addBool(boolean b)
        {
            this.str = str + b;
            return this;
        }
        
        public MyStringBuider buider()
        {
            return new MyStringBuider(this);
        }
    }
    
    
}
