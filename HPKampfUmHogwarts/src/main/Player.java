package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import cards.Card;

public class Player {
	private String name;
	private Character character;
	private ArrayList<Card> hand;
	private Stack<Card> deck;
	private ArrayList<Card> discard;
	private int lightning;
	private int coin;
	private int health;
	
	
	
	public Player(String name, Character character) {
		this.name = name;
		this.character = character;
		hand = new ArrayList<Card>();
		deck = new Stack<Card>();
		discard = new ArrayList<Card>();
	}
	public void giveCoins(int n) {
		coin += n;
	}
	public void giveLightning(int n) {
		lightning += n;
	}
	public void giveHearts(int n) {
		health += n;
		if (health > 10)
			health = 10;
	}
	public void draw() {
		if (deck.empty())
			shuffle();
		hand.add(deck.pop());
	}
	public void shuffle() {
		Random randomGenerator = new Random();
		int size = discard.size();
		int itemsRemoved = 0;
		while (size - itemsRemoved != 0) {
			int idx = randomGenerator.nextInt(size - itemsRemoved);
			deck.push(discard.get(idx));
			discard.remove(idx);
			itemsRemoved++;
		}
	}
}
