package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgKrugovi extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	
	private int radius;
	private boolean check;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgKrugovi dialog = new DlgKrugovi();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgKrugovi() {
		setBounds(100, 100, 300, 220);
		setModal(true);
		setTitle("Krug");
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblRadius = new JLabel("Poluprecnik");
			lblRadius.setFont(new Font("Tahoma", Font.BOLD, 15));
			GridBagConstraints gbc_lblRadius = new GridBagConstraints();
			gbc_lblRadius.insets = new Insets(0, 0, 5, 5);
			gbc_lblRadius.gridx = 1;
			gbc_lblRadius.gridy = 1;
			contentPanel.add(lblRadius, gbc_lblRadius);
		}
		{
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 3;
			gbc_textField.gridy = 1;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JButton btnPotvrdi = new JButton("Potvrdi");
				btnPotvrdi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							radius = Integer.parseInt(textField.getText());
							if(radius > 0) {
								check = true;
								dispose();
							}else {
								JOptionPane.showMessageDialog
								(null, "Radijus mora biti veci od 0!", "Pogresan unos", 
										JOptionPane.ERROR_MESSAGE);
							}
							
						} catch (NumberFormatException e2) {
							JOptionPane.showMessageDialog
							(null, "Radijus mora biti broj!", "Pogresan unos", 
									JOptionPane.ERROR_MESSAGE);
						}
						
						
					}
				});
				btnPotvrdi.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnPotvrdi.setActionCommand("OK");
				buttonPane.add(btnPotvrdi);
				getRootPane().setDefaultButton(btnPotvrdi);
			}
			{
				JButton btnPonisti = new JButton("Ponisti");
				btnPonisti.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnPonisti.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnPonisti.setActionCommand("Cancel");
				buttonPane.add(btnPonisti);
			}
		}
	}

	public int getRadius() {
		return radius;
	}
	
	public boolean isChecked() {
		return check;
	}
	
}
