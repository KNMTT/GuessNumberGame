package com.main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;

public class App extends JFrame {

	/**
	 * 猜数字游戏，一共猜5个数字，每个数字的范围在0-9，如果非法输入，提示输入错误，重新输入。 每次输入，均有提示
	 * 当5个数字均正确时，跳转到success界面。
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/*
	 * JTextField jTextField = new JTextField(); 使用时： LimitedDocument ld = new
	 * LimitedDocument(8);//参数为能输入的最大长度 ld.setAllowChar("0123456789");//只能输入的字符
	 * jTextField.setDocument(ld);//运用到文本框中
	 */
	Random rand = new Random();
	private int a = rand.nextInt(10);
	private int b = rand.nextInt(10);
	private int c = rand.nextInt(10);
	private int d = rand.nextInt(10);
	private int f = rand.nextInt(10);
	int x;
	int y;
	int z;
	int p;
	int q;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setTitle("Guess Game");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\Users\\l\\workspace\\GuessNum\\img\\234351noe55qm1fszc7sys.jpg.thumb.jpg"));
		setBackground(Color.WHITE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblGuessNum = new JLabel("Guess Num");
		lblGuessNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuessNum.setForeground(Color.LIGHT_GRAY);
		lblGuessNum.setFont(new Font("华文隶书", Font.PLAIN, 18));
		lblGuessNum.setBounds(162, 10, 115, 30);
		contentPane.add(lblGuessNum);

		LimitedDocument ld = new LimitedDocument(1);
		ld.setAllowChar("0123456789");

		textField = new JTextField();
		textField.setDocument(ld);
		textField.setForeground(Color.PINK);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(10, 66, 66, 21);
		contentPane.add(textField);
		textField.setColumns(1);

		LimitedDocument ld1 = new LimitedDocument(1);
		ld1.setAllowChar("0123456789");

		textField_1 = new JTextField();
		textField_1.setDocument(ld1);
		textField_1.setForeground(Color.ORANGE);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(86, 66, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(1);

		LimitedDocument ld2 = new LimitedDocument(1);
		ld2.setAllowChar("0123456789");

		textField_2 = new JTextField();
		textField_2.setDocument(ld2);
		textField_2.setForeground(Color.GREEN);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(162, 66, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(1);

		LimitedDocument ld3 = new LimitedDocument(1);
		ld3.setAllowChar("0123456789");

		textField_3 = new JTextField();
		textField_3.setDocument(ld3);
		textField_3.setForeground(Color.MAGENTA);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setBounds(238, 66, 66, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(1);

		LimitedDocument ld4 = new LimitedDocument(1);
		ld4.setAllowChar("0123456789");

		textField_4 = new JTextField();
		textField_4.setDocument(ld4);
		textField_4.setForeground(Color.CYAN);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setBounds(314, 66, 66, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(1);

		JLabel lblNo = new JLabel("No1");
		lblNo.setFont(new Font("华文彩云", Font.PLAIN, 14));
		lblNo.setForeground(Color.GREEN);
		lblNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNo.setBounds(22, 42, 54, 15);
		contentPane.add(lblNo);

		JLabel lblNo_1 = new JLabel("No2");
		lblNo_1.setFont(new Font("华文彩云", Font.PLAIN, 14));
		lblNo_1.setForeground(Color.GREEN);
		lblNo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNo_1.setBounds(98, 42, 54, 15);
		contentPane.add(lblNo_1);

		JLabel lblNo_2 = new JLabel("No3");
		lblNo_2.setFont(new Font("华文彩云", Font.PLAIN, 14));
		lblNo_2.setForeground(Color.GREEN);
		lblNo_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNo_2.setBounds(174, 42, 54, 15);
		contentPane.add(lblNo_2);

		JLabel lblNo_3 = new JLabel("No4");
		lblNo_3.setFont(new Font("华文彩云", Font.PLAIN, 14));
		lblNo_3.setForeground(Color.GREEN);
		lblNo_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNo_3.setBounds(250, 42, 54, 15);
		contentPane.add(lblNo_3);

		JLabel lblNo_4 = new JLabel("No5");
		lblNo_4.setFont(new Font("华文彩云", Font.PLAIN, 14));
		lblNo_4.setForeground(Color.GREEN);
		lblNo_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNo_4.setBounds(326, 42, 54, 15);
		contentPane.add(lblNo_4);

		final JLabel lblTooBig = new JLabel("");
		lblTooBig.setFont(new Font("华文彩云", Font.PLAIN, 14));
		lblTooBig.setForeground(Color.GREEN);
		lblTooBig.setHorizontalAlignment(SwingConstants.CENTER);
		lblTooBig.setBounds(22, 138, 54, 30);
		contentPane.add(lblTooBig);

		final JLabel lblTooSmall = new JLabel("");
		lblTooSmall.setFont(new Font("华文彩云", Font.PLAIN, 14));
		lblTooSmall.setForeground(Color.GREEN);
		lblTooSmall.setHorizontalAlignment(SwingConstants.CENTER);
		lblTooSmall.setBounds(98, 138, 54, 30);
		contentPane.add(lblTooSmall);

		final JLabel lblCurrent = new JLabel("");
		lblCurrent.setFont(new Font("华文彩云", Font.PLAIN, 14));
		lblCurrent.setForeground(Color.GREEN);
		lblCurrent.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrent.setBounds(174, 138, 54, 30);
		contentPane.add(lblCurrent);

		final JLabel label_3 = new JLabel("");
		label_3.setFont(new Font("华文彩云", Font.PLAIN, 14));
		label_3.setForeground(Color.GREEN);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(250, 138, 54, 30);
		contentPane.add(label_3);

		final JLabel lblasd = new JLabel("");
		lblasd.setFont(new Font("华文彩云", Font.PLAIN, 14));
		lblasd.setForeground(Color.GREEN);
		lblasd.setHorizontalAlignment(SwingConstants.CENTER);
		lblasd.setBounds(326, 138, 54, 30);
		contentPane.add(lblasd);

		JButton btnGuess = new JButton("Guess");
		btnGuess.setFont(new Font("华文隶书", Font.PLAIN, 16));
		btnGuess.setForeground(Color.BLACK);
		btnGuess.setBackground(Color.LIGHT_GRAY);
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("" + a + b + c + d + f);
				if (!textField.getText().equals("") & !textField_1.getText().equals("")
						& !textField_2.getText().equals("") & !textField_3.getText().equals("")
						& !textField_4.getText().equals("")) {
					int x = Integer.parseInt(textField.getText());
					if (x > a) {
						lblTooBig.setText("to big");
					} else if (x < a) {
						lblTooBig.setText("to small");
					} else if (x == a) {
						lblTooBig.setText("current");
					} else {
						lblTooBig.setText("input error");
					}

					int y = Integer.parseInt(textField_1.getText());
					if (y > b) {
						lblTooSmall.setText("to big");
					} else if (y < b) {
						lblTooSmall.setText("to small");
					} else if (y == b) {
						lblTooSmall.setText("current");
					} else {
						lblTooBig.setText("input error");
					}
					int z = Integer.parseInt(textField_2.getText());
					if (z > c) {
						lblCurrent.setText("to big");
					} else if (z < c) {
						lblCurrent.setText("to small");
					} else if (z == c) {
						lblCurrent.setText("current");
					} else {
						lblCurrent.setText("input error");
					}
					int q = Integer.parseInt(textField_3.getText());
					if (q > d) {
						label_3.setText("to big");
					} else if (q < d) {
						label_3.setText("to small");
					} else if (q == d) {
						label_3.setText("current");
					} else {
						label_3.setText("input error");
					}
					int p = Integer.parseInt(textField_4.getText());
					if (p > f) {
						lblasd.setText("to big");
					} else if (p < f) {
						lblasd.setText("to small");
					} else if (p == f) {
						lblasd.setText("current");
					} else {
						lblasd.setText("input error");
					}
					if (x == a && y == b && z == c && p == f && q == d) {
						Success s = new Success();
						Success.setNum("" + a + b + c + d + f);
						s.run();
						hide();
					}

				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "please inpput number", "input error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnGuess.setBounds(159, 200, 93, 23);
		contentPane.add(btnGuess);
	}
}
