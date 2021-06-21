package A_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuMWF extends JFrame {

	private JFrame frmTheAmazingMalaysia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuMWF window = new MenuMWF();
					window.frmTheAmazingMalaysia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuMWF() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("The Amazing Malaysia");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuMWF.class.getResource("/A_3/icon.png")));
		setBounds(100, 100, 764, 636);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		//frmTheAmazingMalaysia = new JFrame();
		//frmTheAmazingMalaysia.setTitle("The Amazing Malaysia");
		//frmTheAmazingMalaysia.setIconImage(Toolkit.getDefaultToolkit().getImage(MenuMWF.class.getResource("/A_3/icon.png")));
		//frmTheAmazingMalaysia.setBounds(100, 100, 764, 636);
		//frmTheAmazingMalaysia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frmTheAmazingMalaysia.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("The Amazing Malaysia");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(68, 0, 587, 56);
		getContentPane().add(lblNewLabel);
		//frmTheAmazingMalaysia.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(MenuMWF.class.getResource("/A_3/nl1.jpg")));
		lblNewLabel_1.setBounds(36, 115, 179, 172);
		getContentPane().add(lblNewLabel_1);
		//frmTheAmazingMalaysia.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(MenuMWF.class.getResource("/A_3/r1.png")));
		label.setBounds(290, 115, 179, 172);
		getContentPane().add(label);
		//frmTheAmazingMalaysia.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(MenuMWF.class.getResource("/A_3/rc1.jpg")));
		label_1.setBounds(529, 115, 179, 172);
		getContentPane().add(label_1);
		//frmTheAmazingMalaysia.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(MenuMWF.class.getResource("/A_3/ll1.png")));
		label_2.setBounds(290, 363, 179, 172);
		getContentPane().add(label_2);
		//frmTheAmazingMalaysia.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon(MenuMWF.class.getResource("/A_3/s1.jpg")));
		label_3.setBounds(36, 363, 179, 172);
		getContentPane().add(label_3);
		//frmTheAmazingMalaysia.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon(MenuMWF.class.getResource("/A_3/ck1.png")));
		label_4.setBounds(529, 363, 179, 172);
		getContentPane().add(label_4);
		//frmTheAmazingMalaysia.getContentPane().add(label_4);
		
		JLabel lblNewLabel_2 = new JLabel("Nasi Lemak");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(36, 287, 179, 56);
		getContentPane().add(lblNewLabel_2);
		//frmTheAmazingMalaysia.getContentPane().add(lblNewLabel_2);
		
		JLabel lblRendang = new JLabel("Rendang");
		lblRendang.setForeground(Color.WHITE);
		lblRendang.setHorizontalAlignment(SwingConstants.CENTER);
		lblRendang.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblRendang.setBounds(290, 287, 179, 56);
		getContentPane().add(lblRendang);
		//frmTheAmazingMalaysia.getContentPane().add(lblRendang);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnExit.setIcon(new ImageIcon(MenuMWF.class.getResource("/A_3/e1.png")));
		btnExit.setHorizontalAlignment(SwingConstants.RIGHT);
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnExit.setBackground(Color.BLACK);
		btnExit.setBounds(608, 0, 138, 60);
		getContentPane().add(btnExit);
		//frmTheAmazingMalaysia.getContentPane().add(btnExit);
		
		JLabel lblRotiCanai = new JLabel("Roti Canai");
		lblRotiCanai.setForeground(Color.WHITE);
		lblRotiCanai.setHorizontalAlignment(SwingConstants.CENTER);
		lblRotiCanai.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblRotiCanai.setBounds(529, 287, 179, 56);
		getContentPane().add(lblRotiCanai);
		//frmTheAmazingMalaysia.getContentPane().add(lblRotiCanai);
		
		JLabel lblHighlightDishes = new JLabel("Highlight dishes: ");
		lblHighlightDishes.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighlightDishes.setForeground(Color.WHITE);
		lblHighlightDishes.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblHighlightDishes.setBounds(236, 46, 233, 56);
		getContentPane().add(lblHighlightDishes);
		//frmTheAmazingMalaysia.getContentPane().add(lblHighlightDishes);
		
		JLabel lblSatay = new JLabel("Satay");
		lblSatay.setForeground(Color.WHITE);
		lblSatay.setHorizontalAlignment(SwingConstants.CENTER);
		lblSatay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblSatay.setBounds(36, 533, 179, 56);
		getContentPane().add(lblSatay);
		//frmTheAmazingMalaysia.getContentPane().add(lblSatay);
		
		JLabel lblCurryLaksa = new JLabel("Curry Laksa");
		lblCurryLaksa.setForeground(Color.WHITE);
		lblCurryLaksa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurryLaksa.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblCurryLaksa.setBounds(290, 533, 179, 56);
		getContentPane().add(lblCurryLaksa);
		//frmTheAmazingMalaysia.getContentPane().add(lblCurryLaksa);
		
		JLabel lblChar = new JLabel("Char Kuey Teow");
		lblChar.setForeground(Color.WHITE);
		lblChar.setHorizontalAlignment(SwingConstants.CENTER);
		lblChar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblChar.setBounds(529, 533, 179, 56);
		getContentPane().add(lblChar);
		//frmTheAmazingMalaysia.getContentPane().add(lblChar);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(MenuMWF.class.getResource("/A_3/m2.png")));
		lblNewLabel_3.setBounds(0, 0, 746, 589);
		getContentPane().add(lblNewLabel_3);
		//frmTheAmazingMalaysia.getContentPane().add(lblNewLabel_3);
	}
}
