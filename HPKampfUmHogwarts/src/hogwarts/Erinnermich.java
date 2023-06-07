package hogwarts;

import cards.Card;
import cards.CardInterface;
import main.Player;

public class Erinnermich extends Card implements CardInterface {

	public Erinnermich() {
		super(0, 1, 3);
		// TODO Auto-generated constructor stub
	}

	public void use(Player[] players) {
		players[0].giveCoins(1);
		// add round condition
	}
	public void discard(Player[] players) {
		players[0].giveCoins(2);
	}

}
