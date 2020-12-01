<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <jsp:useBean id="surveyBean" class="com.studentSurvey.jsp.SurveyBean"  scope="session"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Results  </title>
</head>
<body>

<%
	//Process data
	
	for(int i = 0; i<surveyBean.getTotalQuestions(); i++){
	
	String ans = request.getParameter("q" + i);
	if (ans.equals("Satisfied"))
		surveyBean.setAnswers(i, 0);
	else
		surveyBean.setAnswers(i, 1);
		
	}

	//Display
	
	for(int i = 0; i<surveyBean.getTotalQuestions(); i++){
		%>
			<%= i+1%>. <%=surveyBean.getQuestions(i) %> (<%=surveyBean.getAnswers(i, 1) %> Satisfied)(<%=surveyBean.getAnswers(i, 0) %> Dissatisfied)
			<br>
		
		<% } %>
	}



</body>
</html>