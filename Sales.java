package A_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Sales extends JFrame {

	private JFrame frmSalesAnd;
	private JTextField textFieldCustomerN;
	private JTextField textFieldTimeSpent;
	private JTextField textFieldTime;
	private JTextField textFieldTotalPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales window = new Sales();
					window.frmSalesAnd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sales() {
		//frmSalesAnd = new JFrame();
		setTitle("Sales and Billing Department");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sales.class.getResource("/A_3/icon.png")));
		setBounds(100, 100, 691, 569);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		//frmSalesAnd.setTitle("Sales and Billing Department");
		//frmSalesAnd.setIconImage(Toolkit.getDefaultToolkit().getImage(Sales.class.getResource("/A_3/icon.png")));
		//frmSalesAnd.setBounds(100, 100, 691, 533);
		//frmSalesAnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frmSalesAnd.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sales and Billing");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel.setBounds(35, 13, 603, 58);
		getContentPane().add(lblNewLabel);
		//frmSalesAnd.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Price List and Charging Standard");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(182, 84, 310, 16);
		getContentPane().add(lblNewLabel_1);
		//frmSalesAnd.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RM150 per one person for one hour (60 min)");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(147, 113, 400, 16);
		getContentPane().add(lblNewLabel_2);
		//frmSalesAnd.getContentPane().add(lblNewLabel_2);
		
		textFieldCustomerN = new JTextField();
		textFieldCustomerN.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCustomerN.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		textFieldCustomerN.setBounds(304, 146, 164, 58);
		getContentPane().add(textFieldCustomerN);
		//frmSalesAnd.getContentPane().add(textFieldCustomerN);
		textFieldCustomerN.setColumns(10);
		
		JButton button_1 = new JButton("Record");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				SalesRecord SR = new SalesRecord();
				SR.setModalExclusionType(null);
				SR.setVisible(true);
				//
			}
		});
		button_1.setIcon(new ImageIcon(Sales.class.getResource("/A_3/f5.png")));
		button_1.setBounds(266, 439, 164, 70);
		getContentPane().add(button_1);
		button_1.setHorizontalAlignment(SwingConstants.RIGHT);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_1.setBackground(Color.BLACK);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Customer");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setBounds(35, 142, 257, 58);
		getContentPane().add(lblNewLabel_3);
		//frmSalesAnd.getContentPane().add(lblNewLabel_3);
		
		textFieldTimeSpent = new JTextField();
		textFieldTimeSpent.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTimeSpent.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		textFieldTimeSpent.setColumns(10);
		textFieldTimeSpent.setBounds(304, 217, 164, 58);
		getContentPane().add(textFieldTimeSpent);
		//frmSalesAnd.getContentPane().add(textFieldTimeSpent);
		
		JLabel lblTimeSpent = new JLabel("Time Spent (in minutes)");
		lblTimeSpent.setForeground(Color.WHITE);
		lblTimeSpent.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimeSpent.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblTimeSpent.setBounds(35, 213, 257, 58);
		getContentPane().add(lblTimeSpent);
		
		JButton button = new JButton("Exit");
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setIcon(new ImageIcon(Sales.class.getResource("/A_3/e1.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setBounds(522, 0, 151, 58);
		getContentPane().add(button);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		button.setBackground(Color.BLACK);
		//frmSalesAnd.getContentPane().add(lblTimeSpent);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(222, 184, 135));
		panel.setBounds(12, 288, 649, 146);
		getContentPane().add(panel);
		//frmSalesAnd.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTimeSpent_1 = new JLabel("Time Spent");
		lblTimeSpent_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimeSpent_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblTimeSpent_1.setBounds(28, 13, 257, 48);
		panel.add(lblTimeSpent_1);
		
		JLabel lblTotalPrice = new JLabel("Total Price (RM)");
		lblTotalPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalPrice.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblTotalPrice.setBounds(28, 63, 257, 58);
		panel.add(lblTotalPrice);
		
		textFieldTime = new JTextField();
		textFieldTime.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTime.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		textFieldTime.setColumns(10);
		textFieldTime.setBounds(297, 18, 189, 46);
		panel.add(textFieldTime);
		
		textFieldTotalPrice = new JTextField();
		textFieldTotalPrice.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTotalPrice.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		textFieldTotalPrice.setColumns(10);
		textFieldTotalPrice.setBounds(297, 73, 189, 46);
		panel.add(textFieldTotalPrice);
		
		JLabel lblNewLabel_5 = new JLabel("*Tax and Extra Fees Included");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(398, 125, 244, 16);
		panel.add(lblNewLabel_5);
		
		JButton CountButton = new JButton("Count");
		CountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldCustomerN.getText());
					num2 = Integer.parseInt(textFieldTimeSpent.getText());
					
					if(num2%60 != 0) {
						ans = num1 * ((num2/60)+1) * 150;
						textFieldTotalPrice.setText(Integer.toString(ans));
					}else if(num2%60 == 0) {
						ans = num1 * ((num2/60) * 150);
						textFieldTotalPrice.setText(Integer.toString(ans));
					}
					
					textFieldTime.setText(Integer.toString(num2/60)+" hour(s) and " + (num2%60) + " minute(s)");
					//textFieldTotalPrice.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		CountButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		CountButton.setBounds(493, 186, 168, 58);
		getContentPane().add(CountButton);
		//frmSalesAnd.getContentPane().add(CountButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Sales.class.getResource("/A_3/er1.png")));
		lblNewLabel_4.setBounds(0, 0, 673, 521);
		getContentPane().add(lblNewLabel_4);
		//frmSalesAnd.getContentPane().add(lblNewLabel_4);
	}
}
