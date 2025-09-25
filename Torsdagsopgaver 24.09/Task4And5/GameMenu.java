import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{
	
	private ArrayList<String>actions=new ArrayList<>();

	//Constructor.
	GameMenu(ArrayList<String>actions){
	this.actions=actions;
	}


	//Show menu method.
	public void displayMenu(){
		for(String e : actions){
			System.out.println(e);
		}
	}

	//Saves and uses user input.
	public String promptUser(){

		//Creates scanner object.
		Scanner scan = new Scanner(System.in);

		//Prints message.
		System.out.println("Type a number to choose an action:");

		//Show menu options.
		displayMenu();

		//Calls for user input.
		String input1 = scan.nextLine();

		//Sets choice variable = to user input.
		String choice = input1;
		return choice;
	}









}