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

<form action="surveyResult.jsp" method="get">
<table>

	<%
		for(int i = 0; i<surveyBean.getTotalQuestions(); i++){					
	%>

<tr><td><%=i +1 %>. <%= surveyBean.getQuestions(i) %></td>
<td><input type="radio" name="Q<%= i%>" value="Satisfied"> Satisfied</td>
<td><input type="radio" name="Q<%= i%>" value="Dissatisfied"> Dissatisfied</td>
<% } %>
<tr><td></td><td><input type="submit"></td><td><input type="reset"></td></tr>


</table>
</form>

</body>
</html>