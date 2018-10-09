package service;

@javax.jws.WebService
public class WebServiceImpl implements WebService {

	@Override
	public String sayHello(String name) {
		int age=18;
		String IdCard="331082199319121921";
		String height="180cm";
		String info="姓名："+name+";年龄："+age+";身份证号码："+IdCard+";身高："+height;
		return info;
	}

}
