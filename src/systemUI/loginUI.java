//***********
//登录界面
//***********

package systemUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class loginUI extends JFrame {
	//panel
	JPanel jpLoginUI = new JPanel();
	
	// Text fields
	private JTextField jtfAccount = new JTextField();
	private JPasswordField jtfPassword = new JPasswordField();

	// Buttons
	private JButton jbtEnter = new JButton("Enter");
	private JButton jbtCancel = new JButton("Cancel");

	public loginUI() {
		// Panel p1 for holding labels "Account", "password"
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2, 1));
		p1.add(new JLabel("Account:"));
		p1.add(new JLabel("Password:"));

		// Panel jpAccount for holding account
		JPanel jpAccount = new JPanel();
		jpAccount.setLayout(new BorderLayout());
		jpAccount.add(jtfAccount, BorderLayout.CENTER);

		// Panel jpPassword for holding password
		JPanel jpPassword = new JPanel();
		jpPassword.setLayout(new BorderLayout());
		jpPassword.add(jtfPassword, BorderLayout.CENTER);

		// Panel p2 for holding jpAccount and jpPassword
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2, 1));
		p2.add(jpAccount, BorderLayout.WEST);
		p2.add(jpPassword, BorderLayout.CENTER);

		// Place p1 and p2 into jpLogin
		JPanel jpLogin = new JPanel(new BorderLayout());
		jpLogin.add(p1, BorderLayout.WEST);
		jpLogin.add(p2, BorderLayout.CENTER);
		
		// Add buttons to a panel
		JPanel jpButton = new JPanel();
		jpButton.add(jbtEnter);
		jpButton.add(jbtCancel);
		
		jpLoginUI.setLayout(new BorderLayout());
		jpLoginUI.add(jpLogin, BorderLayout.CENTER);
		jpLoginUI.add(jpButton, BorderLayout.SOUTH);
    
		// Add jpAddress and jpButton to the frame
		//add(jpLoginUI, BorderLayout.CENTER);
		//add(jpButton, BorderLayout.SOUTH);

		//按钮触发事件
		jbtEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//载入chooseOperationUI
				ButtonEvents.showChooseOperationUI();
			}
		});
    
		jbtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//关闭当前窗口
				System.exit(ABORT);
			}	
		});
    
	}
	

	public static void main(String[] args) {
	    JFrame frame = new JFrame();
	    loginUI jp = new loginUI();
	    frame.add(jp.jpLoginUI);
	    frame.pack();
	    frame.setSize(350, 150);
	    frame.setTitle("ATMsystem");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}

}