$(window).load(
		function() {
			$("#generate-crosstabulation").click(
					function() {
						$.ajax({
							dataType : "json",
							/*data: {
							         var1:[
							           "var2",
							           "var3",
							           "var4"]
							         },*/
							url : '' + contextPath + '/getCrossTabulationData/'
									+ ($("#question-1").val())+"/"+($("#question-2").val()),
							success : function(data) {
								createCrossTabulation(data);
							}
						});
					});
		});

function createCrossTabulation(data){
	$.each(data.data, function(k) {
		$("#cross-tab").html($("#cross-tab").html()+"<br/>"+(data.data[k][0]+"-"+data.data[k][1]+"-"+data.data[k][2])+"<br/>");
	});
}