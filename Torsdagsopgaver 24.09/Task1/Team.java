import java.util.ArrayList;

public class Team{
	private String teamName;
	private int rank;
	ArrayList<String>players=new ArrayList<>();


	public Team(String teamName){
		this.teamName = teamName;

	}



	public void setRank(int rank){
		this.rank = rank;
	}

	@Override
	public String toString(){
		return "Hold: "+teamName+"		 Rang: "+rank + "		 Teammembers: "+ players.size();
	}


	public void addPlayers(int playerAmount){
		for(int i=0; i<playerAmount; i++){
			players.add("Player: "+i);
		}
	}
}