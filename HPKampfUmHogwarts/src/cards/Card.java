package cards;

import java.awt.Graphics;

import gfx.Assets;
import main.Player;

public class Card implements CardInterface {
	protected int price;
	protected int typeID;
	protected String type;
	protected String name;
	
	public Card(int price, int typeID, String name) {
		this.price = price;
		this.typeID = typeID;
		this.name = name;
		if (typeID == 0)
			type = "Spruch";
		if (typeID == 1)
			type = "Gegenstand";
		if (typeID == 2)
			type = "Verbündeter";
	}
	public void discard(Player[] players) {
		
	}
	public void render(Graphics g, int posX, int posY) {
		g.drawImage(Assets.cards.get(this.name), posX, posY, null);
	}
	public void use(Player[] players) {
		
	}

}
