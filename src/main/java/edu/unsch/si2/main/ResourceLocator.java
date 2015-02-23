package edu.unsch.si2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Vijitha Epa.
 * @since 26-09-12.
 * 
 *        Use to load Spring context beans and message resources.
 */
public class ResourceLocator {

	private static ApplicationContext appContext;

	private ResourceLocator() {

	}

	public static ApplicationContext getContextInstance() {
		if (appContext == null) {
			appContext = new ClassPathXmlApplicationContext("classpath:app-context.xml");
		}

		return appContext;
	}

	public static Object getBean(Class beanName) {
		return getContextInstance().getBean(beanName);
	}

	
}
