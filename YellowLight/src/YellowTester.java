import javax.swing.JFrame;

public class YellowTester {
	public static void main(String[] args) {
		final int WIDTH = 500;
		final int HEIGHT = 500;
		JFrame appFrame = new YellowFrame();
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.setResizable(false);
		appFrame.setSize(WIDTH, HEIGHT);
		appFrame.show();
		//YellowFrame test = new YellowFrame();
		//test.carTester();s
		
	}
}