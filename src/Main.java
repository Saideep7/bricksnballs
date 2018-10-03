import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf=new JFrame();
		GamePlay gamepaly=new GamePlay();
		jf.setBounds(10,10,800,500);
		jf.setTitle("mygame");
		jf.setResizable(false);
		jf.setVisible(true);
		jf.add(gamepaly);

	}

}
