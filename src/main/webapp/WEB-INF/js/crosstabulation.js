google.charts.load('current', {
	'packages' : [ 'table' ]
});

$(window).load(
		function() {
			$("#generate-crosstabulation").click(
					function() {
						$.ajax({
							dataType : "json",
							/*
							 * data: { var1:[ "var2", "var3", "var4"] },
							 */
							url : '' + contextPath + '/getCrossTabulationData/'
									+ ($("#question-1").val()) + "/"
									+ ($("#question-2").val()),
							success : function(data) {
								createCrossTabulation(data);
							}
						});
					});
		});

function createCrossTabulation(data) {

	var htmlString = "<table>";
	var dataTableView = new google.visualization.DataTable();
	for (i = 0; i < data.data[0].length; i++) {
		dataTableView.addColumn('string', '');
	}
	dataTableView.addRows(data.data.length);
	$.each(data.data, function(k) {
		
		for (i = 0; i < data.data[k].length; i++) {
			dataTableView.setCell(k,i,(data.data[k][i]).toString());
		}
		
	});
	var table = new google.visualization.Table(document
			.getElementById('cross-tab'));

	table.draw(dataTableView, {
		showRowNumber : true,
		width : '100%',
		height : '100%'
	});
}