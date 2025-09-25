import java.util.ArrayList;

public class GameMenu{
	
	private ArrayList<String>actions=new ArrayList<>();

	GameMenu(ArrayList<String>actions){
	this.actions=actions;




	}

	public void displayMenu(){
		for(String e : actions){
			System.out.println(e);
		}
	}







}