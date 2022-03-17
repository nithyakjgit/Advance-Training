import java.util.Scanner;
import java.util.Vector;

public class Change {

	static int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
	static int n = coins.length;
	
	static void minCoin(int val) {
		Vector<Integer> ans = new Vector<Integer>();
		
		for(int i = n-1; i >= 0; i--) {
			while(val >= coins[i]) {
				val -= coins[i];
				ans.add(coins[i]);
			}
		}
		
		for(int i = 0; i < ans.size(); i++) {
			System.out.println(" " + ans.elementAt(i));
		}
		
		System.out.println("\n The minimum number of coins is: " + ans.size());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		System.out.println("Minimum number " + "of change for " + n + ": ");
		minCoin(n);

	}

}
