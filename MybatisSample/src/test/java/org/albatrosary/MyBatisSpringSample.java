package org.albatrosary;

import org.albatrosary.bl.RVTBKXLogic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisSpringSample {

	private static final String files = "org/albatrosary/applicationContext.xml";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(files);
		
		RVTBKXLogic logic = (RVTBKXLogic)ctx.getBean("RVTBKXLogic");
		logic.execute();
	}

}
	