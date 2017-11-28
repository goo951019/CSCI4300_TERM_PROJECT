<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
  <head>
    <meta name="viewport" content="initial-scale=1.0">
    <meta charset="utf-8">
    <style>
      #map{ height: 100%;}
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
    </style>
    <body>
      <div id="map"></div>
      <script>
        var map;
        function initMap(){
          map = new google.maps.Map(document.getElementById('map'), {
              center: {lat: 33.9468632199203, lng: -83.37727762536491}, zoom: 16,
              mapTypeId: google.maps.MapTypeId.HYBRID
            });
        }
      </script>
      <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD6EVbZz1GzwJ9bvuGy_lgIRkh0X7t4sDc&callback=initMap"
        async defer></script>
    </body>
  </head>
</html>
