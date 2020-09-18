package LibgdxPkg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class BirdActor extends Actor {
	// ����չʾ����Ա����������
	private TextureRegion region;
	private Texture texture;
	private float r;

	public BirdActor(String img) {
		super();
		texture = new Texture(Gdx.files.internal(img));
		region = new TextureRegion(texture);
		r = 0;
		setSize(50, 50);
		setPosition(50, 100);		// ���� setX(), setY() �ֿ�����
		
		// ������Ա ��ת������֧�� Ϊ��Ա�����½�
		setOrigin(0, 0);
		
		// ������Ա���ű�, X �᷽����С�� 0.5 ��, Y �᷽�򱣳ֲ���
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
