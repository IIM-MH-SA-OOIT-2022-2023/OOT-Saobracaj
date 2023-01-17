package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Line;
import geometry.Point;

import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingFrame extends JFrame {

	private JPanel contentPane;
	private PnlDrawing drawing = new PnlDrawing();
	private boolean firstPoint;
	
	private Point startPoint,endPoint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrawingFrame frame = new DrawingFrame();
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
	public DrawingFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JToggleButton btnPoint = new JToggleButton("POINT");
		panelNorth.add(btnPoint);
		
		JToggleButton btnLine = new JToggleButton("LINE");
		panelNorth.add(btnLine);
		drawing.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnPoint.isSelected()) {
					Point p1 = new Point(e.getX(), e.getY());
					drawing.getShapes().add(p1);
				}else if(btnLine.isSelected()) {
					if(!firstPoint) {
						startPoint = new Point(e.getX(), e.getY());
						firstPoint = true;
					}else {
						endPoint = new Point(e.getX(),e.getY());
						firstPoint = false;
						Line l1 = new Line(startPoint,endPoint);
						drawing.getShapes().add(l1);
					}
				}
				repaint();
			}
		});
		
		contentPane.add(drawing, BorderLayout.CENTER);
	}

}
