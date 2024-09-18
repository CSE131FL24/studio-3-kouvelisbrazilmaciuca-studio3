package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number n: ");
		int n = scanner.nextInt();
		scanner.close();

		boolean[] isPrime = new boolean[n + 1];
		for (int p = 2; p <= n; p++) {
			isPrime[p] = true;
		}

		for (int p = 2; p * p <= n; p++) {
			if (isPrime[p]) {
				for (int i = p * p; i <= n; i += p) {
					isPrime[i] = false;
				}
			}
		}

		for (int p = 2; p <= n; p++) {
			if (isPrime[p]) {
				System.out.println(p);
			}
		}
	}
}