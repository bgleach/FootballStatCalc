import java.util.Scanner;
public class StatCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // creates temporary scanner
		double TD = 0;
		double Yards = 0;
		double INT = 0;
		double comp = 0;
		double ATT = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double passerRating = 0;
		
		System.out.println("How many touchdowns?");
		TD = scan.nextInt();
		
		System.out.println("Total yards?");
		Yards = scan.nextInt();
		
		System.out.println("How many interceptions?");
		INT = scan.nextInt();
		
		System.out.println("How many completions?");
		comp = scan.nextInt();
		
		System.out.println("Number of passes attempted?");
		ATT = scan.nextInt();
		
		a= ((comp/ATT) - .3) * 5;
		
		b= ((Yards/ATT) -3) * .25;
		
		c= (TD/ATT) * 20;
		
		d= 2.375 - ((INT/ATT) * 25);
		
		if(a>2.375){
			a= 2.375;
		}
		if(a<0){
			a = 0;
		}
		
		if(b>2.375){
			b= 2.375;
		}
		if(b<0){
			b = 0;
		}
		if(c>2.375){
			c= 2.375;
		}
		if(c<0){
			c = 0;
		}
		if(d>2.375){
			d= 2.375;
		}
		if(d<0){
			d = 0;
		}
		passerRating= ((a + b + c + d)/6) *100;

		System.out.println("Quarterback Rating:");
		System.out.println(passerRating);
	}				
}
