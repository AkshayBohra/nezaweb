package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class querytreedisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Distribute Database System-QueryTree Display</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"ECOTree.js\"></script>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"ECOTree.css\" />\r\n");
      out.write("<xml:namespace ns=\"urn:schemas-microsoft-com:vml\" prefix=\"v\"/>\r\n");
      out.write("<style>v\\:*{ behavior:url(#default#VML);}</style> \r\n");
      out.write("<style>\r\n");
      out.write("\t\t\t.copy {\r\n");
      out.write("\t\t\t\tfont-family : \"Verdana\";\t\t\t\t\r\n");
      out.write("\t\t\t\tfont-size : 10px;\r\n");
      out.write("\t\t\t\tcolor : #CCCCCC;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("</style>\r\n");
      out.write("\t\t\t\r\n");
      out.write("<script>\r\n");
      out.write("\tvar myTree = null;\t\t\t\r\n");
      out.write("\tfunction CreateTree() {\r\n");
      out.write("\t\tmyTree = new ECOTree('myTree','myTreeContainer');\t\t\t\t\t\t\t\r\n");
      out.write("\t\tmyTree.add(0,-1,\"Projection:Product.name\",200);\r\n");
      out.write("\t\tmyTree.add(1,0,\"JOIN: Product.id = Product.id\",200);\r\n");
      out.write("\t\tmyTree.add(2,1,\"Product.1\",120);\r\n");
      out.write("\t\tmyTree.add(3,1,\"Projection:Product.id\",200);\r\n");
      out.write("\t\tmyTree.add(4,3,\"Selection:Product.stocks<4000\",200);\r\n");
      out.write("\t\tmyTree.add(5,4,\"Product.2\",120);\r\n");
      out.write("\t\tmyTree.UpdateTree();\r\n");
      out.write("\t}\t\t\t\r\n");
      out.write("</script>\t\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar xmlhttp = null;\r\n");
      out.write("\ttry{\r\n");
      out.write("\t\t    xmlhttp= new ActiveXObject('Msxml2.XMLHTTP');\r\n");
      out.write("\t}catch(e){\r\n");
      out.write("\t\ttry{\r\n");
      out.write("\t\t        xmlhttp= new ActiveXObject('Microsoft.XMLHTTP');\r\n");
      out.write("\t\t}catch(e){\r\n");
      out.write("\t\t        try{\r\n");
      out.write("\t\t            xmlhttp= new XMLHttpRequest();\r\n");
      out.write("\t\t        }catch(e){}\r\n");
      out.write("\t\t }\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction getResult(){\r\n");
      out.write("\t\tvar sql = document.getElementById(\"sqlCmd\").value;\r\n");
      out.write("\t\tvar url=\"hello?sql=\"+sql;\r\n");
      out.write("\t\txmlhttp.open(\"POST\",url,true);\r\n");
      out.write("\t\txmlhttp.onreadystatechange = updatePage;\r\n");
      out.write("\t\txmlhttp.send();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction updatePage() {\r\n");
      out.write("\t\tif (xmlhttp.readyState < 4) {\r\n");
      out.write("\t\t\t//result.innerHTML=\"loading...\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (xmlhttp.readyState == 4) {\r\n");
      out.write("\t\t\t//var response = xmlhttp.responseXML;\r\n");
      out.write("\t\t\tvar response = \"2222\";\r\n");
      out.write("\t\t\tif(response==1){\r\n");
      out.write("\t\t\t\tresult.innerHTML=\"&nbsp;\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\t//result.innerHTML=xmlhttp.responseText;\r\n");
      out.write("\t\t\t\tvar text = \"\";\r\n");
      out.write("\t\t\t\tmyTree = new ECOTree('myTree','myTreeContainer');\r\n");
      out.write("\t\t\t\tmyTree.config.colorStyle = ECOTree.CS_LEVEL;\r\n");
      out.write("\t\t\t\tmyTree.config.nodeFill = ECOTree.NF_FLAT;\r\n");
      out.write("\t\t\t\tmyTree.config.useTarget = false;\r\n");
      out.write("\t\t\t\tmyTree.config.selectMode = ECOTree.SL_MULTIPLE;\r\n");
      out.write("\t\t\t\tvar objects = xmlhttp.responseXML.getElementsByTagName(\"node\");\r\n");
      out.write("\t\t\t\tfor(var i=0;i<objects.length;i++){\r\n");
      out.write("\t\t\t\t\tvar object = objects[i];\r\n");
      out.write("\t\t\t\t\tvar content = object.getElementsByTagName(\"content\")[0].firstChild.data;\r\n");
      out.write("\t\t\t\t\ttext += content;\r\n");
      out.write("\t\t\t\t\ttext +=\"; \";\r\n");
      out.write("\t\t\t\t\tvar nodeID =  object.getElementsByTagName(\"nodeid\")[0].firstChild.data;\r\n");
      out.write("\t\t\t\t\ttext += nodeID;\r\n");
      out.write("\t\t\t\t\ttext += \"; \";\r\n");
      out.write("\t\t\t\t\tvar parentNodeID = object.getElementsByTagName(\"parentnodeid\")[0].firstChild.data;\r\n");
      out.write("\t\t\t\t\tvar siteID = object.getElementsByTagName(\"siteid\")[0].firstChild.data;\r\n");
      out.write("\t\t\t\t\ttext += parentNodeID;\t\r\n");
      out.write("\t\t\t\t\ttext +=\"<BR>\";\r\n");
      out.write("\t\t\t\t\tcontent+=\"<BR>\";\r\n");
      out.write("\t\t\t\t\tcontent+=\"(\"+siteID+\")\";\r\n");
      out.write("\t\t\t\t\tmyTree.add(nodeID,parentNodeID,content,200);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tmyTree.UpdateTree();\r\n");
      out.write("\t\t\t\tresult.innerHTML = \"\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#header,#pagefooter,#container{\r\n");
      out.write("\tmargin:0 auto;\r\n");
      out.write("\twidth: 1000px;\r\n");
      out.write("\tmin-width:1000px;\r\n");
      out.write("}\r\n");
      out.write("#header{\r\n");
      out.write("margin-left:5%\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#side {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 25%;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content {\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\twidth: 65%;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tmargin-right: 5%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("        list-style: none;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("#menu {\r\n");
      out.write("        width: 200px;\r\n");
      out.write("        margin: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("#menu li a {\r\n");
      out.write("        height: 32px;\r\n");
      out.write("          voice-family: \"\\\"}\\\"\";\r\n");
      out.write("          voice-family: inherit;\r\n");
      out.write("          height: 24px;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("#menu li a:link, #menu li a:visited {\r\n");
      out.write("        color: #333;\r\n");
      out.write("        display: block;\r\n");
      out.write("        background:  url(img/menu14.gif);\r\n");
      out.write("        padding: 8px 0 0 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("#menu li a:hover, #menu li #current {\r\n");
      out.write("        color: #FFF;\r\n");
      out.write("        background:  url(img/menu14.gif) 0 -32px;\r\n");
      out.write("        padding: 8px 0 0 10px;\r\n");
      out.write("        }\r\n");
      out.write("</style>\r\n");
      out.write("<!-- <body  onLoad=\"CreateTree();\">\r\n");
      out.write("-->\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("<h1><img src=\"img/title-img.jpg\"/></h1>\r\n");
      out.write("</div>\r\n");
      out.write("<hr width=90% size=10 color=#6ba4d7 style=\"filter:alpha(opacity=100,finishopacity=0,style=2)\" /> \r\n");
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\t<div id=\"side\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<ul id=\"menu\">\r\n");
      out.write("\t\t<li><a href=\"index.jsp\">SQL QUERY</a></li>\r\n");
      out.write("\t\t<li><a href=# id=\"current\">QT DISPLAY</a></li>\r\n");
      out.write("\t\t<li><a href=\"gddinfo.jsp\">GDD INFO</a></li>\r\n");
      out.write("\t\t<li><a href=\"help.jsp\">HELP</a></li>\r\n");
      out.write("\t\t<li><a href=\"aboutus.jsp\"  >ABOUT US</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\tPlease Insert a SQL Command: <BR>\r\n");
      out.write("\t<input type=\"text\" style=\"width: 500px; height: 20px;\" id=\"sqlCmd\">&nbsp;\r\n");
      out.write("\t<button type=\"submit\" onClick=\"getResult()\">submit</button>\r\n");
      out.write("\t<BR>\r\n");
      out.write("\t<span id=\"result\"></span>\r\n");
      out.write("\t<div id=\"myTreeContainer\"></div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"pagefooter\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
