package com.mao.webs.main;

public class Client {
	public static void main(String args []){
		
		MyFirstWebServiceService mfwss = new MyFirstWebServiceService();
		MyFirstWebService myFirstWebServicePort = mfwss.getMyFirstWebServicePort();
		String sayHello = myFirstWebServicePort.sayHello("������");
		System.out.println(sayHello);
	}
}
