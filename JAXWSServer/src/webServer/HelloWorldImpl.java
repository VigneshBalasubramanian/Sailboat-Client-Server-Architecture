package webServer;  
import javax.jws.WebService;
 
  /*declare endpoint interface*/
@WebService(endpointInterface="webServer.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{  
  
  /*Find sailor information*/
	public String findSailorInfo(String name) {
    	DatabaseFetch dbf=new DatabaseFetch();
    	String details=dbf.doValidOperation(name);
        return  details ;
    }
  
}  


