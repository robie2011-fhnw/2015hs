package edu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import edu.spring.renderer.*;

public class HelloWorld {

	public static void main(String[] args) {
		loadWithApplicationContext();
	}

	private static BeanFactory getBeanFactory(){
		@SuppressWarnings("deprecation")
		// helloConfig.xml wird überall im Klassenpfad gesucht?
		// pfad hat nicht funktioniert: 
		//	/main/resources/helloConfig.xml
		//  /resources/helloConfig.xml
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("helloConfig.xml"));
		return factory;
	}
	
	public static void loadWithBeanFactory(){
		BeanFactory factory = getBeanFactory();
		Renderer mr = (Renderer) factory.getBean("renderer");
		mr.render();
	}
	
	public static void loadWithApplicationContext(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("helloConfig.xml");
		Renderer mr = (Renderer) context.getBean("renderer");
		mr.render();
	}
}
