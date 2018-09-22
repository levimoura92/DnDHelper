package DnDHelper;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;


public class SQLUtils {
	
	public static int getUser(String user, String pwd) {
		String query ="SELECT id_user, usr_name, usr_pwd, usr_campaign_id FROM [allonsyDev].[dbo].[tb_users] WHERE usr_name = '"+  user +"' AND usr_pwd = '"+pwd+"'";
//		System.out.println(query);
		PreparedStatement ps = null;
		Connection conn = null;
		ResultSet rs =  null;
		String connURL = "jdbc:sqlserver://localhost:1433;database=allonsyDev;integratedSecurity=true;";
		try{
//			System.out.println(connURL);
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");			
			conn = DriverManager.getConnection(connURL);
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
//			System.out.println("executou a query");
			while(rs.next()) {
//				System.out.println(rs.getString(1) + " "+ rs.getString(2)+ " " + rs.getString(3));
				return rs.getInt(1);
			}
			conn.close();
			
		}catch(Exception e){
	 		System.out.println(e.getMessage());
		}		
		return 1;
	}
}
