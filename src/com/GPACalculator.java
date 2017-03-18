package com;

import java.util.HashSet;

public class GPACalculator
{
	//no changes
	private ClassObject phil3730 = new ClassObject("phil3730", "B", 3);
	private ClassObject pols3030 = new ClassObject("pols3030", "B", 3);
	private ClassObject ling1200 = new ClassObject("ling1200", "B+", 3);
	private ClassObject phil1250 = new ClassObject("phil1250", "B+", 3);
	
	private ClassObject phil3400 = new ClassObject("phil3400", "B", 3);
	private ClassObject phil3500 = new ClassObject("phil3500", "A-", 3);
	//3.216666666666667
	private ClassObject phil3310 = new ClassObject("phil3310", "A", 3);
	private ClassObject phil3520 = new ClassObject("phil3520", "B", 3);
	
	private ClassObject phil4120 = new ClassObject("phil4120", "A", 3);
	private ClassObject anth4135 = new ClassObject("anth4135", "A", 3);
	private ClassObject latin1010 = new ClassObject("latin1010", "B+", 4);
	private ClassObject ling4020 = new ClassObject("ling4020", "A-", 3);
	//3.647368421052632
	
	private ClassObject phil3810 = new ClassObject("phil3810", "A-", 3);
	private ClassObject phil5120 = new ClassObject("phil5120", "A-", 3);		
	private ClassObject phil3200 = new ClassObject("phil3200", "B+", 3);
	private ClassObject fa2000 = new ClassObject("fa2000", "A-", 3);
	
	private ClassObject math1050 = new ClassObject("math1050", "B+", 4);
	private ClassObject cs1400 = new ClassObject("cs1400", "A", 3);
	//3.6
	private ClassObject math1210 = new ClassObject("math1210", "B+", 4);
	private ClassObject math1220 = new ClassObject("math1220", "B", 4);
	
	private ClassObject math3010 = new ClassObject("math3010", "A-", 3);
	private ClassObject math2210 = new ClassObject("math2210", "B-", 3);
	private ClassObject eae3600 = new ClassObject("eae3600", "A", 3);
	//3.317647058823529
	
	//redo candidates - Actual on top, hypothetical on bottom
	
	private ClassObject cs1410 = new ClassObject("cs1410", "A", 4);
	private ClassObject fcs3470 = new ClassObject("fcs3470", "B-", 3);
	private ClassObject math1010 = new ClassObject("math1010", "B", 4);
	private ClassObject math1060 = new ClassObject("math1060", "B", 3);
	private ClassObject phys1500 = new ClassObject("phys1500", "C", 3);
	//3.0058823529411764
	//cum gpa = 3.3575129, according to school gpa calculator
	
	
	//new credits
	
	//private ClassObject cs2420 = new ClassObject("cs2420", "A", 4);
	
	//set of classes
	private HashSet<ClassObject> classSet;
	
	public GPACalculator()
	{
		classSet = new HashSet<ClassObject>();
		
		//classes with no changes
		classSet.add(phil3730);
		classSet.add(pols3030);
		classSet.add(ling1200);
		classSet.add(phil1250);
		
		classSet.add(phil3400);
		classSet.add(phil3500);
		classSet.add(phil3310);
		classSet.add(phil3520);
		
		classSet.add(phil4120);
		classSet.add(anth4135);
		classSet.add(latin1010);
		classSet.add(ling4020);
		
		classSet.add(phil3810);
		classSet.add(phil5120);
		classSet.add(phil3200);
		classSet.add(fa2000);
		
		classSet.add(math1050);
		classSet.add(cs1400);
		classSet.add(math1210);
		classSet.add(math1220);
		
		classSet.add(math3010);
		classSet.add(math2210);
		classSet.add(eae3600);
		
		//redo candidates - Actual on top, hypothetical on bottom
		classSet.add(cs1410);
		classSet.add(fcs3470);
		classSet.add(math1010);
		classSet.add(math1060);
		classSet.add(phys1500);
		
		//new credits
		//classSet.add(cs2420);
	}
	
	public double sumOfQualityPoints()
	{
		double qualityPoints = 0;
		for(ClassObject c : classSet)
		{
			qualityPoints += c.getQualityPoints();
		}
		return qualityPoints;
	}
	
	public double sumOfHours()
	{
		double hours = 0;
		for(ClassObject c : classSet)
		{
			hours += c.getHours();
		}
		return hours;
	}
	
	public double setSize()
	{
		return classSet.size();
	}
	
	public HashSet<ClassObject> getClassSet()
	{
		return classSet;
	}
	
	//to change class grade
	public void changeClassGrade(String className, String newGrade)
	{
		boolean containFlag = false;
		for(ClassObject c : classSet)
		{
			String cName = c.getName();
			if(cName.equals(className))
			{
				c.setGrade(newGrade);
				c.setQualityPoints(newGrade);
				containFlag = true;
			}
		}
		if(containFlag == false)
			System.out.println("Error: class you are trying to change the grade of not found!\n");
	}
	
	public ClassObject getClassObject(String className)
	{
		for(ClassObject c : classSet)
		{
			String cName = c.getName();
			if(cName.equals(className))
			{
				return c;
			}
		}
		return null;
	}
}
