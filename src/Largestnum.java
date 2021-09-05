/*largest number among three*/
import java.util.Scanner;
public class Largestnum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=s.nextInt();
		System.out.println("enter the value of b");
		int b=s.nextInt();
		System.out.println("enter the value of c:");
		int c=s.nextInt();
		if (a<b && c<b) {
			System.out.println("b is the latgest ");
		}
		else if (b<a&&c<a) {
		System.out.println("a is the largest");
	
		}
	   else  {
	
		System.out.println("c is the largest");
	}
}

}
