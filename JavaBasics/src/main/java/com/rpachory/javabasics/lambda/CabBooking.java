package com.rpachory.javabasics.lambda;

@FunctionalInterface
interface Cab{
    //void bookCab();
    void bookCab(String source, String Destination);
}

//class UberX implements Cab{
//    @Override
//    public void bookCab() {
//        System.out.println("Cab Booked || Arriving Soon.");
//    }
//}

public class CabBooking {
    public static void main(String[] args){
        //1. General Old way of calling functional interfaces.
//        Cab cab = new UberX(); //Polymorphic statement
//        cab.bookCab();

        //2. Anonymous Class Implementation
//        Cab cab = new Cab() {
//            @Override
//            public void bookCab() {
//                System.out.println("Cab Booked || Arriving Soon.");
//            }
//        };
//        cab.bookCab();

        //3. Using Lambda Expressions
        /**
         * 1. Lambda Expressions are going to work with functional interfaces only. As it has only one|Single method so that is the binding here.
         * 2. Lambda Expressions can take 0-N parameters.
         *      0 Param:        () -> {System.out.println(param);}
         *      1 Param:        (param) -> System.out.println(param);
         *      Multi Param:    (p1, p2) -> System.out.println(p1, p2);
         *
         */
        //Cab cab = () -> System.out.println("Cab Booked || Arriving Soon.");
        Cab cab = (source, destination) -> System.out.println("Cab Booked from "+source+" to "+destination+" || Arriving Soon.");
        cab.bookCab("Bus Stop", "Railway Station");
    }
}
