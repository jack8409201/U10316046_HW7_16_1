/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 16.1
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PickFourCards extends JFrame implements ActionListener{
	//Global variables
	private static JButton Refresh = new JButton("Refresh");
	private static JPanel panel1 = new JPanel();
	private static JPanel panel2 = new JPanel();
	private static ImageIcon[] image = new ImageIcon[52];
	private static int[] poker = new int[4];
	private static JLabel card1;
	private static JLabel card2;
	private static JLabel card3;
	private static JLabel card4;
	
	public PickFourCards(){ 
		deckOfCards();
		display();
	}
	
	@Override //Implement actionPerformed
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Refresh){
			//Call deckOfCards method Shuffle the deck
			deckOfCards();
			card1.setIcon(image[poker[0]]);
			card2.setIcon(image[poker[1]]);
			card3.setIcon(image[poker[2]]);
			card4.setIcon(image[poker[3]]);
			panel1.repaint();
		}
	}
	
	public void display(){
		//Panel1 contains a button
		panel1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		panel1.add(Refresh,BorderLayout.SOUTH);
		add(panel1, BorderLayout.SOUTH);
		
		//Panel2 contains four labels which include for cards
		panel2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		panel2.setLayout(new FlowLayout());
		card1 = new JLabel(image[poker[0]]);
		card2 = new JLabel(image[poker[1]]);
		card3 = new JLabel(image[poker[2]]);
		card4 = new JLabel(image[poker[3]]);
		panel2.add(card1);
		panel2.add(card2);
		panel2.add(card3);
		panel2.add(card4);
		add(panel2, BorderLayout.CENTER);
		
		Refresh.addActionListener(this);
	}
 
	public void deckOfCards(){
		//Create deck array
		int[] deck = new int[52];
		
		// Initialize cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;
		
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			// Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index]; 
			deck[index] = temp;
		}
		
		for(int i = 0; i < 4; i++){
			poker[i] = deck[i];
		}
		for(int i = 1;i<=52;i++){
			image[i-1] = new ImageIcon((getClass().getResource("card/"+i+".png")));
		}
	}
	
	//Main method
	public static void main(String[] args) {
		PickFourCards frame = new PickFourCards();
		frame.setTitle("Pick Four Cards");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
