package game;
import java.awt.Graphics;

import javax.swing.*;
public class snakeMain extends JFrame {
	public snakeMain() {
		snakeWin win = new snakeWin();
		add(win);
		setTitle("Ã∞≥‘…ﬂ1.0v------By FireRagin");
		setSize(435,390);
		setLocation(200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new snakeMain();
	}
}
