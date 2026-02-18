package org.NavyaLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Dev dev = new Dev();
//        dev.building();
        //We have IoC container now
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev dev = context.getBean("dev", Dev.class);
        dev.building();
    }
}
