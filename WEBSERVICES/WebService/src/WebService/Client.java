package WebService;


import java.net.URL;
import java.net.MalformedURLException;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
//import WebService.Calculator;

public class Client {

    public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8080/WS/calc?WSDL");
		QName qname = new QName("http://WebService/", "CalculatorService");
		Service service = Service.create(url, qname);
		Calculator port = service.getPort(Calculator.class);
	    System.out.println(port.add(1, 2));
	}

}
