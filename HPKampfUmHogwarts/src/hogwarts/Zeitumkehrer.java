package hogwarts;

import java.awt.Graphics;

import cards.Card;
import main.Player;

public class Zeitumkehrer extends Card {

	public void use(Player[] players) {
		// TODO Auto-generated method stub
		players[0].giveCoins(1);
		// add round conditions
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
