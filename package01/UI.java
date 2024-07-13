package package01;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import package01.Game.ChoiceHandler;

import javax.swing.JPanel;

public class UI{
	JFrame window;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel; 
	JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel,weaponNameLabel;	
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 50);
	Font titleFont1 = new Font("Times New Roman", Font.PLAIN, 60);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
	
	

	public void createUI(ChoiceHandler cHandler){
		
		//window

		window = new JFrame();
		
		window.setSize(800,600);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		
		
		//title screen
		titleNamePanel = new JPanel();
		
		titleNamePanel.setBounds(100,100,600,500);
		titleNamePanel.setBackground(Color.black);
	
		titleNameLabel = new JLabel("CHRONICLES OF ");
		titleNameLabel.setForeground(Color.white);
		JLabel titleNameLabel1 = new JLabel("ATLAS");
		titleNameLabel1.setForeground(Color.yellow);
		
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);
		titleNameLabel1.setFont(titleFont1);
		titleNamePanel.add(titleNameLabel1);
		
		
		//startbutton
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300,400,200,100);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START");
		
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		
		startButton.setFont(normalFont);
		
		startButton.setFocusPainted(false);
		startButton.addActionListener(cHandler);
		
		startButton.setActionCommand("start");
		
		startButtonPanel.add(startButton);
		startButtonPanel.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	startButtonPanel.setBackground(Color.green); // Set to green

		        // Create a separate thread to change color back after 1 second
		        new Thread(() -> {
		            try {
		                Thread.sleep(100); // Delay for .1 second
		                startButtonPanel.setBackground(Color.black); // Set back to black
		            } catch (InterruptedException e1) {
		                // Handle interruption (optional)
		            }
		        }).start();
		    }
		});
		
		window.add(titleNamePanel);
		
		window.add(startButtonPanel);

		// GAME SCREEN
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250); 
		
		mainTextPanel.setBackground (Color.black); 
		
		window.add(mainTextPanel);
		
		// maintextarea
		
		mainTextArea = new JTextArea("This is the main text area"); 
		
		mainTextArea.setBounds (100, 100, 600, 250);
		mainTextArea.setBackground (Color.black); 
		mainTextArea.setForeground (Color.white); 
		
		mainTextArea.setFont(normalFont); 
		
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		
		mainTextArea.setEditable(false); 
		
		mainTextPanel.add(mainTextArea);
		
		
		//buttons
		
		choiceButtonPanel = new JPanel(); 
		
		choiceButtonPanel.setBounds (250, 350, 300, 150); 
		
		choiceButtonPanel.setBackground (Color.black); 
		
		choiceButtonPanel.setLayout(new GridLayout(4,1)); 
		
		window.add(choiceButtonPanel);
		
		//choice1
		
		choice1 = new JButton("choice1"); 
		
		choice1.setBackground (Color.black); 
		choice1.setForeground (Color.white); 
		
		choice1.setFont(normalFont);
		
		choice1.setFocusPainted(false);
		
		choice1.addActionListener(cHandler);
		choice1.setActionCommand("c1");
		
		choiceButtonPanel.add(choice1);
		
		choice1.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		    	// Set to green
		    	
		        choice1.setBackground(Color.green); 

		        // Create a separate thread to change color back after 1 second
		        new Thread(() -> {
		            try {
		            	// Delay for .1 second
		            	
		            	
		                Thread.sleep(100); 
		                
		                // Set back to black
		                
		                choice1.setBackground(Color.black); 
		            } catch (InterruptedException e1) {
		                // Handle interruption (optional)
		            }
		        }).start();
		    }
		});

		
		//choice2
		
		choice2 = new JButton("choice2"); 
		
		choice2.setBackground (Color.black); 
		choice2.setForeground (Color.white); 
		
		choice2.setFont(normalFont);
		
		choice2.setFocusPainted(false);
		choice2.addActionListener(cHandler);
		
		choice2.setActionCommand("c2");
		
		choiceButtonPanel.add(choice2);
		choice2.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		    	// Set to green
		    	
		        choice2.setBackground(Color.green); 

		        // Create a separate thread to change color back after 1 second
		        new Thread(() -> {
		            try {
		            	
		                // Delay for .1 second
		            	
		            	Thread.sleep(100); 
		            	
		                // Set back to black
		            	
		                choice2.setBackground(Color.black); 
		                
		            } catch (InterruptedException e1) {
		                // Handle interruption (optional)
		            }
		        }).start();
		    }
		});
		
		//choice3
		
		choice3 = new JButton("choice3"); 
		
		choice3.setBackground (Color.black); 
		choice3.setForeground (Color.white); 
		
		choice3.setFont(normalFont);
		
		choice3.setFocusPainted(false);
		
		choice3.addActionListener(cHandler);
		choice3.setActionCommand("c3");
		
		choiceButtonPanel.add(choice3);
		
		choice3.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		    	// Set to green
		        choice3.setBackground(Color.green); 
		        

		        // Create a separate thread to change color back after 1 second
		        new Thread(() -> {
		            try {
		            	// Delay for .1 second
		            	
		                Thread.sleep(100); 
		                
		                // Set back to black
		                
		                choice3.setBackground(Color.black); 
		            } catch (InterruptedException e1) {
		                // Handle interruption (optional)
		            }
		        }).start();
		    }
		});
		//choice4
		
		choice4 = new JButton("choice4"); 
		
		choice4.setBackground (Color.black); 
		choice4.setForeground (Color.white); 
		
		choice4.setFont(normalFont);
		
		choice4.setFocusPainted(false);
		
		choice4.addActionListener(cHandler);
		choice4.setActionCommand("c4");
		
		choiceButtonPanel.add(choice4);
		choice4.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        choice4.setBackground(Color.green); // Set to green

		        // Create a separate thread to change color back after 1 second
		        new Thread(() -> {
		            try {
		                Thread.sleep(100); // Delay for .1 second
		                choice4.setBackground(Color.black); // Set back to black
		            } catch (InterruptedException e1) {
		                // Handle interruption (optional)
		            }
		        }).start();
		    }
		});
		
		//playerpanel
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100, 15, 600, 50); 
		playerPanel.setBackground (Color.black); 
		playerPanel.setLayout(new GridLayout(1,4)); 
		
		window.add(playerPanel);
		
		//health
		
		hpLabel= new JLabel("HP: "); 
		hpLabel.setFont(normalFont); 
		hpLabel.setForeground (Color.white); 
		
		playerPanel.add(hpLabel); 
		
		hpNumberLabel = new JLabel(); 
		hpNumberLabel.setForeground (Color.white); 
		hpNumberLabel.setFont(normalFont);
		
		playerPanel.add(hpNumberLabel);
		
		weaponLabel= new JLabel("Weapon: "); 
		weaponLabel.setForeground (Color.white);
		weaponLabel.setFont(normalFont);
		
		playerPanel.add(weaponLabel);
		
		weaponNameLabel= new JLabel();
		weaponNameLabel.setForeground (Color.white); 
		weaponNameLabel.setFont(normalFont); 
		
		playerPanel.add(weaponNameLabel);
		
		
		window.setVisible(true);
	}

}