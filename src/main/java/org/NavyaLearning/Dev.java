package org.NavyaLearning;

public class Dev {

    Laptop laptop;

    private int age;

    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }

    public Laptop getLaptop(){
        return laptop;
    }

    //publics were missing
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    Dev(){
        System.out.println("Dev constructer called");
    }
    public void building(){
        System.out.println("Dev is building");
        laptop.compiling();
    }
}
