//********************
//所有的按钮触发事件
//********************

package systemUI;

import javax.swing.JFrame;

public class ButtonEvents {
	static void backToMenu()
	{
		showChooseOperationUI();
	}
	
	static void showChooseOperationUI()
	{
		JFrame frame = new JFrame();
	    ChooseOperationUI jp = new ChooseOperationUI();
	    frame.add(jp.getChooseOperationUI());
	    frame.pack();
	    frame.setSize(350, 250);
	    frame.setTitle("ATMsystem");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
	
	static void showDepositUI()
	{
		JFrame frame = new JFrame();
	    DepositUI jp = new DepositUI();
	    frame.add(jp.getDepositUI());
	    frame.pack();
	    frame.setSize(350, 250);
	    frame.setTitle("ATMsystem");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
	
	static void showWithdrawUI()
	{
		JFrame frame = new JFrame();
	    WithdrawUI jp = new WithdrawUI();
	    frame.add(jp.getWithdrawUI());
	    frame.pack();
	    frame.setSize(350, 250);
	    frame.setTitle("ATMsystem");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
	
	static void showTransferUI()
	{
		JFrame frame = new JFrame();
		TransferUI jp = new TransferUI();
	    frame.add(jp.getTransferUI());
	    frame.pack();
	    frame.setSize(350, 250);
	    frame.setTitle("ATMsystem");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
}
