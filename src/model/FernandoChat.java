package model;

import java.util.ArrayList;

public class FernandoChat
{
	private ArrayList<String> randomStuff;
	
	public FernandoChat()
	{
		randomStuff = new ArrayList<String>();
		
		FillTheRandomness();
		
	}

	private void FillTheRandomness()
	{
		randomStuff.add("I like turtles");
		randomStuff.add("Yeah, okay, nice weather we're havin today, huh?");
		randomStuff.add("Are you a girl?");
		randomStuff.add("Hey, did it hurt? When you fell from heaven.");
		randomStuff.add("I'm bipolar");
		randomStuff.add("ugh, who beat you with the ugly stick?");
		randomStuff.add("Gotta love them turtles.");
		randomStuff.add("What's your name?");
		randomStuff.add("Can you tell me your name again?");
		randomStuff.add("Nice beiber haircut..........not.");
		randomStuff.add("I'm sorry, was I coming off as mean?");
		randomStuff.add("good.");
		randomStuff.add("soo, how's your day?");
		randomStuff.add("English, can you speak it?");
		randomStuff.add("Now now, let's not be too sassy here.");
		randomStuff.add("I don't care.");
		randomStuff.add("oooh, that tickles. Stop tickling me.");
		randomStuff.add("no, I'm serious here.");
		randomStuff.add("Did you know that penquins have knees?!");
		randomStuff.add("yea, me too.");
		randomStuff.add("Somethin is wrong with you.");
		randomStuff.add("Do you think I'm crazy?");
		randomStuff.add("No, I think you are.");
		randomStuff.add("I am watching you while you're watching me while the other person behind you watching you.");
		randomStuff.add("Blue");
		randomStuff.add("Green");
		randomStuff.add("Red");
		randomStuff.add("Yes");
		randomStuff.add("No");
		randomStuff.add("Sasquatch patties taste good with mayo.");
		randomStuff.add("The fox said to mind your own business.");
		randomStuff.add("Insert random joke here.");
		randomStuff.add("When you choke a smurf, what color does it turn? ");
		randomStuff.add("Is it good if a vacuum really sucks?");
		randomStuff.add("Who was the first person to look at a cow and say, 'I think I'll squeeze these dangly things here, and drink what ever comes out?' ");
		randomStuff.add("Can you cry underwater?");
		randomStuff.add("If Wile E. Coyote had enough money to buy all that ACME stuff, why didn't he just buy dinner?");
		randomStuff.add("If corn oil is made from corn, and vegetable oil is made from vegetables, what is baby oil made from?");
		randomStuff.add("Wearing headphones for just an hour will increase the bacteria in your ear by 700 times.");
		randomStuff.add("Beetles taste like apples, wasps like pine nuts, and worms like fried bacon.");
		
	}
	public String getRandomTopic()
	{
		String randomTopic = "oh, hi there.";
		
		double myRandomNumber = Math.random();
		int randomStuffPosistion = (int) (myRandomNumber * randomStuff.size());
		randomTopic = randomStuff.get(randomStuffPosistion);
		
		return randomTopic;
	}
}
