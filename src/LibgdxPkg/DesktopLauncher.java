package LibgdxPkg;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {

	public static void main(String[] args) {

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = 320;			// ���ڿ��
		config.height = 480;		// ���ڸ߶�

		config.resizable = false;	// ��������Ϊ��С���ɸı�

		// ����LibGDX������� MainGame ����, �������� config, ������Ϸ����
		new LwjglApplication(new MainGame(), config);
	}
}
