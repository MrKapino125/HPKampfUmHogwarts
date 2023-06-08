package hogwarts;

import cards.Card;
import cards.CardInterface;
import main.Player;

public class Feuerblitz extends Card implements CardInterface {

	public Feuerblitz() {
		super(0, 1, "Feuerblitz");
		// TODO Auto-generated constructor stub
	}

	public void use(Player[] players) {
		players[0].giveLightning(1);
		// add round condition
	}

}
