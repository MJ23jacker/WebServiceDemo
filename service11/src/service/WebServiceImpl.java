package service;

@javax.jws.WebService
public class WebServiceImpl implements WebService {

	@Override
	public String sayHello(String name) {
		int age=18;
		String IdCard="331082199319121921";
		String height="180cm";
		String info="������"+name+";���䣺"+age+";���֤���룺"+IdCard+";��ߣ�"+height;
		return info;
	}

}
