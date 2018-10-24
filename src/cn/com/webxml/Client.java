package cn.com.webxml;

public class Client {
	public static void main(String args [])
	{
		MobileCodeWS mcw = new MobileCodeWS();
		MobileCodeWSSoap mobileCodeWSSoap = mcw.getMobileCodeWSSoap();
		String mobileCodeInfo = mobileCodeWSSoap.getMobileCodeInfo("1885684",null);
		System.out.println(mobileCodeInfo);
	}
} 