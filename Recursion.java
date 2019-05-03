
public class Recursion {
	private int sum;
	
	public int factorial(int n) {
		if (n == 0) return 1;
		if (n == 1) return 1;
		return n*factorial(n-1);
	}
	
	public int row(int n) {
		if (n == 0) return 1;
		if (n == 1) return 1;
		return (n-1)*factorial(n-1);
	}
	
	public int getSum() {
		return this.sum;
	}
	
	//Problem: given a number and a set of numbers, how many ways can you sum various combinations of the numbers in the set?
	public void summer(int number, int[] set) {
		for (int i = 0; i < set.length; i++) {
			summer(number,set, set[i], 0);
		}
	}
	
	
	private void summer(int number, int[] set, int x, int sum) {
		if (x == number) {
			sum += 1;
			return;
		}
		if (x > number) return;
		for (int i = 0; i < set.length; i++) {
			summer(i, set, set[i], sum);
		}
//		return 0;
	}
}
