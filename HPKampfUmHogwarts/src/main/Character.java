package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import cards.Card;

public class Character {
	private String name;
	private int charID;
	
	public Character(int id) {
		switch (id) {
		case 0: name = "Harry";
				break;
		case 1: name = "Hermine";
				break;
		case 2: name = "Ron";
				break;
		case 3: name = "Neville";
				break;
		default: break;
		}
		
		if (id == 0) 
			name = "Harry";
		if (id == 1) 
			name = "Hermine";
		if (id == 2) 
			name = "Ron";
		if (id == 3) 
			name = "Neville";
		charID = id;
	}
	
	public void use(Player[] players) {
		
		int choice;
		switch (charID) {
		case 0: choice = 0; //prompt player
				players[choice].giveLightning(1);
				break;
		case 1: choice = 0; //prompt player
				players[choice].giveCoins(1);
				break;
		case 2: choice = 0; //prompt player
				players[choice].giveLightning(1);
				break;
		case 3: choice = 0; //prompt player
				players[choice].giveHearts(1);
				break;
		default: break;
		}
	}
	public Stack<Card> createDeck() {
		Stack<Card> deck = new Stack<Card>();
		
		ArrayList<Card> cards = new ArrayList<Card>();
		for (String card : Init.character.get(charID).keySet()) {
			int instances = Init.character.get(charID).get(card);
			for (int i = 0; i < instances; i++) {
				cards.add((Card) Init.createInstance(card));
			}
		}
		Random randomGenerator = new Random();
		int size = cards.size();
		int itemsRemoved = 0;
		while (size - itemsRemoved != 0) {
			int idx = randomGenerator.nextInt(size - itemsRemoved);
			deck.push(cards.get(idx));
			cards.remove(idx);
			itemsRemoved++;
		}
		return deck;
	}
}
