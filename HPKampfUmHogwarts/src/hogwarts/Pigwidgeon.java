package hogwarts;

import cards.Card;
import cards.CardInterface;
import main.Player;

public class Pigwidgeon extends Card implements CardInterface{

	public Pigwidgeon() {
		super(0, 2, 11);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void use(Player[] players) {
		int choice = 0; // prompt player
		if (choice == 0)
			players[0].giveLightning(1);
		if (choice == 1)
			players[0].giveHearts(2);
	}
}
