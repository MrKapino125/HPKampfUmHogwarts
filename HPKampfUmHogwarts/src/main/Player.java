package main;

import java.util.Stack;

import cards.Card;

public class Player {
	private String name;
	private Character character;
	private Card[] hand;
	private Stack<Card> deck;
	private Card[] discard;
	private int lightning;
	private int coin;
	private int health = 10;
	
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
}
