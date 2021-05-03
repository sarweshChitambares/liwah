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
  PreparedStatement ps=con.prepareStatement("delete from expert_table where expert_id=?");
  ps.setString(1,expId);

  ps.executeUpdate();
response.sendRedirect("admin page.jsp");

%>