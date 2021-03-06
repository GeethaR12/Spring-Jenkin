package com.verizon.service;

import com.verizon.exceptions.ScoreException;
import com.verizon.model.Grade;

public class ScoringService {
	
	public Grade getGrade(double avg) {
		Grade g=null;
		if(avg>=90) g=Grade.A;
		else if (avg>=80) g=Grade.B;
		else if (avg>=70) g=Grade.C;
		else g=Grade.F;
		
		return g;
	}
	public double getPercentage(int[] marks,int maxMarksInEachSubject) throws ScoreException {
		
		double percent=0;
		
		if(maxMarksInEachSubject<=0)
			throw new ScoreException("Invalid max marks");
		if(marks==null || marks.length==0)
			throw new ScoreException("No marks received");
		
		double totalMaxScore=maxMarksInEachSubject*marks.length;
		double totalScore=0;
		for(int score:marks) {
			if(score<0 || score>maxMarksInEachSubject)
				throw new ScoreException("Score cannot be negative");
			totalScore+=score;
		}
		percent=(totalScore/totalMaxScore)*100;
		return percent;
	}

}
