import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlay extends JPanel implements KeyListener,ActionListener {

	private boolean play=false;
	
	private int score=0;
	
	private int totalbricks=31;
	
	private Timer timer;
	private int delay=8;
	
	private int playerX=392;
	private int ballposX=385;
	private int ballposY=429;
	private int ballXdir=-1;
	private int ballYdir=-2;
	public GamePlay()
	{
		addKeyListener(this);
		setFocusable(true);
		//setResizable(false);
		setFocusTraversalKeysEnabled(false);
		timer =new Timer(delay,this);
		
	}
	public void paint(Graphics g) {
		//background color
		g.setColor(Color.black);
		g.fillRect(1, 1, 800, 500);
		
		//player color
		g.setColor(Color.red);
		g.fillRect(playerX,450, 50, 10);
		
		//ball color
		g.setColor(Color.yellow);
		g.fillOval(ballposX, ballposY, 20, 20);
		g.dispose();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
