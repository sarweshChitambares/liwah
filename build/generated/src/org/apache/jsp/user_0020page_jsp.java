package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_0020page_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("        .themeorange\n");
      out.write("        {\n");
      out.write("            background:#F6A600;\n");
      out.write("            font-family:arial;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .themeblack\n");
      out.write("        {\n");
      out.write("            background:#black;\n");
      out.write("            font-family:arial;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <head>\n");
      out.write("        <title> welcome boyii!!</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div style=\"background-image:url(bg0.png); background-repeat:no-repeat; background-position:center; background-size:120% 100%\" ;>\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("    <table class=\"themeblack\" >\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t<marquee><h1>Get Fastest solution </h1></marquee>\n");
      out.write("           <table width class=\"themeorange\" >\n");
      out.write("            <tr>\n");
      out.write("                <td><img src=\"liwahfixit.png\" >\n");
      out.write("                </td>\n");
      out.write("\t\t<td width=\"30%\" align=\"left\"><a href=\"www.google.com\">explore more </a></td>\n");
      out.write("            <td align=\"center\" >\n");
      out.write("                \n");
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
      out.write("                \n");
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
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("                </table>\n");
      out.write("    <table  align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                <table ><th>queries</th>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>query type</td><td><input type=\"text\" style=\"border-radius:30px\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr >\n");
      out.write("                        <td>query description</td><td><textarea></textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td colspan=\"2\" align=\"center\"><button style=\"border-radius:30px\">update</button></td></tr>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <table><th>get solution</th>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>user id</td>\n");
      out.write("                        <td><input type=\"text\" style=\"border-radius:30px\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>user name</td><td><input type=\"text\" style=\"border-radius:30px\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>select one</td>\n");
      out.write("                        <td><select><option>select query type</option>  \n");
      out.write("                    <option>hardware</option>\n");
      out.write("                    <option>software</option>\n");
      out.write("                    <option>network</option></select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>email </td><td><input type=\"email\" style=\"border-radius:30px\"></td></tr>\n");
      out.write("                <tr><td></td><td><button style=\"border-radius:30px\">submit</button><a href=\"login page.jsp\">login</a></td></tr>\n");
      out.write("                </table>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <br><br><br><br><marquee  direction=\"up\" behaviour=\"alternate\" ><img src=\"mar.png\"></marquee>\n");
      out.write("                <table><h4>you can help other's</h4>\n");
      out.write("                    <tr><td>query</td><td><input type='text' style=\"border-radius:30px\"></td> </tr>\n");
      out.write("                    <tr><td>describe solution</td><td><textarea></textarea></td></tr>\n");
      out.write("                    <tr><td><button style=\"border-radius:30px\">reply</button></td></tr>\n");
      out.write("                </table>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("  \n");
      out.write("    <table align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("            <td><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("                <table>\n");
      out.write("                    <tr><td><a href=\"expert signup.jsp\">become a affiliate</a></td></tr>\n");
      out.write("                    <tr><td><a href=\"customer care.jsp\">customer care </a></td></tr>\n");
      out.write("                    <tr><td><a href=\"contactus.jsp\">contact no.</a></td></tr>\n");
      out.write("                    <tr><td><a href=\"location.jsp\">location's</a></td></tr>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("       </div> \n");
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
