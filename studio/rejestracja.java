package studio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class rejestracja extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField field;
	private JPasswordField field2;

	/**
	 * Launch the application.
	 */
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
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setIcon(new ImageIcon(rejestracja.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		button.setBounds(459, 0, 33, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(rejestracja.class.getResource("/javax/swing/plaf/metal/icons/ocean/minimize.gif")));
		button_1.setBounds(427, 0, 33, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(rejestracja.class.getResource("/javax/swing/plaf/metal/icons/ocean/maximize.gif")));
		button_2.setBounds(395, 0, 33, 23);
		contentPane.add(button_2);
		
		JLabel lblRejestracja = new JLabel("Rejestracja ");
		lblRejestracja.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRejestracja.setBounds(20, 78, 118, 39);
		contentPane.add(lblRejestracja);
		
		JLabel lblNewLabel = new JLabel("Imi\u0119:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(123, 167, 73, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNazwisko = new JLabel("Nazwisko:");
		lblNazwisko.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNazwisko.setBounds(93, 202, 97, 14);
		contentPane.add(lblNazwisko);
		
		JLabel lblAdresEmail = new JLabel("Adres e-mail:");
		lblAdresEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdresEmail.setBounds(74, 237, 129, 14);
		contentPane.add(lblAdresEmail);
		
		JLabel lblNazwaUytkownika = new JLabel("Nazwa u\u017Cytkownika:");
		lblNazwaUytkownika.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNazwaUytkownika.setBounds(28, 275, 129, 14);
		contentPane.add(lblNazwaUytkownika);
		
		JLabel lblHaso = new JLabel("*Has\u0142o:");
		lblHaso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHaso.setBounds(106, 312, 46, 14);
		contentPane.add(lblHaso);
		
		JLabel lblPowtrzHaso = new JLabel("Powt\u00F3rz has\u0142o:");
		lblPowtrzHaso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPowtrzHaso.setBounds(61, 374, 97, 14);
		contentPane.add(lblPowtrzHaso);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(177, 165, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setColumns(10);
		textField_1.setBounds(177, 200, 187, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setColumns(10);
		textField_2.setBounds(177, 235, 187, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_3.setColumns(10);
		textField_3.setBounds(177, 273, 187, 20);
		contentPane.add(textField_3);
		
		field = new JPasswordField();
		field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
			}
		});
		field.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		field.setBounds(177, 310, 187, 20);
		contentPane.add(field);
		
		field2 = new JPasswordField();
		field2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		field2.setBounds(177, 372, 187, 20);
		contentPane.add(field2);
		
		JButton btnNewButton = new JButton("Zarejestruj ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				login second = new login();
				second.setVisible(true);
				
				
				
			}
		});
		btnNewButton.setBounds(116, 427, 312, 39);
		contentPane.add(btnNewButton);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				
				
				
			}
		});
		progressBar.setIndeterminate(false);
		progressBar.setForeground(new Color(0, 255, 0));
		progressBar.setBounds(177, 341, 187, 14);
		contentPane.add(progressBar);
		progressBar.setValue(1);
		
		JLabel lblSiaHasa = new JLabel("Si\u0142a has\u0142a");
		lblSiaHasa.setBounds(116, 337, 46, 14);
		contentPane.add(lblSiaHasa);
		
		JLabel lblNewLabel_1 = new JLabel("* - has\u0142o powinno zawierac od 6 do max 20 znak\u00F3w");
		lblNewLabel_1.setBounds(20, 520, 324, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblStudioNagra = new JLabel("Studio Nagra\u0144 v1.0");
		lblStudioNagra.setBounds(10, 0, 128, 14);
		contentPane.add(lblStudioNagra);
	}
}
