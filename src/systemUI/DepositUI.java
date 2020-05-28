//***********
//存款界面
//***********

package systemUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DepositUI {
	//panel
	private JPanel jpDepositUI = new JPanel();
	
	//用于记录存入现金的变量
	private int depositAmount = 0;
	
	//用于显示各种提示信息的标签
	String message = "请放入现金";
	JLabel jlMessage = new JLabel(message);
	JPanel jpMessage = new JPanel();
	
	//buttons
	private JButton jbtEnter = new JButton("Enter");
	private JButton jbtFinish = new JButton("Finish");
	private JButton jbtCancel = new JButton("Cancel");
	JPanel jpButtons = new JPanel();
	
	public DepositUI()
	{
		jpDepositUI.setLayout(new BorderLayout());
		
		jpDepositUI.add(new JPanel(), BorderLayout.NORTH);
		
		jpMessage.add(jlMessage);
		jpDepositUI.add(jpMessage, BorderLayout.CENTER);
		
		jpButtons.add(jbtEnter);
		jpButtons.add(jbtFinish);
		jpButtons.add(jbtCancel);
		jpDepositUI.add(jpButtons, BorderLayout.SOUTH);
		
		//按钮触发事件
		//Enter按钮
		ActionListener enterAction = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositAmount += (int)(Math.random() * 10 + 1) * 100;
				message = "已放入金额：" + depositAmount;
				jlMessage.setText(message);
				jbtEnter.setText("Continue");
				jpDepositUI.revalidate();   //刷新页面
			}
		};
		jbtEnter.addActionListener(enterAction);
		
		//Finish按钮
		jbtFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message = "存款已完成，请按Cancel按钮回到主界面";
				jlMessage.setText(message);
				jpDepositUI.revalidate();
				
				//选择Finish后禁用Enter按钮的操作
				jbtEnter.removeActionListener(enterAction);
				
				//to do
				//与银行数据库通信，修改账户余额
			}
		});
		
		//Cancel按钮
		jbtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonEvents.backToMenu();
			}
		});
	}
	
	public JPanel getDepositUI()
	{
		return jpDepositUI;
	}
}
