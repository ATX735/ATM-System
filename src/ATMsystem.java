//***********
//ATM系统入口
//***********

import javax.swing.JFrame;

import systemUI.*;

public class ATMsystem {
	public static void main(String[] args) {
	    JFrame frame = new JFrame();
	    LoginUI jp = new LoginUI();
	    frame.add(jp.getLoginUI());
	    frame.pack();
	    frame.setSize(350, 150);
	    frame.setTitle("ATMsystem");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
}
