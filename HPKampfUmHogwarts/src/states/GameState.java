package states;

import java.awt.Graphics;
import java.util.ArrayList;

import cards.Card;
import gfx.Assets;

public class GameState extends State {
	
	public GameState() {
		
	}
	
	public void tick() {
		
	}

	public void render(Graphics g, ArrayList<Card> deck) {
		int counter = 0;
		for (Card card : deck) {
			card.draw(g, counter*250, 0);
		}
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
}
