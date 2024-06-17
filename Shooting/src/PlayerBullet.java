
public class PlayerBullet extends Character {
	public  void draw(MyFrame f) {
		f.setColor(128,128,128);
		f.fillRect(x + 10,  y - 30, 10, 20);
	}
	public PlayerBullet(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
	}
}
