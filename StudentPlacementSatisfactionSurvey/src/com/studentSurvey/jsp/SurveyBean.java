package com.studentSurvey.jsp;


public class SurveyBean {
	
	String[] questions = {"Please rate your overall satisfaction working at TechDigital Oasis?", 
			"What department do you work in at Tech Digital Oasis?", 
			"Which Placement location do you work at?", 
			"Assuming that there are five (5) levels within your organization, with one (1) being the lowest and five (5) being the highest. At what level is placement job?"};
			
	
	int[][] answers = new int[questions.length][2];
	
	public int getTotalQuestions() {
		return questions.length;
	}

	public String getQuestions(int i) {
		return questions[i];
	}


	public void setQuestions(String question, int i) {
		this.questions[i] = question;
	}


	public int getAnswers(int q, int a) {
		return answers[q][a];
	}


	public void setAnswers(int q, int a) {
		this.answers[q][a]++;
	}


	public SurveyBean() {
		// TODO Auto-generated constructor stub
		
		
	}

}
