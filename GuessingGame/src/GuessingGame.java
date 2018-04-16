import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;	// text field for the users guess
	private JLabel lblOutput;		// output field
	private int randNum;			// the random number
	
	public void checkGuess() {	// check the user input
		String guessText = txtGuess.getText();
		String message = "";
		// Lets check that guess
		try {
			int guess = Integer.parseInt(guessText);
			// too high
			if (guess > randNum) 
			{
				message = guess + " is too high.  Try again.";
				lblOutput.setText(message);
			}
			// too low
			else if (guess < randNum)
			{
				message = guess + " is too low.  Try again.";
				lblOutput.setText(message);
			}
			// correct answer
			else
			{
				message = guess + " is correct.  Good job.  Lets play again.";
				lblOutput.setText(message);
				newGame();
			}
		}
		catch(Exception e) {
			lblOutput.setText("Enter a whole number between 1 and 100.");
		}
		finally {
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}
	}
	
	public void newGame() {
		
		randNum = (int)(Math.random() * 100 + 1);
	}
	
	public GuessingGame() {
		getContentPane().setBackground(new Color(0, 255, 255));
		getContentPane().setForeground(new Color(255, 0, 0));
		setForeground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTankslayersHiloGuessing = new JLabel("TankSlayer's Hi-Lo Guessing Game");
		lblTankslayersHiloGuessing.setFont(new Font("Consolas", Font.BOLD, 16));
		lblTankslayersHiloGuessing.setBounds(0, 11, 434, 42);
		lblTankslayersHiloGuessing.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblTankslayersHiloGuessing);
		
		JButton btnGuess = new JButton("GUESS");
		btnGuess.setBackground(new Color(255, 0, 255));
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setFont(new Font("Consolas", Font.BOLD, 11));
		btnGuess.setBounds(173, 150, 89, 23);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number and click the damned button");
		lblOutput.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(10, 205, 414, 23);
		getContentPane().add(lblOutput);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(69, 85, 297, 33);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
		lblGuessANumber.setBounds(23, 11, 198, 14);
		panel.add(lblGuessANumber);
		lblGuessANumber.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblGuessANumber.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		txtGuess.setHorizontalAlignment(SwingConstants.CENTER);
		txtGuess.setBounds(231, 7, 54, 20);
		panel.add(txtGuess);
		txtGuess.setColumns(10);
	}

	public static void main(String[] args) {
		
		GuessingGame theGame = new GuessingGame();
		
		theGame.newGame();
		theGame.setSize(new Dimension(430, 330));
		theGame.setVisible(true);

	}
}