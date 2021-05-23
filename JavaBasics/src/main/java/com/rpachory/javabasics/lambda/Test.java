package com.rpachory.javabasics.lambda;

@FunctionalInterface // This will make sure that you don't define any other abstract methods.
// Functional Interface: Exactly 1 abstract method.
interface displayable{
    void display(String msg); //By default >>>  public abstract void
}
public class Test implements displayable{

    public static void main(String[] args){
        Test dis = new Test();
        dis.display("My Functional Interface Displayable");
    }

    @Override
    public void display(String msg) {
        System.out.println(msg);
    }

}
