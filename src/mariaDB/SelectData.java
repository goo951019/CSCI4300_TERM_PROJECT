package mariaDB;

import java.sql.*;

public class SelectData {
	
	private String content = "";
	
	public SelectData()
	{
		
	}
	
	/*
	 * VALID LOCATIONS:
	 * 
	 * Science Library
	 * Miller Learning Center
	 * Science Learning Center
	 * Main Library
	 * Tate Student Center
	 * Two Story Coffee
	 * Snelling (Downstairs)
	 * Starbucks (Upstairs)
	 * Walkers
	 * Museum of Art
	 * Founders Memorial Garden
	 */
	
	public String getContentString(String location)
	{
		try 
		{
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studyMapContentStrings?user=root");
			
			System.out.println("Connection to database established");
			
			Statement state = conn.createStatement();
			
			String query = "select content from content_table where location=\"" + location + "\";";
				
			System.out.println("Query: " + query);
			ResultSet result = state.executeQuery(query);
			
			if(result.next())
				content = result.getString("content");
			
			System.out.println("Content:" + content);
		
			conn.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			content = e.toString();
		}
		
		return content;
	}
}
