<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Distribute Database System-Index</title>
<script type="text/javascript">
var xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
function getResult(){
	var sql = document.getElementById("sqlCmd").value;
	var url="hello?sql="+sql;
	xmlhttp.open("POST",url,false);
	xmlhttp.onreadystatechange = updatePage;
	xmlhttp.send();
}
function updatePage() {
	if (xmlhttp.readyState < 4) {
		result.innerHTML="loading...";
	}
	if (xmlhttp.readyState == 4) {
		var response = xmlhttp.responseText;
		if(response==1){
			result.innerHTML="&nbsp;";
		}
		else{
			result.innerHTML=xmlhttp.responseText;
		}
	}
}
</script>
</head>

<style>
#header,#pagefooter,#container {
	margin: 0 auto;
	width: 1000px;
	min-width: 1000px;
}

#header {
	margin-left: 5%;
}

#side {
	float: left;
	width: 25%;
	margin-top: 20px;
}

#content {
	float: right;
	width: 65%;
	margin-top: 20px;
	margin-right: 5%;
}

ul {
	list-style: none;
	margin: 0;
	padding: 0;
}

#menu {
	width: 200px;
	margin: 10px;
}

#menu li a {
	height: 32px;
	voice-family: "\"}\"";
	voice-family: inherit;
	height: 24px;
	text-decoration: none;
}

#menu li a:link,#menu li a:visited {
	color: #333;
	display: block;
	background: url(img/menu14.gif);
	padding: 8px 0 0 10px;
}

#menu li a:hover,#menu li #current {
	color: #FFF;
	background: url(img/menu14.gif) 0 -32px;
	padding: 8px 0 0 10px;
}
</style>
<body>

<div id="header">
<h1><img src="img/title-img.jpg" /></h1>
</div>
<hr width=90% size=10 color=#6ba4d7
	style="filter: alpha(opacity = 100, finishopacity = 0, style = 2)" />

<div id="container">

<div id="side">

<ul id="menu">
	<li><a href=# id="current" >SQL QUERY</a></li>
	<li><a href="querytreedisplay.jsp">QT DISPLAY</a></li>
	<li><a href="gddinfo.jsp">GDD INFO</a></li>
	<li><a href="help.jsp">HELP</a></li>
	<li><a href="aboutus.jsp">ABOUT US</a></li>
</ul>

</div>

<div id="content">Please Insert a SQL Command: <BR>
<input type="text" style="width: 500px; height: 20px;" id="sqlCmd">&nbsp;
<button type="submit" onClick="getResult()">submit</button>
<BR>
<span id="result"></span></div>
</div>
<div id="pagefooter"></div>

</body>
</html>