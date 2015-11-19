package javaLab.ch8.EightPoint7and8and9;

public class Date {
	
	//instance variables
	private int month;
	private int day;
	private int year;
	
	private static final int[]  daysPerMonth = 
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public Date(int theMonth, int theDay, int theYear){
		month 		= checkMonth(theMonth);
		setYear(theYear);
		//year 		= theYear; // this is the default code of example
		day 		= checkDay(theDay);
		
		//System.out.printf("Date object contractor for date %s \n", this);
	}
	
	//this function added by qasim. not in example
	public void setYear(int year){
		this.year 		= year;
	}
	//this function added by qasim. not in example
	public int getYear(){
		return year;
	}

	private int checkMonth(int testMonth){
		if(testMonth >0 && testMonth <= 12 ){
			return testMonth;	
		}else{
			throw new IllegalArgumentException("month must be 1-12");
		}
		
	}
	
	private int checkDay(int testDay){
		if(testDay > 0 && testDay <= daysPerMonth[month])
			return testDay;
		else if((month == 2 && testDay == 29) && 
				(year % 400 == 0 || year % 4 == 0 && year % 100 != 0))
			return testDay;
		else
		throw new IllegalArgumentException("day out-of-range for the sepecified mouth and year");
	}
	
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
	
}
