package webServer;  
import javax.xml.ws.Endpoint;  
  /*publish the service to port 8081*/
public class HelloWorldWSPublisher {  
 public static void main(String[] args) {  
  Endpoint.publish("http://localhost:8087/WS/HelloWorld",new HelloWorldImpl());  
 }  
}  