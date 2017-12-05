package mariaDB;

import contentString.Content;
import java.sql.*;

public class add2table {

	public static void main(String[] args) {
		
		Content p1 = new Content("Science Library");
		p1.setContent("<div id=\"content\"><div id=\"siteNotice\"></div><h1 id=\"firstHeading\" class=\"firstHeading\">Science Library</h1><div id=\"bodyContent\"><p>The Science Library is a great place to study!. It has 3 floors to study and a dedicated quiet floor. It also has convenient access to Jittery Joes Coffee and loans out dry-erase markers.</p><p><img src=\"http://www.allstateelec.com/wp-content/uploads/2015/01/130104_7_R1-1024x791.jpg\" alt=\"Science Library\" width=\"200\" height=\"200\"> <img style=\"padding-left: .25cm\" src=\"https://www.libs.uga.edu/sites/default/files/styles/landscape_mediumlarge_400x300_/public/2016-07/science_library_0.png?itok=NZYWrjnp\" alt=\"Science Library\" width=\"200\" height=\"200\"></p></div></div>");
		
		Content p2 = new Content("Miller Learning Center");
		p2.setContent("<div id=\"mlccontent\"><div id=\"mlcsiteNotice\"></div><h1 id=\"firstHeading\" class=\"firstHeading\">Miller Learning Center</h1><div id=\"mlcbodyContent\"><p>The Miller Learning Center is open 24 hours a day and has 96 group study rooms.</p><p><img src=\"https://www.libs.uga.edu/sites/default/files/styles/landscape_mediumlarge_400x300_/public/2016-07/MLC_LARGE_FACADE.jpg?itok=CBoDgByx\" alt=\"MLC\" width=\"200\" height=\"200\"> <img style=\"padding-left: .25cm\" src=\"https://c1.staticflickr.com/7/6014/5955237252_22b110d058.jpg\" alt=\"MLC\" width=\"200\" height=\"200\"></p></div></div>");
		
		Content p3 = new Content("Science Learning Center");
		p3.setContent("<div id=\"slccontent\"><div id=\"slcsiteNotice\"></div><h1 id=\"firstHeading\" class=\"firstHeading\">Science Learning Center</h1><div id=\"slcbodyContent\"><p>The new Science Learning Center includes study rooms and a Caribou Coffee shop. </p><p><img src=\"https://bloximages.newyork1.vip.townnews.com/redandblack.com/content/tncms/assets/v3/editorial/5/c7/5c783ede-59c2-11e6-88af-7f3b39f6a501/57a26406bfbf6.image.jpg?resize=1200%2C800\" alt=\"SLC\" width=\"200\" height=\"200\"> <img style=\"padding-left: .25cm\" src=\"http://columns.uga.edu/media/images/slc_34050-006-624x394.jpg\" alt=\"SLC\" width=\"200\" height=\"200\"></p></div></div>");
		
		Content p4 = new Content("Main Library");
		p4.setContent("<div id=\"main_librarycontent\"><div id=\"main_librarysiteNotice\"></div><h1 id=\"firstHeading\" class=\"firstHeading\">Main Library</h1><div id=\"main_librarybodyContent\"><p>The Main Library is a quiet study spot that includes a coffee shop. Check out the fourth floor for a colloborative study space. </p><p><img src=\"https://www.libs.uga.edu/sites/default/files/inline-images/openspaces.jpg\" alt=\"Main Library\" width=\"200\" height=\"200\"> <img style=\"padding-left: .25cm\" src=\"https://www.libs.uga.edu/sites/default/files/styles/landscape_medium/public/2016-07/t-25842-038.jpg?itok=6Nx7QhKU\" alt=\"Main Library\" width=\"200\" height=\"200\"></p></div></div>");
		
		Content p5 = new Content("Tate Student Center");
		p5.setContent("<div id=\"tatecontent\"><div id=\"tatesiteNotice\"></div><h1 id=\"firstHeading\" class=\"firstHeading\">Tate Student Center</h1><div id=\"tatebodyContent\"><p>Tate Student Center includes a food court and a Starbucks cafe. There are tables and sofas scattered all over the building. A less popular spot for studying, but space is always avaliable. </p><p><img src=\"http://dnpt4lt4gxlt9.cloudfront.net/uploads/2013/01/02131656/higher_ed_uga_tate_ccarry-tate_1821.jpg\" alt=\"Tate Center\" width=\"200\" height=\"200\"> <img style=\"padding-left: .25cm\" src=\"http://ugaref.com/picture/image/75/Tate_stairs.jpg\" alt=\"Tate Center\" width=\"200\" height=\"200\"></p></div></div>");
		
		Content p6 = new Content("Two Story Coffee");
		p6.setContent("<div id=\"two_storycoffeecontent\"><div id=\"two_storycoffeesiteNotice\"></div><h1 id=\"firstHeading\" class=\"firstHeading\">Two Story Coffeehouse</h1><div id=\"two_storycoffeebodyContent\"><p>Located in Five Points, Two Story is popular among both students and locals. </p><p><img src=\"http://images.morris.com/images/athens/mdControlled/cms/2008/12/07/364108969.jpg\" alt=\"Two Story Coffee\" width=\"200\" height=\"200\"> <img style=\"padding-left: .25cm\" src=\"https://images-yasabe.netdna-ssl.com/r/m6/640x480/17982142.jpg\" alt=\"Two Story Coffee\" width=\"200\" height=\"200\"></p></div></div>");
		
		Content p7 = new Content("Snelling (Downstairs)");
		p7.setContent("<div id=\"snellingcontent\"><div id=\"snellingsiteNotice\"></div><h1 id=\"firstHeading\" class=\"firstHeading\">Snelling Basement</h1><div id=\"snellingbodyContent\"><p>The basement in Snelling Dining Commons has some of the comfiest couches, and is not as crowded as other study spots. </p><p><img src=\"http://images.morris.com/images/athens/mdControlled/cms/2008/11/22/358914198.jpg\" alt=\"Snelling\" width=\"200\" height=\"200\"> <img style=\"padding-left: .25cm\" src=\"http://i.imgur.com/N4foQmT.jpg?1\" alt=\"Snelling\" width=\"200\" height=\"200\"></p></div></div>");
		
		Content p8 = new Content("Starbucks (Upstairs)");
		p8.setContent("<div id=\"starbuckscontent\"><div id=\"starbuckssiteNotice\"></div><h1 id=\"firstHeading\" class=\"firstHeading\">Downtown Starbucks</h1><div id=\"starbucksbodyContent\"><p>The upstairs space at Starbucks is a great study spot that even works for large groups. </p><p><img src=\"https://bloximages.newyork1.vip.townnews.com/redandblack.com/content/tncms/assets/v3/editorial/6/7f/67fdea50-a673-11e4-9b44-8f6b9e7639e0/54c8105c653fa.image.jpg\" alt=\"Starbucks\" width=\"200\" height=\"200\"> <img style=\"padding-left: .25cm\" src=\"https://s3-media1.fl.yelpcdn.com/bphoto/LctKsf5sqo8pr-EcOL_S7g/o.jpg\" alt=\"Starbucks\" width=\"200\" height=\"200\"></p></div></div>");
		
		Content p9 = new Content("Walkers");
		p9.setContent("<div id=\"walkerscontent\"><div id=\"walkerssiteNotice\"></div><h1 id=\"firstHeading\"class=\"firstHeading\">Walkers Coffee Shop and Pub</h1><div id=\"walkersbodyContent\"><p>Walkers has some of the best coffee in Athens. There is both indoor and outdoor seating. </p><p><img src=\"http://www.walkerscoffee.com/images/pic_home_day_2.jpg\" alt=\"Walkers\" width=\"200\" height=\"200\"> <img style=\"padding-left: .25cm\" src=\"https://c1.staticflickr.com/3/2741/4120545707_e1acaafecf.jpg\" alt=\"Walkers\" width=\"200\" height=\"200\"></p></div></div>");
		
		Content p10 = new Content("Museum of Art");
		p10.setContent("<div id=\"museum_artcontent\"><div id=\"museum_artsiteNotice\"></div><h1 id=\"firstHeading\" class=\"firstHeading\">Georgia Museum of Art</h1><div id=\"museum_artbodyContent\"><p>The Georgia Museum of Art includes a cafe with seating. It is a great place to go to study and find creativity. </p><p><img src=\"https://josephlupo.files.wordpress.com/2011/11/img_03572.jpg\" alt=\"Art Museum\" width=\"200\" height=\"200\"> <img style=\"padding-left: .25cm\" src=\"https://cgdarch.com/wp-content/uploads/2016/12/georgia-museum-of-art-02.jpg\" alt=\"Art Museum\" width=\"200\" height=\"200\"></p></div></div>");
		
		Content p11 = new Content("Founders Memorial Garden");
		p11.setContent("<div id=\"founders_gardencontent\"><div id=\"founders_gardensiteNotice\"></div><h1 id=\"firstHeading\" class=\"firstHeading\">Founders Memorial Garden</h1><div id=\"founders_gardenbodyContent\"><p>The Founders Memorial Garden is a scenic outdoors study spot tucked away in North campus. It is great for warm days. </p><p><img src=\"http://www.ced.uga.edu/wp-content/uploads/2015/03/FMG.statue.DN_-320x240.jpg\" alt=\"Founders Garden\" width=\"200\" height=\"200\"> <img style=\"padding-left: .25cm\" src=\"https://www.architects.uga.edu/sites/default/files/images/field/memorial-garden.jpg\" alt=\"Founders Garden\" width=\"200\" height=\"200\"></p></div></div>");

		try 
		{
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studyMapContentStrings?user=root");
			
			System.out.println("Connection to database established");
			
			Statement state = conn.createStatement();
			
			String query = "";
			
			//don't want to execute this on my personal vm since my tables are already populated
			for(int i = 12; i < 12; i++)
			{
				if(i == 1) query = "insert into content_table (location, content) values ('" + p1.getLocation() + "', '" + p1.getContent() + "');";
				else if(i == 2) query = "insert into content_table (location, content) values ('" + p2.getLocation() + "', '" + p2.getContent() + "');";
				else if(i == 3) query = "insert into content_table (location, content) values ('" + p3.getLocation() + "', '" + p3.getContent() + "');";
				else if(i == 4) query = "insert into content_table (location, content) values ('" + p4.getLocation() + "', '" + p4.getContent() + "');";
				else if(i == 5) query = "insert into content_table (location, content) values ('" + p5.getLocation() + "', '" + p5.getContent() + "');";
				else if(i == 6) query = "insert into content_table (location, content) values ('" + p6.getLocation() + "', '" + p6.getContent() + "');";
				else if(i == 7) query = "insert into content_table (location, content) values ('" + p7.getLocation() + "', '" + p7.getContent() + "');";
				else if(i == 8) query = "insert into content_table (location, content) values ('" + p8.getLocation() + "', '" + p8.getContent() + "');";
				else if(i == 9) query = "insert into content_table (location, content) values ('" + p9.getLocation() + "', '" + p9.getContent() + "');";
				else if(i == 10) query = "insert into content_table (location, content) values ('" + p10.getLocation() + "', '" + p10.getContent() + "');";
				else if(i == 11) query = "insert into content_table (location, content) values ('" + p11.getLocation() + "', '" + p11.getContent() + "');";
				
				System.out.println("Query: " + query);
				state.executeUpdate(query);
			}
			
			conn.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
