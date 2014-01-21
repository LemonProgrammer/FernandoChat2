package controller;

import model.FernandoChat;
import view.ChatFrame;

public class ChatController
{
	private ChatFrame appFrame;
	private FernandoChat appBot;
	
	public ChatController()
	{
		appBot = new FernandoChat();
	}
	public ChatFrame getAppFrame()
	{
		return appFrame;
	}
	public void setAppFrame(ChatFrame appFrame)
	{
		this.appFrame = appFrame;
	}
	public FernandoChat getAppBot()
	{
		return appBot;
	}
	public void setAppBot(FernandoChat appBot)
	{
		this.appBot = appBot;
	}
	
	public void start()
	{
		appFrame = new ChatFrame(this);
	}
}