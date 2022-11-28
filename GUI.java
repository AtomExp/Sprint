import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class GUI extends JPanel implements ActionListener, ItemListener {

	//Implements window and panel
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	
	//Implements static dropboxes for crust and size
	static JComboBox crustBox;
	static JComboBox sizeBox;
	
	//Label for testing
	static JLabel pizzaLabel;
	
	//Variables for pizza customization
	static String topping1 = "", topping2 = "", topping3 = "", topping4 = "";
	static String crust = "Thin";
	static String size = "Small";
	
	//Various Pizza toppings as checkboxes
	static JCheckBox top1 = new JCheckBox("Cheese");
	static JCheckBox top2 = new JCheckBox("Pepperoni");
	static JCheckBox top3 = new JCheckBox("Sausage");
	static JCheckBox top4 = new JCheckBox("Ham");
	static JCheckBox top5 = new JCheckBox("Green Pepper");
	static JCheckBox top6 = new JCheckBox("Onion");
	static JCheckBox top7 = new JCheckBox("Tomato");
	static JCheckBox top8 = new JCheckBox("Mushroom");
	static JCheckBox top9 = new JCheckBox("Pineapple");	
	
    public static void main(String[] args) {
    	
    	//Basic framework for application
    	GUI gui = new GUI();
    	frame.setSize(1500, 1000);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    	frame.add(panel);
    	
    	panel.setLayout(null);
    	
    	//creating crust label
    	JLabel crustLabel = new JLabel("Crusts");
    	crustLabel.setFont(new Font("Serif", Font.PLAIN, 24));
    	panel.add(crustLabel);
    	
    	//creating size label
    	JLabel sizeLabel = new JLabel("Sizes");
    	sizeLabel.setFont(new Font("Serif", Font.PLAIN, 24));
    	panel.add(sizeLabel);
    	
    	//creating topping label;
    	JLabel toppingsLabel = new JLabel("Toppings");
    	toppingsLabel.setFont(new Font("Serif", Font.PLAIN, 24));
    	panel.add(toppingsLabel);
    	
    	//creating pizza label
    	pizzaLabel = new JLabel("pizza");
    	toppingsLabel.setFont(new Font("Serif", Font.PLAIN, 24));
    	panel.add(pizzaLabel);
    	
    	//setting location of labels
    	crustLabel.setBounds(100, 200, 200, 25);
    	sizeLabel.setBounds(100, 400, 200, 25);
    	toppingsLabel.setBounds(100, 600, 200, 25);
    	pizzaLabel.setBounds(1000, 800, 500, 100);
    	
    	//creating crust dropbox
    	String crusts[] = { "Thin", "Regular", "Pan"};
    	crustBox = new JComboBox(crusts);
    	crustBox.setSelectedIndex(0);
    	crustBox.addItemListener(gui);
    	crustBox.setEditable(true);
    	panel.add(crustBox);
    	
    	//creating size dropbox
    	String sizes[] = { "Small", "Medium", "Large", "Extra Large"};
    	sizeBox = new JComboBox(sizes);
    	sizeBox.setSelectedIndex(0);
    	sizeBox.addItemListener(gui);
    	sizeBox.setEditable(true);
    	panel.add(sizeBox);
    	
    	//creating topping checkboxes
        panel.add(top1);
        panel.add(top2);
        panel.add(top3);
        panel.add(top4);
        panel.add(top5);
        panel.add(top6);
        panel.add(top7);
        panel.add(top8);
        panel.add(top9);
        top1.setBounds(300, 600, 100, 50);
        top2.setBounds(400, 600, 100, 50);
        top3.setBounds(500, 600, 100, 50);
        top4.setBounds(300, 650, 50, 50);
        top5.setBounds(380, 650, 120, 50);
        top6.setBounds(500, 650, 100, 50);
        top7.setBounds(300, 700, 100, 50);
        top8.setBounds(400, 700, 100, 50);
        top9.setBounds(500, 700, 100, 50);
    	
        //setting location of dropboxes
    	crustBox.setBounds(300, 200, 200, 25);
    	sizeBox.setBounds(300, 400, 200, 25);
    	
    	frame.setVisible(true);
    }
 
    /** Listens to the combo box. */
    public void actionPerformed(ActionEvent e) {

    }

	@Override
	public void itemStateChanged(ItemEvent e) {

		//keep track of pizza combination
		if(e.getSource() == crustBox) {
			crust = (String) crustBox.getSelectedItem();
		}
		if(e.getSource() == sizeBox) {
			size = (String) sizeBox.getSelectedItem();
		}
		
		//set pizza text to refence pizza
		pizzaLabel.setText("You have a " + size + ", " + crust + " pizza");
	}

} 