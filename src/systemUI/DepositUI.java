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
	private int cashAmount = 0;
	
	//text
	String text = "请放入现金";
	JLabel jlText = new JLabel(text);
	
	//buttons
	private JButton jbtEnter = new JButton("Enter");
	private JButton jbtFinish = new JButton("Finish");
	private JButton jbtCancel = new JButton("Cancel");
	
	public DepositUI()
	{
		jpDepositUI.setLayout(new BorderLayout());
		
		jpDepositUI.add(new JPanel(), BorderLayout.NORTH);
		
		JPanel jpText = new JPanel();
		jpText.add(jlText);
		jpDepositUI.add(jpText, BorderLayout.CENTER);
		
		JPanel jpButtons = new JPanel();
		jpButtons.add(jbtEnter);
		jpButtons.add(jbtFinish);
		jpButtons.add(jbtCancel);
		jpDepositUI.add(jpButtons, BorderLayout.SOUTH);
		
		//按钮触发事件
		//Enter按钮
		ActionListener enterAction = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cashAmount += (int)(Math.random() * 10 + 1) * 100;
				text = "已放入金额：" + cashAmount;
				jlText.setText(text);
				jpDepositUI.revalidate();   //刷新页面
			}
		};
		jbtEnter.addActionListener(enterAction);
		
		//Finish按钮
		jbtFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = "存款已完成，请按Cancel按钮回到主界面";
				jlText.setText(text);
				jpDepositUI.revalidate();
				
				//选择Finish后禁用Enter按钮的操作
				jbtEnter.removeActionListener(enterAction);
				
				//to do
				//与银行系统通信，修改账户余额
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
