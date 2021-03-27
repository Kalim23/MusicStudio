package studio;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Shape;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowEvent;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class rejestracja extends JFrame {

	private JPanel contentPane;
	private JPasswordField pass;
	private JPasswordField pass2;
	private JTextField imie;
	private JTextField nazwisko;
	private JTextField email;
	private JTextField user;
	
	//
	private static final long serialVersionUID = 1L;
	private static final Color[] PB_COLORS = {Color.green, Color.yellow, Color.red};
	private static final int MAX_LENGTH = 25;
	
	
	//private PreparedStatement ps = null;
	
	


	/**
	 * Launch the application.
	 * 
	 */
	
	 public boolean checkUsername(String usernam)
	    {
	        PreparedStatement ps;
	        ResultSet rs;
	        boolean checkUser = false;
	        String query = "SELECT * FROM `rejestracja` WHERE username = ?";
	        
	        try {
	            ps = MyConnection.getConnection().prepareStatement(query);                 // operacja sprawdzaj¹ca czy nazwa uzytykownika istnieje w bazie danych
	            ps.setString(1, usernam);
	            
	            rs = ps.executeQuery();
	            
	            if(rs.next())
	            {
	                checkUser = true;
	            }
	        } catch (SQLException ex) {
	            Logger.getLogger(rejestracja.class.getName()).log(Level.SEVERE, null, ex);
	        }
	         return checkUser;
	    }
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rejestracja frame = new rejestracja();
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
	public rejestracja() {
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(rejestracja.class.getResource("/com/sun/java/swing/plaf/windows/icons/DetailsView.gif")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 578);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblRejestracja = new JLabel("Rejestracja ");
		lblRejestracja.setBounds(20, 83, 194, 39);
		lblRejestracja.setForeground(Color.WHITE);
		lblRejestracja.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNewLabel = new JLabel("Imi\u0119:");
		lblNewLabel.setBounds(123, 175, 73, 14);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNazwisko = new JLabel("Nazwisko:");
		lblNazwisko.setBounds(93, 210, 97, 14);
		lblNazwisko.setForeground(Color.WHITE);
		lblNazwisko.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblAdresEmail = new JLabel("Adres e-mail:");
		lblAdresEmail.setBounds(74, 245, 129, 14);
		lblAdresEmail.setForeground(Color.WHITE);
		lblAdresEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNazwaUytkownika = new JLabel("U\u017Cytkownik:");
		lblNazwaUytkownika.setBounds(77, 283, 86, 14);
		lblNazwaUytkownika.setForeground(Color.WHITE);
		lblNazwaUytkownika.setFont(new Font("Tahoma", Font.BOLD, 12));
		JProgressBar progressBar = new JProgressBar();
		JLabel lblHaso = new JLabel("*Has\u0142o:");
		lblHaso.setBounds(106, 320, 46, 14);
		lblHaso.setForeground(Color.WHITE);
		lblHaso.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel lblPowtrzHaso = new JLabel("Powt\u00F3rz has\u0142o:");
		lblPowtrzHaso.setBounds(60, 355, 97, 14);
		lblPowtrzHaso.setForeground(Color.WHITE);
		lblPowtrzHaso.setFont(new Font("Tahoma", Font.BOLD, 12));
		pass = new JPasswordField();
		pass.addFocusListener(new FocusAdapter() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
				String specialCharacters = " !#$%&'()*+,-./:;<=>?@[]^_`{|}~";
				
				
				char[] pw = pass.getPassword();
			      int value = (pw.length * 100) / MAX_LENGTH;		//sprawdzanie dlugosci wpisanego has³a
			      value = (value > 100) ? 100 : value;
			      progressBar.setValue(value);
			      																	

			      int colorIndex = (PB_COLORS.length * value) / 100;	//kolorowanie hasla w zaleznosci od dlugosci
			      progressBar.setForeground(PB_COLORS[colorIndex]);
			      
			   if(Character.isUpperCase(pw[colorIndex]) && (pw.length>4))
			   {
				   
				   progressBar.setForeground(Color.yellow);
			   }
			   else if(!Character.isLetterOrDigit(pw[colorIndex])) {
				   progressBar.setForeground(Color.red);
				   
			   }
			 
			   
				
			   
			}
		});
		pass.setBounds(177, 318, 187, 20);
		pass.setBackground(Color.WHITE);
		pass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		pass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel lblSiaHasa = new JLabel("Si\u0142a has\u0142a");
		lblSiaHasa.setBounds(93, 393, 69, 14);
		lblSiaHasa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSiaHasa.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_1 = new JLabel("* - has\u0142o powinno zawierac od 6 do max 25 znak\u00F3w");
		lblNewLabel_1.setBounds(20, 528, 324, 14);
		lblNewLabel_1.setForeground(Color.WHITE);
		
		JLabel lblStudioNagra = new JLabel("Studio Nagra\u0144 v1.0");
		lblStudioNagra.setBounds(10, 5, 128, 14);
		lblStudioNagra.setForeground(Color.WHITE);
		
		pass2 = new JPasswordField();
		pass2.setBounds(177, 353, 187, 20);
		pass2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pass2.setBackground(Color.WHITE);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(204, 51, 0));
		separator.setBackground(new Color(204, 51, 0));
		separator.setBounds(15, 133, 457, 2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(204, 51, 0));
		separator_1.setBackground(new Color(204, 51, 0));
		separator_1.setBounds(15, 425, 457, 2);
		contentPane.setLayout(null);
		contentPane.add(lblRejestracja);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNazwisko);
		contentPane.add(lblAdresEmail);
		contentPane.add(lblNazwaUytkownika);
		contentPane.add(lblHaso);
		contentPane.add(lblPowtrzHaso);
		contentPane.add(pass);
		contentPane.add(lblSiaHasa);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblStudioNagra);
		contentPane.add(pass2);
		contentPane.add(separator);
		contentPane.add(separator_1);
		
		imie = new JTextField();
		imie.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		imie.setBackground(new Color(255, 255, 255));
		imie.setBounds(177, 175, 187, 20);
		contentPane.add(imie);
		imie.setColumns(10);
		
		nazwisko = new JTextField();
		nazwisko.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		nazwisko.setColumns(10);
		nazwisko.setBounds(177, 208, 187, 20);
		contentPane.add(nazwisko);
		
		email = new JTextField();
		email.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		email.setColumns(10);
		email.setBounds(177, 243, 187, 20);
		contentPane.add(email);
		
		user = new JTextField();
		user.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		user.setColumns(10);
		user.setBounds(177, 281, 187, 20);
		contentPane.add(user);
		
		JButton btnNewButton = new JButton("Zarejestruj");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = imie.getText();
				String nazw = nazwisko.getText();
				String adres = email.getText();
		        String uname = user.getText();
		        String passwd = String.valueOf(pass.getPassword());
		        String re_pass = String.valueOf(pass2.getPassword());
		        
		                
		        if(uname.equals(""))
		        {
		            JOptionPane.showMessageDialog(null, "Podaj nazwê u¿ytkownika");
		        }
		    
		        else if(passwd.equals(""))
		        {
		            JOptionPane.showMessageDialog(null, "Podaj has³o");
		        }
		        else if(!passwd.equals(re_pass))
		        {
		           JOptionPane.showMessageDialog(null, "Has³a siê nie zgadzaj¹");
		        }
		        else if(checkUsername(uname))
		        {
		        	
		            JOptionPane.showMessageDialog(null, "U¿ytkonik o tej nazwie ju¿ istnieje");
		        }
		        PreparedStatement ps;
		        String query = "INSERT INTO `rejestracja`(`imie`, `nazwisko`, `email`, `username`, `password`) VALUES (?,?,?,?,?)";
		      try {
		    	  
		    	 
		    	  
		    	  
		    	  ps = MyConnection.getConnection().prepareStatement(query);
		    	  
		    	  ps.setString(1, name);
		    	  ps.setString(2, nazw);
		    	  ps.setString(3, adres);
		    	  ps.setString(4, uname);
		    	  ps.setString(5, passwd);
		    	  ps.executeUpdate();
		    	  
		    	// if(ps.executeUpdate() > 0) 
		    	 // {
		    		 
		    		 // JOptionPane.showMessageDialog(null, "Rejestracja pomyœlna, mo¿esz sie zalogowaæ");
		    	 // }
		    		  
		    	  
		    	 
		  
		      }catch(SQLException ex) {
		    	  
		    	  Logger.getLogger(rejestracja.class.getName()).log(Level.SEVERE, null, ex);
		      }
		    
		  
		        
		        
		     
		    
		    
		   login second = new login();
		   second.setVisible(true);
		
		   
			}

			
		});
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(128,128,128));
		btnNewButton.setForeground(new Color(204, 51, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(106, 454, 266, 51);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("_");
		button.setSelected(true);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(ICONIFIED);
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				button.setBackground(Color.DARK_GRAY);
			}
		});
		button.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				button.setBackground(Color.gray);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setFocusPainted(false);
		button.setBorderPainted(false);
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(407, 1, 42, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("X");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				button_1.setBackground(Color.DARK_GRAY);
			}
		});
		button_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				button_1.setBackground(Color.RED);
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setSelected(true);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setFocusPainted(false);
		button_1.setBorderPainted(false);
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBounds(450, 1, 42, 23);
		contentPane.add(button_1);
		
		//JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(176, 393, 188, 20);
		contentPane.add(progressBar);
		
		
	}
}
