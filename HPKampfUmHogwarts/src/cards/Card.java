package cards;

import java.awt.Graphics;

import gfx.Assets;
import main.Player;

public class Card implements CardInterface {
	protected int price;
	protected int typeID;
	protected String type;
	protected int renderID;
	protected static int width = 250;
	protected static int height = 250;
	
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
	public void draw(Graphics g, int posX, int posY) {
		g.drawImage(Assets.enemies.get(this.renderID), posX, posY, null);
	}
	public void use(Player[] players) {
		
	}

}
