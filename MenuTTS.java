package A_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuTTS extends JFrame {

	private JFrame frmTheUniquenessOf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuTTS window = new MenuTTS();
					window.frmTheUniquenessOf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuTTS() {

		setTitle("The Uniqueness of Malaysia");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuTTS.class.getResource("/A_3/icon.png")));
		setBounds(100, 100, 747, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		//frmTheUniquenessOf = new JFrame();
		//frmTheUniquenessOf.setTitle("The Uniqueness of Malaysia");
		//frmTheUniquenessOf.setIconImage(Toolkit.getDefaultToolkit().getImage(MenuTTS.class.getResource("/A_3/icon.png")));
		//frmTheUniquenessOf.setBounds(100, 100, 747, 640);
		//frmTheUniquenessOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frmTheUniquenessOf.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(MenuTTS.class.getResource("/A_3/nk1.jpg")));
		label.setBounds(32, 119, 179, 172);
		getContentPane().add(label);
		//frmTheUniquenessOf.getContentPane().add(label);
		
		JLabel lblNasiKerabu = new JLabel("Nasi Kerabu");
		lblNasiKerabu.setBounds(44, 300, 179, 56);
		lblNasiKerabu.setHorizontalAlignment(SwingConstants.CENTER);
		lblNasiKerabu.setForeground(Color.WHITE);
		lblNasiKerabu.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		getContentPane().add(lblNasiKerabu);
		//frmTheUniquenessOf.getContentPane().add(lblNasiKerabu);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(MenuTTS.class.getResource("/A_3/nb1.jpg")));
		label_2.setBounds(32, 367, 179, 172);
		getContentPane().add(label_2);
		//frmTheUniquenessOf.getContentPane().add(label_2);
		
		JLabel lblNasiBriyani = new JLabel("Nasi Briyani");
		lblNasiBriyani.setBounds(32, 537, 179, 56);
		lblNasiBriyani.setHorizontalAlignment(SwingConstants.CENTER);
		lblNasiBriyani.setForeground(Color.WHITE);
		lblNasiBriyani.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		getContentPane().add(lblNasiBriyani);
		//frmTheUniquenessOf.getContentPane().add(lblNasiBriyani);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon(MenuTTS.class.getResource("/A_3/rt2.png")));
		label_4.setBounds(286, 367, 179, 172);
		getContentPane().add(label_4);
		//frmTheUniquenessOf.getContentPane().add(label_4);
		
		JLabel lblRotiTisu = new JLabel("Roti Tisu");
		lblRotiTisu.setBounds(286, 537, 179, 56);
		lblRotiTisu.setHorizontalAlignment(SwingConstants.CENTER);
		lblRotiTisu.setForeground(Color.WHITE);
		lblRotiTisu.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		getContentPane().add(lblRotiTisu);
		//frmTheUniquenessOf.getContentPane().add(lblRotiTisu);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon(MenuTTS.class.getResource("/A_3/ak1.jpg")));
		label_6.setBounds(525, 367, 179, 172);
		getContentPane().add(label_6);
		//frmTheUniquenessOf.getContentPane().add(label_6);
		
		JLabel lblAisKacang = new JLabel("Ais Kacang");
		lblAisKacang.setBounds(525, 537, 179, 56);
		lblAisKacang.setHorizontalAlignment(SwingConstants.CENTER);
		lblAisKacang.setForeground(Color.WHITE);
		lblAisKacang.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		getContentPane().add(lblAisKacang);
		//frmTheUniquenessOf.getContentPane().add(lblAisKacang);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon(MenuTTS.class.getResource("/A_3/bk1.jpg")));
		label_8.setBounds(525, 119, 179, 172);
		getContentPane().add(label_8);
		//frmTheUniquenessOf.getContentPane().add(label_8);
		
		JLabel lblBakKutTeh = new JLabel("Bak Kut Teh");
		lblBakKutTeh.setBounds(525, 300, 179, 56);
		lblBakKutTeh.setHorizontalAlignment(SwingConstants.CENTER);
		lblBakKutTeh.setForeground(Color.WHITE);
		lblBakKutTeh.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		getContentPane().add(lblBakKutTeh);
		//frmTheUniquenessOf.getContentPane().add(lblBakKutTeh);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setIcon(new ImageIcon(MenuTTS.class.getResource("/A_3/e1.png")));
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button.setBackground(Color.BLACK);
		button.setBounds(591, 0, 138, 60);
		getContentPane().add(button);
		//frmTheUniquenessOf.getContentPane().add(button);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setIcon(new ImageIcon(MenuTTS.class.getResource("/A_3/hc2.png")));
		label_10.setBounds(286, 119, 179, 172);
		getContentPane().add(label_10);
		//frmTheUniquenessOf.getContentPane().add(label_10);
		
		JLabel lblHainaneseChickenRice = new JLabel("Hainanese Chicken Rice");
		lblHainaneseChickenRice.setBounds(283, 300, 179, 56);
		lblHainaneseChickenRice.setHorizontalAlignment(SwingConstants.CENTER);
		lblHainaneseChickenRice.setForeground(Color.WHITE);
		lblHainaneseChickenRice.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		getContentPane().add(lblHainaneseChickenRice);
		//frmTheUniquenessOf.getContentPane().add(lblHainaneseChickenRice);
		
		JLabel lblTheUniquenessOf = new JLabel("The Uniqueness of Malaysia");
		lblTheUniquenessOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheUniquenessOf.setForeground(Color.WHITE);
		lblTheUniquenessOf.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblTheUniquenessOf.setBounds(61, 0, 587, 56);
		getContentPane().add(lblTheUniquenessOf);
		//frmTheUniquenessOf.getContentPane().add(lblTheUniquenessOf);
		
		JLabel label_13 = new JLabel("Highlight dishes: ");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		label_13.setBounds(229, 46, 233, 56);
		getContentPane().add(label_13);
		//frmTheUniquenessOf.getContentPane().add(label_13);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MenuTTS.class.getResource("/A_3/m5.jpg")));
		lblNewLabel.setBounds(0, 0, 729, 593);
		getContentPane().add(lblNewLabel);
		//frmTheUniquenessOf.getContentPane().add(lblNewLabel);
	}

}
