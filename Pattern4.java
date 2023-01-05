package dec23;
import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			n=sc.nextInt();
			for(int i=1;i<=n;i++) {
		//for row
			int p=5;
			for(int j=1;j<=i;j++) {
		//for column
				System.out.print(p +" ");
				p--;
			}
			System.out.println(" ");
		//printing  new line
			}
					
		}

	}
	