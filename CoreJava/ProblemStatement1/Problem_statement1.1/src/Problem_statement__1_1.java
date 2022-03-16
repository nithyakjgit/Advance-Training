
import java.util.Scanner;

public class Problem_statement__1_1 {

	public static void main(String[] args) {
		int n=0,i=0;
		System.out.println("enter number n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
		System.out.println();

	}

}