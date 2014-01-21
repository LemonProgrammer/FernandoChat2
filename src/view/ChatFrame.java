package view;

import javax.swing.JFrame;

import controller.ChatController;

public class ChatFrame extends JFrame
{
	private ChatController baseController;
	private ChatPanel basePanel;
	
	public ChatFrame(ChatController baseController)
	{
		this.baseController = baseController;
		basePanel = new ChatPanel(baseController);
		
		setupFrame();
		
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 400);
		this.setVisible(true);
	}
	
}