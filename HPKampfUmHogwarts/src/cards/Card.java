package cards;

import main.Player;

public class Card {
	protected int price;
	protected int typeID;
	protected String type;
	protected int renderID;
	
	public Card(int price, int typeID, int renderID) {
		this.price = price;
		this.typeID = typeID;
		this.renderID = renderID;
		if (typeID == 0)
			type = "Spruch";
		if (typeID == 1)
			type = "Gegenstand";
		if (typeID == 2)
			type = "Verbündeter";
	}
	public void discard(Player[] players) {
		
	}
	public void render(Card card) {
		
	}

}
