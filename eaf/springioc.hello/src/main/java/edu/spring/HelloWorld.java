package edu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import edu.spring.renderer.*;

public class HelloWorld {

	public static void main(String[] args) {
		BeanFactory factory = getBeanFactory();
		Renderer mr = (Renderer) factory.getBean("renderer");
		mr.render();
		
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
}
