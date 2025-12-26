package loopsInJava;

public class SumOfOddNo {

	public static void main(String[] args) {

		System.out.println("Following are the Sum of Odd Numbers : ");

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("Sum Of 1 To 100 Odd Numbers: " + sum);
	}

}
