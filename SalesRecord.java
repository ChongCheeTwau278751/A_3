package A_3;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class SalesRecord extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesRecord frame = new SalesRecord();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SalesRecord() {
		setTitle("Sales Record");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SalesRecord.class.getResource("/A_3/icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 950, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 153, 255)));
		panel.setBounds(0, 0, 932, 614);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 153, 255)));
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(306, 27, 604, 73);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Sales Record");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBounds(12, 13, 580, 51);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 153, 255)));
		panel_1_1.setBackground(new Color(0, 0, 0));
		panel_1_1.setBounds(21, 27, 278, 561);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Number");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 27, 103, 14);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total Price (RM)");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(20, 52, 103, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Additional Fees");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(20, 77, 103, 14);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Reason");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(20, 128, 62, 14);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Comment");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(20, 205, 103, 14);
		panel_1_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("How do you know us?");
		lblNewLabel_1_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_2_1_1.setBounds(30, 341, 217, 14);
		panel_1_1.add(lblNewLabel_1_2_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setBounds(135, 24, 126, 20);
		panel_1_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(135, 49, 126, 20);
		panel_1_1.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setColumns(10);
		textField_3.setBounds(135, 103, 126, 20);
		panel_1_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setColumns(10);
		textField_4.setBounds(135, 128, 126, 20);
		panel_1_1.add(textField_4);
		
		JComboBox howCab = new JComboBox();
		howCab.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Online (Facebook etc.)", "Family", "Friend", "Colleague"}));
		howCab.setFont(new Font("Tahoma", Font.BOLD, 11));
		howCab.setBounds(82, 361, 129, 20);
		panel_1_1.add(howCab);
		
		JComboBox PTBox = new JComboBox();
		PTBox.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Cash", "Card", "Mobile Payment", "Bank Transfer", "Checks"}));
		PTBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		PTBox.setBounds(135, 155, 126, 20);
		panel_1_1.add(PTBox);
		
		JLabel label = new JLabel("Tips");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label.setBounds(20, 180, 62, 14);
		panel_1_1.add(label);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(135, 180, 126, 20);
		panel_1_1.add(textField_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_5.setColumns(10);
		textField_5.setBounds(135, 205, 126, 20);
		panel_1_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_6.setColumns(10);
		textField_6.setBounds(135, 230, 126, 20);
		panel_1_1.add(textField_6);
		
		JCheckBox chckbxYes = new JCheckBox("Yes");
		chckbxYes.setBounds(20, 303, 110, 25);
		panel_1_1.add(chckbxYes);
		//
		chckbxYes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (chckbxYes.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "You get to know better about Malaysia through Xymaxx Restaurant.");
                } 
            }
        });
		//
		
		JCheckBox chckbxNo = new JCheckBox("No");
		chckbxNo.setBounds(148, 303, 110, 25);
		panel_1_1.add(chckbxNo);
		//
		chckbxNo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
            if (chckbxNo.isSelected()) {
                JOptionPane.showMessageDialog(frame, "You do not get to know about Malaysia through Xymaxx Restaurant.");
            	} 
			}
		});
		//
		
		JLabel lblBestDishes = new JLabel("Best Dishes");
		lblBestDishes.setForeground(new Color(255, 255, 255));
		lblBestDishes.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblBestDishes.setBounds(20, 230, 103, 14);
		panel_1_1.add(lblBestDishes);
		
		JSlider slider = new JSlider();
		slider.setForeground(new Color(255, 255, 255));
		slider.setBackground(new Color(0, 0, 0));
		slider.setFont(new Font("Times New Roman", Font.BOLD, 13));
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMaximum(10);
		slider.setBounds(20, 421, 241, 35);
		panel_1_1.add(slider);
		
		JLabel lblSatisfactoryLevel = new JLabel("Satisfactory Level");
		lblSatisfactoryLevel.setForeground(new Color(255, 255, 255));
		lblSatisfactoryLevel.setHorizontalAlignment(SwingConstants.CENTER);
		lblSatisfactoryLevel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSatisfactoryLevel.setBounds(81, 394, 129, 14);
		panel_1_1.add(lblSatisfactoryLevel);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(65, 469, 146, 38);
		panel_1_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textField.getText(),
						textField_1.getText(),
						textField_3.getText(),
						textField_4.getText(),
						PTBox.getSelectedItem(),
						textField_2.getText(),
						textField_5.getText(),
						textField_6.getText(),
						howCab.getSelectedItem(),
						slider.getValue(),
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "System Update confirmed", "Sales Record System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setBackground(new Color(0, 0, 0));
		btnUpdate.setBounds(65, 510, 146, 38);
		panel_1_1.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textField.getText(),i,0);
			    	model.setValueAt(textField_1.getText(),i,1);
			    	model.setValueAt(textField_3.getText(),i,2);
			    	model.setValueAt(textField_4.getText(),i,3);
			    	model.setValueAt(PTBox.getSelectedItem(),i,4);
			    	model.setValueAt(textField_2.getText(),i,5);
			    	model.setValueAt(textField_5.getText(),i,6);
			    	model.setValueAt(textField_6.getText(),i,7);
			    	model.setValueAt(howCab.getSelectedItem(),i,8);
			    	model.setValueAt(slider.getValue(),i,9);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		
		
		JLabel lblPaymentType = new JLabel("Payment Type");
		lblPaymentType.setForeground(Color.WHITE);
		lblPaymentType.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPaymentType.setBounds(20, 159, 103, 14);
		panel_1_1.add(lblPaymentType);
		
		
		JRadioButton YesRadioButton = new JRadioButton("Yes");
		YesRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		YesRadioButton.setBounds(135, 74, 49, 25);
		panel_1_1.add(YesRadioButton);
		//
		YesRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if (e.getSource()==YesRadioButton) {
					textField_3.setEnabled(true);
					textField_4.setEnabled(true);
				}
			}
		});
		//
		
		JRadioButton NoRadioButton = new JRadioButton("No");
		NoRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		NoRadioButton.setBounds(212, 74, 49, 25);
		panel_1_1.add(NoRadioButton);
		//
		NoRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if (e.getSource()==NoRadioButton) {
					textField_3.setEnabled(false);
					textField_3.setText("");
					textField_4.setEnabled(false);
					textField_4.setText("");
				}
			}
		});
		//
		
		JLabel lblAmount = new JLabel("Amount (RM)");
		lblAmount.setForeground(Color.WHITE);
		lblAmount.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmount.setBounds(20, 103, 103, 14);
		panel_1_1.add(lblAmount);
		
		JLabel lblFeedback = new JLabel("Feedback From Customer");
		lblFeedback.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeedback.setForeground(Color.WHITE);
		lblFeedback.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFeedback.setBounds(20, 260, 241, 14);
		panel_1_1.add(lblFeedback);
		
		JLabel lblDoYouGet = new JLabel("Do you get to know better about Malaysia?");
		lblDoYouGet.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoYouGet.setForeground(Color.WHITE);
		lblDoYouGet.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDoYouGet.setBounds(20, 280, 241, 14);
		panel_1_1.add(lblDoYouGet);
		
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 153, 255)));
		panel_1_2.setBackground(new Color(0, 0, 0));
		panel_1_2.setBounds(306, 461, 440, 66);
		panel.add(panel_1_2);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBackground(new Color(0, 0, 0));
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				PTBox.setSelectedItem("Make a selection");
				howCab.setSelectedItem("Make a selection");
				
				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReset.setBounds(12, 13, 136, 40);
		panel_1_2.add(btnReset);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setBackground(new Color(0, 0, 0));
		btnPrint.setForeground(new Color(255, 255, 255));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnPrint.setBounds(292, 13, 136, 40);
		panel_1_2.add(btnPrint);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBackground(new Color(0, 0, 0));
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBounds(153, 13, 136, 40);
		panel_1_2.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Sales Record System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Sales Record System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 153, 255)));
		panel_1_3.setBackground(new Color(255, 153, 255));
		panel_1_3.setBounds(306, 104, 604, 344);
		panel.add(panel_1_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 11, 580, 276);
		panel_1_3.add(scrollPane_1);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 9));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Customer Number", "Total Price", "Additional fee", "Reason", "Payment Type", "Tips", "Comment", "Best Dishes", "Way", "Satisfactory Level"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setBounds(228, 300, 146, 40);
		panel_1_3.add(btnUpload);
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\User\\Desktop\\Programming I\\EXE2\\src\\A_3\\SalesRecord.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnUpload.setBackground(Color.BLACK);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setIcon(new ImageIcon(SalesRecord.class.getResource("/A_3/e1.png")));
		btnExit.setBounds(748, 472, 162, 55);
		panel.add(btnExit);
		btnExit.setBackground(new Color(0, 0, 0));
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
	}
}

