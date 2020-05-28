//***********
//登陆界面
//***********

package systemUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginUI extends JFrame {
	//panel
	private JPanel jpLoginUI = new JPanel();
	
	// Text fields
	private JTextField jtfAccount = new JTextField();
	private JPasswordField jtfPassword = new JPasswordField();

	// Buttons
	private JButton jbtEnter = new JButton("Login");
	private JButton jbtCancel = new JButton("Cancel");

	public LoginUI() {
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

		//按钮触发事件
		jbtEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//to do
				//与银行数据库通信，判断账号密码是否有误
				
				//若账号密码正确则打开选择操作界面
				ButtonEvents.showChooseOperationUI();
			}
		});
    
		jbtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//退出程序
				System.exit(ABORT);
			}	
		});
	}
	
	public JPanel getLoginUI()
	{
		return jpLoginUI;
	}
}