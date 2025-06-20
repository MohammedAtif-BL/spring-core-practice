package com.example.backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Car carBean = (Car) applicationContext.getBean("carBean");
        carBean.showDetails();
    }
}
