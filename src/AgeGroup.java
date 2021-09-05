/*to find a age group on the basis of age
age      group
0-10     child
10-19    teenage
19-40     young
above 40 old*/
import java.util.Scanner;
public class AgeGroup {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter your age:");
		int age=s.nextInt();
		if (age>0&&age<=10) {
			System.out.println("child");
			
		}
		else if (age>10&&age<19) {
			System.out.println("teenage");
		}
		else if(age>19&&age<40) {
			System.out.println("adult");
			
		}
		else if(age<40) {
			System.out.println("old");
		}
	}

}
