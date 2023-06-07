package cards;

import main.Player;

public class Feuerblitz extends Card implements CardInterface {

	public Feuerblitz() {
		super(0, 1, 4);
		// TODO Auto-generated constructor stub
	}

	public void use(Player[] players) {
		players[0].giveLightning(1);
		// add round condition
	}

}
