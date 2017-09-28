package webServer;  
import javax.jws.WebMethod;  
import javax.jws.WebService;  
  
@WebService  
public interface HelloWorld {  
  
 //class - to find and insert sailor information
	@WebMethod public String findSailorInfo(String name);
}  


