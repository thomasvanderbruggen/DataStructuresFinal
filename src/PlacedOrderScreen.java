import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Scrollbar;

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
 * Shows the completed order back to the user
 * @author Tom
 * 
 */
public class PlacedOrderScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 * @param order the completed order
	 */
	public PlacedOrderScreen(Order order) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 33, 576, 456);
		contentPane.add(textArea);
		textArea.setText(order.printOrder());
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(0, 0, -1, 2);
		contentPane.add(scrollbar);
		
		JLabel orderLbl = new JLabel("ORDER");
		orderLbl.setBounds(169, 11, 46, 14);
		contentPane.add(orderLbl);
	}
}
