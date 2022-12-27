package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgBoja extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldRed;
	private JTextField textFieldGreen;
	private JTextField textFieldBlue;
	
	private int r,g,b;
	private boolean check;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgBoja dialog = new DlgBoja();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgBoja() {
		setBounds(100, 100, 450, 300);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 48, 0, 214, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblRed = new JLabel("RED");
			lblRed.setFont(new Font("Verdana", Font.BOLD, 14));
			GridBagConstraints gbc_lblRed = new GridBagConstraints();
			gbc_lblRed.insets = new Insets(0, 0, 5, 5);
			gbc_lblRed.gridx = 1;
			gbc_lblRed.gridy = 1;
			contentPanel.add(lblRed, gbc_lblRed);
		}
		{
			textFieldRed = new JTextField();
			textFieldRed.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						JOptionPane.showMessageDialog(null, "Morate uneti broj!", 
								"Pogresan unos", JOptionPane.WARNING_MESSAGE);
						e.consume();
					}
					
				}
			});
			textFieldRed.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldRed.setText("Unesite vrednost od 0-255");
			textFieldRed.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_textFieldRed = new GridBagConstraints();
			gbc_textFieldRed.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldRed.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldRed.gridx = 3;
			gbc_textFieldRed.gridy = 1;
			contentPanel.add(textFieldRed, gbc_textFieldRed);
			textFieldRed.setColumns(10);
		}
		{
			JLabel lblGreen = new JLabel("GREEN");
			lblGreen.setFont(new Font("Verdana", Font.BOLD, 14));
			GridBagConstraints gbc_lblGreen = new GridBagConstraints();
			gbc_lblGreen.insets = new Insets(0, 0, 5, 5);
			gbc_lblGreen.gridx = 1;
			gbc_lblGreen.gridy = 3;
			contentPanel.add(lblGreen, gbc_lblGreen);
		}
		{
			textFieldGreen = new JTextField();
			textFieldGreen.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						JOptionPane.showMessageDialog(null, "Morate uneti broj!", 
								"Pogresan unos", JOptionPane.WARNING_MESSAGE);
						e.consume();
					}
				}
			});
			textFieldGreen.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldGreen.setText("Unesite vrednost od 0-255");
			textFieldGreen.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_textFieldGreen = new GridBagConstraints();
			gbc_textFieldGreen.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldGreen.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldGreen.gridx = 3;
			gbc_textFieldGreen.gridy = 3;
			contentPanel.add(textFieldGreen, gbc_textFieldGreen);
			textFieldGreen.setColumns(10);
		}
		{
			JLabel lblBlue = new JLabel("BLUE");
			lblBlue.setFont(new Font("Verdana", Font.BOLD, 14));
			GridBagConstraints gbc_lblBlue = new GridBagConstraints();
			gbc_lblBlue.insets = new Insets(0, 0, 0, 5);
			gbc_lblBlue.gridx = 1;
			gbc_lblBlue.gridy = 5;
			contentPanel.add(lblBlue, gbc_lblBlue);
		}
		{
			textFieldBlue = new JTextField();
			textFieldBlue.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						JOptionPane.showMessageDialog(null, "Morate uneti broj!", 
								"Pogresan unos", JOptionPane.WARNING_MESSAGE);
						e.consume();
					}
				}
			});
			textFieldBlue.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldBlue.setText("Unesite vrednost od 0-255");
			textFieldBlue.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_textFieldBlue = new GridBagConstraints();
			gbc_textFieldBlue.insets = new Insets(0, 0, 0, 5);
			gbc_textFieldBlue.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldBlue.gridx = 3;
			gbc_textFieldBlue.gridy = 5;
			contentPanel.add(textFieldBlue, gbc_textFieldBlue);
			textFieldBlue.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						r = Integer.parseInt(textFieldRed.getText());
						g = Integer.parseInt(textFieldGreen.getText());
						b = Integer.parseInt(textFieldBlue.getText());
						if((r <= 255 && r>=0)
								&& (g <= 255 && g>=0) &&
								(b <= 255 && b>=0)){
							check = true;
							dispose();
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public boolean isCheck() {
		return check;
	}

}
