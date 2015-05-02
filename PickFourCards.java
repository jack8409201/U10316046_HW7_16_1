import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PickFourCards extends JFrame{
 
	private static JButton Refresh = new JButton("Refresh");
	private static JPanel panel1 = new JPanel();
	private static JPanel panel2 = new JPanel();
	private static JLabel card1;
	private static JLabel card2;
	private static JLabel card3;
	private static JLabel card4;
	
	public PickFourCards(){ 
				
		panel1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		panel1.add(Refresh,BorderLayout.SOUTH);
		add(panel1, BorderLayout.SOUTH);
  
		panel2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		panel2.setLayout(new FlowLayout());
		card1 = new JLabel();
		card2 = new JLabel();
		card3 = new JLabel();
		card4 = new JLabel();
		panel2.add(card1);
		panel2.add(card2);
		panel2.add(card3);
		panel2.add(card4);
		add(panel2, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		PickFourCards frame = new PickFourCards();
		frame.setTitle("Pick Four Cards");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
