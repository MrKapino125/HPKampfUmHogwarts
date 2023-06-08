package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import cards.Card;
import hogwarts.Alohomora;
import hogwarts.Alraune;
import hogwarts.BeedleDemBarden;
import hogwarts.BohnenJederGeschmacksrichtungen;
import hogwarts.Erinnermich;
import hogwarts.Feuerblitz;
import hogwarts.Hedwig;
import hogwarts.Krummbein;
import hogwarts.Pigwidgeon;
import hogwarts.Sauberwisch11;
import hogwarts.Tarnumhang;
import hogwarts.Trevor;
import hogwarts.Zeitumkehrer;

public class Character {
	private String name;
	private int charID;
	
	public Character(int id) {
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
		if (charID == 0) {
			int choice = 0; //prompt player
			players[choice].giveLightning(1);
		}
		if (charID == 1) {
			int choice = 0; //prompt player
			players[choice].giveCoins(1);
		}
		if (charID == 2) {
			int choice = 0; //prompt player
			players[choice].giveLightning(1);
		}
		if (charID == 3) {
			int choice = 0; //prompt player
			players[choice].giveHearts(1);
		}
	}
	public Stack<Card> createDeck() {
		Stack<Card> deck = new Stack<Card>();
		
		ArrayList<Card> cards = new ArrayList<Card>();
		for (int i = 0; i < 7; i++) {
			cards.add(new Alohomora());
		}
		if (charID == 0) {
			cards.add(new Feuerblitz());
			cards.add(new Hedwig());
			cards.add(new Tarnumhang());
		}
		if (charID == 1) {
			cards.add(new BeedleDemBarden());
			cards.add(new Zeitumkehrer());
			cards.add(new Krummbein());
		}
		if (charID == 2) {
			cards.add(new Pigwidgeon());
			cards.add(new Sauberwisch11());
			cards.add(new BohnenJederGeschmacksrichtungen());
		}
		if (charID == 3) {
			cards.add(new Trevor());
			cards.add(new Erinnermich());
			cards.add(new Alraune());
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
