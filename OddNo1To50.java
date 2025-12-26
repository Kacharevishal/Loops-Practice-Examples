package loopsInJava;

public class OddNo1To50 {

	public static void main(String[] args) {

          System.out.println("Following are the Odd Numbers between 1 To 50");
		
		for(int i=1;i<=50;i++)
		{
			if(i % 2 == 1)
			{
				System.out.println(i+" is a Odd Number");
			}
		}
	}

}
