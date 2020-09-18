package LibgdxPkg;
import com.badlogic.gdx.Game;

public class MainGame extends Game{
	private GameScreen game_screen;

	@Override
	public void create() {
		// TODO Auto-generated method stub
		game_screen = new GameScreen();
		setScreen(game_screen);
	}
	

}
