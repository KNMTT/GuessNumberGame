package com.main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class Success extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static String s;
	JLabel lblCongratulation = new JLabel();

	public static String setNum(String str) {
		return s = str;
	}

	public static String getNum() {
		return s;
	}

	/**
	 * Launch the application.
	 */
	public void run() {
		try {
			Success frame = new Success();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Success() {
		setTitle("Guess Game");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\Users\\l\\workspace\\GuessNum\\img\\234351noe55qm1fszc7sys.jpg.thumb.jpg"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String temp = "CongratulationNum: " + Success.getNum();
		lblCongratulation.setText(temp);
		lblCongratulation.setForeground(Color.GREEN);
		lblCongratulation.setFont(new Font("»ªÎÄ²ÊÔÆ", Font.PLAIN, 20));
		lblCongratulation.setBounds(71, 68, 321, 105);
		contentPane.add(lblCongratulation);
	}

}
