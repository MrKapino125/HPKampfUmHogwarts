package cards;

import main.Player;

public class Card {
	protected int price;
	protected int typeID;
	protected String type;
	
	public Card(int price, int id) {
		this.price = price;
		typeID = id;
		if (id == 0)
			type = "Spruch";
		if (id == 1)
			type = "Gegenstand";
		if (id == 2)
			type = "Verbündeter";
	}
	public void discard(Player[] players) {
		
	}

}
