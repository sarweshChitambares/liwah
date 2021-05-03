<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%
  String expId=request.getParameter("expId") ;
  String expName=request.getParameter("expName");
  String age=request.getParameter("age");
  String eMail=request.getParameter("eMail");
  String contact=request.getParameter("contact");
  String pass=request.getParameter("pass");
  Class.forName("mysql.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
  PreparedStatement ps=con.prepareStatement("insert into expert_table values(?,?,?,?,?,?)");
  ps.setString(1,expId);
 ps.setString(2,expName);
 ps.setString(3,age);
ps.setString(4,eMail); 
ps.setString(5,contact);
ps.setString(6,pass);
  ps.executeUpdate();
response.sendRedirect("expert page.jsp");

%>