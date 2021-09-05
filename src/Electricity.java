/*An elictricity board charges according to following rates
 For the first 100 unit-------------rs40per unit
 for the next 200 unit---------------rs 50 per unit
 beyond 300 unit--------------------rs 60 per unit
 All user are charged meter charge also,which is also rs 50
 */
import java.util.Scanner;
 public class Electricity {
   
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the unit:");
	int unit=s.nextInt();
	if (unit>300) {
	  float total_amount=(unit-300)*60+200*50+100*40;
		System.out.println("your charge is"+ total_amount);
		
	}
	else if(unit>100) {
		float total_amount=(unit-100)*50+100*40;
		System.out.println("your charge is"+ total_amount);
	}
	else {
		float total_amount=unit*40;
				System.out.println("your charge is"+total_amount);
	}

	}

}
