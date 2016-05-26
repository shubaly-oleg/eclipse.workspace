package WebService;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Calculator {

	public static void main(String[] args) {
		  Endpoint.publish(
		      "http://localhost:8080/WS/calc", new Calculator());

		}

	public int add(int a, int b) {
	    return a + b;
	  }
	
}
