package loopsInJava;

public class PrintSumOfEvenNo {

	public static void main(String[] args) {

		System.out.println("Following are the Sum of Even Numbers: ");

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum Of 1 To 100 Even Numbers: " + sum);
	}
}
