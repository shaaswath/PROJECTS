import java.util.*;
public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the customer name: ");
		String Name = in.nextLine();
		System.out.print("Enter the customer ID No: ");
		int ID = in.nextInt();
		System.out.print("Enter the units used: ");
		double units = in.nextDouble();
		System.out.println("----------------------------------------------------");
		
		System.out.println("Rate per Unit");
		System.out.println("    First 100 Units = ₹1.50");
		System.out.println("    Next  200 Units = ₹2.50");
		System.out.println("    Above 300 Units = ₹4.00");
		System.out.println("    Fixed charges = ₹50.00");
		System.out.println("----------------------------------------------------");
		
		double total =0.00;
		double amount = 0.00;
		
		if (units <= 100) {
            amount = units * 1.5;
        }
		else if(units <= 200) {
			amount = (100 * 1.50) + (units - 100) * 2.50 ;
		}
		else if (units <= 300) {
            amount = (100 * 1.5) + (100 * 2.50) + (units - 200) * 4.00;
        } else {
            amount = (100 * 1.5) + (200 * 2.50) + (100 * 4.00) + (units - 300) * 6.00;
        }
        
       total = amount + 50.00;
		
		System.out.println("Bill Breakdown:");
		System.out.println("    Total energy amount = ₹"+ amount);
		System.out.println("    Total + fixed charges = ₹"+ total);
		System.out.println("----------------------------------------------------");
		

		}

}
