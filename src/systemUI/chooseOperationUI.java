//*************
//选择操作界面
//*************

package systemUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChooseOperationUI {
	//panel
	private Box jpChooseOperationUI = Box.createVerticalBox();
	
	//buttons
	private JButton jbtDeposit = new JButton("Deposit");
	private JButton jbtWithdraw = new JButton("Withdraw");
	private JButton jbtTransfer = new JButton("Transfer");
	private JButton jbtModifyPassword = new JButton("ModifyPassword");
	private JButton jbtCheckBalance = new JButton("CheckBalance");
	
	public ChooseOperationUI() {
		JPanel jpDeposit = new JPanel();
		jpDeposit.add(jbtDeposit);
		jpChooseOperationUI.add(jpDeposit);
		
		JPanel jpWithdraw = new JPanel();
		jpWithdraw.add(jbtWithdraw);
		jpChooseOperationUI.add(jpWithdraw);
		
		JPanel jpTransfer = new JPanel();
		jpTransfer.add(jbtTransfer);
		jpChooseOperationUI.add(jpTransfer);
		
		JPanel jpModifyPassword = new JPanel();
		jpModifyPassword.add(jbtModifyPassword);
		jpChooseOperationUI.add(jpModifyPassword);
		
		JPanel jpCheckBalance = new JPanel();
		jpCheckBalance.add(jbtCheckBalance);
		jpChooseOperationUI.add(jpCheckBalance);
		
		//按钮触发事件
		jbtDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//切换到存款界面
				ButtonEvents.showDepositUI();
			}
		});
		
		jbtWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//to do
				//切换到取款界面
				
			}
		});
		
		jbtTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//to do
				//切换到转账界面
				
			}
		});
		
		jbtModifyPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//to do
				//切换到修改密码界面
				
			}
		});
		
		jbtCheckBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//to do
				//切换到查询余额界面
				
			}
		});
	}
	
	public Box getChooseOperationUI()
	{
		return jpChooseOperationUI;
	}
}


