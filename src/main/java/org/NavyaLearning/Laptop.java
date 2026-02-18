package org.NavyaLearning;

public class Laptop {

    private String brand;

    Laptop(String brand) {
        this.brand = brand;
        System.out.println("Laptop constructor with brand called! " + brand);
        //Simple constructor injection used here : )
    }

    Laptop(){
        System.out.println("Laptop constructor called"); //For every object defined in the
        //IoC (aka spring.xml file) we will get a constructor calling
    }
    public void compiling(){
        System.out.println("Laptop compiling");
    }
}
