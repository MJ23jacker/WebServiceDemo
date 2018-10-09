package service;

import javax.xml.ws.Endpoint;

public class WebPublish {
	public static void main(String[] args) {
		String address="http://127.0.0.1:8989/WS_Server/WebService";
		Endpoint.publish(address, new WebServiceImpl());
		System.out.println("发布webservice成功");

	}
}
