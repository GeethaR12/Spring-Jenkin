package com.verizon.service;

import com.verizon.model.Grade;

public class SimpleInterestService {
	
	public double getSimpleInterest(double p,double r,double t) {
		double result=0.00;
		if(!(p<=0 || r<=0 || t<=0))
		result= (p*r*t)/100;
		return result;
		
	}
	public double getPayableAmount(double p,double r,double t) {
		double result=0.00;
		if(!(p<=0 || r<=0 || t<=0))
			result=  p+getSimpleInterest(p, r, t);
		return result;
	}
}
