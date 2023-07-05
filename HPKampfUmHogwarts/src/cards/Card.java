package cards;

import java.awt.Graphics;

import main.Player;

public abstract class Card {
	public void discard(Player[] players) {
		
	}
	public abstract void render(Graphics g, int posX, int posY);
	public abstract void use(Player[] players);
	public abstract int type();
	public abstract int price();
}
