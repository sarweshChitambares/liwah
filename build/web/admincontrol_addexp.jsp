<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%
  String expId=request.getParameter("expId") ;
  String expName=request.getParameter("expName");
  String eMail=request.getParameter("eMail");
  Class.forName("mysql.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
  PreparedStatement ps=con.prepareStatement("insert into expert_table(expert_id,expert_name,mail_id) values(?,?,?)");
  ps.setString(1,expId);
 ps.setString(2,expName);
ps.setString(3,eMail); 
  ps.executeUpdate();
response.sendRedirect("admin page.jsp");

%>