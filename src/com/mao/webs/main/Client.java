package com.mao.webs.main;
/**
 * 服务没开啊
 * @author haiyi
 *
 */
public class Client {
	public static void main(String args []){
		
		MyFirstWebServiceService mfwss = new MyFirstWebServiceService();
		MyFirstWebService myFirstWebServicePort = mfwss.getMyFirstWebServicePort();
		String sayHello = myFirstWebServicePort.sayHello("孙艳文");
		System.out.println(sayHello);
	}
}
