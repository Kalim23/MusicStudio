package studio;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Point;
import java.awt.Window;

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
import java.awt.ComponentOrientation;
import javax.swing.JSeparator;
import javax.swing.border.SoftBevelBorder;

public class login extends JFrame {

	 int sX = -1, sY = -1;
	    static Label stat;
	    Image bImage;
	    boolean dragging = false;
	    int curX = -1, curY = -1;
	
	private JPanel contentPane;
	private JPasswordField password;
	private JTextField username;

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
		
		setBounds(100, 100, 342, 435);
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			{

		
			}
		});
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setVerifyInputWhenFocusTarget(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login/e-mail");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(102, 113, 115, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(116, 194, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		password = new JPasswordField();
		password.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		password.setBounds(55, 221, 209, 36);
		contentPane.add(password);
		
		username = new JTextField();
		username.setIgnoreRepaint(true);
		username.setToolTipText("");
		username.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		username.setBounds(55, 138, 209, 36);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblLogowanie = new JLabel("Logowanie");
		lblLogowanie.setForeground(Color.WHITE);
		lblLogowanie.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblLogowanie.setBounds(10, 37, 148, 50);
		contentPane.add(lblLogowanie);
		
		JButton btnNewButton_1 = new JButton("Log in");
		btnNewButton_1.setForeground(new Color(204, 51, 0));
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(204, 51, 0), null, Color.RED, null));
		btnNewButton_1.setFocusTraversalPolicyProvider(true);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		                                         
				PreparedStatement ps;
		        ResultSet rs;
		        String uname = username.getText();
		        String pass = String.valueOf(password.getPassword());
		        
		        String query = "SELECT * FROM `rejestracja` WHERE `username` =? AND `password` =?";
		        
		        try {
		            ps = MyConnection.getConnection().prepareStatement(query);
		            
		            ps.setString(1, uname);
		            ps.setString(2, pass);
		            
		            rs = ps.executeQuery();
		            
		            if(rs.next())
		            {
		            	
		            	main second = new main();
		            	second.show();
		            	
		            	
		            }
		            else{
		                    JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
		                }
		            
		            
		           
			
		        } catch (SQLException ex) {
		            
		        }
		
			}

			
					
	
										
		});
		btnNewButton_1.setBounds(65, 308, 187, 50);
		contentPane.add(btnNewButton_1);
		
		JLabel lblJeliJesteNowym = new JLabel("Nowy u\u017Cytkownik ? Zarejestruj si\u0119 !");
		lblJeliJesteNowym.addMouseMotionListener(new MouseMotionAdapter() {
			
			
		});
		lblJeliJesteNowym.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
		
		
			}
			
			public void mouseEntered(MouseEvent arg0) {
				lblJeliJesteNowym.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			}
			
			public void mouseExited(MouseEvent e) {
				lblJeliJesteNowym.setBorder(null);
			}
		});
		lblJeliJesteNowym.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJeliJesteNowym.setForeground(UIManager.getColor("ToolTip.background"));
		lblJeliJesteNowym.setBounds(65, 387, 199, 14);
		contentPane.add(lblJeliJesteNowym);
		
		JLabel lblNewLabel_2 = new JLabel("Studio nagran v1.0");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 0, 129, 14);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(204, 51, 0));
		separator.setBackground(new Color(204, 51, 0));
		separator.setBounds(10, 284, 322, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(204, 51, 0));
		separator_1.setBackground(new Color(204, 51, 51));
		separator_1.setBounds(10, 87, 322, 2);
		contentPane.add(separator_1);
		
		JButton button = new JButton("X");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(DISPOSE_ON_CLOSE);
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setBackground(Color.DARK_GRAY);
			}
		});
		button.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				button.setBackground(Color.RED);
				
			}
		
		});
		button.setSelected(true);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setFocusPainted(false);
		button.setBorderPainted(false);
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(300, 0, 42, 23);
		contentPane.add(button);
		
		JButton button_2 = new JButton("_");
		button_2.setSelected(true);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				button_2.setBackground(Color.DARK_GRAY);
			}
		});
		button_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				button_2.setBackground(Color.GRAY);
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(ICONIFIED);
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setFocusPainted(false);
		button_2.setBorderPainted(false);
		button_2.setBackground(Color.DARK_GRAY);
		button_2.setBounds(258, 0, 42, 23);
		contentPane.add(button_2);
	}
}
