/*to input sales amonut of a sales and claculate commission amount if commisiion rates are as follow
 sales amount     commision
 <=5000            5%
 >5000 and <=10000 10%
 >10000            15%
 */
import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		int amount;
		float commission;
		float total;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the amount;");
	    amount=s.nextInt();
		if (amount<=5000) {
		commission=0.5f*amount;
		total=commission + amount;
		System.out.println("total sales amount"+total);
			}
		else if(amount>5000&&amount<=10000) {
			commission =0.10f*amount;
			total=commission +amount;
			System.out.println("total sales"+ total);		
		}
		else if(amount>10000) {
			commission=0.15f*amount;
			total=commission+amount;
			System.out.println("total sales"+total);
		}

	}

}
