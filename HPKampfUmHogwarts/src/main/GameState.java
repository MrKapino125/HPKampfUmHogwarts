package main;

import java.awt.Graphics;

public class GameState extends State {
	
	public GameState() {
		
	}
	
	public void tick() {
			
	}

	public void render(Graphics g) {
			g.drawImage(Assets.enemies.get(0), 0, 0, null);
	}
	
}
