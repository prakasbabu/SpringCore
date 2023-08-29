package com.takeo.SpringCorePractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       BeanFactory factory = new XmlBeanFactory(new ClassPathResource("/com/takeo/SpringCorePractice/config/core.xml"));
       Object obj = factory.getBean("studentBean");
       Student std =(Student)obj;
       System.out.println(std.getStudentName());
       
       ApplicationContext ctxt = new ClassPathXmlApplicationContext("/com/takeo/SpringCorePractice/config/core.xml");
       Student stdunet = (Student) ctxt.getBean("studentBean");
       System.out.println(stdunet.getStudentName());
       
    }
}
