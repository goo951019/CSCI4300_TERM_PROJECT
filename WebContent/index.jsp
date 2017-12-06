<%@ page language="java" import="mariaDB.*" %>
<html>
<title>UGA Study Spots</title>
<head>
    <style>
        #map {
            height: 100%;	
        }
        html, body{
              height: 100%;
              margin: 0;
              padding: 0;
	      background-color:#66a3ff;
        }
		h1{
			font-family: 'Raleway',sans-serif;
		}
		button.tabs{
			width: 4cm;
			padding:0 5px;
		}
		div.expand{
			display: none;
			background-color: white;
			width: 450px;
			height: 125px;
			margin: 0;
			overflow: auto;
		}
	</style>
</head>
<jsp:useBean id="contentBean" class="mariaDB.SelectData" scope="session" >
<jsp:setProperty name="contentBean" property="*" />
</jsp:useBean>
<body>
<h1 align="center">UGA Study Spots</h1>
<div align="center">
		<button class="tabs">Addresses</button>
		<div class="expand">
		  <b>Science Library</b>
		  <p>Address: 210 D. W. Brooks Drive, Athens, GA 30602</p>
		  <p>MON-THURS: 7:30am-2:00AM</p>
		  <p>SAT: 10:00am-7:00pm</p>
		  <p>SUN: 1:00pm-2:00am</p>
		  <b>Miller Learning Center</b>
		  <p>Address: 48 Baxter St, Athens, GA 30602</p>
		  <p>Open 24 hours, 7 days a week</p>
		  <b>Science Learning Center</b>
		  <p>Address: 130 Carlton Street Athens, GA 30602</p>
		  <p>MON-FRI: 7:30am-9:00PM</p>
		  <p>SAT-SUN: Closed</p>
		  <b>Main Library</b>
		  <p>Address: 320 S Jackson St, Athens, GA 30602</p>
		  <p>MON-THURS: 7:30am-2:00AM</p>
		  <p>SAT: 10:00am-7:00pm</p>
		  <p>SUN: 1:00pm-2:00am</p>
		  <b>Tate Student Center</b>
		  <p>Address: 45 Baxter St, Athens, GA 30602</p>
		  <p>SUN-SAT: 8:00am-12:00AM</p>
		  <b>Two Story Coffeehouse</b>
		  <p>Address: 680 S Lumpkin St, Athens, GA 30606</p>
		  <p>MON-FRI: 8:00am-10:00pm</p>
		  <p>SAT-SUN: Closed</p>
		  <b>Snelling (Downstairs)</b>
		  <p>Address: 210 D. W. Brooks Drive, Athens, GA 30602</p>
		  <p>MON-THURS: Open 24 hours</p>
		  <p>FRI: Closes at 2:30pm</p>
		  <p>SAT-SUN: Closed</p>
		  <b>Starbucks (Downtown)</b>
		  <p>Address: 100 College Ave, Athens, GA 30601</p>
		  <p>MON-FRI: 6:00am-11:00pm</p>
		  <p>SAT: 6:00am-12:00pm</p>
		  <p>SUN: 6:00am-10:00pm</p>
		  <b>Walkers</b>
		  <p>Address: 128 College Ave, Athens, GA 30601</p>
		  <p>MON-THURS: 7:00am-2:00am</p>
		  <p>SAT: 8:30am-2:00am</p>
		  <p>SUN: 11:00am-12:00am</p>
		  <b>Museum of Art</b>
		  <p>Address: 90 Carlton St, Athens, GA 30602</p>
		  <p>MON: Closed</p>
		  <p>TUES-THURS: 10:00am-9:00pm</p>
		  <p>SAT-SUN: 1:00pm-5:00pm</p>
		  <b>Founders Memorial Garden</b>
		  <p>Address: Founders Garden Athens, GA 30601</p>
		  <p>Open at all times.</p>
		  <p></p>
		  <br>
		</div>
	</div>
	<div align="center">
		<button class="tabs">Help</button>
		<div class="expand">
		  <p>To use the website, click on any of the markers on the map. When clicked, a pop-up will expand and display the name, pictures,and a description of the location.
		  To see the address, click the address button above the help button and search up the address by the name of the location you desire.
		  </p>
		</div>	
	</div>
	<br>
<script>
	var tabsList = document.getElementsByClassName("tabs");
		tabsList[0].onclick = function(){
			this.classList.toggle("active");
			var  expand = this.nextElementSibling;
			if ( expand.style.display === "block") {
				 expand.style.display = "none";
			} else {
				 expand.style.display = "block";
			}
		}
		
		tabsList[1].onclick = function(){
			this.classList.toggle("active");
			var  expand = this.nextElementSibling;
			if ( expand.style.display === "block") {
				 expand.style.display = "none";
			} else {
				 expand.style.display = "block";
			}
		}
</script>
<div id="map"></div>
<script>
    function initMap() {
        var campus_center = {lat: 33.9463864, lng: -83.3759057};
        var new_center= {lat: 33.9505, lng: -83.3751};
        var map = new google.maps.Map(document.getElementById('map'), {
            zoom: 15,
            center: new_center
        });
        
        var prefetch = '<%=contentBean.getContentString("Science Library")%>';

        //SCIENCE LIBRARY
        var science_library_content = '<%=contentBean.getContentString("Science Library")%>';
        var science_library = {lat: 33.946199, lng: -83.375447};
        var science_library_infowindow = new google.maps.InfoWindow({
            content: science_library_content
        });
        var science_library_marker = new google.maps.Marker({
            position: science_library,
            map: map,
            title: "Science Library"
        });
        science_library_marker.addListener("click", function(){
            science_library_infowindow.open(map, science_library_marker);
        });
        //end of science library

        //MLC
        var mlc_content = '<%=contentBean.getContentString("Miller Learning Center")%>';
    		var mlc = {lat: 33.9517, lng: -83.3761};
    		var mlc_infowindow = new google.maps.InfoWindow({
     		   content: mlc_content
   		 });
    		var mlc_marker = new google.maps.Marker({
    		    position: mlc,
    		    map: map,
     		   title: "Miller Learning Center"
   		 });
    		mlc_marker.addListener("click", function(){
    		    mlc_infowindow.open(map, mlc_marker);
   		 });
    	//end of MLC

        //SLC
        var slc_content = '<%=contentBean.getContentString("Science Learning Center")%>';
		var slc = {lat: 33.9426, lng: -83.3764};
		var slc_infowindow = new google.maps.InfoWindow({
 		   content: slc_content
		 });
		var slc_marker = new google.maps.Marker({
		    position: slc,
		    map: map,
 		   title: "Science Learning Center"
		 });
		slc_marker.addListener("click", function(){
		    slc_infowindow.open(map, slc_marker);
		 });
		//end of SLC

		//library
		var main_library_content = '<%=contentBean.getContentString("Main Library")%>';
		var main_library = {lat: 33.9541, lng: -83.3738};
		var main_library_infowindow = new google.maps.InfoWindow({
		   content: main_library_content
		 });
		var main_library_marker = new google.maps.Marker({
		    position: main_library,
		    map: map,
			   title: "Main Library"
		 });
		main_library_marker.addListener("click", function(){
			main_library_infowindow.open(map, main_library_marker);
		 });
		
		
		//tate
		var tate_content = '<%=contentBean.getContentString("Tate Student Center")%>';
		var tate = {lat: 33.9505, lng: -83.3751};
		var tate_infowindow = new google.maps.InfoWindow({
		   content: tate_content
		 });
		var tate_marker = new google.maps.Marker({
		    position: tate,
		    map: map,
			   title: "Tate Student Center"
		 });
		tate_marker.addListener("click", function(){
			tate_infowindow.open(map, tate_marker);
		 });

		//two story coffee
        var two_storycoffee_content = '<%=contentBean.getContentString("Two Story Coffee")%>';
        var two_storycoffee = {lat: 33.9379, lng: -83.3875};
        var two_storycoffee_infowindow = new google.maps.InfoWindow({
           content: two_storycoffee_content
   		 });
        var two_storycoffee_marker = new google.maps.Marker({
            position: two_storycoffee,
            map: map,
            title: "Two Story Coffeehouse"
   		 });
        two_storycoffee_marker.addListener("click", function(){
            two_storycoffee_infowindow.open(map, two_storycoffee_marker);
   		 });
		
		
		//downstairs, snelling
		var snelling_content ='<%=contentBean.getContentString("Snelling (Downstairs)")%>';
		var snelling = {lat: 33.9447, lng: -83.3764};
		var snelling_infowindow = new google.maps.InfoWindow({
		   content: snelling_content
		 });
		var snelling_marker = new google.maps.Marker({
		    position: snelling,
		    map: map,
			   title: "Snelling Basement"
		 });
		snelling_marker.addListener("click", function(){
			snelling_infowindow.open(map, snelling_marker);
		 });
		
			
		//starbucks downtown, upstairs
		var starbucks_content = '<%=contentBean.getContentString("Starbucks (Upstairs)")%>';
		var starbucks = {lat: 33.9580, lng: -83.3751};
		var starbucks_infowindow = new google.maps.InfoWindow({
		   content: starbucks_content
		 });
		var starbucks_marker = new google.maps.Marker({
		    position: starbucks,
		    map: map,
			   title: "Starbucks"
		 });
		starbucks_marker.addListener("click", function(){
			starbucks_infowindow.open(map, starbucks_marker);
		 });
		
	
		
		
		
		//walkers
		var walkers_content = '<%=contentBean.getContentString("Walkers")%>';
		var walkers = {lat: 33.9581, lng: -83.3752};
		var walkers_infowindow = new google.maps.InfoWindow({
		   content: walkers_content
		 });
		var walkers_marker = new google.maps.Marker({
		    position: walkers,
		    map: map,
			   title: "Walkers"
		 });
		walkers_marker.addListener("click", function(){
			walkers_infowindow.open(map, walkers_marker);
		 });
		
		
		//museum of art
		var museum_art_content = '<%=contentBean.getContentString("Museum of Art")%>';
		var museum_art = {lat: 33.941037, lng: -83.370126};
		var museum_art_infowindow = new google.maps.InfoWindow({
		   content: museum_art_content
		 });
		var museum_art_marker = new google.maps.Marker({
		    position: museum_art,
		    map: map,
			   title: "Art Museum"
		 });
		museum_art_marker.addListener("click", function(){
			museum_art_infowindow.open(map, museum_art_marker);
		 });
		
			
		
		//foundersmemorialgarden
		var founders_garden_content = '<%=contentBean.getContentString("Founders Memorial Garden")%>';
		var founders_garden = {lat: 33.9541, lng: -83.3761};
		var founders_garden_infowindow = new google.maps.InfoWindow({
		   content: founders_garden_content
		 });
		var founders_garden_marker = new google.maps.Marker({
		    position: founders_garden,
		    map: map,
			   title: "Founders Memorial Garden"
		 });
		founders_garden_marker.addListener("click", function(){
			founders_garden_infowindow.open(map, founders_garden_marker);
		 });
		
    }
</script>
<script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBck-j5klgh0kETA-nQ7Zm4cWCvOFdiIUI&callback=initMap">
</script>
</body>
</html>
