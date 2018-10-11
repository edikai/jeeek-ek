package ek.junit.aop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ek.bo.aop.AopService;


public class AopServiceImplTest {
	
	@Test
	public void testAopExample1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop.xml");
		AopService service = (AopService) ac.getBean("aopServiceImpl");
		service.aopExample1();
	}
	
	@Test
	public void testJsjb() throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("c:\\Result.txt"),true));

	     writer.write("\"101\",\"英语\",\"english\",\"100001\"\r\n");
	     writer.write("\"101\",\"英语\",\"english\",\"100001\"\r\n");
	     
	     writer.close();
	}
	
	@Test
	public void testDf() throws IOException{
		System.out.println("--------主线程---START------------");
		new Thread(){
			public void run(){
				long sum = 0;
				System.out.println("子线程开始........");
				for (int i = 1; i < 150000; i++) {
					for (int j = 1; j < 1000; j++) {
						for (int k = 1; k < 100; k++) {
							if (i>50000) {
								sum += i*j*k;
							}else if (i>100000) {
								if (j<500) {
									sum+=i*j/(j-k);
								}else {
									sum+=i*k;
								}
							}else {
								sum+=j*k;
							}
							System.out.println(sum);
						}
					}
				}
				System.out.println("子线程结束.................");
				super.start();
			}
		}.start();
		System.out.println("--------主线程---end------------");
	}
}
