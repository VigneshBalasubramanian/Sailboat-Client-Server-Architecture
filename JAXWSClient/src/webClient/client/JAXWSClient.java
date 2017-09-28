package webClient.client;
import java.util.Scanner;

import webserver.HelloWorld;
import webserver.HelloWorldImplService;  
  
/** 
 * @class - to insert and view sailor boat information 
 */  
public class JAXWSClient {  
  
    
    public static void main(String[] args) {  
         /*
          * Service declaration */
        HelloWorldImplService helloWorldService = new HelloWorldImplService();  
        HelloWorld mymethod = helloWorldService.getHelloWorldImplPort(); 
        /*read the input values*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the option \n 1 To insert new record \n 2 to reterive the record \n 3 to update the record \n");
        String option=sc.nextLine();
        if(option.equals("1")){
        	/*Take input from user to insert new record*/
        System.out.println("please enter the FirstName \n");
        String firstName=sc.nextLine();
        System.out.println("please enter the LastName");
        String lastName=sc.nextLine();
        System.out.println("please enter the Boat Type");
        String boatType=sc.nextLine();
        System.out.println("please enter the Boat Length");
        String boatLength=sc.nextLine();
        System.out.println("please enter the Build Year");
        String buildYear=sc.nextLine();
        System.out.println("please enter the Motor Type");
        String motorType=sc.nextLine();
        System.out.println("please enter the Slip paid or not for the month");
        String slipFeepaid=sc.nextLine();
        System.out.println("please enter Moored Slip");
        String mooredSlip=sc.nextLine();
        String insertLine=firstName+"%"+lastName+"%"+boatType+"%"+boatLength+"%"+buildYear+"%"+motorType+"%"+slipFeepaid+"%"+mooredSlip+"%%insert";
       // call the findSailorInfo to insert sailor data
        String op=mymethod.findSailorInfo(insertLine);
        System.out.println(op);
        }
        /* if option to retrieve data*/
        else if(option.equals("2")){
            System.out.println("please enter the FirstName\n");
            
           
            String firstName=sc.nextLine();
           
            System.out.println("please enter the LastName \n");
            String lastName=sc.nextLine();
            System.out.println("please enter the Boat Type");
            String boatType=sc.nextLine();
            System.out.println("please enter the Boat Length");
            String boatLength=sc.nextLine();
            System.out.println("please enter the Build Year");
            String buildYear=sc.nextLine();
            System.out.println("please enter the Motor Type");
            String motorType=sc.nextLine();
            System.out.println("please enter the Slip paid or not for the month");
            String slipFeepaid=sc.nextLine();
            System.out.println("please enter Moored Slip");
            String mooredSlip=sc.nextLine();
            String sailorInfo=firstName+"%"+lastName+"%"+boatType+"%"+boatLength+"%"+buildYear+"%"+motorType+"%"+slipFeepaid+"%"+mooredSlip+"%%reterive";
            /*retrieve sailor information*/
            String[] check=sailorInfo.split("%");
            String op=mymethod.findSailorInfo(sailorInfo);
            String[] opArray=op.split("&");
            for(int i=0;i<opArray.length;i++){
            	System.out.println(opArray[i]);
            }
            
            }
        /*option to update sailor information by selecting the sailor id*/
          else if(option.equals("3")){
        	  String sailorInfo="%"+"%"+"%"+"%"+"%"+"%"+"%"+"%%reterive";
              /*retrieve sailor information*/
              String[] check=sailorInfo.split("%");
              String op=mymethod.findSailorInfo(sailorInfo);
              String[] opArray=op.split("&");
              for(int i=0;i<opArray.length;i++){
              	System.out.println(opArray[i]);
              }
        	  System.out.println("please enter the sailor id to change \n");
              String sailorId=sc.nextLine();
        	  System.out.println("please enter the updated FirstName \n");
              String firstName=sc.nextLine();
              System.out.println("please enter the updated LastName");
              String lastName=sc.nextLine();
              System.out.println("please enter the updated Boat Type");
              String boatType=sc.nextLine();
              System.out.println("please enter the updated Boat Length");
              String boatLength=sc.nextLine();
              System.out.println("please enter the updated Build Year");
              String buildYear=sc.nextLine();
              System.out.println("please enter the updated Motor Type");
              String motorType=sc.nextLine();
              System.out.println("please enter the updated Slip paid or not for the month");
              String slipFeepaid=sc.nextLine();
              System.out.println("please enter updated Moored Slip");
              String mooredSlip=sc.nextLine();
              String insertLine=firstName+"%"+lastName+"%"+boatType+"%"+boatLength+"%"+buildYear+"%"+motorType+"%"+slipFeepaid+"%"+mooredSlip+"%"+sailorId+"%update";
             // call the findSailorInfo and update sailor data
               op=mymethod.findSailorInfo(insertLine);
              System.out.println(op);
          }
        
       
    }  
}  


