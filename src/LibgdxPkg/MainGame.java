package LibgdxPkg;
import com.badlogic.gdx.Game;

// This is another branch 2333

// 这是一个冲突的地方哈哈哈哈


public class MainGame extends Game{
	private GameScreen game_screen;

	@Override
	public void create() {
		// TODO Auto-generated method stub
		game_screen = new GameScreen();
		setScreen(game_screen);
	}
	

}
