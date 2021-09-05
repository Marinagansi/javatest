/*display menu bar and calculate sum,difference,multipke ,division  of two numbers*/
import java.util.Scanner;
public class Switch2 {
	public static void main (String[] arg) {
		Scanner s= new Scanner(System.in);
		System.out.println("MENU BAR\n 1.Add  2.sub\n 3.multiple\n 4.div\n");
		System.out.println("enter the a=");
		int a= s.nextInt();
		System.out.println("enter the b=");
		int b=s.nextInt();
	    System.out.println("enter form menu bar");
	    int menu=s.nextInt();
	    switch(menu) {
	    case 1:
	    	System.out.println("the sum is"+ a+b);
	    break;
	    case 2:
	    	int c=a-b;
	    	System.out.println("the  sub is" + c);
	    	break;
	    case 3:
	    	System.out.println("the multipy is "+ a*b);
	    	break;
	    case 4:
	    	System.out.println("the divide is" + a/b);
	    	break;
	    	default:
	    		System.out.println("wrong choice");
	    	
	    }
	}
	
	
	

}
