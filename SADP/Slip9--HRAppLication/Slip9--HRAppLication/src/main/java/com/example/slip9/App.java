package com.example.slip9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	HR hr = (HR) context.getBean("HR1");
    	System.out.println(hr.toString());
    }
}
