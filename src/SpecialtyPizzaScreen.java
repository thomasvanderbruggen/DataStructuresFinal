import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

/**
 * @author Tom
 *
 */
public class SpecialtyPizzaScreen extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private DecimalFormat df = new DecimalFormat("0.00");
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Create the frame
	 * @param order the current order
	 * @param ogFrame the original frame of the application
	 * @param price the textfield where price is shown
	 * @param orderToUser the textfield where the user is shown the order
	 */
	public SpecialtyPizzaScreen(Order order, JFrame ogFrame, JTextPane price, TextArea orderToUser) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow][][]", "[21.00][][-17.00][][][][][][][][][][][][][]"));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(SpecialtyPizzas.Specialties.values()));
		contentPane.add(comboBox, "cell 3 0,growx");
		
		JCheckBox pepBox = new JCheckBox("Pepperoni");
		contentPane.add(pepBox, "cell 1 1");
		
		JCheckBox bpBox = new JCheckBox("Banana Peppers");
		contentPane.add(bpBox, "cell 3 1");
		
		JCheckBox beefBox = new JCheckBox("Beef");
		contentPane.add(beefBox, "cell 1 3");
		
		JCheckBox boBox = new JCheckBox("Black Olives");
		contentPane.add(boBox, "cell 3 3");
		
		JCheckBox cbBox = new JCheckBox("Canadian Bacon");
		contentPane.add(cbBox, "cell 1 4");
		
		JCheckBox goBox = new JCheckBox("Green Olives");
		contentPane.add(goBox, "cell 3 4");
		
		JCheckBox pineBox = new JCheckBox("Pineapple");
		contentPane.add(pineBox, "cell 5 4");
		
		JCheckBox chicBox = new JCheckBox("Chicken");
		contentPane.add(chicBox, "cell 1 5");
		
		JCheckBox jalaBox = new JCheckBox("Jalapenos");
		contentPane.add(jalaBox, "cell 3 5");
		
		JCheckBox gpBox = new JCheckBox("Green Peppers");
		contentPane.add(gpBox, "cell 5 5");
		
		JCheckBox isBox = new JCheckBox("Italian Sausage");
		contentPane.add(isBox, "cell 1 6");
		
		JCheckBox mushBox = new JCheckBox("Mushrooms");
		contentPane.add(mushBox, "cell 3 6");
		
		JCheckBox sausBox = new JCheckBox("Sausage");
		contentPane.add(sausBox, "cell 1 7");
		
		JCheckBox onBox = new JCheckBox("Onions");
		contentPane.add(onBox, "cell 3 7");
		
		JCheckBox bacBox = new JCheckBox("Bacon");
		contentPane.add(bacBox, "cell 1 8");
		
		JLabel sizeLbl = new JLabel("Sizes");
		contentPane.add(sizeLbl, "cell 1 9");
		
		JLabel crustsLbl = new JLabel("Crusts");
		contentPane.add(crustsLbl, "cell 3 9");
		
		JLabel sauceLbl = new JLabel("Sauces");
		contentPane.add(sauceLbl, "cell 5 9");
		
		JRadioButton personalBtn = new JRadioButton("Personal");
		buttonGroup.add(personalBtn);
		contentPane.add(personalBtn, "cell 1 10");
		
		JRadioButton thinBtn = new JRadioButton("Thin");
		buttonGroup_1.add(thinBtn);
		contentPane.add(thinBtn, "cell 3 10");
		
		JRadioButton tradBtn = new JRadioButton("Traditional");
		buttonGroup_2.add(tradBtn);
		contentPane.add(tradBtn, "cell 5 10");
		
		JRadioButton smallBtn = new JRadioButton("Small");
		buttonGroup.add(smallBtn);
		contentPane.add(smallBtn, "cell 1 11");
		
		JRadioButton panBtn = new JRadioButton("Pan");
		buttonGroup_1.add(panBtn);
		contentPane.add(panBtn, "cell 3 11");
		
		JRadioButton mildBtn = new JRadioButton("Mild");
		buttonGroup_2.add(mildBtn);
		contentPane.add(mildBtn, "cell 5 11");
		
		JRadioButton medBtn = new JRadioButton("Medium");
		buttonGroup.add(medBtn);
		contentPane.add(medBtn, "cell 1 12,aligny center");
		
		JRadioButton htBtn = new JRadioButton("Hand Tossed");
		buttonGroup_1.add(htBtn);
		contentPane.add(htBtn, "cell 3 12");
		
		JRadioButton ranchBtn = new JRadioButton("Ranch");
		buttonGroup_2.add(ranchBtn);
		contentPane.add(ranchBtn, "cell 5 12");
		
		JRadioButton largeBtn = new JRadioButton("Large");
		buttonGroup.add(largeBtn);
		contentPane.add(largeBtn, "cell 1 13,alignx left");
		
		JRadioButton gfBtn = new JRadioButton("Gluten Free");
		buttonGroup_1.add(gfBtn);
		contentPane.add(gfBtn, "cell 3 13");
		
		JRadioButton buffBtn = new JRadioButton("Buffalo");
		buttonGroup_2.add(buffBtn);
		contentPane.add(buffBtn, "cell 5 13");
		
		JRadioButton xlBtn = new JRadioButton("XL");
		buttonGroup.add(xlBtn);
		contentPane.add(xlBtn, "cell 1 14");
		
		JButton addToOrderBtn = new JButton("Add to Order");
		contentPane.add(addToOrderBtn, "cell 3 15");
		// sets all checkboxes to default toppings for selected specialty pizza
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SpecialtyPizzas.Specialties choice = (SpecialtyPizzas.Specialties) comboBox.getSelectedItem();
				switch (choice) {
				case SELECT_ONE:
					pepBox.setSelected(false);
					bacBox.setSelected(false);
					beefBox.setSelected(false);
					cbBox.setSelected(false);
					chicBox.setSelected(false);
					isBox.setSelected(false);
					sausBox.setSelected(false);
					bpBox.setSelected(false);
					boBox.setSelected(false);
					goBox.setSelected(false);
					jalaBox.setSelected(false);
					mushBox.setSelected(false);
					onBox.setSelected(false);
					pineBox.setSelected(false);
					gpBox.setSelected(false);
					tradBtn.setSelected(true);
					break;
				case MEATLOVERS:
					pepBox.setSelected(true);
					bacBox.setSelected(true);
					beefBox.setSelected(true);
					cbBox.setSelected(true);
					chicBox.setSelected(false);
					isBox.setSelected(true);
					sausBox.setSelected(true);
					bpBox.setSelected(false);
					boBox.setSelected(false);
					goBox.setSelected(false);
					jalaBox.setSelected(false);
					mushBox.setSelected(false);
					onBox.setSelected(false);
					pineBox.setSelected(false);
					gpBox.setSelected(false);
					tradBtn.setSelected(true);
					break;
				case SUPREME:
					pepBox.setSelected(true);
					bacBox.setSelected(false);
					beefBox.setSelected(true);
					cbBox.setSelected(false);
					chicBox.setSelected(false);
					isBox.setSelected(true);
					sausBox.setSelected(true);
					bpBox.setSelected(false);
					boBox.setSelected(true);
					goBox.setSelected(false);
					jalaBox.setSelected(false);
					mushBox.setSelected(true);
					onBox.setSelected(true);
					pineBox.setSelected(false);
					gpBox.setSelected(true);
					tradBtn.setSelected(true);
					break;
				case HAWAIIAN:
					pepBox.setSelected(false);
					bacBox.setSelected(true);
					beefBox.setSelected(false);
					cbBox.setSelected(true);
					chicBox.setSelected(false);
					isBox.setSelected(false);
					sausBox.setSelected(false);
					bpBox.setSelected(false);
					boBox.setSelected(false);
					goBox.setSelected(false);
					jalaBox.setSelected(false);
					mushBox.setSelected(false);
					onBox.setSelected(false);
					pineBox.setSelected(true);
					gpBox.setSelected(false);
					tradBtn.setSelected(true);
					break;
				case VEGGIE:
					pepBox.setSelected(false);
					bacBox.setSelected(false);
					beefBox.setSelected(false);
					cbBox.setSelected(false);
					chicBox.setSelected(false);
					isBox.setSelected(false);
					sausBox.setSelected(false);
					bpBox.setSelected(false);
					boBox.setSelected(true);
					goBox.setSelected(true);
					jalaBox.setSelected(false);
					mushBox.setSelected(true);
					onBox.setSelected(true);
					pineBox.setSelected(false);
					gpBox.setSelected(true);
					mildBtn.setSelected(true);
					break;
				case CHICKENBACONRANCH:
					pepBox.setSelected(false);
					bacBox.setSelected(true);
					beefBox.setSelected(false);
					cbBox.setSelected(false);
					chicBox.setSelected(true);
					isBox.setSelected(false);
					sausBox.setSelected(false);
					bpBox.setSelected(false);
					boBox.setSelected(false);
					goBox.setSelected(false);
					jalaBox.setSelected(false);
					mushBox.setSelected(false);
					onBox.setSelected(false);
					pineBox.setSelected(false);
					gpBox.setSelected(false);
					ranchBtn.setSelected(true);
					break;
				case BUFFALOCHICKEN:
					pepBox.setSelected(false);
					bacBox.setSelected(false);
					beefBox.setSelected(false);
					cbBox.setSelected(false);
					chicBox.setSelected(true);
					isBox.setSelected(false);
					sausBox.setSelected(false);
					bpBox.setSelected(true);
					boBox.setSelected(false);
					goBox.setSelected(false);
					jalaBox.setSelected(false);
					mushBox.setSelected(false);
					onBox.setSelected(false);
					pineBox.setSelected(false);
					gpBox.setSelected(false);
					buffBtn.setSelected(true);
					break;
				}
			}
			
		});
		addToOrderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> toppings = new ArrayList<String>();
				String sauce = ""; 
				Pizza.Sizes size = null; 
				Pizza.Crusts crust = null;
				// add toppings to arraylist if checkbox is selected
				if (pepBox.isSelected()) {toppings.add("Pepperoni");}
				if (beefBox.isSelected()) { toppings.add("Beef"); }
				if (cbBox.isSelected()) {toppings.add("Canadian Bacon"); }
				if (chicBox.isSelected()) {toppings.add("Chicken"); } 
				if (isBox.isSelected()) {toppings.add("Italian Sausage"); }
				if (sausBox.isSelected()) {toppings.add("Sausage"); }
				if (bacBox.isSelected()) {toppings.add("Bacon"); }
				if (bpBox.isSelected()) {toppings.add("Banana Peppers"); } 
				if (boBox.isSelected()) {toppings.add("Black Olives"); } 
				if (jalaBox.isSelected()) {toppings.add("Jalapenos"); } 
				if (mushBox.isSelected()) {toppings.add("Mushrooms"); } 
				if (onBox.isSelected()) {toppings.add("Onions"); }
				if (pineBox.isSelected()) {toppings.add("Pineapple"); } 
				if (gpBox.isSelected()) {toppings.add("Green Peppers"); } 
				// set size
				if (personalBtn.isSelected()) {
					size = Pizza.Sizes.PERSONAL;
				}else if (smallBtn.isSelected()) {
					size = Pizza.Sizes.SMALL;
				}else if (medBtn.isSelected()) {
					size = Pizza.Sizes.MEDIUM; 
				}else if (largeBtn.isSelected()) {
					size = Pizza.Sizes.LARGE; 
				}else if (xlBtn.isSelected()) {
					size = Pizza.Sizes.XL;
				}
				// set sauce
				if (tradBtn.isSelected()) {
					sauce = "Traditional"; 
				}else if (tradBtn.isSelected()) {
					sauce = "Mild";
				}else if (ranchBtn.isSelected()) {
					sauce = "Ranch"; 
				}else if (buffBtn.isSelected()) {
					sauce = "Buffalo";
				}
				// set crust
				if (thinBtn.isSelected()) {
					crust = Pizza.Crusts.THIN;
				}else if (panBtn.isSelected()) {
					crust = Pizza.Crusts.PAN;
				}else if (htBtn.isSelected()) {
					crust = Pizza.Crusts.HANDTOSSED; 
				}else if (gfBtn.isSelected()) {
					crust = Pizza.Crusts.GF;
				}
				// if all needed options are selected, add pizza to order, otherwise display message telling user to add the needed ingredient
				if (sauce.equals("")) {
					JOptionPane.showMessageDialog(null, "Please select a sauce");
				}else if (size == null) {
					JOptionPane.showMessageDialog(null, "Please select a size");
				}else if (crust == null) {
					JOptionPane.showMessageDialog(null, "Please select a crust");
				}else if ((SpecialtyPizzas.Specialties) comboBox.getSelectedItem() == SpecialtyPizzas.Specialties.SELECT_ONE) {
					JOptionPane.showMessageDialog(null, "Please select a specialty");
				}
				else {
					// re-sets the price and the order text and repaints the original frame
					SpecialtyPizzas temp = new SpecialtyPizzas((SpecialtyPizzas.Specialties)comboBox.getSelectedItem(), toppings, sauce, size, crust); 
					order.add(temp);
					price.setText("$" + df.format(order.getPrice()));
					orderToUser.setText(order.printOrder());
					ogFrame.revalidate();
					ogFrame.repaint();
					dispose();
				}
			}
		});
	}
	
}
