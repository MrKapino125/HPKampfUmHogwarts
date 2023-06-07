package hogwarts;

import cards.Card;
import cards.CardInterface;
import main.Player;

public class BeedleDemBarden extends Card implements CardInterface{

	public BeedleDemBarden() {
		super(0, 1, 2);
		// TODO Auto-generated constructor stub
	}

	public void use(Player[] players) {
		// TODO Auto-generated method stub
		int choice = 0; // prompt choice
		if (choice == 0)
			players[0].giveCoins(2);
		if (choice == 1) {
			for (Player player : players) {
				player.giveCoins(1);
			}
		}
	}

}
