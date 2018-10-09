package service;

public class WSclient {

	public static void main(String[] args) {
		//创建一个用于产生WebServiceImpl实例的工厂
		WebServiceImplService factory = new WebServiceImplService();
		//通过工厂生成一个WebServiceImpl实例
		WebServiceImpl wsImpl = factory.getWebServiceImplPort();
		//调用webservice的sayHello方法
		String result=wsImpl.sayHello("Harden");
		System.out.println("调用WebService的sayHello方法返回的结果是："+result);
		System.out.println("======================");
	}
}
