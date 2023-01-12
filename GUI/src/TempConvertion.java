import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TempConvertion extends JFrame {

	private JLabel celsiusLabel;
	private JLabel fahrenheitLabel;

	private JTextField celsiusTF;
	private JTextField fahrenheitTF;

	private static final int WIDTH = 500;
	private static final int HEIGHT = 100;
	private static final double FTOC = 5.0 / 9.0;
	private static final double CTOC = 9.0 / 5.0;
	private static final double OFFSET = 32;

	public TempConvertion() {
		setTitle("Temperature Convertion");
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 4));

		celsiusLabel = new JLabel("Temp in Celsius: ");
		fahrenheitLabel = new JLabel("Temp in Fahrenheit: ");

		celsiusTF = new JTextField(10);
		fahrenheitTF = new JTextField(10);

		c.add(celsiusLabel);
		c.add(fahrenheitLabel);
		c.add(celsiusTF);
		c.add(fahrenheitTF);

		// celsiusTF.addActionaListener();
		CelsHandler celsiusHandler = new CelsHandler();
		celsiusTF.addActionListener(celsiusHandler);

		FahrenHandler fahrenheitHandler = new FahrenHandler();
		fahrenheitTF.addActionListener(fahrenheitHandler);

		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		CenteredFrame(this);
	}

	public void CenteredFrame(javax.swing.JFrame objFrame) {
		Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
		int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
		int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
		objFrame.setLocation(iCoordX, iCoordY);
	}

	private class CelsHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double celsius, fahenheit;
			celsius = Double.parseDouble(celsiusTF.getText());
			fahenheit = celsius * CTOC * OFFSET;
			fahrenheitTF.setText(String.format("%.2f", fahenheit));

		}
	}

	private class FahrenHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double celsius, fahenheit;
			fahenheit = Double.parseDouble(celsiusTF.getText());
			celsius = (fahenheit - FTOC) * OFFSET;
			fahrenheitTF.setText(String.format("%.2f", celsius));
		}
	}

	public static void main(String[] args) {
		TempConvertion JFrame = new TempConvertion();
	}

}
