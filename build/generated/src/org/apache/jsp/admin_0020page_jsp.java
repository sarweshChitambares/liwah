package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_0020page_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <style>\n");
      out.write("        .themeorange\n");
      out.write("        {\n");
      out.write("            background:#F6A600;\n");
      out.write("            font-family:arial;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .themeblack\n");
      out.write("        {\n");
      out.write("            background:#69696;\n");
      out.write("            font-family:arial;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <head>\n");
      out.write("        <title>Welcome Admin</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div style=\"background-image:url(bg0.png); background-repeat:no-repeat; background-position:center; background-size:120% 100%\" ;>\n");
      out.write("<marquee><h1>Get all Control!!!</h1></marquee>\n");
      out.write("        \n");
      out.write("             <table bgcolor=\"#F6A600\" width=\"100%\">\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"theme\" colspan=\"4\"><img src=\"liwahfixit.png\" >\n");
      out.write("                </td>\n");
      out.write("            <td align=\"center\" >\n");
      out.write("                <table >\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"contactus.jsp\">cuntact us</a></td>\n");
      out.write("                        <td><a href=\"aboutus.jsp\">about us</a></td>\n");
      out.write("                        <td><a href=\"customer care.jsp\">help</a></td>\n");
      out.write("                        <td><a href=\"login page.jsp\">logout</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("        <tr width=\"60%\">\n");
      out.write("            <td>\n");
      out.write("                <table align=\"center\"><tr><td>\n");
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
      out.write("                 </select></td>\n");
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
      out.write("                     <option>view queries\n");
      out.write("                     <option>windows \n");
      out.write("                     <option>android \n");
      out.write("                        <option>ios \n");
      out.write("                        <option>hardware \n");
      out.write("                         <option>network \n");
      out.write("                         <option>dll's      \n");
      out.write("                 </select>\n");
      out.write("                 </td>  \n");
      out.write("                   <td align =\"center\">\n");
      out.write("                  <select>  <option>doorstep services\n");
      out.write("                    <option>hardware expert's\n");
      out.write("                    <option>software expert's     \n");
      out.write("                  </select>\n");
      out.write("                </td>    \n");
      out.write("            \n");
      out.write("                </table></td></tr>\n");
      out.write("        </table>\n");
      out.write("    \n");
      out.write("    <table width=\"75%\" align=\"center\" >\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                <h3>online experts</h3>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>hardware experts</td>\n");
      out.write("                        <td>no. of experts</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td>software experts</td><td>no. of experts=100</td></tr>\n");
      out.write("                    <tr><td>network experts</td><td>no. of experts=80</td></tr>\n");
      out.write("                    <tr><td>rooting experts</td><td>no. of experts=60</td></tr>\n");
      out.write("                </table>\n");
      out.write("                   \n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <table>\n");
      out.write("                <h3>doorstep experts</h3>\n");
      out.write("                <tr><td>hardware experts </td><td>no. of experts=60</td></tr>\n");
      out.write("                <tr><td>network experts</td><td>no. of experts=10</td></tr>\n");
      out.write("                </table>    \n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <table>\n");
      out.write("                 <h3>all users</h3>\n");
      out.write("                 <tr><td>online</td><td>no. of user=1000</td></tr>\n");
      out.write("                 <tr><td>doorstep</td><td>no. of users=410</td></tr>\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                </table>\n");
      out.write("                </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <table width=\"100%\" align=\"center\" >\n");
      out.write("        \n");
      out.write("        <tr><h3 align='center'>updte information's</h3>\n");
      out.write("            <td>\n");
      out.write("                <form action=\"admincontrol_addexp.jsp\">\n");
      out.write("                <table><th>online expert</th>\n");
      out.write("                    <tr><td>expert id</td></tr>\n");
      out.write("                    <tr><td><input type='text' name=\"expId\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                    <tr><td>expert name</td></tr>\n");
      out.write("                    <tr><td><input type='text'name=\"expName\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                    <tr><td>email address</td></tr>\n");
      out.write("                    <tr><td><input type='text'name=\"eMail\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                    <tr><td><input type=submit value=\"update\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                </table></form>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <form action=\"admincontrol_addexp.jsp\">\n");
      out.write("                <table><th>doorstep expert</th>\n");
      out.write("                    <tr><td>expert id</td></tr>\n");
      out.write("                    <tr><td><input type='text'name=\"expId\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                    <tr><td>expert name</td></tr>\n");
      out.write("                    <tr><td><input type='text' name=\"expName\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                    <tr><td>emal address</td></tr>\n");
      out.write("                    <tr><td><input type='text'name=\"eMail\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                    <tr><td><input type=submit value=\"update\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                </table>\n");
      out.write("                    </form>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("            <form action=\"admincontrol_adduser.jsp\">\n");
      out.write("                <table >\n");
      out.write("                    <th>user</th>\n");
      out.write("                    <tr><td>user id</td></tr>\n");
      out.write("                    <tr><td><input type='text' name=\"uId\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                    <tr><td>user name</td></tr>\n");
      out.write("                    <tr><td><input type='text' name=\"uName\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                    <tr><td>email address</td></tr>\n");
      out.write("                    <tr><td><input type='text' name=\"eMail\"style=\"border-radius:30px\"></td></tr>\n");
      out.write("                    <tr><td><input type=submit value=\"update\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                </table>\n");
      out.write("                    </form>\n");
      out.write("            </td>    \n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("     <table align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                <table>\n");
      out.write("                    <tr><td><a href=\"expert signup.jsp\">become a affiliate</a></td></tr>\n");
      out.write("                    <tr><td><a href=\"customer care.jsp\">customer care </a></td></tr>\n");
      out.write("                    <tr><td><a href=\"contactus.jsp\">contact no.</a></td></tr>\n");
      out.write("                    <tr><td><a href=\"location.jsp\">location's</a></td></tr>\n");
      out.write("                   \n");
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
