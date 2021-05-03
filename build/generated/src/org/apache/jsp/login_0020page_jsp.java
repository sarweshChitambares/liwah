package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_0020page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <script>\n");
      out.write("        function check()\n");
      out.write("        {\n");
      out.write("        if(lg.userId.value==0)\n");
      out.write("        alert(\"user id is required\")\n");
      out.write("        if(lg.password.value==0)\n");
      out.write("        alert(\"password is required\")\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("<style>\n");
      out.write("        .themeorange\n");
      out.write("        {\n");
      out.write("            background:#F6A600;\n");
      out.write("            font-family:arial;\n");
      out.write("            font-weight: bold;\n");
      out.write("\t\twidth:100%;\n");
      out.write("        }\n");
      out.write("        .themeblack\n");
      out.write("        {\n");
      out.write("            background:#69696;\n");
      out.write("            font-family:arial;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <head>\n");
      out.write("        <title>login page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div style=\"background-image:url(bg0.png); background-repeat:no-repeat; background-position:center; background-size:120% 100%\" ;>\n");
      out.write("    <marquee><h1>Best Place for Solution</h1></marquee>\n");
      out.write("        <table class=\"themeorange\" width=\"100%\">\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"theme\" colspan=\"4\"><img src=\"liwahfixit.png\" ></td>\n");
      out.write("          <td align=\"center\" >\n");
      out.write("                <table >\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"contactus.jsp\">cuntact us</a></td>\n");
      out.write("                        <td><a href=\"aboutus.jsp\">about us</a></td>\n");
      out.write("                        <td><a href=\"customer care.jsp\">help</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </td>\n");
      out.write("        <tr width=\"60%\"><td  height=\"10%\" align =\"center\">\n");
      out.write("            <select>\n");
      out.write("                     <option>view services\n");
      out.write("                     <option>Hardware Related\n");
      out.write("                     <option>Software Related\n");
      out.write("                     <option>network related\n");
      out.write("                     <option>pc related    \n");
      out.write("                     <option>console related    \n");
      out.write("                     <option>android rooting related\n");
      out.write("                     <option>hacking related\n");
      out.write("                     <option>booting related\n");
      out.write("                     <option>custom rom related    \n");
      out.write("                 </select>\n");
      out.write("                 <td align =\"center\">\n");
      out.write("                 <select>\n");
      out.write("                     <option>view support\n");
      out.write("                     <option>problem request's\n");
      out.write("                     <option>solution's\n");
      out.write("                     <option>suggestions\n");
      out.write("                     <option>get personal help    \n");
      out.write("                     <option>about us     \n");
      out.write("                 </select>\n");
      out.write("                 </td>\n");
      out.write("                 <td height=\"10%\" align =\"center\">\n");
      out.write("                 <select>\n");
      out.write("                     <option>view experts\n");
      out.write("                     <option>windows expert\n");
      out.write("                     <option>android expert\n");
      out.write("                        <option>ios expert\n");
      out.write("                        <option>hardware experts\n");
      out.write("                         <option>network experts\n");
      out.write("                         <option>dll's expert     \n");
      out.write("                 </select>\n");
      out.write("                 </td>  \n");
      out.write("                   <td align =\"center\">\n");
      out.write("                  <select>  <option>doorstep services\n");
      out.write("                    <option>hardware expert's\n");
      out.write("                    <option>software expert's     \n");
      out.write("                  </select>\n");
      out.write("                </td>    \n");
      out.write("            </td></tr>\n");
      out.write("        </table>\n");
      out.write("        <table  width=\"100%\">\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    <form action=\"logincode.jsp\" name=\"lg\">\n");
      out.write("                    <table align=\"center\">\n");
      out.write("                        <tr><td>user id</td><td><input type=\"text\" name=\"userId\" placeholder=\"your id\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                        <tr><td>password</td><td><input type=\"text\" name=\"password\" style=\"border-radius:30px\" placeholder=\"password\"></td></tr>\n");
      out.write("                        <tr><td></td><td><button name=\"login\" style=\"border-radius:30px\">login</button><a href=\"\">forget password</a></td></tr>\n");
      out.write("                    </table>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                   \n");
      out.write("             \n");
      out.write("             \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          \n");
      out.write("        <table width=\"30%\"  align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("              <td align=\"center\">\n");
      out.write("                  <table>\n");
      out.write("                <tr><td ><a href=\"\">register as employee</a></td></tr>       \n");
      out.write("                <tr><td ><a href=\"\">about us</a> </td></tr>\n");
      out.write("                <tr><td><a href=\"\"></a></td></tr>\n");
      out.write("                <tr><td ><a href=\"\">help center</a></td></tr>\n");
      out.write("            <tr><td ><a href=\"\">contact us</a></td></tr> \n");
      out.write("            <tr><td ><a href=\"\">support</a></td></tr> \n");
      out.write("            \n");
      out.write("           </table> \n");
      out.write("        </table>\n");
      out.write("             <table align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                <table><br><br><br><br><br>\n");
      out.write("                    <tr><td><a href=\"expert signup.jsp\">become a affiliate</a></td></tr>\n");
      out.write("                    <tr><td><a href=\"customer care.jsp\">customer care </a></td></tr>\n");
      out.write("                    <tr><td><a href=\"contactus.jsp\">contact no.</a></td></tr>\n");
      out.write("                    <tr><td><a href=\"location.jsp\">location's</a></td></tr>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
