package loopsInJava;

public class EvenNo1To50 {

	public static void main(String[] args) {

		System.out.println("Following are the  Even Numbers between 1 To 50");
		
		for(int i=1;i<=50;i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i+" is a Even Number");
			}
		}
	}

}
