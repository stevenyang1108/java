package java50;

public class NumbersCombination {
	public static void main(String[] args) {
		int a,b,c;
		for (int i = 100; i < 1000; i++)
		{
			a = i / 100;
			b = i/10 - a*10;
			c = i % 10;
			//System.out.println(a + " " +b + " "+ c);
			if (a >=1 && a <=4 && b>=1 && b<=4 && c>=1 && c<=4 && a != b && b != c && a!=c)
				System.out.println(i);
			else
				continue;
		}
	}

}
