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
	
	//用于记录要取出的金额
	private int withdrawAmount = 0;
	
	//取款金额输入框
	JLabel jlInput = new JLabel("请输入要取出的金额：");
	JTextField jtfAmount = new JTextField(8);
	JPanel jpInput = new JPanel();
	
	//用于显示提示信息
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
				//获取输入框中的数字，并赋值给withdrawAmount
				withdrawAmount = Integer.parseInt( jtfAmount.getText() );
				
				//to do
				//与银行数据库通信，判断取款金额是否大于余额
				//若不大于余额，则完成取款操作，修改账户余额
				
				//弹出提示信息
				jpWithdrawUI.remove(jpInput);
				jlMessage.setText("取款已完成，请按cancel按钮回到菜单界面");
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
