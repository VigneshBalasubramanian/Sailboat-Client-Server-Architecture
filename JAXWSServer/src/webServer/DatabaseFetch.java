

package webServer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/* Perform the database insert and retrieve operation*/
public class DatabaseFetch {
	public String doValidOperation(String sailorInfo){
		String op="";
		String[] sailorInfoArray=sailorInfo.split("%");
		if(sailorInfoArray[9].equals("insert")){
			insertSailorInfo(sailorInfo);
		}
		else if(sailorInfoArray[9].equals("update")){
			updateSailorInfo(sailorInfo);
		}
		else
			op=findSailorRecordInDB(sailorInfo);
		return op;
	}
	/*insert sailor information taking all information in sailorInfo*/
	public String insertSailorInfo(String sailorInfo){
		String[] sailorInfoArray=sailorInfo.split("%");
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://192.168.56.10:3306/sailboat","root","abhi");  
			
			Statement stmt=con.createStatement();  
			/*update all rows in sailor details table*/
			stmt.executeUpdate("insert into SailorDetails values ("+0+",'"+sailorInfoArray[1]+"',"+"'"+sailorInfoArray[0]+"',"+"'"+sailorInfoArray[2]+"',"+new Float(sailorInfoArray[3]).floatValue()+","+new Integer(sailorInfoArray[4]).intValue()
			   +","+"'"+sailorInfoArray[5]+"',"+"'"+sailorInfoArray[6]+"',"+"'"+sailorInfoArray[6]+"')"); 
			
			con.close();  
			}catch(Exception e){ System.out.println(e);} 
		return "inserted successfully";
	}
	/*retrieve sailor  information*/
	public String findSailorRecordInDB(String sailorInfo){
		String sailorDetails="";
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://192.168.56.10:3306/sailboat","root","abhi");  
		//here sailboat is database name, root is username and abhi is databse password. ip is the virtual machine ip  
		Statement stmt=con.createStatement();  
		
		ResultSet rs=stmt.executeQuery("select * from SailorDetails"+getQueryWhereCondition(sailorInfo) ); 
		
		while(rs.next())  
		sailorDetails+=rs.getInt(1)+"-"+rs.getString(3)+"- "+rs.getString(2)+"-"+rs.getString(4)+"-"+rs.getInt(5)+"-"+rs.getInt(6)+"-"+
		rs.getString(8)+"-"+rs.getString(7)+"-"+rs.getString(9)+"&";  
		con.close();  
		}catch(Exception e){ System.out.println(e);} 
		return sailorDetails;
	}
	/*split and make the query*/
	public String getQueryWhereCondition(String sailorInfo){
		String query=" where ";
		String[] sailorInfoArray=sailorInfo.split("%");
		if(!sailorInfoArray[0].equals(""))
			query+="FirstName='"+sailorInfoArray[0]+"' and ";
		if(!sailorInfoArray[1].equals(""))
			query+="LastName='"+sailorInfoArray[1]+"' and ";
		if(!sailorInfoArray[2].equals(""))
			query+="BoatType='"+sailorInfoArray[2]+"' and ";
		if(!sailorInfoArray[3].equals(""))
			query+="BoatLength='"+sailorInfoArray[3]+"' and ";
		if(!sailorInfoArray[4].equals(""))
			query+="BuildYear='"+sailorInfoArray[4]+"' and ";
		if(!sailorInfoArray[5].equals(""))
			query+="MotorType='"+sailorInfoArray[5]+"' and ";
		if(!sailorInfoArray[6].equals(""))
			query+="slipFeePaid='"+sailorInfoArray[6]+"' and ";
		if(!sailorInfoArray[7].equals(""))
			query+="MooredSlip='"+sailorInfoArray[7]+"' and ";
		if(!query.equals(" where ")){
			query=query.substring(0,query.length()-4);
		}
		else{
			query="";
		}
		
		System.out.println("query"+" where "+query);
		
		return query;
	}
	//update the database with updated values
	public String updateSailorInfo(String sailorInfo){
		String[] sailorInfoArray=sailorInfo.split("%");
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://192.168.56.10:3306/sailboat","root","abhi");  
			
			Statement stmt=con.createStatement();  
			
			stmt.executeUpdate("update SailorDetails set LastName='"+sailorInfoArray[1]+"',"+"FirstName='"+sailorInfoArray[0]+"',"+"BoatType='"+sailorInfoArray[2]+"',BoatLength="+new Float(sailorInfoArray[3]).floatValue()+",BuildYear="+new Integer(sailorInfoArray[4]).intValue()
			   +",MotorType="+"'"+sailorInfoArray[5]+"',slipFeePaid="+"'"+sailorInfoArray[6]+"',MooredSlip="+"'"+sailorInfoArray[7]+"' where sailorID="+new Integer(sailorInfoArray[8]).intValue()); 
			
			con.close();  
			}catch(Exception e){ System.out.println(e);} 
		return "inserted successfully";
	}
}
