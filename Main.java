import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
This program greets the user with their name
Author Ahmad Zeshan
*/
public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;
	
	JTextField nameInput;

	JButton helloButton;

	JLabel nameLabel;
  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Greeting Program");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

		//initialize the main Jpanel
	  mainPanel = new JPanel();
	  //disable any layout helpers 
	  mainPanel.setLayout(null);

		//initialize the input text field
	 	nameInput = new JTextField();
    
		//set the location and size
	  nameInput.setBounds(200, 100, 400, 25);
		
		//initialize the buttons
		helloButton = new JButton("Say Hello");

		//set the size and location of the button
		helloButton.setBounds(350,350,100,25);

		//Add an action listener to this 
		helloButton.addActionListener(this);

		//set the action commands to the button
		helloButton.setActionCommand("hello");

		//intialize the output
		nameLabel = new JLabel("");
		//set the bounds for the name 
		nameLabel.setBounds(200,200,500,20);

		//add the input bar onto the panel
		mainPanel.add(nameInput);

		//add the butotn to the mainPane
		mainPanel.add(helloButton);
	 
	  //outputs the usersname
		mainPanel.add(nameLabel);
		// add the panel to the window
		frame.add(mainPanel);
	}

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
		if(command.equals("hello")){
			//get the input inside of the text bar
			String nameText = nameInput.getText();
			nameLabel.setText("Hello " + nameText);
		}else{
			nameLabel.setText("");
		}

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
