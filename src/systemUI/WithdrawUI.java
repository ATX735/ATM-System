//*********
//取款界面
//*********

package systemUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WithdrawUI {
	//panel
	private JPanel jpWithdrawUI = new JPanel();
	
	//用于记录取出现金的变量
	private int withdrawAmount = 0;
	
	//输入框
	JLabel jlInput = new JLabel("请输入要取现金的数量：");
	JTextField jtfAmount = new JTextField(8);
	JPanel jpInput = new JPanel();
	
	//用于显示各种提示信息的标签
	JLabel jlMessage = new JLabel();
	JPanel jpMessage = new JPanel();
	
	//buttons
	JButton jbtEnter = new JButton("Enter");
	JButton jbtCancel = new JButton("Cancel");
	JPanel jpButtons = new JPanel();
	
	public WithdrawUI()
	{
		jpWithdrawUI.setLayout(new BorderLayout());
		jpWithdrawUI.add(new JPanel(), BorderLayout.NORTH);
		
		jpInput.add(jlInput);
		jpInput.add(jtfAmount);
		jpWithdrawUI.add(jpInput, BorderLayout.CENTER);
		
		jpMessage.add(jlMessage);
		
		jpButtons.add(jbtEnter);
		jpButtons.add(jbtCancel);
		jpWithdrawUI.add(jpButtons, BorderLayout.SOUTH);
		
		//按钮触发事件
		//Enter按钮
		jbtEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//获取文本框中的内容，并赋值给withdrawAmount
				withdrawAmount = Integer.parseInt( jtfAmount.getText() );
				
				//to do
				//与银行数据库通信，判断账户余额是否足够
				//若足够则完成取款并修改账户余额
				jpWithdrawUI.remove(jpInput);
				jlMessage.setText("取款已完成，请按Cancel按钮回到主界面");
				jpWithdrawUI.add(jpMessage, BorderLayout.CENTER);
				jpWithdrawUI.revalidate();
			}
		});
		
		//Cancel按钮
		jbtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonEvents.backToMenu();
			}
		});
	}
	
	public JPanel getWithdrawUI()
	{
		return jpWithdrawUI;
	}
}
