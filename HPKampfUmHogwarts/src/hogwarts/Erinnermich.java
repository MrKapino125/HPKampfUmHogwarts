package hogwarts;

import java.awt.Graphics;

import cards.Card;
import main.Player;

public class Erinnermich extends Card {

	public void use(Player[] players) {
		players[0].giveCoins(1);
		// add round condition
	}
	public void discard(Player[] players) {
		players[0].giveCoins(2);
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
