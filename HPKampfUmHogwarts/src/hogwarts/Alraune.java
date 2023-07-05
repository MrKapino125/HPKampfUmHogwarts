package hogwarts;

import java.awt.Graphics;

import cards.Card;
import main.Player;

public class Alraune extends Card {

	@Override
	public void use(Player[] players) {
		int choice = 0; // prompt
		if (choice == 0)
			players[0].giveLightning(1);
		if (choice == 1) {
			int pick = 0; // prompt
			players[pick].giveHearts(2);
		}
	}

	@Override
	public void render(Graphics g, int posX, int posY) {
		// TODO Auto-generated method stub
		
	}

	public int type() {
		// TODO Auto-generated method stub
		return 1;
	}

	public int price() {
		// TODO Auto-generated method stub
		return 0;
	}

}