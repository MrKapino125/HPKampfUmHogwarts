package main;

public class Character {
	private String name;
	private int charID;
	
	public Character(int id) {
		if (id == 0) 
			name = "Harry";
		if (id == 1) 
			name = "Hermine";
		if (id == 2) 
			name = "Ron";
		if (id == 3) 
			name = "Neville";
		charID = id;
	}
	
	public void use(Player player, Player[] other) {
		
	}
}
