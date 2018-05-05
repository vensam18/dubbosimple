package cn.hd.dubbo.sample.test;

import java.util.List;

import cn.hd.dubbo.sample.provider.SampleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Consumer {
	//ceshi
	
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "sample-consumer.xml" });
		context.start();
		//
		//
		SampleService sampleService = (SampleService) context.getBean("sampleService");
		String hello = sampleService.sayHello("tom");
		System.out.println(hello);
        System.out.println("123");
		List list = sampleService.getUsers();

		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		System.in.read();
	}

}