//*********
//转账界面
//*********

package systemUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TransferUI {
	//panel
	JPanel jpTransferUI = new JPanel();
	
	String destAccount;		//用于记录收款账户
	int transferAmount = 0;		//用于记录转账金额
	
	int count = 0;		//计数Enter按钮被按过的次数
	
	//收款账户输入框
	JLabel jlDestAccount = new JLabel("收款账户：");
	JTextField jtfDestAccount = new JTextField(16);
	JPanel jpDestAccount = new JPanel();
	
	//转账金额输入框
	JLabel jlTransferAmount = new JLabel("转账金额：");
	JTextField jtfTransferAmount  = new JTextField(16);
	JPanel jpTransferAmount  = new JPanel();
	
	//提示信息
	JLabel jlMessage = new JLabel();
	JPanel jpMessage = new JPanel();
	
	//buttons
	JButton jbtEnter = new JButton("Enter");
	JButton jbtCancel = new JButton("Cancel");
	JPanel jpButtons = new JPanel();
	
	public TransferUI()
	{
		jpDestAccount.add(jlDestAccount);
		jpDestAccount.add(jtfDestAccount);
		jpTransferAmount.add(jlTransferAmount);
		jpTransferAmount.add(jtfTransferAmount);
		
		//jpInput用于搭载上面两个输入框
		JPanel jpInput = new JPanel();
		jpInput.add(jpDestAccount);
		jpInput.add(jpTransferAmount);
		
		jpMessage.add(jlMessage);
		
		jpButtons.add(jbtEnter);
		jpButtons.add(jbtCancel);
		
		jpTransferUI.setLayout(new BorderLayout());
		jpTransferUI.add(new JPanel(), BorderLayout.NORTH);
		jpTransferUI.add(jpInput, BorderLayout.CENTER);
		jpTransferUI.add(jpButtons, BorderLayout.SOUTH);
		
		//按钮触发事件
		//Enter按钮
		jbtEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count+=1;
				
				//第一次按Enter
				if(count == 1)
				{
					//将输入框中的内容赋值给用于记录的变量
					destAccount = jtfDestAccount.getText();
					transferAmount = Integer.parseInt( jtfTransferAmount.getText() );
					
					//弹出确认信息
					jlMessage.setText("<html><body>确认以下信息无误后，再次按Enter按钮完成转账<br>"
										+ "或按Cancel按钮回到菜单界面<br><br>"
										+ "收款账户：" + destAccount + "<br>"
										+ "转账金额：" + transferAmount + "</body></html>");
					jpTransferUI.remove(jpInput);
					jpTransferUI.add(jpMessage, BorderLayout.CENTER);
					jpTransferUI.revalidate();
				}
				//第二次按Enter
				else if(count == 2)
				{
					jlMessage.setText("转账已完成，请按cancel按钮回到菜单界面");
					
					//to do
					//与银行数据库通信，修改转账账户和收款账户的余额
				}
			}
		});
		
		//Cancel按钮
		jbtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonEvents.backToMenu();
			}
		});
	}
	
	public JPanel getTransferUI()
	{
		return jpTransferUI;
	}
}
