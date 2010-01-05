package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gddinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Distribute Database System-GDD Info</title>\r\n");
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
      out.write("ul{\r\n");
      out.write("        list-style: none;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("}\r\n");
      out.write("#menu{\r\n");
      out.write("        width: 200px;\r\n");
      out.write("        margin: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#menu li a {\r\n");
      out.write("        height: 32px;\r\n");
      out.write("          voice-family: \"\\\"}\\\"\";\r\n");
      out.write("          voice-family: inherit;\r\n");
      out.write("          height: 24px;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#menu li a:link, #menu li a:visited {\r\n");
      out.write("        color: #333;\r\n");
      out.write("        display: block;\r\n");
      out.write("        background:  url(img/menu14.gif);\r\n");
      out.write("        padding: 8px 0 0 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#menu li a:hover, #menu li #current {\r\n");
      out.write("        color: #FFF;\r\n");
      out.write("        background:  url(img/menu14.gif) 0 -32px;\r\n");
      out.write("        padding: 8px 0 0 10px;\r\n");
      out.write(" }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
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
      out.write("\t\t<li><a href=\"querytreedisplay.jsp\">QT DISPLAY</a></li>\r\n");
      out.write("\t\t<li><a href=# id=\"current\">GDD INFO</a></li>\r\n");
      out.write("\t\t<li><a href=\"help.jsp\">HELP</a></li>\r\n");
      out.write("\t\t<li><a href=\"aboutus.jsp\"  >ABOUT US</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\tgdd info~~~~~~~~\r\n");
      out.write("\r\n");
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
