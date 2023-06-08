package main;

import java.util.ArrayList;
import java.util.Stack;
import cards.CardInterface;
import cards.Card;

public class Board {
	private Card[] shop;
	private Stack<CardInterface> shopDeck;
	private Stack<CardInterface> dunkleKuensteDeck;
	private Stack<CardInterface> boesewichtDeck;
	private ArrayList<CardInterface> dunkleKuensteDiscard;
	private ArrayList<CardInterface> boesewichtDiscard;
	
	public Board() {
		
	}
}
