package com.sahil.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.sahil.mobile.beanclass.*;;

@SpringBootApplication
public class MobileApplication {

	public static void main(String[] args) {
        
        
		 ApplicationContext context=new ClassPathXmlApplicationContext("file:/Users/sahilyadav/Downloads/sapient/week7/mobile/src/main/java/com/sahil/mobile/MobileContext.xml"); 
        
        Mobile mobile = (Mobile) context.getBean("Mobile");
        
        System.out.println(mobile);
	}

}
