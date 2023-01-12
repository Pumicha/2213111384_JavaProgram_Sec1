import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtnumber1;
	private JTextField txtnumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
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
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumber1.setBounds(75, 38, 109, 32);
		contentPane.add(lblNumber1);

		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumber2.setBounds(75, 81, 109, 19);
		contentPane.add(lblNumber2);

		txtnumber1 = new JTextField();
		txtnumber1.setBounds(194, 46, 164, 20);
		contentPane.add(txtnumber1);
		txtnumber1.setColumns(10);

		txtnumber2 = new JTextField();
		txtnumber2.setBounds(194, 77, 164, 20);
		contentPane.add(txtnumber2);
		txtnumber2.setColumns(10);

		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblResult.setBounds(180, 189, 123, 28);
		contentPane.add(lblResult);

		final JComboBox cmbOperator = new JComboBox();
		cmbOperator.setBounds(194, 108, 98, 22);
		contentPane.add(cmbOperator);
		cmbOperator.addItem("+");
		cmbOperator.addItem("-");
		cmbOperator.addItem("*");
		cmbOperator.addItem("/");

		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOperator.setBounds(75, 101, 73, 32);
		contentPane.add(lblOperator);

		final JRadioButton onedigit = new JRadioButton("1 digit");
		onedigit.setBounds(194, 149, 98, 19);
		contentPane.add(onedigit);

		final JRadioButton twodigit = new JRadioButton("2 digit");
		twodigit.setBounds(194, 171, 109, 23);
		contentPane.add(twodigit);

		ButtonGroup group = new ButtonGroup();
		group.add(onedigit);
		group.add(twodigit);

		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum = 0;
				String operator;
				if (e.getSource() == btnOK) {
					num1 = Double.parseDouble(txtnumber1.getText());
					num2 = Double.parseDouble(txtnumber2.getText());
					// sum = num1 + num2;
					operator = (String) cmbOperator.getSelectedItem();
					if (operator.equals("+"))
						sum = num1 + num2;
					if (operator.equals("-"))
						sum = num1 - num2;
					if (operator.equals("*"))
						sum = num1 * num2;
					if (operator.equals("/"))
						sum = num1 / num2;

					DecimalFormat frmNumber = null;
					if (onedigit.isSelected())
						frmNumber = new DecimalFormat("#,###.0");
					else if (twodigit.isSelected())
						frmNumber = new DecimalFormat("#,###.00");

					lblResult.setText(String.format(frmNumber.format(sum)));
				}
			}
		});
		btnOK.setBounds(94, 218, 98, 32);
		contentPane.add(btnOK);

		JButton btnCancel = new JButton("Exit");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(263, 218, 95, 32);
		contentPane.add(btnCancel);

		JLabel lblDigit = new JLabel("How to show digit");
		lblDigit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDigit.setBounds(75, 144, 123, 24);
		contentPane.add(lblDigit);

	}
}
