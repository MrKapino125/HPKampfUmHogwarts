package hogwarts;

import cards.Card;
import cards.CardInterface;
import main.Player;

public class BohnenJederGeschmacksrichtungen extends Card implements CardInterface {

	public BohnenJederGeschmacksrichtungen() {
		super(0, 1, 10);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void use(Player[] players) {
		// TODO Auto-generated method stub
		players[0].giveCoins(1);
		// add condition
	}
}
