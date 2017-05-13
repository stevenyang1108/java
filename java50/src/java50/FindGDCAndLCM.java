package java50;

import java.util.*;
public class FindGDCAndLCM {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b = 0;
		int gdc,lcm = 0;
		do {
			System.out.print("Enter two numbers(separated with blank): ");
			if (sc.hasNextInt())
			{
				a = sc.nextInt();
				b = sc.nextInt();
				gdc = findGDC(a,b);
				lcm = a*b/gdc;
				System.out.println(a + " and "+b + ": GDC = " + gdc
								+ ", LCM = " + lcm);
			}
			else
			{
				System.out.println("All Done");
				break;
			}
		} while (true);
		
	}
	public static int findGDC(int x, int y)
	{
		int temp = 0;
		if (x % y != 0)
		{
			temp = x % y;
			return findGDC(y, temp);
		}
		else
			 return y;
	}
	
	

}
