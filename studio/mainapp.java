package studio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JTree;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JMenu;
import javax.swing.JComboBox;

public class mainapp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					mainapp frame = new mainapp();
					
				    frame.setVisible(true);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	


	/**
	 * Create the frame.
	 */
	public mainapp() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 590);
		contentPane = new JPanel();
		contentPane.setIgnoreRepaint(true);
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel2.getLayout();
		JLayeredPane layeredPane1 = new JLayeredPane();
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane1.removeAll();
				layeredPane1.add(panel2);
				layeredPane1.repaint();
				layeredPane1.revalidate();
				
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusCycleRoot(true);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Kamil\\Downloads\\73225012_1295407240583344_2578775789893844992_n.png"));
		btnNewButton.setBounds(10, 144, 83, 88);
		contentPane.add(btnNewButton);
		JPanel panel1 = new JPanel();
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setMargin(new Insets(13, 14, 2, 14));
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Kamil\\Desktop\\materialy\\icons8-gear-48.png"));
		JPanel panel3 = new JPanel();
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane1.removeAll();
				layeredPane1.add(panel3);
				layeredPane1.repaint();
				layeredPane1.revalidate();
			}
		});
		btnNewButton_2.setBounds(26, 279, 52, 53);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("X");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setSelected(true);
		btnNewButton_3.setBounds(859, 0, 42, 23);
		contentPane.add(btnNewButton_3);
		
		JButton button_1 = new JButton("_");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setContentAreaFilled(false);
		button_1.setIcon(null);
		button_1.setBounds(756, 0, 42, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u25A1");
		button_2.setSelected(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setContentAreaFilled(false);
		button_2.setBorder(null);
		button_2.setBounds(808, 0, 42, 23);
		contentPane.add(button_2);
		
		//JLayeredPane layeredPane1 = new JLayeredPane();
		layeredPane1.setBounds(100, 80, 801, 510);
		contentPane.add(layeredPane1);
		layeredPane1.setLayout(new CardLayout(0, 0));
		
		//JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(51, 153, 0));
		layeredPane1.add(panel1, "name_609036896372900");
		panel1.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Szukaj");
		btnNewButton_4.setBounds(39, 11, 118, 23);
		panel1.add(btnNewButton_4);
		
		//JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255, 153, 51));
		layeredPane1.add(panel2, "name_609054012368500");
		
		//JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(51, 204, 153));
		layeredPane1.add(panel3, "name_609057646457500");
		panel3.setLayout(null);
		
		JPanel panel4 = new JPanel();
		layeredPane1.add(panel4, "name_609061998567000");
		panel4.setLayout(null);
		//JLayeredPane layeredPane1 = new JLayeredPane();
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(26, 80, 52, 53);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane1.removeAll();
				layeredPane1.add(panel1);
				layeredPane1.repaint();
				layeredPane1.revalidate();
								
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Kamil\\Desktop\\materialy\\icons8-music-record-50.png"));
	}
}
