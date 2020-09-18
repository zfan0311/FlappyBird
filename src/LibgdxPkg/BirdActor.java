package LibgdxPkg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class BirdActor extends Actor {
	// 用于展示该演员的纹理区域
	private TextureRegion region;
	private Texture texture;
	private float r;

	public BirdActor(String img) {
		super();
		texture = new Texture(Gdx.files.internal(img));
		region = new TextureRegion(texture);
		r = 0;
		setSize(50, 50);
		setPosition(50, 100);		// 或者 setX(), setY() 分开设置
		
		// 设置演员 旋转和缩放支点 为演员的左下角
		setOrigin(0, 0);
		
		// 设置演员缩放比, X 轴方向缩小到 0.5 倍, Y 轴方向保持不变
		setScale(1.0F, 1.0F);
//		setSize(this.region.getRegionWidth(), this.region.getRegionHeight());
	}


	@Override
	public void act(float delta) {
		super.act(delta);
		r += delta*(-5);
		setRotation(r);

	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		super.draw(batch, parentAlpha);
		
		if (region == null || !isVisible()) {
			return;
		}

		batch.draw(
				region, 
				getX(), getY(), 
				getOriginX(), getOriginY(), 
				getWidth(), getHeight(), 
				getScaleX(), getScaleY(), 
				getRotation()
		);
	}

}
