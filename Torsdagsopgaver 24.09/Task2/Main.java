import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);

		//Ask user name and get input.
		System.out.println("Please type your name.");
		String input1 = scan.nextLine();
		String name=input1;

		System.out.println();

		//Ask user age and get input.
		System.out.println("Hello, "+name + ".");
		System.out.println("Please enter your age.");
		int input2 = scan.nextInt();
		int age=input2;
		System.out.println();
		System.out.println("You are " + age + ".");

		

		//Calculate and print years until retirement age.
		int remainingYears=67-input2;
		System.out.println("You have: " + remainingYears + " before you can retire.");











	}












}