package hogwarts;

import cards.Card;
import cards.CardInterface;
import main.Player;

public class Krummbein extends Card implements CardInterface{

	public Krummbein() {
		super(0, 2, 6);
		// TODO Auto-generated constructor stub
	}

	public void use(Player[] players) {
		int choice = 0; // prompt player
		if (choice == 0)
			players[0].giveLightning(1);
		if (choice == 1)
			players[0].giveHearts(2);
	}

}