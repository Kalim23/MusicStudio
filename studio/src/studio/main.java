package studio;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JComboBox;
import net.miginfocom.swing.MigLayout;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.DebugGraphics;
import java.awt.event.MouseMotionAdapter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JSlider;





public class main extends JFrame {

	private JPanel contentPane;
	private JTextField tytul;
	private JTextField wykonawca;
	private JTextField gatunek;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					main frame = new main();
					
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
	public main() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1199, 591);
		contentPane = new JPanel();
		contentPane.setIgnoreRepaint(true);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JButton btnNewButton_3 = new JButton("X");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_3.setBackground(Color.DARK_GRAY);
			}
		});
		btnNewButton_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnNewButton_3.setBackground(Color.RED);
			}
		});
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setSelected(true);
		btnNewButton_3.setBounds(1157, 0, 42, 23);
		contentPane.add(btnNewButton_3);
		
		JButton button_1 = new JButton("_");
		button_1.setSelected(true);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				button_1.setBackground(Color.DARK_GRAY);
			}
		});
		button_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				button_1.setBackground(new Color(96,96,96));
			}
		});
		button_1.setBorderPainted(false);
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setFocusPainted(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setIcon(null);
		button_1.setBounds(1074, 0, 42, 23);
		contentPane.add(button_1);
		JLayeredPane layeredPane = new JLayeredPane();
		JButton button_2 = new JButton("\u25A1");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				button_2.setBackground(Color.DARK_GRAY);
			}
		});
		button_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				button_2.setBackground(new Color(96,96,96));
			}
			
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(getExtendedState()==NORMAL)
				    setExtendedState(MAXIMIZED_BOTH);
				    else
				    setExtendedState(NORMAL);
				   }
			
			
			
			
		});
		button_2.setBorderPainted(false);
		button_2.setBackground(Color.DARK_GRAY);
		button_2.setFocusPainted(false);
		button_2.setSelected(true);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(1116, 0, 42, 23);
		contentPane.add(button_2);
		
		//JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(59, 40, 975, 549);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		
		
	    
	    
		panel1.setDoubleBuffered(false);
		panel1.setBackground(Color.GRAY);
		layeredPane.add(panel1, "name_11293621127000");
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Strona g\u0142\u00F3wna");
		lblNewLabel.setBounds(399, 11, 132, 22);
		lblNewLabel.setForeground(new Color(204, 51, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel1.add(lblNewLabel);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.GRAY);
		layeredPane.add(panel2, "name_11300577009300");
		panel2.setLayout(new MigLayout("", "[132px][][]", "[22px][][]"));
		
		JLabel lblTwrcy = new JLabel("Tw\u00F3rcy");
		lblTwrcy.setForeground(new Color(204, 51, 0));
		lblTwrcy.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel2.add(lblTwrcy, "cell 0 0,alignx left,aligny top");
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.GRAY);
		layeredPane.add(panel3, "name_11303144530200");
		panel3.setLayout(new MigLayout("", "[]", "[]"));
		
		JLabel lblBiblioteka = new JLabel("Biblioteka");
		lblBiblioteka.setForeground(new Color(204, 51, 0));
		lblBiblioteka.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel3.add(lblBiblioteka, "cell 0 0");
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.GRAY);
		layeredPane.add(panel4, "name_11332022423600");
		panel4.setLayout(new MigLayout("", "[]", "[]"));
		
		JLabel lblSklep = new JLabel("Sklep");
		lblSklep.setForeground(new Color(204, 51, 0));
		lblSklep.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel4.add(lblSklep, "cell 0 0");
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.GRAY);
		layeredPane.add(panel5, "name_11335302550700");
		panel5.setLayout(new MigLayout("", "[]", "[]"));
		
		JLabel lblUstawienia = new JLabel("Ustawienia");
		lblUstawienia.setForeground(new Color(204, 51, 0));
		lblUstawienia.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel5.add(lblUstawienia, "cell 0 0");
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.GRAY);
		layeredPane.add(panel6, "name_406071127991300");
		panel6.setLayout(null);
		
		JLabel lblDodajUtwr = new JLabel("Dodaj utw\u00F3r");
		lblDodajUtwr.setBounds(7, 7, 113, 22);
		lblDodajUtwr.setForeground(new Color(204, 51, 0));
		lblDodajUtwr.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel6.add(lblDodajUtwr);
		
		JLabel lblNewLabel_1 = new JLabel("Podaj tytu\u0142");
		lblNewLabel_1.setForeground(new Color(204, 51, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(74, 132, 183, 47);
		panel6.add(lblNewLabel_1);
		
		JLabel lblPodajWykonawce = new JLabel("Podaj wykonawce");
		lblPodajWykonawce.setForeground(new Color(204, 51, 0));
		lblPodajWykonawce.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPodajWykonawce.setBounds(74, 216, 183, 47);
		panel6.add(lblPodajWykonawce);
		
		JLabel lblPodajGatunek = new JLabel("Podaj gatunek");
		lblPodajGatunek.setForeground(new Color(204, 51, 0));
		lblPodajGatunek.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPodajGatunek.setBounds(74, 300, 183, 47);
		panel6.add(lblPodajGatunek);
		
		tytul = new JTextField();
		tytul.setBounds(267, 141, 271, 32);
		panel6.add(tytul);
		tytul.setColumns(10);
		
		wykonawca = new JTextField();
		wykonawca.setColumns(10);
		wykonawca.setBounds(267, 225, 271, 32);
		panel6.add(wykonawca);
		
		gatunek = new JTextField();
		gatunek.setColumns(10);
		gatunek.setBounds(267, 309, 271, 32);
		panel6.add(gatunek);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String nazwa = tytul.getText();
				String wykon = wykonawca.getText();
				String gat = gatunek.getText();
		        float ocena=0;
		         int id=2;
		        PreparedStatement ps;
		        String query = "INSERT INTO `utwory`(`nazwa`, `wykonawca_id`, `ocena`, `gatunek`) VALUES (?,?,?,?)";
		      try {
		    	  
		    	 
		    	  
		    	  
		    	  ps = MyConnection.getConnection().prepareStatement(query);
		    	  
		    	 
		    	  ps.setString(1,nazwa);
		    	  ps.setString(2,wykon);
		    	  ps.setFloat(3,ocena);
		    	  ps.setString(4,gat);
		    	  
		   
		    	  ps.executeUpdate();
		      }catch(SQLException ex) {
		    	  System.out.println("nie udalo sie dodac utworu");
		      
		      }
			
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Kamil\\Desktop\\studio\\icons8-add-10.png"));
		button.setSize(new Dimension(55, 55));
		button.setBorderPainted(false);
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(627, 146, 123, 123);
		panel6.add(button);
		
		JButton home = new JButton("");
		home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				home.setBackground(Color.DARK_GRAY);
			}
		});
		home.addMouseMotionListener(new MouseMotionAdapter() {
			

			@Override
			public void mouseMoved(MouseEvent e) {
				
				
				home.setBackground(new Color(204, 51, 0));
			
				
			}
		});
		home.setBorderPainted(false);
		home.setDoubleBuffered(true);
		home.setForeground(UIManager.getColor("textHighlight"));
		home.setBorder(UIManager.getBorder("CheckBox.border"));
		home.setBackground(Color.DARK_GRAY);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(panel1);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		home.setIcon(new ImageIcon("C:\\Users\\Kamil\\Desktop\\studio\\icons8-home-100.png"));
		home.setSize(new Dimension(55, 55));
		home.setBounds(0, 50, 55, 55);
		contentPane.add(home);
		
		JButton tworca = new JButton("");
		tworca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				tworca.setBackground(Color.DARK_GRAY);
			}
		});
		tworca.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				tworca.setBackground(new Color(204, 51, 0));
			}
		});
		tworca.setBorderPainted(false);
		tworca.setBackground(Color.DARK_GRAY);
		tworca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel2);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		tworca.setIcon(new ImageIcon("C:\\Users\\Kamil\\Desktop\\studio\\icons8-music-record-100.png"));
		tworca.setSize(new Dimension(55, 55));
		tworca.setBounds(0, 110, 55, 55);
		contentPane.add(tworca);
		
		JButton biblioteka = new JButton("");
		biblioteka.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				biblioteka.setBackground(Color.DARK_GRAY);
			}
		});
		biblioteka.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				biblioteka.setBackground(new Color(204, 51, 0));
			}
		});
		biblioteka.setBorderPainted(false);
		biblioteka.setBackground(Color.DARK_GRAY);
		biblioteka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel3);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		biblioteka.setIcon(new ImageIcon("C:\\Users\\Kamil\\Desktop\\studio\\icons8-music-200.png"));
		biblioteka.setSize(new Dimension(55, 55));
		biblioteka.setBounds(0, 170, 55, 55);
		contentPane.add(biblioteka);
		
		JButton sklep = new JButton("");
		sklep.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				sklep.setBackground(Color.DARK_GRAY);
			}
		});
		sklep.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				sklep.setBackground(new Color(204, 51, 0));
			}
		});
		sklep.setBorderPainted(false);
		sklep.setBackground(Color.DARK_GRAY);
		sklep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel4);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		sklep.setIcon(new ImageIcon("C:\\Users\\Kamil\\Desktop\\studio\\icons8-market-square-100.png"));
		sklep.setSize(new Dimension(55, 55));
		sklep.setBounds(0, 230, 55, 55);
		contentPane.add(sklep);
		
		JButton ustawienia = new JButton("");
		ustawienia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				ustawienia.setBackground(Color.DARK_GRAY);
			}
		});
		ustawienia.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				ustawienia.setBackground(new Color(204, 51, 0));
			}
		});
		ustawienia.setBorderPainted(false);
		ustawienia.setBackground(Color.DARK_GRAY);
		ustawienia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel5);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		ustawienia.setIcon(new ImageIcon("C:\\Users\\Kamil\\Desktop\\studio\\settings.png"));
		ustawienia.setSize(new Dimension(55, 55));
		ustawienia.setBounds(0, 525, 55, 55);
		contentPane.add(ustawienia);
		
		JButton btnNewButton_1 = new JButton("...");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(0, 0, 42, 16);
		contentPane.add(btnNewButton_1);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnNewButton_1, popupMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		popupMenu.add(mntmNewMenuItem);
		
		JButton dodaj = new JButton("");
		dodaj.setForeground(Color.WHITE);
		dodaj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				dodaj.setBackground(Color.DARK_GRAY);
			}
		});
		dodaj.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				dodaj.setBackground(new Color(204,52,0));
			}
			
			
		});
		dodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel6);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		dodaj.setIcon(new ImageIcon("C:\\Users\\Kamil\\Desktop\\studio\\icons8-add-100.png"));
		dodaj.setSize(new Dimension(55, 55));
		dodaj.setBorderPainted(false);
		dodaj.setBackground(Color.WHITE);
		dodaj.setBounds(0, 292, 55, 55);
		contentPane.add(dodaj);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
		});
	}
}

