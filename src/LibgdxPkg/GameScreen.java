package LibgdxPkg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GameScreen implements Screen {
	private SpriteBatch batch;
	
	// ����
	
	
	// �Զ������Ա
	private BirdActor bird_1;

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float dt) {
		// TODO Auto-generated method stub
		bird_1.act(dt);
		
		batch.begin();
		
		// ������Ա������������ֱ�ӻ���, λ���������Ļ���½ǣ�
		bird_1.draw(batch, 1.0F);
		
		batch.end();
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		batch = new SpriteBatch();
		
		// ������Ա
		bird_1 = new BirdActor("4.png");
		
	}

	
}
