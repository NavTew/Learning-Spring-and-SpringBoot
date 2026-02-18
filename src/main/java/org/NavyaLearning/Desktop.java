package org.NavyaLearning;

public class Desktop implements Computer {

    private String brand;

    Desktop(String brand) {
        this.brand = brand;
        System.out.println("Desktop constructor with brand called! " + brand);
        //Simple constructor injection used here : )
    }

    Desktop(){
        System.out.println("Desktop constructor called"); //For every object defined in the
        //IoC (aka spring.xml file) we will get a constructor calling
    }

    @Override
    public void compiling(){
        System.out.println("Desktop compiling");
    }
}
