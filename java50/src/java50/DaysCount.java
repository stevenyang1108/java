package java50;

import java.util.*;

public class DaysCount {
	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\.|\n");
		
		int year, month, day,days = 0;
		int[] daysForMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		

		
	year = sc.nextInt();
		
	month = sc.nextInt();
		
	day = sc.nextInt();
		System.out.println(year+ "-"+month+"-"+day);
		for (int i = 1; i < month; i++)
		{
			days = days +daysForMonth[i-1];
		}
		
		if (year % 1000 == 0 && month > 2)
			days++;
		else if (year%4 == 0 && year%100 != 0 && month > 2)
			days++;
		
			System.out.println("there are "+(days+day)+ " days.");
		

		sc.close();
		
	}

}
