package hogwarts;

import java.awt.Graphics;

import cards.Card;
import main.Player;

public class Alohomora extends Card {

	@Override
	public void use(Player[] players) {
		// TODO Auto-generated method stub
		players[0].giveCoins(1);
	}

	@Override
	public void render(Graphics g, int posX, int posY) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int type() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
