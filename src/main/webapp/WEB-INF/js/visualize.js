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
	if (chartType === 'Map') {
		dataTable.addColumn('number', 'Lat');
		dataTable.addColumn('number', 'Lon');
		for ( var i in data.rows)
			rows.push([ parseFloat(i), parseFloat(data.rows[i]) ]);
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

	var options = {
		'title' : question,
		'width' : 700,
		'height' : 300,
		min : -10,
		max : 100,
		redFrom : 90,
		redTo : 100,
		yellowFrom : 75,
		yellowTo : 90,
		region : 'CA',
		displayMode : 'region',
		resolution : 'provinces',
		colorAxis : {
			//colors : [ '#e31b23', 'grey','black', '#00853f' ]
		},
		backgroundColor : '#81d4fa',
		datalessRegionColor : '#f8bbd0',
		defaultColor : '#f5f5f5',
		is3D : true
	};

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