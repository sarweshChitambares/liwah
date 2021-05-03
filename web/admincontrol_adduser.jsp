<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%
  String uId=request.getParameter("uId") ;
  String uName=request.getParameter("uName");
  String eMail=request.getParameter("eMail");
  Class.forName("mysql.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
  PreparedStatement ps=con.prepareStatement("insert into user_table(user_id,user_name,mail_id) values(?,?,?)");
  ps.setString(1,uId);
 ps.setString(2,uName);
ps.setString(3,eMail); 
  ps.executeUpdate();
response.sendRedirect("admin page.jsp");

%>