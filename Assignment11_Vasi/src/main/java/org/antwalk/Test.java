package org.antwalk;

import java.util.List;

import org.antwalk.Dao.WatchDaoImpl;
import org.antwalk.model.Watch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		WatchDaoImpl watch = context.getBean("watchDaoImpl", WatchDaoImpl.class);
		System.out.println("Adding Watch Records Records");
		
		  watch.create("Rolex", 12000); watch.create("Apple", 13000);
		  watch.create("Titan", 45000);
		 
		//watch.update(4, 2000);

		System.out.println("Listing Watches : ");
		List<Watch> watches = watch.listWatch();
		for (Watch wt : watches) {
			System.out.println("Id:" + wt.getId());
			System.out.println("Brand:" + wt.getBrand());
			System.out.println("Price:" + wt.getPrice());
		}
	}
}
