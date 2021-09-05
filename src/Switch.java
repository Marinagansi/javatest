import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("enter the days of week;");
int days=s.nextInt();
//switch statement to check
switch (days) {
case 1:
	System.out.println("it is sunday");
	break;

case 2:
	System.out.println("monday");
	break;
case 3:
	System.out.println("tuesday");
	break;
default:
System.out.println("default case");
	
}

	}

}
