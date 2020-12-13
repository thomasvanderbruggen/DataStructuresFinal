import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

/**************************************************************
* Name        : 
* Author      : 
* Created     :
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program overall description here
*               Input: 
*               Output:
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

/**
 * @author Tom
 *
 */
public class FirstScreen {

	JFrame firstScreen;


	/**
	 * Create the application.
	 */
	public FirstScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Order order = new Order(); 
		
		// ----------- FIRST GUI WINODW ---------------------------
		firstScreen = new JFrame();
		firstScreen.setResizable(false);
		firstScreen.setBounds(100, 100, 943, 428);
		firstScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstScreen.getContentPane().setLayout(null);
		
		JButton customPizzaBtn = new JButton("Custom Pizzas");
		customPizzaBtn.setBounds(10, 29, 289, 133);
		firstScreen.getContentPane().add(customPizzaBtn);
		
		JButton specialtyPizzaBtn = new JButton("Specialty Pizzas");
		specialtyPizzaBtn.setBounds(309, 29, 289, 133);
		firstScreen.getContentPane().add(specialtyPizzaBtn);
		
		JButton sidesBtn = new JButton("Sides");
		sidesBtn.setBounds(163, 173, 289, 133);
		firstScreen.getContentPane().add(sidesBtn);
		
		TextArea orderDisplay = new TextArea();
		orderDisplay.setBounds(619, 10, 308, 346);
		firstScreen.getContentPane().add(orderDisplay);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 2);
		firstScreen.getContentPane().add(scrollPane);
		
		JLabel priceLbl = new JLabel();
		priceLbl.setText("Price:");
		priceLbl.setBounds(619, 374, 46, 14);
		firstScreen.getContentPane().add(priceLbl);
		
		JButton placeOrderBtn = new JButton("Place Order");
		placeOrderBtn.setBounds(524, 350, 89, 23);
		firstScreen.getContentPane().add(placeOrderBtn);
		
		JTextPane price = new JTextPane();
		price.setText("$0.00");
		price.setBounds(657, 368, 74, 20);
		firstScreen.getContentPane().add(price);
		customPizzaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomPizzaScreen window = new CustomPizzaScreen(order, firstScreen, price, orderDisplay);
				window.setVisible(true);
			}
			
		}); 
		specialtyPizzaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SpecialtyPizzaScreen window = new SpecialtyPizzaScreen(order, firstScreen, price, orderDisplay); 
				window.setVisible(true);	
			}
		}); 
		placeOrderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlacedOrderScreen window = new PlacedOrderScreen(order); 
				window.setVisible(true);
			}
			
		}); 
		sidesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SidesScreen window = new SidesScreen(order, firstScreen, price, orderDisplay); 
				window.setVisible(true);
			}
		});
		
	}
}
