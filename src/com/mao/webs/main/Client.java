package com.mao.webs.main;
/**
 * ����û����
 * @author haiyi
 * �����������ٺٺٺ�
 */
public class Client {
	public static void main(String args []){
		
		MyFirstWebServiceService mfwss = new MyFirstWebServiceService();
		MyFirstWebService myFirstWebServicePort = mfwss.getMyFirstWebServicePort();
		String sayHello = myFirstWebServicePort.sayHello("������");
		System.out.println(sayHello);
	}
}
