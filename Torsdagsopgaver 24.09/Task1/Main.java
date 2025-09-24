

class Main{
	public static void main(String[]args){
		
		//Creates team objects and gives them a name.
		Team team1 = new Team("Barca");
		Team team2 = new Team("Bayern");
		Team team3 = new Team("FCK");
		Team team4 = new Team("Brøndby");
		Team team5 = new Team("Madrid");
		Team team6 = new Team("Inter");	

		//Sets rank of the teams.
		team1.setRank(1);
		team2.setRank(2);
		team3.setRank(5);
		team4.setRank(6);
		team5.setRank(3);
		team6.setRank(4);

		//Adds ammount of players to the team.
		team1.addPlayers(18);
		team2.addPlayers(21);
		team3.addPlayers(17);
		team4.addPlayers(20);
		team5.addPlayers(15);
		team6.addPlayers(18);



		//Prints teamname, rank and player ammount.
		System.out.println(team1.toString());
		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());
		System.out.println(team6.toString());

	
	}
	











}