package com;

import java.text.DecimalFormat;

/**
 * Calculates cumulative GPA. Default GPA matches unofficial transcript info
 * current as of 12/17/2014 with the exception of assuming that I will pass cs2420 
 * with an A during upcoming Spring '15 semester. If not passed with an A, update 
 * in GPACalculator member variable for cs2420. Update GPA Calculator with any 
 * classes taken after current date before running.
 * 
 * How to use:
 * 
 * 			** To add classes **
 * 
 * Format: ...new Class([grade], [#ofCreditHours])
 * 
 * Examples:
 * 1. ClassObject nameOfClass = new ClassObject("[nameOfClass]", "A", 3);
 * gpaCalc.getClassSet().add([nameOfClass]);
 * 
 * 2. ClassObject essf1043 = new ClassObject("essf1043", "A", 2);
 * gpaCalc.getClassSet().add(essf1043);
 * 
 * 			** To remove classes **
 * Format: ...remove(gpaCalc.[nameOfClass])
 * 
 * Example:
 * 1. gpaCalc.getClassSet().remove(gpaCalc.cs1410);
 * 
 * 
 * 			** To change class grade **
 * Format: ...changeClassGrade([nameOfClass], [grade])
 * 
 * Examples:
 * 1. gpaCalc.changeClassGrade("[nameOfClass]", "[grade]");
 * 2. gpaCalc.changeClassGrade("math1010", "A");
 * 3. gpaCalc.changeClassGrade("pols3030", "A");
 * 4. gpaCalc.changeClassGrade("phil3730", "A");
 * 
 * End.
 * 
 * @author Fred Javalera
 *
 */
public class GPACalculatorClient
{
	public static void main(String[] args)
	{
		//sets up client
		DecimalFormat df = new DecimalFormat("#.###");
		GPACalculator gpaCalc = new GPACalculator();
		
		/*
		 * program in area below
		 */
		
		//*************************************************************
		
		/*
		 * Spring 2015 semester
		 */
		
		//for sure taking the following:
		
		gpaCalc.changeClassGrade("math1010", "A");
		ClassObject cs2420 = new ClassObject("cs2420", "A-", 4);
		gpaCalc.getClassSet().add(cs2420);
		
		gpaCalc.changeClassGrade("phys1500", "A");
		gpaCalc.changeClassGrade("math1060", "A");
		
//		gpaCalc.changeClassGrade("phil3520", "A");
//		gpaCalc.changeClassGrade("pols3030", "A");
		
//		ClassObject uc1020 = new ClassObject("uc1020", "A", 1);
//		gpaCalc.getClassSet().add(uc1020);
		
//		ClassObject essf1043 = new ClassObject("essf1043", "A", 2);
//		gpaCalc.getClassSet().add(essf1043);
		
		//plus one of these two options:
		
//		gpaCalc.changeClassGrade("math2210", "A");
		
//		gpaCalc.changeClassGrade("phil3730", "A");
		
		//or
		
//		ClassObject cs2100 = new ClassObject("cs2100", "A", 3);
//		gpaCalc.getClassSet().add(cs2100);
		
		/*
		 * end Spring 2015
		 */
		
		//*************************************************************
		
		/*
		 * Summer 2015 Semester
		 */
		
//		ClassObject film3500 = new ClassObject("film3500", "A", 4);
//		gpaCalc.getClassSet().add(film3500);
		
		/*
		 * end Summer 2015
		 */
		
		//*************************************************************
		
		/*
		 * Fall 2015 semester
		 */
		
//		ClassObject cs3500 = new ClassObject("cs3500", "A", 4);
//		gpaCalc.getClassSet().add(cs3500);
		
		/*
		 * end Fall 2015 semester
		 */
		
		//*************************************************************
		
		/*
		 * Misc. classes
		 */
		
//		ClassObject eae3605 = new ClassObject("eae3605", "A", 3);
//		gpaCalc.getClassSet().add(eae3605);
		
//		gpaCalc.changeClassGrade("fcs3470", "A");
		
//		ClassObject essf1043 = new ClassObject("essf1043", "A", 2);
//		gpaCalc.getClassSet().add(essf1043);
		
//		gpaCalc.changeClassGrade("pols3030", "A");
		
//		gpaCalc.changeClassGrade("phil3730", "A");
		
		/*
		 * end misc. classes
		 */
		
		//*************************************************************
		
		/*
		 * prints calculation information
		 */
		double qualityPoints = gpaCalc.sumOfQualityPoints();
		double totalHours = gpaCalc.sumOfHours();
		System.out.println("\n*****************************************");
		System.out.println("********* Cumulative GPA: " + qualityPoints/totalHours + " *********");
		System.out.println("*****************************************\n");
		System.out.println("Number Of classes: " + (int) gpaCalc.setSize() + " classes");
		System.out.println("Sum Of Quality Points: " + qualityPoints);
		totalHours += .5;
		System.out.println("Total Attempted Credit Hours: " + totalHours);
//		System.out.println("Equation: \nSumOfQualityPoints / TotalAttemptedCreditHours");
	}
}