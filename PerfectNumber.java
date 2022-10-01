import java.util.Scanner;

public class PerfectNumber {

	// Just like the Armstrong number, the Perfect Number is also a special type of
	// positive number. When the number is equal to the sum of its positive divisors
	// excluding the number, it is called a Perfect Number. For example, 28 is the
	// perfect
	// number because when we sum the divisors of 28, it will result in the same
	// number.
	// The divisors of 28 are 1, 2, 4, 7, and 14. So,

	public static void main(String[] args) {
		// take a input number
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter any Positive Number = ");
		int perfectNumber = inp.nextInt();
		int sum = 0;

		// sum of its positive divisors excluding the numbe
		for (int i = 1; i <= perfectNumber / 2; i++) {

			if (perfectNumber % i == 0) {
				sum = sum + i;
			}
		}
		// check number is Pefect Number Or not
		if (perfectNumber == sum) {
			System.out.println(perfectNumber + " is a Perfect Number");
		} else {
			System.out.println(perfectNumber + " is Not a Perfect Number");
		}
		inp.close();
	}
}
