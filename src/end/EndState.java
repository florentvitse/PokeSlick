package end;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class EndState extends BasicGameState {

	private StateBasedGame game;
    private GameContainer container;
    public static final int ID = 2;
	
	@Override
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		this.container = container;
		this.game = game;
		
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		displayText(g, "YOU ARE GREAT", 260, 64);
		/*
		 * AFFICHAGE DU TEXTE DE FIN
		 */
		displayText(g, "PRESS [ESC] TO END THE GAME", 200, 400);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() {
		return ID;
	}
	
	@Override
	public void keyPressed(int key, char c) {
		
		// Touche ESC on termine le programme
		if (key == Input.KEY_ESCAPE) {
            		container.exit();
        }
	}
	
	/**
     * Affichage de texte sur la fenêtre du jeu.
     *
     * @param g - Contexte Graphique.
     * @param text - Texte à afficher.
     * @param absOrigin - Coordonnée Horizontale en haut à gauche de la première lettre du texte.
     * @param ordOrigin - Coordonnée Verticale en haut à gauche de la première lettre du texte.
     */
	public void displayText(Graphics g, String text, float absOrigin, float ordOrigin){
		g.drawString(text, absOrigin, ordOrigin);
	}

}