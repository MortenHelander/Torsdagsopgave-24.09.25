import java.util.ArrayList;

public class Main{
	
	public static void main(String[]args){
		//Create ArrayList and make an object.
		ArrayList<String>actions=new ArrayList<>();
		GameMenu g = new GameMenu(actions);

		
		//Add menu options.
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");
	
		//Display menu options.
		String userChoice = g.promptUser();
		int action=Integer.parseInt(userChoice);
		doAction(action);


	}


	//Switch case to check user input. Each case represents number pressed.
	public static void doAction(int action){
		switch(action){

			case 1:
			System.out.println("Starting the game now");
			break;

			case 2:
			System.out.println("Fetching previously saved game data");
			break;

			case 3:
			System.out.println("Game paused");
			break;

			case 4:
			System.out.println("Ending game");
			break;
		}

	}

















}