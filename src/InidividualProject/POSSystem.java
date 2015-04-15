package InidividualProject;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class POSSystem extends JFrame {
	public static final long serialVersionUID=138938122;

	   private int flavorCount = 0;
	   private int decoratorCount = 0;
	   
	   private IceCream icecream;
	   
	   private ArrayList<Flavor> FlavorOptions = new ArrayList<Flavor>(10);
	   private ArrayList<Decorator> DecoratorOptions = new ArrayList<Decorator>(10);
	
	public POSSystem(){
        super();

     } 
	
	public void addFlavorButton(String name, int price)
	{
        FlavorOptions.add(new Flavor(name, price));
        flavorCount++;
	}
	
	public void addDecoratorButton(String name, int price)
	{
		DecoratorOptions.add(new Decorator(name, price));
		decoratorCount++;
	}
	
	public void setAdminLayout()
	{
		Container container =  getContentPane();
		container.removeAll();
		
        container.setLayout(new GridLayout( 3, 0 ));
        
    	final JLabel result = new JLabel("");
        
        JPanel jp = new JPanel();
        container.add(jp, BorderLayout.NORTH);
    	JLabel label1 = new JLabel("Ice-Cream Flavor");
    	jp.add(label1);
    	
    	final JTextField input1 = new JTextField(5);
    	input1.setBounds(100,20,100,20);
    	jp.add(input1);
    	
    	JLabel label2 = new JLabel("Price");
    	jp.add(label2);
    	
    	final JTextField input2 = new JTextField(5);
    	input2.setBounds(100,20,100,20);
    	jp.add(input2);
    	
    	JButton button1 = new JButton("add new Ice-Cream Flavor");
    	button1.addActionListener(new ActionListener() { 
    		  public void actionPerformed(ActionEvent e) { 
    			  	addFlavorButton(input1.getText(), Integer.parseInt(input2.getText()));
    			  	result.setText("new ice-Cream Flavor " + input1.getText() + " is created");
    			  } 
    			} );
    	jp.add(button1);
    	
        JPanel jp2 = new JPanel();
        container.add(jp2, BorderLayout.CENTER);
    	JLabel label3 = new JLabel("Decorator");
    	jp2.add(label3);
    	
    	final JTextField input3 = new JTextField(5);
    	input3.setBounds(100,20,100,20);
    	jp2.add(input3);
    	
    	JLabel label4 = new JLabel("Price");
    	jp2.add(label4);
    	
    	final JTextField input4 = new JTextField(5);
    	input4.setBounds(100,20,100,20);
    	jp2.add(input4);
    	
    	JButton button2 = new JButton("add new Decorator");
    	button2.addActionListener(new ActionListener() { 
    		  public void actionPerformed(ActionEvent e) { 
	    			  addDecoratorButton(input3.getText(), Integer.parseInt(input4.getText()));
	    			  result.setText("new decorator " + input3.getText() + " is created");
    			  } 
    			} );
    	jp2.add(button2);

        JPanel jp3 = new JPanel();
        container.add(jp3, BorderLayout.SOUTH);
        
    	JButton button = new JButton("Back to Main Page");
    	button.addActionListener(new ActionListener() { 
    		  public void actionPerformed(ActionEvent e) { 
    			    setLayout();
    			  } 
    			} );
    	jp3.add(button);
    	
    	jp3.add(result);
    	
        setSize( 900, 600 );
        setVisible( true );
	}
	

	public void setLayout()
	{
		Container container =  getContentPane();
		container.removeAll();
		this.setTitle("POS System");
		
        container.setLayout(new GridLayout( 0, 3 ));

        JPanel jp = new JPanel(new GridLayout(flavorCount+1, 0));
        
        container.add(jp, BorderLayout.WEST);
        
    	JLabel label1 = new JLabel("Ice-Cream Flavor", SwingConstants.CENTER);
    	jp.add(label1);
        
        for (int i = 0; i < FlavorOptions.size();i++)
        {
        	JButton button = new JButton("[" + (i+1) + ". " + FlavorOptions.get(i).getDescription() + " , $" + FlavorOptions.get(i).getPrice() + "]");
        	button.addActionListener(new ActionListener() { 
        		  public void actionPerformed(ActionEvent e) { 
        			  	String buttonText = ((JButton)e.getSource()).getText();
        			  	icecream = new IceCreamMaker(FlavorOptions.get(Integer.valueOf(buttonText.substring(1,2))-1));
        			    setLayout();
        			  } 
        			} );
        	jp.add(button);
        }
        
        JPanel jp2 = new JPanel(new GridLayout(decoratorCount+1, 0));
        
        container.add(jp2, BorderLayout.CENTER);
        
        JLabel label2 = new JLabel("Decorator", SwingConstants.CENTER);
    	jp2.add(label2);
        
        for (int i = 0; i < DecoratorOptions.size();i++)
        {
        	JButton button = new JButton("["  + (i+1) + ". " +  DecoratorOptions.get(i).getDescription() + " ,$" + DecoratorOptions.get(i).getPrice() + "]");
        	button.addActionListener(new ActionListener() { 
      		  public void actionPerformed(ActionEvent e) { 
      			    String buttonText = ((JButton)e.getSource()).getText();
      			    if (icecream != null)
      			    {
      			    	icecream = new IceCreamDecoratorMaker(icecream, DecoratorOptions.get(Integer.valueOf(buttonText.substring(1,2))-1));
      			    }
      			    setLayout();
      			  } 
      			} );
        	jp2.add(button);
        }
        
        JPanel jp3 = new JPanel(new GridLayout(3, 0));
        
        container.add(jp3, BorderLayout.EAST);
        
    	JButton button = new JButton("New Ice Cream");
    	button.addActionListener(new ActionListener() { 
  		  public void actionPerformed(ActionEvent e) { 
  			  	icecream = new IceCreamMaker();
  			  	setLayout();
  			  } 
  			} );
    	jp3.add(button);
    	
    	JLabel lbIceCream = new JLabel();
    	if(icecream != null)
    	{
    		if (icecream.getDescription() == "")
    		{
    			lbIceCream.setText("Please choose flavor & decorator");
    		}
    		else
    		{
    			lbIceCream.setText("<html>" + icecream.getDescription() + " Ice-Cream<br>Total: " + String.valueOf(icecream.getPrice()) + "</html>");
    		}
    	}
    	jp3.add(lbIceCream);

    	JButton adminButton = new JButton("System Administrator");
    	adminButton.addActionListener(new ActionListener() { 
  		  public void actionPerformed(ActionEvent e) { 
  			    setAdminLayout();
  			  } 
  			} );
    	jp3.add(adminButton);
        

        setSize( 900, 600 );
        setVisible( true );
	}
	
public static void main(String[] args) {
		POSSystem pos = new POSSystem();
		
		pos.addFlavorButton("Chocolate", 20);
		pos.addFlavorButton("Vanilla", 25);
		
		pos.addDecoratorButton("M&M", 5);
		pos.addDecoratorButton("Stawberry", 4);
		
		pos.setLayout();
		
	}
}
