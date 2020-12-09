<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="surveyBean" class="com.studentSurvey.jsp.SurveyBean"  scope="session"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tech Digital Oasis student Survey</title>
</head>
<body>
		
<div align="right">
<a href ="http://localhost:3030/StudentPlacementSatisfactionSurvey/logout.jsp">Logout</a>
</div>
<div align="center">
<img src="C:\Users\W-book\git\StudentPlacementSatisfactionSurvey\StudentPlacementSatisfactionSurvey\Images\opinion.jpg">
<h1>Choose satisfied or dissatisfied</h1>
</div>
<form action="surveyResult.jsp" method="get">
<table>

	
	<%
		
		for(int i = 0; i<surveyBean.getTotalQuestions(); i++){					
	%>

<tr><td><%=i +1 %>. <%= surveyBean.getQuestions(i) %></td>
<td><h4><br><input type="radio" name="Q<%= i%>" value="Satisfied">Satisfied</h4></td>
<td><h4><br><input type="radio" name="Q<%= i%>" value="Dissatisfied">Dissatisfied</h4></td>
<% } %>
<tr><td></td><td><input type="submit" value="SUBMIT"></td><td><input type="reset"></td></tr>


</table>
</form>

</body>
</html>