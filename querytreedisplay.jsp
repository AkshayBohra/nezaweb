<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Distribute Database System-QueryTree Display</title>
<script type="text/javascript" src="ECOTree.js"></script>
<link type="text/css" rel="stylesheet" href="ECOTree.css" />
<xml:namespace ns="urn:schemas-microsoft-com:vml" prefix="v"/>
<style>v\:*{ behavior:url(#default#VML);}</style> 
<style>
			.copy {
				font-family : "Verdana";				
				font-size : 10px;
				color : #CCCCCC;
			}
</style>
			
<script>
	var myTree = null;			
	function CreateTree() {
		myTree = new ECOTree('myTree','myTreeContainer');							
		myTree.add(0,-1,"Projection:Product.name",200);
		myTree.add(1,0,"JOIN: Product.id = Product.id",200);
		myTree.add(2,1,"Product.1",120);
		myTree.add(3,1,"Projection:Product.id",200);
		myTree.add(4,3,"Selection:Product.stocks<4000",200);
		myTree.add(5,4,"Product.2",120);
		myTree.UpdateTree();
	}			
</script>		
<script type="text/javascript">
	var xmlhttp = null;
	try{
		    xmlhttp= new ActiveXObject('Msxml2.XMLHTTP');
	}catch(e){
		try{
		        xmlhttp= new ActiveXObject('Microsoft.XMLHTTP');
		}catch(e){
		        try{
		            xmlhttp= new XMLHttpRequest();
		        }catch(e){}
		 }
	}
	function getResult(){
		var sql = document.getElementById("sqlCmd").value;
		var url="hello?sql="+sql;
		xmlhttp.open("POST",url,true);
		xmlhttp.onreadystatechange = updatePage;
		xmlhttp.send();
	}
	function updatePage() {
		if (xmlhttp.readyState < 4) {
			//result.innerHTML="loading...";
		}
		if (xmlhttp.readyState == 4) {
			//var response = xmlhttp.responseXML;
			var response = "2222";
			if(response==1){
				result.innerHTML="&nbsp;";
			}
			else{
				//result.innerHTML=xmlhttp.responseText;
				var text = "";
				myTree = new ECOTree('myTree','myTreeContainer');
				myTree.config.colorStyle = ECOTree.CS_LEVEL;
				myTree.config.nodeFill = ECOTree.NF_FLAT;
				myTree.config.useTarget = false;
				myTree.config.selectMode = ECOTree.SL_MULTIPLE;
				var objects = xmlhttp.responseXML.getElementsByTagName("node");
				for(var i=0;i<objects.length;i++){
					var object = objects[i];
					var content = object.getElementsByTagName("content")[0].firstChild.data;
					text += content;
					text +="; ";
					var nodeID =  object.getElementsByTagName("nodeid")[0].firstChild.data;
					text += nodeID;
					text += "; ";
					var parentNodeID = object.getElementsByTagName("parentnodeid")[0].firstChild.data;
					var siteID = object.getElementsByTagName("siteid")[0].firstChild.data;
					text += parentNodeID;	
					text +="<BR>";
					content+="<BR>";
					content+="("+siteID+")";
					myTree.add(nodeID,parentNodeID,content,200);
				}
				myTree.UpdateTree();
				result.innerHTML = "";
			}
		}
	}
</script>	
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
<!-- <body  onLoad="CreateTree();">
-->
<body>
<div id="header">
<h1><img src="img/title-img.jpg"/></h1>
</div>
<hr width=90% size=10 color=#6ba4d7 style="filter:alpha(opacity=100,finishopacity=0,style=2)" /> 

<div id="container">
	<div id="side">
	
		<ul id="menu">
		<li><a href="index.jsp">SQL QUERY</a></li>
		<li><a href=# id="current">QT DISPLAY</a></li>
		<li><a href="gddinfo.jsp">GDD INFO</a></li>
		<li><a href="help.jsp">HELP</a></li>
		<li><a href="aboutus.jsp"  >ABOUT US</a></li>
		</ul>
	
	</div>
	
	<div id="content">
	Please Insert a SQL Command: <BR>
	<input type="text" style="width: 500px; height: 20px;" id="sqlCmd">&nbsp;
	<button type="submit" onClick="getResult()">submit</button>
	<BR>
	<span id="result"></span>
	<div id="myTreeContainer"></div>
	
	</div>
</div>
<div id="pagefooter">
</div>

</body>
</html>
