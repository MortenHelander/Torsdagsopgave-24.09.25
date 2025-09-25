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
	

		g.displayMenu();




	}

















}