package com.studentSurvey.jsp;

public class SurveyBean {	
	
	String[] questions = {"Please rate your overall satisfaction working at TechDigital Oasis!", 
			"My team members show mutual trust of each other!",
			"I'm more productive in a team than I am when working alone",
			"I believe that I am an important member of my primary team",
			"My team makes a significant contribution to the success of this company",
			"My job is interesting and challenging",
			"My job allows me to use a variety of skills and abilities",
			"I can go to my supervisor with any work-related problem and get help",
			"My supervisor gives me useful feedback about my work",
			"My supervisor takes the time to show me how to succeed in this company",
			"I have a workload that allows me to do an excellent job",
			"My coworkers motivate me",
			"The work in my department is well organized",
			"There is cooperation between my department and other departments within this company",
			"This company encourages employees to think out of the box",
			"At this company, employees are treated like family",
			"Human relations employees are available to me to discuss my career plans",
			"This organisaztion accept responsibilities for developing its employees' careers",
			"My performance appraisal provides me with meaningful feedback about my job performance"};
			
			
	
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
