package hogwarts;

import java.awt.Graphics;

import cards.Card;
import main.Player;

public class Feuerblitz extends Card {

	public void use(Player[] players) {
		players[0].giveLightning(1);
		// add round condition
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
