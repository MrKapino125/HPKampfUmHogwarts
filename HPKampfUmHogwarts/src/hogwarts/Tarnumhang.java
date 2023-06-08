package hogwarts;

import cards.Card;
import cards.CardInterface;
import main.Player;

public class Tarnumhang extends Card implements CardInterface{

	public Tarnumhang() {
		super(0, 1, "Tarnumhang");
		// TODO Auto-generated constructor stub
	}

	public void use(Player[] players) {
		// TODO Auto-generated method stub
		players[0].giveCoins(1);
	}

}
