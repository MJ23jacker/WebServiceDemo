package service;

public class WSclient {

	public static void main(String[] args) {
		//����һ�����ڲ���WebServiceImplʵ���Ĺ���
		WebServiceImplService factory = new WebServiceImplService();
		//ͨ����������һ��WebServiceImplʵ��
		WebServiceImpl wsImpl = factory.getWebServiceImplPort();
		//����webservice��sayHello����
		String result=wsImpl.sayHello("Harden");
		System.out.println("����WebService��sayHello�������صĽ���ǣ�"+result);
		System.out.println("======================");
	}
}
