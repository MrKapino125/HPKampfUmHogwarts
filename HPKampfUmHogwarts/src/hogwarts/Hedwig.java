package hogwarts;

import java.awt.Graphics;

import cards.Card;
import main.Player;

public class Hedwig extends Card {

	public void use(Player[] players) {
		int choice = 0; // prompt player
		if (choice == 0)
			players[0].giveLightning(1);
		if (choice == 1)
			players[0].giveHearts(2);
	}

	@Override
	public void render(Graphics g, int posX, int posY) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int type() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
