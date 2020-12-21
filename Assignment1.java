import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ASSIGNMENT 1 -NUMERICAL COMPUTATION & EXPRESSION 
		//1.	The program should ask detail personal background of customer
		//2.	The program should ask what product or services they provide
		//3.	Determine what price per quantity or how much the service charge per hour
		//4.	The program should ask customer how many item and quantity OR how many service they would like to order
		//5.	Calculate the total price need to be paid
		// Please use Scanner to get the input from the customer
		
		//26  	278751	Chong Chee Twau - Food/Drinks-Bread

		String name;
		int age, num1, num2, num3, num4, num5, num6;
		long IC;
		double sum;
		
		Scanner in = new Scanner (System.in);
		
		//1.
		System.out.print("Enter your name: ");
		name = in.nextLine();
		System.out.print("Enter your age: ");
		age = in.nextInt();
		System.out.print("Enter your IC number: ");
		IC = in.nextLong();
		
		//2.&3.
		System.out.println("Product provided(per one quantity): ");
		System.out.println("White bread = RM 5.00, Wheat bread = RM 7.00, Whole Grain bread = RM 9.00");
		System.out.println("Rye Bread = RM 3.00, French Bread = RM 10.00, Hot-Dog Bread = RM 13.00");
		//System.out.print("Please enter the code of product required: ");
	
		
		//4.
		System.out.println("Quantity of Item wanted: ");
		//integer1 = sc.nextInt();
		System.out.print("White Bread =");
		num1 = in.nextInt();
		System.out.print("Wheat Bread =");
		num2 = in.nextInt();
		System.out.print("Whole Grain Bread =");
		num3 = in.nextInt();
		System.out.print("Rye Bread =");
		num4 = in.nextInt();
		System.out.print("French Bread =");
		num5 = in.nextInt();
		System.out.print("Hot-Dog Bread =");
		num6 = in.nextInt();
		
		
		//5.
		 sum = ((num1*5) + (num2*7) + (num3*9) + (num4*3) + (num5*10) + (num6*13));
			
		System.out.print("Total Price: RM " + sum);
		
		
		in.close();
	}

}
