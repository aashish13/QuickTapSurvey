// Load the Visualization API and the piechart package.
google.load('visualization', '1.0', {
	'packages' : [ 'corechart', 'geochart', 'geomap', 'map' ]
});

// Set a callback to run when the Google Visualization API is loaded.
// google.setOnLoadCallback(drawChart);

// method called when the question is changed

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
								if (data.chartType == "Quotes")
									createQuotes(data)
								else if (data.chartType == "Map")
									createHeatMap(data)
								else if (data.chartType == "GeoChart")
									createGeoChart(data)
								else if (data.chartType == "OpenTextAnalysis")
									createOpenTextAnalysis(data)
								else
									visualize(data);
							}
						});
					});
		});

function visualize(data) {
	var dataTable = new google.visualization.DataTable();
	var chartType = data.chartType;
	var rows = [];
	var question = data.question;

	if (chartType == 'Gauge') {
		$('#chart_info').html("<br/>" + data.info);
	}

	if (chartType === 'GeoChart' || chartType === 'Map') {
		dataTable.addColumn('number', 'Lat');
		dataTable.addColumn('number', 'Lon');
	} else {
		$.each(data.columns, function(k, v) {
			dataTable.addColumn(k, v);
		});
		for ( var i in data.rows)
			rows.push([ i, data.rows[i] ]);
	}

	dataTable.addRows(rows);
	// chartType="Histogram";
	drawChart(dataTable, chartType, question);
}

function drawChart(dataTable, chartType, question) {
	if (chartType == 'Gauge') {
		var options = {
			'title' : question,
			'width' : 700,
			'height' : 300,
			min : -100,
			max : 100,
			redFrom : -100,
			redTo : 0,
			greenFrom : 1,
			greenTo : 100,
			animation : {
				duration : 1000,
				easing : 'out',
			},
			is3D : true
		};
	} else {
		var options = {
			'title' : question,
			'width' : 700,
			'height' : 300,
			is3D : true
		};
	}
	var chart = new google.visualization.ChartWrapper({
		containerId : 'chart_div'
	});
	// get chart type from ajax
	// chartType = 'Gauge';
	chart.setChartType(chartType);
	chart.setOptions(options);
	// get data from ajax
	chart.setDataTable(dataTable);
	chart.draw();
}

function createHeatMap(data) {
	var map, heatmap;

	map = new google.maps.Map(document.getElementById('chart_div'), {
		zoom : 13,
		center : {
			lat : 37.775,
			lng : -122.434
		},
		mapTypeId : google.maps.MapTypeId.SATELLITE
	});

	heatmap = new google.maps.visualization.HeatmapLayer({
		data : getPoints(),
		map : map
	});
}
function createOpenTextAnalysis(data) {
	var dataTable = new google.visualization.DataTable();
	dataTable.addColumn('string', 'Text');
	var rows = [];
	for ( var i in data.openText) {
		rows.push([ data.openText[i] ]);
	}
	dataTable.addRows(rows);
	var outputDiv = document.getElementById('chart_div');
	var wc = new WordCloud(outputDiv);
	wc
			.draw(
					dataTable,
					{
						stopWords : 'a was too it with may only while used so as be by an and is or A in this that the of for to its'
					});
}

function createGeoChart(data) {

	var data = google.visualization.arrayToDataTable([ [ 'Province', 'Count' ],
			[ "Ontario", 1000 ], [ "Quebec", 1900 ],
			[ "British Columbia", 100 ], [ "Alberta", 300 ],
			[ "Manitoba", 500 ], [ "Saskatchewan", 600 ],
			[ "Nova Scoitia", 30 ], [ "New Brunswick", 50 ],
			[ "Newfoundland and Labrador", 100 ],
			[ "Prince Edward Island", 200 ], [ "Northwest Territories", 300 ],
			[ "Yukon", 400 ], [ "Nunavut", 500 ] ]);

	var options = {
		region : 'CA',
		'width' : 700,
		'height' : 300,
		displayMode : 'markers',
		colorAxis : {
			colors : [ '#00853f', 'black', '#e31b23' ]
		},
		backgroundColor : '#81d4fa',
		datalessRegionColor : '#f8bbd0',
		defaultColor : '#f5f5f5',
		colorAxis : {
			colors : [ 'green', 'blue' ]
		}
	};

	var chart = new google.visualization.GeoChart(document
			.getElementById('chart_div'));
	chart.draw(data, options);

}
function createQuotes(data) {
	$('#chart_div').html("");
	var map = new Object();
	var time = [];
	for ( var i in data.rows) {
		time.push(i);
		var d1 = Date.parse(i);
		map[d1] = data.rows[i];
	}
	keys = Object.keys(map);
	l = keys.length;
	keys.sort();
	time.sort();
	if (l > 10)
		l = 10;
	for (var i = l - 1; i >= 0; i--) {
		var k = keys[i];
		$('#chart_div').html(
				$('#chart_div').html() + "<table class='table1'>"
						+ "<tr class='info'><td>" + "<b>" + time[i]
						+ "</td><td>" + "<b>" + "\"" + map[k] + "\""
						+ "</td></tr></table>" + "<br>");

	}
}

// function createQuotes(data){
// for ( var i in data.rows)
// {
// $('#chart_div').html(
// $('#chart_div').html() +"<table class='table1'><tr class='info'><td>"+ "<b>"+
// i +"</td><td>"+"<b>"+"\"" + data.rows[i] + "\""+"</td></tr></table>"
//
// +"<br>");}
// }

