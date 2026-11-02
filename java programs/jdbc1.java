import java.sql.*;
import java.lang.*;
public class jdbc1
{
public static void main(String[] args)throws Exception 
{
Class.forName("oracle.jdbc.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
System.out.println("connected");
Statement st;
try{
st=con.createStatement();
st.executeQuery("create table account(ano varchar2(5),name varchar2(20),balance number(8,2))");
System.out.println("Table is created");
}
catch(SQLException ex)
{
System.out.println(" The Exception raised is"+ex);
}
con.close();
}
}
