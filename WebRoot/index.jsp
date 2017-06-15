<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import="java.sql.*"%>
<%!
private static final String DBDRIVER="org.git.mm.mysql.jdbc.Driver";
	private static final String DBURL="jdbc:mysql://localhost:3306/mldn";
	private static final String DBUSER="root";
	private static final String PASSWORD="root";
 %>
 <%
 Connection conn;
 PreparedStatement  pstmt=null;
 ResultSet rs=null;
 Class.forName(DBDRIVER);
 conn=DriverManager.getConnection(DBURL,DBUSER,PASSWORD);
 String sql="INSERT INTO news(title,content) VALUES (?,?)";
 pstmt=conn.prepareStatement(sql);
  pstmt.setString(1, "我");
  pstmt.setString(2, "他");
  out.print(pstmt.executeUpdate());
  conn.close();
  %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
  </body>
</html>
