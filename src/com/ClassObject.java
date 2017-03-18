package com;

public class ClassObject
{
	private String grade;
	private int hours;
	private double qualityPoints;
	private String name;
	
	public ClassObject(String _name, String _grade, int _creditHours)
	{
		name = _name;
		grade = _grade;
		hours = _creditHours;
		qualityPoints = qualityPointMatrix(_grade);
	}
	
	public String getGrade()
	{
		return grade;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setGrade(String newGrade)
	{
		grade = newGrade;
	}
	
	public void setQualityPoints(String _grade)
	{
		qualityPoints = qualityPointMatrix(_grade);
	}
	
	public int getHours()
	{
		return hours;
	}
	public double getQualityPoints()
	{
		return qualityPoints;
	}
	public double qualityPointMatrix(String grade)
	{
		if(grade.equals("A"))
		{
			if(hours == 1)
			{
				return 4*1;
			}
			else if(hours == 2)
			{
				return 4*2;
			}
			else if(hours == 3)
			{
				return 4*3;
			}
			else
			{
				return 4*4;
			}
		}
		if(grade.equals("A-"))
		{
			if(hours == 1)
			{
				return 3.7*1;
			}
			else if(hours == 2)
			{
				return 3.7*2;
			}
			else if(hours == 3)
			{
				return 3.7*3;
			}
			else
			{
				return 3.7*4;
			}
		}
		if(grade.equals("B+"))
		{
			if(hours == 1)
			{
				return 3.3*1;
			}
			else if(hours == 2)
			{
				return 3.3*2;
			}
			else if(hours == 3)
			{
				return 3.3*3;
			}
			else
			{
				return 3.3*4;
			}
		}
		if(grade.equals("B"))
		{
			if(hours == 1)
			{
				return 3*1;
			}
			else if(hours == 2)
			{
				return 3*2;
			}
			else if(hours == 3)
			{
				return 3*3;
			}
			else
			{
				return 3*4;
			}
		}
		if(grade.equals("B-"))
		{
			if(hours == 1)
			{
				return 2.7*1;
			}
			else if(hours == 2)
			{
				return 2.7*2;
			}
			else if(hours == 3)
			{
				return 2.7*3;
			}
			else
			{
				return 2.7*4;
			}
		}
		if(grade.equals("C+"))
		{
			if(hours == 1)
			{
				return 2.3*1;
			}
			else if(hours == 2)
			{
				return 2.3*2;
			}
			else if(hours == 3)
			{
				return 2.3*3;
			}
			else
			{
				return 2.3*4;
			}
		}
		if(grade.equals("C"))
		{
			if(hours == 1)
			{
				return 2*1;
			}
			else if(hours == 2)
			{
				return 2*2;
			}
			else if(hours == 3)
			{
				return 2*3;
			}
			else
			{
				return 2*4;
			}
		}
		return 0;
	}
}
