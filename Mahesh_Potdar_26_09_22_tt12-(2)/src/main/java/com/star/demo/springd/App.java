package com.star.demo.springd;

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
    	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application.xml"));

		//ApplicationContext factory = new ClassPathXmlApplicationContext("application.xml");

		/*
		 * Object o = factory.getBean("stud1");
		 * 
		 * Student stud1 = (Student) o;
		 * 
		 * System.out.println(stud1);
		 * 
		 * System.out.println(stud1.getSid() + " " + stud1.getSname());
		 * 
		 * Student stud2 = factory.getBean("stud2", Student.class);
		 * 
		 * System.out.println(stud2);
		 * 
		 * System.out.println(stud1.getSid() + " " + stud1.getSname());
		 */
		
		Teacher t1 =		factory.getBean("t1",Teacher.class);
		
		System.out.println(t1);	
		
		Student e1 = factory.getBean("stud1", Student.class);
		
		System.out.println(e1);
		
		System.out.println(e1.getTeacher());
		
		System.out.println(e1.getSubjects());
				
		/*
		 * Student s5 = factory.getBean("stud1", Student.class);
		 * 
		 * System.out.println(s5);
		 * 
		 * 
		 * Student s6 = factory.getBean("stud1", Student.class);
		 * 
		 * System.out.println(s6);
	
		 */
    	
    }
}
