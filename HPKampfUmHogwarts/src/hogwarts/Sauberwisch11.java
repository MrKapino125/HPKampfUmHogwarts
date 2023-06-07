package hogwarts;

import cards.Card;
import cards.CardInterface;
import main.Player;

public class Sauberwisch11 extends Card implements CardInterface{

	public Sauberwisch11() {
		super(0, 1, 12);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void use(Player[] players) {
		// TODO Auto-generated method stub
		players[0].giveLightning(1);
		// add condition
	}
}
