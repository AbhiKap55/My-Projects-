
import java.awt.*;

import javax.swing.*; 

public class AutomatedGUI extends JFrame 
{

	JLabel[] labels; 
	JTextField[] fields; 
	JButton[] buttons; 
	
	public AutomatedGUI()
	{
		setSize(400,300);
		setResizable(true); 
		setTitle("Welcome ");
		setLocation(200,200);
		
		Container contentPane = getContentPane(); 
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);
		
		labels = new JLabel[3]; 
		fields = new JTextField[3]; 
		buttons = new JButton[3]; 
		
		String[] names = {"One", "Two", "Three"};
		int x = 50; 
		
		for(int i = 0; i<labels.length;i++)
		{
			labels[i] = new JLabel(names[i]);
			fields[i] = new JTextField();
			buttons[i] = new JButton("Go");
			labels[i].setBounds(40,x,100,30);
			fields[i].setBounds(130,x,100,30);
			buttons[i].setBounds(275,x,80,30);
			x+=50; 
			contentPane.add(labels[i]);
			contentPane.add(fields[i]);
			contentPane.add(buttons[i]);
		}
	}
	
	public static void main(String [] args)
	{
		AutomatedGUI obj = new AutomatedGUI(); 
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
 