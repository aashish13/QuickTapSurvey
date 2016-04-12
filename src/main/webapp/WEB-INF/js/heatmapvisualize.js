$(window).load(
		function() {
			$("#all-question").change(
					function() {
						// ajax call and get the data and redraw the chart
						$.ajax({
							dataType : "json",
							url : '' + contextPath + '/getvisualizationdata/'
									+ chartType + '/' + ($(this).val()),
							success : function(data) {
								
								createHeatMap(data)
							}
						});
					});
		});
function createHeatMap(data){
	
	initialize(data);
}
var map, pointarray, heatmap;

function initialize(data) {
	try{
    var mapOptions = {
        zoom: 5,
        center: new google.maps.LatLng(43.728813,-79.606514),
        mapTypeId: google.maps.MapTypeId.ROADMAP
    };

    map = new google.maps.Map(document.getElementById('map'),
        mapOptions);
    var locations=[];
    for ( var i in data.rows){
    	locations.push(new google.maps.LatLng( parseFloat(i), data.rows[i] ));
    }
    	

    pointArray = new google.maps.MVCArray(locations);

    heatmap = new google.maps.visualization.HeatmapLayer({
        data: pointArray
    });
    heatmap.set('radius', 30);
    heatmap.setMap(map);
	}
	catch(err){
		alert(err.message);
	}
}