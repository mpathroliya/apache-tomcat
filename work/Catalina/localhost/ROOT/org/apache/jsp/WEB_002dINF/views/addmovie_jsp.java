/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.26
 * Generated at: 2019-10-14 09:03:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addmovie_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <title>Add Movie</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://code.jquery.com/ui/1.12.1/themes/ui-darkness/jquery-ui.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"/>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("    padding-top: 70px;\n");
      out.write("    padding-bottom: 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer{\n");
      out.write("    height: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".movie-card {\n");
      out.write("  display: flex;\n");
      out.write("  flex-direction: column;\n");
      out.write("  justify-content: flex-end;\n");
      out.write("  padding: 10px;\n");
      out.write("  align-items: stretch;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".movie-card .card{\n");
      out.write("\n");
      out.write("    flex: 1 1 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".movie-cards {\n");
      out.write("  padding: 20px 0;\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: space-around;\n");
      out.write("  align-items: stretch;\n");
      out.write("  flex-wrap: nowrap;\n");
      out.write("  overflow-x: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul li {\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".booking-seats {\n");
      out.write("  animation-name: show;\n");
      out.write("  animation-duration: 10s;\n");
      out.write("  animation-timing-function: linear;\n");
      out.write("  animation-fill-mode: forwards;\n");
      out.write("  margin: 10% 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes show {\n");
      out.write("    from { visibility: visible; }\n");
      out.write("    to { visibility: hidden; width: 0px; height: 0px;}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".booking-success {\n");
      out.write("  animation-name: hide;\n");
      out.write("  animation-duration: 10s;\n");
      out.write("  animation-timing-function: linear;\n");
      out.write("  animation-fill-mode: forwards;\n");
      out.write("  visibility: hidden;\n");
      out.write("  opacity: 0;\n");
      out.write("  margin: 10% 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes hide {\n");
      out.write("    99% { visibility: hidden; opacity: 0;}\n");
      out.write("    100% { visibility: visible; opacity: 1;}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".loader {\n");
      out.write("    border: 16px solid #f3f3f3; /* Light grey */\n");
      out.write("    border-top: 16px solid #3498db; /* Blue */\n");
      out.write("    border-radius: 50%;\n");
      out.write("    width: 120px;\n");
      out.write("    height: 120px;\n");
      out.write("    animation: spin 2s linear 5;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes spin {\n");
      out.write("    0% { transform: rotate(0deg); }\n");
      out.write("    100% { transform: rotate(360deg); }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-signin {\n");
      out.write("    max-width: 330px;\n");
      out.write("    padding: 15px;\n");
      out.write("    margin: 0 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-signin .form-control {\n");
      out.write("    position: relative;\n");
      out.write("    height: auto;\n");
      out.write("    -webkit-box-sizing: border-box;\n");
      out.write("    -moz-box-sizing: border-box;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    padding: 10px;\n");
      out.write("    font-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-signin .form-control:focus {\n");
      out.write("    z-index: 2;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-signin input {\n");
      out.write("    margin-top: 10px;\n");
      out.write("    border-bottom-right-radius: 0;\n");
      out.write("    border-bottom-left-radius: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-signin button {\n");
      out.write("    margin-top: 10px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                            <span style=\"font-family:cursive;display:inline-block;color:yellow\">MoviesNow</span>\n");
      out.write("                    </a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li><a href=\"/\">Movies</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Create new Movie</h2>\n");
      out.write("        <form action=\"/addmovie\" method=\"post\" class=\"form-signin\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"name\" type=\"text\" class=\"form-control\" placeholder=\"Movie Name\"\n");
      out.write("                       autofocus=\"true\"/>\n");
      out.write("                <textarea rows = \"5\" cols=\"50\" name=\"descr\" type=\"text\" class=\"form-control\" placeholder=\"Description\"></textarea>\n");
      out.write("                <input name=\"tags\" type=\"text\" class=\"form-control\" placeholder=\"Movie Tags(Space Separated)\"/>\n");
      out.write("                <input name=\"imdb_rating\" type=\"number\" step=\".01\" class=\"form-control\" placeholder=\"IMDB Rating\"/>\n");
      out.write("                <input name=\"runtime\" type=\"number\" class=\"form-control\" placeholder=\"Runtime(in minutes)\"/>\n");
      out.write("                <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Add Movie</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <footer class=\"footer navbar-inverse navbar-fixed-bottom\">\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.12.4.min.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
