package ek.junit;

public class MyTest {

	private double[][] costInterval = {
			{0,1,10},//��俪ʼ����, ����������, �շѱ�׼
			{1,5,9},
			{5,10,8}
		};
	
	public static void main(String[] args) {
		System.out.println(myTest.getNumByChanFee(1900));
		System.out.println(myTest.getNumByChanFee(5400));
		System.out.println("-----------------");
		System.out.println(myTest.getNumByChanFee_num(1900));
		System.out.println(myTest.getNumByChanFee_num(5400));
	}
	
	/**
	 * ���ͨ�ŷѻ�ȡ�̲������� -- ͨ���ж������ж� 
	 * @param chanFee
	 * @return
	 */
	private int getNumByChanFee_num(double chanFee){
		int num = 0;
		
		for (int i = 0; i < costInterval.length; i++) {
			if (chanFee/(costInterval[i][2]/100) < (costInterval[i][1] - costInterval[i][0]) * 10000) {
				num += chanFee/(costInterval[i][2]/100);
				break;
			}else {
				double thisIntervalNum = (costInterval[i][1] - costInterval[i][0])*10000;
				num += thisIntervalNum;
				chanFee -= thisIntervalNum*costInterval[i][2]/100;
			}
		}
		
		return num;
	}
	/**
	 * ���ͨ���ѻ�ȡ�̲������� -- ͨ��Ƚ�Ǯ�����ж�
	 * @param chanFee
	 * @return
	 */
	private int getNumByChanFee(double chanFee){
		int num = 0;
		for (int i = 0; i < costInterval.length; i++) {
			if ((costInterval[i][1]-costInterval[i][0])*10000*(costInterval[i][2]/100) > chanFee) {
				num += chanFee/(costInterval[i][2]/100);
				break;
			}else {
				double thisIntervalNum = (costInterval[i][1] - costInterval[i][0])*10000;
				num += thisIntervalNum;
				chanFee -= thisIntervalNum * costInterval[i][2]/100;
			}
		}
		
		return num;
	}

	private static MyTest myTest = new MyTest();
	public static MyTest getInstance(){
		if (null == myTest) {
			myTest = new MyTest();
		}
		return myTest;
	}
}
