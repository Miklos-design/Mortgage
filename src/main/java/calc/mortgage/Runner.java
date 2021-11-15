package calc.mortgage;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
			long principal;
			double interestRateMonthly;
		
			Scanner userInput = new Scanner(System.in);
			
		while(true) {
			System.out.println("Please enter principal between 1k and 1m: ");
			principal =userInput.nextLong();
			if (principal>=1000 && principal <= 1_000_000)
				break;
			System.out.println("Enter valid amount!");
		}
		while(true) {
			System.out.println("Please enter annual interest rate: ");
			interestRateMonthly =userInput.nextDouble()/1200;
			if (interestRateMonthly>=0 && interestRateMonthly <= 30)
				break;
			System.out.println("Enter valid number beetween 0 and 30");
		}
			System.out.println("Please enter period in years 0-35: ");
			int periodMonths = userInput.nextInt()*12;
			userInput.nextLine();
			
			System.out.println("Please enter currency: ");
			String currency =userInput.nextLine().toUpperCase();
			
			DecimalFormat df =new DecimalFormat("#.##");
			
			double brackets = Math.pow((interestRateMonthly+1), periodMonths);
			String MothlyPayment= df.format((principal* ((interestRateMonthly*brackets)/(brackets-1))));
			
			System.out.println("Your monthly repayment is: " + currency + " " + MothlyPayment);
			{
					userInput.close();
			}
	//m=principal * (interetsMonthly *(interestMonthly+1)|periodMonths/ (1+interestMonthly)|periodMonths -1	
	}

}
