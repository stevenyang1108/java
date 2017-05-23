package java50;



public class BounceBall {
	public static void main(String[] args) {
		Double high = 100.00;
		Double dis = 0.0;
		for (int t = 1;  t < 11; t++) 
		{
			if (t==1)
			{
				dis = dis + high;
				high = high/2;
			}
			else if (t==10)
			{
				high = high/2;
				System.out.println("the " + t +" time touch: " + high);
				break;
			}
			else
				{
					dis = dis + 2*high;
					high = high/2;
				}
			
			System.out.println("the " + t + " time touch: " + high);
		}
		System.out.println("total distance: " + dis);
		System.out.println("the last distance: " + high);
	}

}
