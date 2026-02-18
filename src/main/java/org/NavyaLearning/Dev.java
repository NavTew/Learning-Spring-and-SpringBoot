package org.NavyaLearning;

public class Dev {

    Computer com;


    public void setCom(Computer com){ //the setter and getter is based on name !!!
        this.com = com;
    }

    public Computer getCom(){
        return com;
    }

    Dev(){
        System.out.println("Dev constructer called");
    }
    public void building(){
        System.out.println("Dev is building");
        com.compiling();
    }
}
