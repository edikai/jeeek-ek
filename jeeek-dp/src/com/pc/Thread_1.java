package com.pc;

import java.util.Random;

/**
 * @包名   com.pc
 * @文件名 Thread_1.java
 * @作者   qin_hqing
 * @创建日期 2015-1-28
 * @版本 V 1.0
 */
public class Thread_1 extends Thread{

	/**
	 * @param args
	 * TODO
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Work work = new Work();
		Thread_1 t = new Thread_1(work);
		t.start();
		t.join();
		int value = t.getData().value;
		System.out.println(value);
	}
	
	private Work work ;
	private Data data ;
	public Thread_1(Work work){
		this.work = work;
		this.data = new Data();
	}
	public void run(){
		Random random = new Random();
		int n1 = random.nextInt(1000);
		int n2 = random.nextInt(2000);
		int n3 = random.nextInt(3000);
		this.work.process(this.data, n1, n2, n3);
	}
	public Data getData() {
		return data;
	}
}
class Data{
	public int value = 0;
}
class Work{
	public void process(Data data, Integer...nums) {
		for (int i : nums) {
			data.value += i;
		}
	}
}