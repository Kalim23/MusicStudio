package studio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Point;

import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Canvas;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.MouseAdapter;
import javax.swing.border.BevelBorder;

public class login extends JFrame {

	 int sX = -1, sY = -1;
	    static Label stat;
	    Image bImage;
	    boolean dragging = false;
	    int curX = -1, curY = -1;
	
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField txtUssername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 435);
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			{

		
			}
		});
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setVerifyInputWhenFocusTarget(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setIcon(new ImageIcon(login.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		btnNewButton.setBounds(309, 0, 33, 23);
		contentPane.add(btnNewButton);
		
		JButton btnX = new JButton("");
		btnX.setIcon(new ImageIcon(login.class.getResource("/javax/swing/plaf/metal/icons/ocean/minimize.gif")));
		btnX.setBounds(279, 0, 33, 23);
		contentPane.add(btnX);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(login.class.getResource("/javax/swing/plaf/metal/icons/ocean/maximize.gif")));
		button_1.setBounds(247, 0, 33, 23);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("Login/e-mail");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(77, 112, 91, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(77, 196, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(77, 221, 171, 29);
		contentPane.add(passwordField);
		
		txtUssername = new JTextField();
		txtUssername.setIgnoreRepaint(true);
		txtUssername.setToolTipText("");
		txtUssername.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtUssername.setBounds(77, 144, 171, 29);
		contentPane.add(txtUssername);
		txtUssername.setColumns(10);
		
		JLabel lblLogowanie = new JLabel("Zaloguj si\u0119 ");
		lblLogowanie.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblLogowanie.setBounds(93, 51, 115, 50);
		contentPane.add(lblLogowanie);
		
		JLabel lblNewLabel_3 = new JLabel("zapomnia\u0142e\u015B has\u0142a ?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setBounds(157, 261, 115, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainapp second = new mainapp();
				second.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Kamil\\Desktop\\button.png"));
		btnNewButton_1.setBounds(101, 286, 136, 44);
		contentPane.add(btnNewButton_1);
		
		JLabel lblJeliJesteNowym = new JLabel("Je\u015Bli jeste\u015B nowym u\u017Cytkownikiem, kliknij aby si\u0119 zarejestrowa\u0107");
		lblJeliJesteNowym.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				rejestracja second = new rejestracja();
				second.setVisible(true);
		
		
			}
		});
		lblJeliJesteNowym.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblJeliJesteNowym.setForeground(new Color(0, 0, 255));
		lblJeliJesteNowym.setBounds(30, 364, 312, 14);
		contentPane.add(lblJeliJesteNowym);
		
		JLabel lblNewLabel_2 = new JLabel("Studio nagran v1.0");
		lblNewLabel_2.setBounds(10, 0, 129, 14);
		contentPane.add(lblNewLabel_2);
	}
}
