import java.util.ArrayList;

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







}