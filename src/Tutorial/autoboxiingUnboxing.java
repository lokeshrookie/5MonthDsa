package Tutorial;

import java.io.Serializable;
import java.rmi.Remote;

public class autoboxiingUnboxing implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle one = new Rectangle();
        Rectangle two = new Rectangle();
        one.length = 5;
        one.breadth = 7;
        two = one.clone();
        System.out.println(two);


    }

}

class Rectangle implements  Cloneable, Serializable , Remote {
    int length;
    int breadth;
    public Rectangle(){

    }


    @Override
    public Rectangle clone() {
        try {
            Rectangle clone = (Rectangle) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}


class Jug{
    private int waterQuantity = 500;
    public int getWaterQuantity(){
        return waterQuantity;
    }
    private Jug(){}
    private static Jug object = null;
    public int getWater(int quantity){
        waterQuantity -=quantity;
        return quantity;
    }
    public static Jug getInstance(){
        if(object == null){
            object = new Jug();
        }
        return object;
    }
}