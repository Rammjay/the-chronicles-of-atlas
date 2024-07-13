package package01;

public class VisibilityManager {
	UI ui;
	public VisibilityManager(UI userInterface) {
		ui= userInterface;
	}
	
	//title screen show
	
	public void showTitleScreen() {
		
		// show the title
		ui.titleNamePanel.setVisible(true);
		ui.startButtonPanel.setVisible(true);
		
		//hide the game screen
		ui.mainTextPanel.setVisible(false);
		
		ui.choiceButtonPanel.setVisible(false);
		
		ui.playerPanel.setVisible(false);
	}
	
	//title to town
	
public void titleToTown() {
		
		// hide the title
		ui.titleNamePanel.setVisible(false);
		ui.startButtonPanel.setVisible(false);
		
		//show the game screen
		ui.mainTextPanel.setVisible(true);
		
		ui.choiceButtonPanel.setVisible(true);
		
		ui.playerPanel.setVisible(true);
	}
	

}
