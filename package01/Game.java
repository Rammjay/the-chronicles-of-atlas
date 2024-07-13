package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
	// Constants for action commands
	  
	private static final String START_ACTION = "start";
	
	private static final String CHOICE_1_ACTION = "c1";
	
	private static final String CHOICE_2_ACTION = "c2";
	
	private static final String CHOICE_3_ACTION = "c3";
	
	private static final String CHOICE_4_ACTION = "c4";
	
	ChoiceHandler cHandler = new ChoiceHandler();
	
	UI ui = new UI();
	
	VisibilityManager vm = new VisibilityManager(ui);
	
	Story story = new Story(this,ui,vm);
	
	String nextPosition1,nextPosition2,nextPosition3,nextPosition4;
	public static void main(String[] args){
		new Game();
	}

	public Game(){
		
        ui.createUI(cHandler);
        story.defaultSetup();
        vm.showTitleScreen();
	}

	// ActionListener implementation for handling user choices

	public class ChoiceHandler implements ActionListener{
		
		//performed action
		
		public void actionPerformed(ActionEvent event) {
			
			String yourChoice = event.getActionCommand();
			
			//switch cases
			
			
			switch(yourChoice) 
			{
			
			//cases
			
			case "start":vm.titleToTown();story.townGate();break;
			
			case "c1" :story.selectPosition(nextPosition1); break;
			
			case "c2" :story.selectPosition(nextPosition2); break;
			
			case "c3" :story.selectPosition(nextPosition3); break;
			
			case "c4" :story.selectPosition(nextPosition4); break;
			}
		}
	}
}
        