<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%
String uId=request.getParameter("userId");
String pass=request.getParameter("password");

Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
PreparedStatement ps=con.prepareStatement("select * from login_table where user_id=? and password=?");
ps.setString(1,uId);
ps.setString(2,pass);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
String operator=rs.getString(3);
        if(operator.equals("admin"))
        {
        response.sendRedirect("admin page.jsp");
        }
        if(operator.equals("user"))
        {
        response.sendRedirect("user page.jsp");
        }
        if(operator.equals("expert"))
        {
        response.sendRedirect("expert page.jsp");
        }    
        else
        {
        response.sendRedirect("login page.jsp");
        }
}
%>
