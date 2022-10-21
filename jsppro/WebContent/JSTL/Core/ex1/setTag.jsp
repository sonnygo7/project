<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="num1" value="20" />
<c:set var="num2">
10.5
</c:set>
<c:set var="today" value="<%= new java.util.Date() %>" />

<html>
	<head>
		<title>set 태그와 remove 태그</title>
	</head>

	<body>
		<%
			String str = "JSP변수";
			request.setAttribute("st", str);   // 공유 설정
		%>
		변수1 : str1 = <%=str %>  <br>   <!-- "JSP변수" 출력 -->
		변수2 : str2 = ${str}  <br>      <!-- 출력 안됨  -->
		변수3 : str3 = ${st}   <br>      <!-- "JSP변수" 출력 -->
		<%
			String s = (String) request.getAttribute("st");
		%>
		변수4 : str4 = <%=s %> <br>      <!-- "JSP변수" 출력 -->
 	
		변수 num1 = ${num1} <br>
		변수 num2 = ${num2} <br>
		num1 + num2 = ${num1 + num2} <br>
		오늘은 ${today} 입니다.

		<c:remove var="num1" scope="page" />

		<p>
		삭제한 후의 num1 = ${num1} <br>
		삭제한 후의 num1 + num2 = ${num1 + num2}
	</body>
</html>
