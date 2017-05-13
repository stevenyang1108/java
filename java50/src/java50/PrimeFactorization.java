package java50;
import java.util.*;
public class PrimeFactorization {
	public static void main(String[] args)
	{
		Scanner keybordIn = new Scanner(System.in);
		int num = 0;
		
		do
		{
			System.out.print("Enter an number: ");
			if (keybordIn.hasNextInt())
			{
				num = keybordIn.nextInt();
				
				System.out.print(num + " = ");
				//System.out.println(num);
				for (int i = 2; i <= num; i++)
				{
					if (num%i == 0)
					{
						System.out.print(i);
						num = num / i;
						i = 1;
						if (num != 1)
							System.out.print(" X ");
						else
							System.out.println();
					}
				}
			}
				
			
			else
			{
				System.out.println("All Done!");
				break;
			}
				
		}while(true);
		keybordIn.close();
	}

}
