$(window).load(
		function() {
			$("#generate-crosstabulation").click(
					function() {
						$.ajax({
							dataType : "json",
							url : '' + contextPath + '/getCrossTabulationData/'
									+ ($("#question-1").val())+"/"+($("#question-2").val()),
							success : function(data) {
								createCrossTabulation(data);
							}
						});
					});
		});

function createCrossTabulation(data){
	
	$.each(data, function(k, v) {
	alert(v.length);
	});
}