package hogwarts;

import cards.Card;
import cards.CardInterface;
import main.Player;

public class Alraune extends Card implements CardInterface {

	public Alraune() {
		super(0, 1, "Alraune");
		// TODO Auto-generated constructor stub
	}

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

}