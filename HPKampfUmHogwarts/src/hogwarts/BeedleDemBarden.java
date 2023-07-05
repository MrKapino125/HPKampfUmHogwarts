package hogwarts;

import java.awt.Graphics;

import cards.Card;
import main.Player;

public class BeedleDemBarden extends Card {

	public void use(Player[] players) {
		// TODO Auto-generated method stub
		int choice = 0; // prompt choice
		if (choice == 0)
			players[0].giveCoins(2);
		if (choice == 1) {
			for (Player player : players) {
				player.giveCoins(1);
			}
		}
	}

	@Override
	public void render(Graphics g, int posX, int posY) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int type() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
