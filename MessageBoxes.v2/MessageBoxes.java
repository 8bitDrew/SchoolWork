import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	public class MessageBoxes extends JPanel 
	{
		private JFrame frame = new JFrame("Message Boxes");
		JButton btnAlert = new JButton("Alert");
		JButton btnBool = new JButton("Yes/No");
		JButton btnColor = new JButton("Color");
		JButton btnInput = new JButton("Input");
		JButton btnValues = new JButton("Values");
		private JTextField txt = new JTextField(15);
		

		public MessageBoxes() 
		{


			btnAlert.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					String id = ((JButton)e.getSource()).getText();
					JOptionPane.showMessageDialog(null,
					"There's a bug on you!", "Hey!",
					JOptionPane.ERROR_MESSAGE);
				}
			});
			
			btnBool.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					String id = ((JButton)e.getSource()).getText();

					int val = JOptionPane.showConfirmDialog(null,
					"or no", "Chose yes",
					JOptionPane.YES_NO_OPTION);

					if(val != JOptionPane.CLOSED_OPTION)
					{
						if(val == 0)
						{
							txt.setText("Yes");
						}
						else
						{
							txt.setText("No");
						}
					}
				}	
			});
			
			btnColor.addActionListener(new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					String id = ((JButton)e.getSource()).getText();
					Object[] options = {"Red", "Green", "Yellow"};//Added another value
					int sel = JOptionPane.showOptionDialog(null,
					"Choose a Color!", "Warning",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.WARNING_MESSAGE, null,
					options, options[0]);

					if(sel != JOptionPane.CLOSED_OPTION)
					{
						txt.setText("Color Selected: " + options[sel]);
					}
				}
			});
			
			btnInput.addActionListener(new ActionListener() 
			{				
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					String id = ((JButton)e.getSource()).getText();
					String val = JOptionPane.showInputDialog("How many fingers do you see?");
					txt.setText(val);
				}
			});
			
			btnInput.addActionListener(new ActionListener() 
			{
				
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					String id = ((JButton)e.getSource()).getText();
					Object[] selections = {"First", "Second", "Third","Fourth"};//Added another value
					Object val = JOptionPane.showInputDialog(null,
					"Choose one", "Input",
					JOptionPane.INFORMATION_MESSAGE,
					null, selections, selections[0]);

					if(val != null)
					{
						txt.setText(val.toString());
					}
				}
			});

			frame.add(btnAlert);
			add(btnBool);
			add(btnColor);
			add(btnInput);
			add(btnValues);
		}
		
		public void launchJFrame(){
			
			frame.setSize(250, 250);
			frame.getContentPane().setLayout(new FlowLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
		
		public static void main(String[] args)
		{
			MessageBoxes messageBoxes = new MessageBoxes();
			messageBoxes.launchJFrame();
		}

		/*
		public MessageBoxes()
		{
			frame = new JFrame("Title");
			frame.setSize(250, 250);
			frame.getContentPane().setLayout(new FlowLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			for(int i = 0; i < b.length; i++)
			{
				frame.getContentPane().add(b[i]);
			}
			
			frame.getContentPane().add(txt);
			frame.setVisible(true);
		}

		public void launchJFrame()
		{
			b[0].addActionListener(alertActionListener);
			for(int i = 0; i < b.length; i++)
			{
				b[i].addActionListener(al);
			}
		}

		public static void main(String [] args)
		{
			MessageBoxes messageBoxes = new MessageBoxes();
			messageBoxes.launchJFrame();
		}		
		*/
		
		/*
		private static void createAndShowGui() 
		{
			MessageBoxes mainPanel = new MessageBoxes();
			JFrame frame = new JFrame("MessageBoxes");
			frame.setSize(250, 250);
			frame.getContentPane().setLayout(new FlowLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(mainPanel);
			frame.pack();
			frame.setLocationByPlatform(true);
			frame.setVisible(true);
		}

		public static void main(String[] args) 
		{
			SwingUtilities.invokeLater(new Runnable() 
			{
				public void run() 
				{
					createAndShowGui();
				}
			});
		}
		*/
	}