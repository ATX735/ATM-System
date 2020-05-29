//**************
//修改密码界面
//**************

package systemUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ModifyPasswordUI {
	//panel
	JPanel jpModifyPasswordUI = new JPanel();
	
	//用于记录新旧密码
	String oldPW;
	String newPW;
	
	//原密码输入框
	JLabel jlOldPW = new JLabel("请输入原密码：");
	JPasswordField jtfOldPW = new JPasswordField(16);
	JPanel jpOldPW = new JPanel();
	
	//新密码输入框
	JLabel jlNewPW = new JLabel("请输入新密码：");
	JPasswordField jtfNewPW = new JPasswordField(16);
	JPanel jpNewPW = new JPanel();
	
	//提示信息
	JLabel jlMessage = new JLabel();
	JPanel jpMessage = new JPanel();
	
	//buttons
	JButton jbtEnter = new JButton("Enter");
	JButton jbtCancel = new JButton("Cancel");
	JPanel jpButtons = new JPanel();
	
	public ModifyPasswordUI()
	{
		jpOldPW.add(jlOldPW);
		jpOldPW.add(jtfOldPW);
		
		jpNewPW.add(jlNewPW);
		jpNewPW.add(jtfNewPW);
		
		//jpInput用于搭载上面两个输入框
		JPanel jpInput = new JPanel();
		jpInput.add(jpOldPW);
		jpInput.add(jpNewPW);
		
		jpMessage.add(jlMessage);
		
		jpButtons.add(jbtEnter);
		jpButtons.add(jbtCancel);
		
		jpModifyPasswordUI.setLayout(new BorderLayout());
		jpModifyPasswordUI.add(new JPanel(), BorderLayout.NORTH);
		jpModifyPasswordUI.add(jpInput, BorderLayout.CENTER);
		jpModifyPasswordUI.add(jpButtons, BorderLayout.SOUTH);
		
		//按钮触发事件
		//Enter按钮
		jbtEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//获取输入框中的新旧密码
				oldPW = new String(jtfOldPW.getPassword());
				newPW = new String(jtfNewPW.getPassword());
				
				//to do
				//与银行数据库通信，判断原密码是否输入正确
				
				//若输入正确，则修改为新密码
				
				//弹出提示信息
				jlMessage.setText("修改密码已完成，请按cancel按钮回到菜单界面");
				jpModifyPasswordUI.remove(jpInput);
				jpModifyPasswordUI.add(jpMessage, BorderLayout.CENTER);
				jpModifyPasswordUI.revalidate();
			}
		});
		
		//Cancel按钮
		jbtCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonEvents.backToMenu();
			}
		});
	}
	
	public JPanel getModifyPasswordUI()
	{
		return jpModifyPasswordUI;
	}
}
