import java.util.Scanner;

public class PracTest2 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] set = {1, 2, 3};
    	int number = 2;
    	Recursion r = new Recursion();
    	Recursion.summer(number, set);
    	System.out.println(Recursion.getSum());
//    	String line = sc.nextLine();
//    	while (line != null) {
//			line = sc.nextLine();
//			
//		}
    }
}
