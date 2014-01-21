package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import model.FernandoChat;
import controller.ChatController;

public class ChatPanel extends JPanel
{

	private SpringLayout baseLayout;
	private SpringLayout baseLayout_1;
	private JButton chatButton;
	private JTextField userTextField;
	private JTextArea chatArea;
	private JTextArea chatArea_1;
	private ChatController baseController;
	private FernandoChat appBot;
	private JScrollPane chatPane;

	public ChatPanel(ChatController baseController)
	{
		this.baseController = baseController;
		this.appBot = baseController.getAppBot();

		chatButton = new JButton("Click here to go on an awesome magical journey!");
		baseLayout = new SpringLayout();
		userTextField = new JTextField(30);
		chatArea = new JTextArea(10, 30);
		chatPane = new JScrollPane(chatArea);

	
		setupPanel();
		setupLayout();
		setupListeners();

		setupChat();
	}
	
	private void setupChat()
	{
		chatArea.setText(appBot.getRandomTopic());
	}
	
	private void setupPanel()
	{

		this.setLayout(baseLayout);
		this.setBackground(Color.BLUE);
		
		this.add(chatButton);
		this.add(userTextField);
		this.add(chatPane);
		
		chatArea.setWrapStyleWord(true);
		chatArea.setLineWrap(true);
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = userTextField.getText();
				chatArea.append(appBot.getRandomTopic() + "\n");
				chatButton.setText("you broke it :( ");
				

			}
		});
		userTextField.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent typed)
			{
				String userInput = userTextField.getText();
				chatArea.append(userInput);
				chatArea.append("\n" + " ");
				chatArea.setBackground(Color.RED);
				chatArea.append(appBot.getRandomTopic() + "\n");
				userTextField.setText("");
				userTextField.setToolTipText("Type here to chat");

			}
		});

	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, chatButton, 8, SpringLayout.SOUTH, userTextField);
		baseLayout.putConstraint(SpringLayout.WEST, userTextField, 102, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatButton, 91, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatArea, 9, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatArea, 103, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, userTextField, 8, SpringLayout.SOUTH, chatPane);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 8, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 102, SpringLayout.WEST, this);
	}

}
