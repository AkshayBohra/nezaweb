<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Distribute Database System-Help</title>
</head>

<style>
#header,#pagefooter,#container{
	margin:0 auto;
	width: 1000px;
	min-width:1000px;
}
#header{
margin-left:5%
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

#menu li a:link, #menu li a:visited {
        color: #333;
        display: block;
        background:  url(img/menu14.gif);
        padding: 8px 0 0 10px;
        }

#menu li a:hover, #menu li #current {
        color: #FFF;
        background:  url(img/menu14.gif) 0 -32px;
        padding: 8px 0 0 10px;
        }
</style>
<body>

<div id="header">
<h1><img src="img/title-img.jpg"/></h1>
</div>
<hr width=90% size=10 color=#6ba4d7 style="filter:alpha(opacity=100,finishopacity=0,style=2)" /> 

<div id="container">
	<div id="side">
	
		<ul id="menu">
		<li><a href="index.jsp">SQL QUERY</a></li>
		<li><a href="querytreedisplay.jsp">QT DISPLAY</a></li>
		<li><a href="gddinfo.jsp">GDD INFO</a></li>
		<li><a href=# id="current">HELP</a></li>
		<li><a href="aboutus.jsp">ABOUT US</a></li>
		</ul>
	
	</div>
	
	<div id="content">
		<table cellpadding="6px">
		<tr><td>Command Support:</td></tr>
		<tr><td>1.setsite:</td></tr>
		<tr><td>2.create table:</td></tr>
		<tr><td>3.H/V fragment:</td></tr>
		<tr><td>4.allocate:</td></tr>
		<tr><td>5.importdata:</td></tr>
		<tr><td>6.insert:</td></tr>
		<tr><td>7.select:</td></tr>
		<tr><td>8.delete:</td></tr>
		</table>


	</div>
</div>
<div id="pagefooter">
</div>

</body>
</html>
