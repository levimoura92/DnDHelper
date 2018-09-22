package DnDHelper;

import java.sql.DriverManager;
import DnDHelper.UserDnD;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;


public class SQLUtils {
	
	public static UserDnD getUser(String user, String pwd) {
		String query ="SELECT id_user, usr_name, usr_pwd, usr_campaign_id FROM [allonsyDev].[dbo].[tb_users] WHERE usr_name = '"+  user +"' AND usr_pwd = '"+pwd+"'";
//		System.out.println(query);
		PreparedStatement ps = null;
		Connection conn = null;
		ResultSet rs =  null;
		UserDnD userDnD = new UserDnD();
		String connURL = "jdbc:sqlserver://localhost:1433;database=allonsyDev;integratedSecurity=true;";
		try{
//			System.out.println(connURL);
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");			
			conn = DriverManager.getConnection(connURL);
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
//			System.out.println("executou a query");
			while(rs.next()) {
				userDnD.setCod(rs.getInt(1));
				userDnD.setNome(rs.getString(2));
				userDnD.setCampanha(rs.getInt(3));
				System.out.println(userDnD.getNome());
				conn.close();

				return userDnD;
//				System.out.println(rs.getString(1) + " "+ rs.getString(2)+ " " + rs.getString(3));
//				return rs.getInt(2);
			}			
		}catch(Exception e){
	 		System.out.println(e.getMessage());
		}		
		return null;
	}
	
	public static void cadastraArmas(String wpnName, int wpnDice, int wpnNumDice, String wpnEffect) {
		String query = null;
		if(wpnEffect.equals("")) {
			query ="INSERT INTO tb_weapons (weapon_name, weapon_dice, weapon_num_dice) VALUES ('"+wpnName+"', "+wpnDice+", "+wpnNumDice+")";
		}else {
			query ="INSERT INTO tb_weapons (weapon_name, weapon_dice, weapon_num_dice, weapon_effect) VALUES ('"+wpnName+"', "+wpnDice+", "+wpnNumDice+", '"+wpnEffect+"')";
		}
		System.out.println(query);
		//		System.out.println(query);
		PreparedStatement ps = null;
		Connection conn = null;
		ResultSet rs =  null;
		String connURL = "jdbc:sqlserver://localhost:1433;database=allonsyDev;integratedSecurity=true;";
		try{
			System.out.println(connURL);
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");			
			conn = DriverManager.getConnection(connURL);
			ps = conn.prepareStatement(query);
			ps.executeQuery();
			System.out.println("executou a query");
//			while(rs.next()) {
////				System.out.println(rs.getString(1) + " "+ rs.getString(2)+ " " + rs.getString(3));
////				return rs.getInt(1);
//			}
			conn.close();
			
		}catch(Exception e){
	 		System.out.println(e.getMessage());
		}		
	}
}
