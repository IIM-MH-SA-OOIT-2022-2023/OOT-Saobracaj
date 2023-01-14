package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import geometry.Circle;
import geometry.Point;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmKrugovi extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<Circle> dlm = new DefaultListModel<>();
	private JList list;
	private String brojacText =  "Krugova u listi: ";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmKrugovi frame = new FrmKrugovi();
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
	public FrmKrugovi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblNaslov = new JLabel("Krugovi");
		lblNaslov.setFont(new Font("Tahoma", Font.BOLD, 25));
		panelNorth.add(lblNaslov);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JLabel lblBrojac = new JLabel("Krugova u listi:");
		lblBrojac.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelSouth.add(lblBrojac);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{0, 0};
		gbl_panelCenter.rowHeights = new int[]{0, 0};
		gbl_panelCenter.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panelCenter.add(scrollPane, gbc_scrollPane);
		
		list = new JList();
		list.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(c == KeyEvent.VK_ENTER) {
					if(list.isSelectionEmpty()) {
						JOptionPane.showMessageDialog(null, "Nije selektovan krug!" ,
								"Losa selekcija", JOptionPane.WARNING_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Povrsina odabranog kruga je: "
								+ dlm.get(list.getSelectedIndex()).area(), 
								"", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int klik = e.getButton();
				if(klik == MouseEvent.BUTTON3) {
					DlgKrugovi dlg = new DlgKrugovi();
					dlg.setVisible(true);
					if(dlg.isChecked()) {
						Circle c1 = new Circle(new Point(-1,-1),dlg.getRadius());
						dlm.add(dlm.getSize(), c1);
						lblBrojac.setText("");
						lblBrojac.setText(brojacText + dlm.getSize());
					}
					
				}
			}
		});
		list.setModel(dlm);
		list.setBackground(Color.GRAY);
		scrollPane.setViewportView(list);
	}

}
