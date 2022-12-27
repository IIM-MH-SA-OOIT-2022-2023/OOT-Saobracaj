package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmTest extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<String> dlm = new DefaultListModel<String>();
	private JList list;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
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
	public FrmTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblNaslov = new JLabel("Aplikacija za bojenje");
		lblNaslov.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panelNorth.add(lblNaslov);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{0, 0, 0, 87, 0, 29, 0};
		gbl_panelCenter.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCenter.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JLabel lblCrvena = new JLabel("Crvena");
		lblCrvena.setFont(new Font("Verdana", Font.PLAIN, 20));
		GridBagConstraints gbc_lblCrvena = new GridBagConstraints();
		gbc_lblCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrvena.gridx = 1;
		gbc_lblCrvena.gridy = 1;
		panelCenter.add(lblCrvena, gbc_lblCrvena);
		
		JButton btnCrvena = new JButton("Oboji me!");
		btnCrvena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCenter.setBackground(Color.RED);
				panelNorth.setBackground(Color.RED);
				dlm.add(0, lblCrvena.getText());
			}
		});
		btnCrvena.setFont(new Font("Verdana", Font.PLAIN, 15));
		GridBagConstraints gbc_btnCrvena = new GridBagConstraints();
		gbc_btnCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrvena.gridx = 3;
		gbc_btnCrvena.gridy = 1;
		panelCenter.add(btnCrvena, gbc_btnCrvena);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridheight = 7;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 5;
		gbc_scrollPane.gridy = 0;
		panelCenter.add(scrollPane, gbc_scrollPane);
		
		list = new JList();
		list.setModel(dlm);
		scrollPane.setViewportView(list);
		
		JLabel lblPlava = new JLabel("Plava");
		lblPlava.setFont(new Font("Verdana", Font.PLAIN, 20));
		GridBagConstraints gbc_lblPlava = new GridBagConstraints();
		gbc_lblPlava.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlava.gridx = 1;
		gbc_lblPlava.gridy = 3;
		panelCenter.add(lblPlava, gbc_lblPlava);
		
		JButton btnPlava = new JButton("Oboji me!");
		btnPlava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCenter.setBackground(Color.BLUE);
				panelNorth.setBackground(Color.BLUE);
				dlm.add(0, lblPlava.getText());
			}
		});
		btnPlava.setFont(new Font("Verdana", Font.PLAIN, 15));
		GridBagConstraints gbc_btnPlava = new GridBagConstraints();
		gbc_btnPlava.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlava.gridx = 3;
		gbc_btnPlava.gridy = 3;
		panelCenter.add(btnPlava, gbc_btnPlava);
		
		JLabel lblZelena = new JLabel("Zelena");
		lblZelena.setFont(new Font("Verdana", Font.PLAIN, 20));
		GridBagConstraints gbc_lblZelena = new GridBagConstraints();
		gbc_lblZelena.insets = new Insets(0, 0, 5, 5);
		gbc_lblZelena.gridx = 1;
		gbc_lblZelena.gridy = 5;
		panelCenter.add(lblZelena, gbc_lblZelena);
		
		JButton btnZelena = new JButton("Oboji me!");
		btnZelena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCenter.setBackground(Color.GREEN);
				panelNorth.setBackground(Color.GREEN);
				dlm.add(0, lblZelena.getText());
			}
		});
		btnZelena.setFont(new Font("Verdana", Font.PLAIN, 15));
		GridBagConstraints gbc_btnZelena = new GridBagConstraints();
		gbc_btnZelena.insets = new Insets(0, 0, 5, 5);
		gbc_btnZelena.gridx = 3;
		gbc_btnZelena.gridy = 5;
		panelCenter.add(btnZelena, gbc_btnZelena);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = comboBox.getSelectedItem().toString();
				dlm.add(0, temp);
				if(temp.equals("Ljubicasta")) {
					panelNorth.setBackground(Color.MAGENTA);
					panelCenter.setBackground(Color.MAGENTA);
				}else if(temp.equals("Narandzasta")) {
					panelNorth.setBackground(Color.ORANGE);
					panelCenter.setBackground(Color.ORANGE);
				}else if(temp.equals("Crna")) {
					panelNorth.setBackground(Color.BLACK);
					panelCenter.setBackground(Color.BLACK);
				}
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ljubicasta", "Narandzasta", "Crna"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 8;
		panelCenter.add(comboBox, gbc_comboBox);
		
		JLabel lblInstrukcija = new JLabel("Unesite boju koju zelite");
		lblInstrukcija.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblInstrukcija = new GridBagConstraints();
		gbc_lblInstrukcija.insets = new Insets(0, 0, 0, 5);
		gbc_lblInstrukcija.gridx = 1;
		gbc_lblInstrukcija.gridy = 10;
		panelCenter.add(lblInstrukcija, gbc_lblInstrukcija);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					dlm.add(0, textField.getText());
					textField.setText("");
				}
			}
		});
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 10;
		panelCenter.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnDugme = new JButton("Klikni me!");
		btnDugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Pritisnuli ste dugme 😲", 
						"Obavestenje", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnDugme.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelSouth.add(btnDugme);
		
		JButton btnDijalog = new JButton("Odaberi RGB boju");
		btnDijalog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgBoja dlg = new DlgBoja();
				dlg.setVisible(true);
				if(dlg.isCheck()) {
					Color c = new Color(dlg.getR(), dlg.getG(), dlg.getB());
					panelCenter.setBackground(c);
					panelNorth.setBackground(c);
				}
			}
		});
		btnDijalog.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelSouth.add(btnDijalog);
	}

}
