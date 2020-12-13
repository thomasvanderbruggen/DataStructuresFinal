import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;


public class SidesScreen extends JFrame {

	private JPanel contentPane;
	private DecimalFormat df = new DecimalFormat("0.00");

	/**
	 * Create the frame
	 * @param order the current order
	 * @param ogFrame the original frame of the application
	 * @param price the textfield where price is shown
	 * @param orderToUser the textfield where the user is shown the order
	 */
	public SidesScreen(Order order, JFrame ogFrame, JTextPane price, TextArea orderToUser) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][][][][][][]"));
		
		JLabel wingsLbl = new JLabel("Wings");
		contentPane.add(wingsLbl, "cell 1 0");
		
		JLabel pastaLbl = new JLabel("Pastas");
		contentPane.add(pastaLbl, "cell 5 0");
		
		JCheckBox fourWingsChk = new JCheckBox("4 Buffalo Wings");
		contentPane.add(fourWingsChk, "cell 1 1");
		
		JCheckBox chicAlfredoChk = new JCheckBox("Chicken Penne Alfredo");
		contentPane.add(chicAlfredoChk, "cell 5 1");
		
		JCheckBox sixWingsChk = new JCheckBox("6 Buffalo Wings");
		contentPane.add(sixWingsChk, "cell 1 2");
		
		JCheckBox rigMeatChk = new JCheckBox("Rigatoni With Meat Sauce");
		contentPane.add(rigMeatChk, "cell 5 2");
		
		JCheckBox eightWingsChk = new JCheckBox("8 Buffalo Wings");
		contentPane.add(eightWingsChk, "cell 1 3");
		
		JCheckBox ravioliChk = new JCheckBox("Ravioli");
		contentPane.add(ravioliChk, "cell 5 3");
		
		JCheckBox twelveWingsChk = new JCheckBox("12 Buffalo Wings");
		contentPane.add(twelveWingsChk, "cell 1 4");
		
		JCheckBox macAndChzChk = new JCheckBox("Mac and Cheese");
		contentPane.add(macAndChzChk, "cell 5 4");
		
		JLabel friedLbl = new JLabel("Fried Foods");
		contentPane.add(friedLbl, "cell 1 5");
		
		JLabel sauceCupLbl = new JLabel("Sauce Cups");
		contentPane.add(sauceCupLbl, "cell 5 5");
		
		JCheckBox friedPickChk = new JCheckBox("Fried Pickles");
		contentPane.add(friedPickChk, "cell 1 6");
		
		JCheckBox tradCupChk = new JCheckBox("Traditional");
		contentPane.add(tradCupChk, "cell 5 6");
		
		JCheckBox jalaPopChk = new JCheckBox("Jalapeno Poppers");
		contentPane.add(jalaPopChk, "cell 1 7");
		
		JCheckBox mildCupChk = new JCheckBox("Mild");
		contentPane.add(mildCupChk, "cell 5 7");
		
		JCheckBox mozzStickChk = new JCheckBox("Mozzarella Sticks");
		contentPane.add(mozzStickChk, "cell 1 8");
		
		JCheckBox ranchCupChk = new JCheckBox("Ranch");
		contentPane.add(ranchCupChk, "cell 5 8");
		
		JCheckBox friedRavChk = new JCheckBox("Fried Ravioli");
		contentPane.add(friedRavChk, "cell 1 9");
		
		JCheckBox buffCupChk = new JCheckBox("Buffalo");
		contentPane.add(buffCupChk, "cell 5 9");
		
		JButton addToOrderBtn = new JButton("AddToOrder");
		contentPane.add(addToOrderBtn, "cell 3 10");
		// Adds all ordered sides to the order
		addToOrderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> sides = new ArrayList<String>(); 
				if (fourWingsChk.isSelected()) {sides.add("4 Buffalo Wings"); } 
				if (sixWingsChk.isSelected()) {sides.add("6 Buffalo Wings"); } 
				if (eightWingsChk.isSelected()) {sides.add("8 Buffalo Wings"); }
				if (twelveWingsChk.isSelected()) {sides.add("12 Buffalo Wings"); }
				if (chicAlfredoChk.isSelected()) {sides.add("Chicken Alfredo"); }
				if (rigMeatChk.isSelected()) {sides.add("Rig w/MeatSauce"); }
				if (ravioliChk.isSelected()) {sides.add("Ravioli\t"); }
				if (macAndChzChk.isSelected()) {sides.add("Mac and Cheese"); }
				if (friedPickChk.isSelected()) {sides.add("Fried Pickles"); }
				if (jalaPopChk.isSelected()) {sides.add("Jala Poppers"); }
				if (mozzStickChk.isSelected()) {sides.add("Mozzarella Sticks");}
				if (friedRavChk.isSelected()) {sides.add("Fried Ravioli"); } 
				if (tradCupChk.isSelected()) {sides.add("Cup of Red"); } 
				if (ranchCupChk.isSelected()) {sides.add("Cup of Ranch"); } 
				if (mildCupChk.isSelected()) {sides.add("Cup of Mild"); }
				if (buffCupChk.isSelected()) {sides.add("Cup of Buffalo");}
				for (String side: sides) {
					Sides temp = new Sides(side); 
					order.add(temp);
				}
				// re-sets the price and the order text and repaints the original frame
				price.setText(df.format(order.getPrice()));
				orderToUser.setText(order.printOrder());
				ogFrame.revalidate(); 
				ogFrame.repaint();
				dispose();
				
			}
			
		});
	}

}
