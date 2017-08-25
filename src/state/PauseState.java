package state;

import java.awt.Graphics2D;

import manager.GameStateManager;

public class PauseState extends GameState {
		
		public PauseState(GameStateManager gsm) {
			super(gsm);
		}
		
		public void init() {}
		
		public void update() {
			handleInput();
		}

		@Override
		public void draw(Graphics2D g) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void handleInput() {
			// TODO Auto-generated method stub
			
		}
}
