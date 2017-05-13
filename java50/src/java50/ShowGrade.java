package java50;
import java.util.*;
import java.util.regex.Pattern;

import org.omg.CORBA.SystemException;
public class ShowGrade {
	public static void main(String[] args)
	{
		Scanner keybordIn = new Scanner(System.in);
		int num = 0;
		String grade;
		do
		{
			System.out.print("Enter grade: ");
			if (keybordIn.hasNextInt())
			{
				num = keybordIn.nextInt();
				keybordIn.nextLine();
				/*if (num >= 90)
				
					System.out.println(num + " => A");
				else if (num >=60 && num <=89)
					System.out.println(num + " => B");
				else if (num < 60)
					System.out.println(num + " => C");*/
				grade = num >= 90? "A":(num >= 60 && num < 90 ? "B":"C" );
				System.out.println(num + " => " + grade);
				
			}
			else 
			{
				System.out.println("All Done!");
				break;
			}
		}while (true);
		keybordIn.close();
	}

}
