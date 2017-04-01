package calc;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * 计算器窗口
 * 
 * @author ASUS
 *
 */
public class calcFrame extends JFrame {
	JLabel labelResult;
	
	 String[] titles = {"","=","c","-","7","8","9","/","4","5","6","*","1","2","3","+"};
	
	private JButton[] buttons = new JButton[titles.length];
	
	public calcFrame() {
		initUi();
		setVisible(true);
	}

	private void initUi() {
		setTitle("汪汪牌计算机");
		setSize(320, 480);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//添加结果标签
		labelResult = new JLabel("0.0");
		labelResult.setBorder(new EmptyBorder(30, 10, 32, 10));
		labelResult.setHorizontalAlignment(SwingConstants.RIGHT);
		add(labelResult,BorderLayout.NORTH);
		
		//添加按钮
		JPanel buttonPanel = new JPanel(new GridLayout(5, 4,5,5));
		add(buttonPanel,BorderLayout.CENTER);
		for(int i =0;i<titles.length;i++){
			if(titles[i].length()==0){
				buttonPanel.add(new JLabel(""));
			}else{
				buttons[i] = new JButton(titles[i]);
				buttonPanel.add(buttons[i]);
			}
		}
	}
}
