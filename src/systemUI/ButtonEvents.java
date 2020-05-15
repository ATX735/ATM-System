//********************
//所有的按钮监听事件
//********************

package systemUI;

import javax.swing.JFrame;

public class ButtonEvents {
	static void showChooseOperationUI()
	{
		JFrame frame = new JFrame();
	    chooseOperationUI jp = new chooseOperationUI();
	    frame.add(jp.jpChooseOperationUI);
	    frame.pack();
	    frame.setSize(350, 250);
	    frame.setTitle("ATMsystem");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
	
	
}
