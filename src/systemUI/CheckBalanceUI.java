//*************
//查询余额界面
//*************

package systemUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBalanceUI {
	//panel
	JPanel jpCheckBalanceUI = new JPanel();
	
	String account;
	int balance = 0;	//记录账户余额
	
	//提示信息
	JLabel jlMessage = new JLabel();
	JPanel jpMessage = new JPanel();
	
	//buttons
	JButton jbtBack = new JButton("Back");
	JPanel jpButtons = new JPanel();
	
	public CheckBalanceUI()
	{
		account = LoginUI.getAccount();
		//to do 
		//与银行数据库通信，查询该账户余额并赋值给balance
		balance = (int)(Math.random() * 100000);
		
		//输出消息
		jlMessage.setText("您的账户" + account + "的余额为：" + balance + "元");
		jpMessage.add(jlMessage);
		
		jpButtons.add(jbtBack);
		
		jpCheckBalanceUI.setLayout(new BorderLayout());
		jpCheckBalanceUI.add(new JPanel(), BorderLayout.NORTH);
		jpCheckBalanceUI.add(jpMessage, BorderLayout.CENTER);
		jpCheckBalanceUI.add(jpButtons, BorderLayout.SOUTH);
		
		//back按钮触发事件
		jbtBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonEvents.backToMenu();
			}
		});
	}
	
	public JPanel getCheckBalanceUI()
	{
		return jpCheckBalanceUI;
	}
}
