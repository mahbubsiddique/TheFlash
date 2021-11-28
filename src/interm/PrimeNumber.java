package interm;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 27;

		boolean isPrime = true;

		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0)
				isPrime = false;

		}

		if (isPrime == true)
			System.out.println("It is a Prime Number");
		else
			System.out.println("Not a Prime Number");

	}

}
