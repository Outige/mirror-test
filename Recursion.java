
public class Recursion {
	public static int factorial(int n) {
		if (n == 0) return 1;
		if (n == 1) return 1;
		return n*factorial(n-1);
	}
	
	public static int row(int n) {
		if (n == 0) return 1;
		if (n == 1) return 1;
		return (n-1)*factorial(n-1);
	}
	
	//Problem: given a number and a set of numbers, how many ways can you sum various combinations of the numbers in the set?
	public static int summer(int number, int[] set) {
		for (int i = 0; i < set.length; i++) {
			return summer(number,set, set[i], 0);
		}
		return 0;
	}
	
	
	private static int summer(int number, int[] set, int x, int sum) {
		if (x == number) return 1;
		if (x > number) return 0;
		for (int i = 0; i < set.length; i++) {
			sum += summer(i, set, set[i], sum);
		}
//		return 0;
	}
}
