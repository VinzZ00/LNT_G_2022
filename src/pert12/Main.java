package pert12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	Connection con;
	Statement st; //Simple code.
	PreparedStatement ps; // Security Come first.
	ResultSet rs;
	public Main() {
		// TODO Auto-generated constructor stub
		// JDBC (Java Database Connectivity)
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datakelasg", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			st = con.createStatement();
			rs = st.executeQuery("Select * from penghuni where nama = 'Elvin Sestomi'");
			
			
			while(rs.next()) {
				System.out.println("No. " + rs.getRow());	
				System.out.println(rs.getObject(1));
				System.out.println(rs.getObject(2));
				System.out.println(rs.getObject(3));
				System.out.println();
			}
			
			System.out.println(st.execute("delete from penghuni where id = 4"));
			
			int rowEffected = st.executeUpdate("Update penghuni set nama = 'Student of G Class' where ID < 7 && ID > 4 ");
			System.out.println(rowEffected);
			
			rs = st.executeQuery("Select identifier from penghuni order by identifier asc");
			
			rs.last();
			
			String lastIden = String.valueOf(rs.getObject(1));
			// PE004
			
			int newIndex = Integer.valueOf(lastIden.substring(2));
			
			String index = String.format("%03d", ++newIndex);
//			rowEffected = st.executeUpdate("Insert into penghuni(Identifier, Nama) values ('PE" + index + "', 'Andi')");
//			System.out.println(rowEffected);
			String nama = "Budi";
			ps = con.prepareStatement("Insert into penghuni(identifier, nama) values (?, ?)");
			ps.setString(1, "PE".concat(index));
			ps.setString(2, nama);
			
			System.out.println(ps.execute());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
