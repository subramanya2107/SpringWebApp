$(document).ready(function() {

	var data = {
		"id" : 1,
		"type" : 1,
		"project" : 1,
		"userName" : "un1",
		"msg" : "msg1",
		"appVersion" : "a"
	};

	$.ajax({
		url : 'rest/msglog/addmsglog',
		type : 'POST',
		headers : {
			'Accept' : 'application/json',
			'Content-Type' : 'application/json'
		},
		data : JSON.stringify(data),
		contentType : 'application/json',
		dataType : 'json',
		success : function(d) {
			  $( "#content" ).html( JSON.stringify(d) );
		},
		error:function(){
			alert("error");
		}
	});
	
	
});
