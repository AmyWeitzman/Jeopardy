/**
 * @student.info
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */
import java.util.Scanner;
 
public class Jeopardy
{
	Scanner Input = new Scanner(System.in);
	
	String name;
	String sci100;
	String sci200;
	String sci300;
	String sci400;
	String sci500;
	String hist100;
	String hist200;
	String hist300;
	String hist400;
	String hist500;
	String pop100;
	String pop200;
	String pop300;
	String pop400;
	String pop500;
	String geo100;
	String geo200;
	String geo300;
	String geo400;
	String geo500;
	String lit100;
	String lit200;
	String lit300;
	String lit400;
	String lit500;
	String math100;
	String math200;
	String math300;
	String math400;
	String math500;
	int daily1;
	int daily2;
	int daily3;
	int daily4;
	String choose01;
	String home;
	String fav;
	int money = 0;
	String myth600;
	String myth700;
	String myth800;
	String myth900;
	String myth1000;
	String letter600;
	String letter700;
	String letter800;
	String letter900;
	String letter1000;
	String ba600;
	String ba700;
	String ba800;
	String ba900;
	String ba1000;
	String h600;
	String h700;
	String h800;
	String h900;
	String h1000;
	String rt600;
	String rt700;
	String rt800;
	String rt900;
	String rt1000;
	String A600;
	String A700;
	String A800;
	String A900;
	String A1000;
	String finalQ;
	
	public void getInfo()
	{
		System.out.print("Enter your name ---> ");
		name = Input.next();
		System.out.print("Enter the city you are from ---> ");
		home = Input.next();
		System.out.print("Enter one of your favorite things(one word) ---> ");
		fav = Input.next();
	}
	
	public void printCats1()
	{
		System.out.println();
		System.out.println("And the categories are...");
		System.out.println();
		System.out.println("==========================================================================================");
		System.out.println("Science		History		Pop Culture		Geography		Literature		Math");
		System.out.println(" $100		 	 $100		   	   $100			   $100		  $100 		 $100 ");
		System.out.println(" $200		 	 $200		   	   $200			   $200		  $200 		 $200 ");
		System.out.println(" $300		 	 $300		   	   $300			   $300		  $300 		 $300 ");
		System.out.println(" $400		 	 $400		   	   $400			   $400		  $400 		 $400 ");
		System.out.println(" $500		 	 $500		   	   $500			   $500		  $500 		 $500 ");
		System.out.println("===========================================================================================");
		System.out.println();
	}
	
	public void jeopardyRound()
	{
		int i = 0;
		System.out.println("Ok " + name + ", you pick first in the Jeopardy round.");
		System.out.println("When selecting a category, please use the following abbreviations: Science = sci, History = hist, Pop Culture = pop, Geography = geo, Literature = lit, Math = math");
		System.out.println("When selecting an amount, please use the following form: $100 = 100, $200 = 200, $300 = 300, $400 = 400, $500 = 500");
		System.out.println("So, when selecting the category and amount, type in the format of categoryamount(ex: geo100 or pop500).");
		System.out.print("Once you have selected the category and amount, the clue will appear. You will then be able to type in your response. *Remember:\"whatis\" before your response(leave as one long word, such as \"whatispizza\")");
		System.out.print("Warning: the categories board will NOT remove the ones you have used so look through the code to make sure you don't repeat.");
		System.out.println();
		System.out.print("Choose a category and amount ---> ");
		choose01 = Input.next();
		while(i <= 30)
		{
			if(choose01.equals("sci100") == true)
			{
				System.out.println("The positively charged particles in an atom(plural, lowercase)");
				System.out.print("Enter your response ---> ");
				sci100 = Input.next();
				if(sci100.equals("whatisprotons") == true)
				{
					System.out.print("That's correct! ");
					money = money + 100;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 100;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("sci200") == true)
			{
				System.out.println("The system of the body that transports blood throughout the body(no need to put \"system\" in your response, lowercase)");
				System.out.print("Enter your response ---> ");
				sci200 = Input.next();
				if(sci200.equals("whatiscirculatory") == true)
				{
					System.out.println("That's correct! ");
					money = money + 200;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 200;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("sci300") == true)
			{
				System.out.println("The process by which plants produce food(lowercase)");
				System.out.print("Enter your response ---> ");
				sci300 = Input.next();
				if(sci300.equals("whatisphotosynthesis") == true)
				{
					System.out.println("That's correct! ");
					money = money + 300;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 300;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("sci400") == true)
			{
				System.out.println("The elliptical pattern in which planets travel around the sun(singular, lowercase)");
				System.out.print("Enter your response ---> ");
				sci400 = Input.next();
				if(sci400.equals("whatisorbit") == true)
				{
					System.out.println("That's correct! ");
					money = money + 400;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 400;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("sci500") == true)
			{
				System.out.println("Term for animals that consume both plants and meat(singular, lowercase)");
				System.out.print("Enter your response ---> ");
				sci500 = Input.next();
				if(sci500.equals("whatisomnivore") == true)
				{
					System.out.println("That's correct! ");
					money = money + 500;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 500;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("hist100") == true)
			{
				System.out.println("The last name of the first President of the United States(Capitalized)");
				System.out.print("Enter your response ---> ");
				hist100 = Input.next();
				if(hist100.equals("whatisWashington") == true)
				{
					System.out.println("That's correct! ");
					money = money + 100;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 100;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("hist200") == true)
			{
				System.out.println("The ancient people of this civilization mummified their dead(country, Capitalized)");
				System.out.print("Enter your response ---> ");
				hist200 = Input.next();
				if(hist200.equals("whatisEgypt") == true)
				{
					System.out.println("That's correct! ");
					money = money + 200;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 200;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("hist300") == true)
			{
				System.out.println("The last name of the first man to circumnavigate the Earth(Capitalized)");
				System.out.print("Enter your response ---> ");
				hist300 = Input.next();
				if(hist300.equals("whatisMagellan") == true)
				{
					System.out.println("That's correct! ");
					money = money + 300;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 300;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("hist400") == true)
			{
				System.out.println("The last name of the conqueror of the Incas, who resided in Peru(Capitalized)");
				System.out.print("Enter your response ---> ");
				hist400 = Input.next();
				if(hist400.equals("whatisPizarro") == true)
				{
					System.out.println("That's correct! ");
					money = money + 400;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 400;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("hist500") == true)
			{
				System.out.println("The system of social hierarchy in ancient India(no need to put \"system,\" lowercase)");
				System.out.print("Enter your response ---> ");
				hist500 = Input.next();
				if(hist500.equals("whatiscaste") == true)
				{
					System.out.println("That's correct! ");
					money = money + 500;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 500;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("pop100") == true)
			{
				System.out.println("Jennifer Lawrence plays this role in the movie \"The Hunger Games\"(first name only, Capitalized");
				System.out.print("Enter your response ---> ");
				pop100 = Input.next();
				if(pop100.equals("whatisKatniss") == true)
				{
					System.out.println("That's correct! ");
					money = money + 100;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 100;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("pop200") == true)
			{
				System.out.println("Lucille Ball played the role of \"Lucy\" on the old TV show, \"I\" ____ \"Lucy\"(lowercase)");
				System.out.print("Enter your response ---> ");
				pop200 = Input.next();
				if(pop200.equals("whatislove") == true)
				{
					System.out.println("That's correct! ");
					money = money + 200;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 200;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("pop300") == true)
			{
				System.out.println("This rapper came to fame with her hit, \"Fancy\"(first name only, Capitalized)");
				System.out.print("Enter your response ---> ");
				pop300 = Input.next();
				if(pop300.equals("whatisIggy") == true)
				{
					System.out.println("That's correct! ");
					money = money + 300;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 300;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("pop400") == true)
			{
				System.out.println("This term, a text representation of an emotion, was recently named the word of the year(lowercase)");
				System.out.print("Enter your response ---> ");
				pop400 = Input.next();
				if(pop400.equals("whatisemoji") == true)
				{
					System.out.println("That's correct! ");
					money = money + 400;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 400;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("pop500") == true)
			{
				System.out.println("This popular coffee chain's logo includes a mermaid(Capitalized)");
				System.out.print("Enter your response ---> ");
				pop500 = Input.next();
				if(pop500.equals("whatisStarbucks") == true)
				{
					System.out.println("That's correct! ");
					money = money + 500;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 500;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("geo100") == true)
			{
				System.out.println("The lines on a globe running North and South(singular, lowercase)");
				System.out.print("Enter your response ---> ");
				geo100 = Input.next();
				if(geo100.equals("whatislongitude") == true)
				{
					System.out.println("That's correct! ");
					money = money + 100;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");				
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 100;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("geo200") == true)
			{
				System.out.println("This large desert spans most of northern Africa(Capitalized)");
				System.out.print("Enter your response ---> ");
				geo200 = Input.next();
				if(geo200.equals("whatisSahara") == true)
				{
					System.out.println("That's correct! ");
					money = money + 200;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");				
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 200;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("geo300") == true)
			{
				System.out.println("This sea lies between Europe and Africa(no need to put \"sea,\" Capitalized)");
				System.out.print("Enter your response ---> ");
				geo300 = Input.next();
				if(geo300.equals("whatisMediterranean") == true)
				{
					System.out.println("That's correct! ");
					money = money + 300;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 300;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("geo400") == true)
			{
				System.out.println("The capital of the largest country in Asia(Capitalized)");
				System.out.print("Enter your response ---> ");
				geo400 = Input.next();
				if(geo400.equals("whatisMoscow") == true)
				{
					System.out.println("That's correct! ");
					money = money + 400;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 400;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("geo500") == true)
			{
				System.out.println("This U.S. state was formed by volcanic eruptions(Capitalized)");
				System.out.print("Enter your response ---> ");
				geo500 = Input.next();
				if(geo500.equals("whatisHawaii") == true)
				{
					System.out.println("That's correct! ");
					money = money + 500;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 500;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("lit100") == true)
			{
				System.out.println("C.S Lewis was the author this popular children's book series, \"The Chronicles of ___\"(Capitalized)");
				System.out.print("Enter your response ---> ");
				lit100 = Input.next();
				if(lit100.equals("whatisNarnia") == true)
				{
					System.out.println("That's correct! ");
					money = money + 100;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 100;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("lit200") == true)
			{
				System.out.println("This famous British playwright wrote works, such as \"MacBeth,\" \"Hamlet,\" and \"King Lear\"(last name only, Capitalized) ");
				System.out.print("Enter your response ---> ");
				lit200 = Input.next();
				if(lit200.equals("whatisShakespeare") == true)
				{
					System.out.println("That's correct! ");
					money = money + 200;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 200;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("lit300") == true)
			{
				System.out.println("Stephenie Meyer's \"Twilight\" series includes this type of blood sucking creature in human form(singular, lowercase) ");
				System.out.print("Enter your response ---> ");
				lit300 = Input.next();
				if(lit300.equals("whatisvampire") == true)
				{
					System.out.println("That's correct! ");
					money = money + 300;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 300;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("lit400") == true)
			{
				System.out.println("The opening line of the first book in this magical series begins, \"Mr. and Mrs. Dursley, of number four, Privet Drive...\"(Show as one word like this: AmyWeitzman)");
				System.out.print("Enter your response ---> ");
				lit400 = Input.next();
				if(lit400.equals("whatisHarryPotter") == true)
				{
					System.out.println("That's correct! ");
					money = money + 400;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 400;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("lit500") == true)
			{
				System.out.println("Theodor Geisel published children's books under the pen name \"Dr. __\"(Capitalized)");
				System.out.print("Enter your response ---> ");
				lit500 = Input.next();
				if(lit500.equals("whatisSeuss") == true)
				{
					System.out.println("That's correct! ");
					money = money + 500;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 500;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("math100") == true)
			{
				System.out.println("The term for the perimeter of a circle(lowercase)");
				System.out.print("Enter your response ---> ");
				math100 = Input.next();
				if(math100.equals("whatiscircumference") == true)
				{
					System.out.println("That's correct! ");
					money = money + 100;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 100;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("math200") == true)
			{
				System.out.println("Multiplying the length by the width by the height of a cube gives you its this(lowercase)");
				System.out.print("Enter your response ---> ");
				math200 = Input.next();
				if(math200.equals("whatisvolume") == true)
				{
					System.out.println("That's correct! ");
					money = money + 200;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 200;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("math300") == true)
			{
				System.out.println("All the angles of a quadrilateral add up to what number in degrees(just the number)");
				System.out.print("Enter your response ---> ");
				math300 = Input.next();
				if(math300.equals("whatis360") == true)
				{
					System.out.println("That's correct! ");
					money = money + 300;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 300;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("math400") == true)
			{
				System.out.println("Ten percent of 250 is");
				System.out.print("Enter your response ---> ");
				math400 = Input.next();
				if(math400.equals("whatis25") == true)
				{
					System.out.println("That's correct! ");
					money = money + 400;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 400;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("math500") == true)
			{
				System.out.println("DAILY DOUBLE!");
				System.out.print("Enter your wager(integer only)(ex: 300) ---> ");
				daily1 = Input.nextInt();
				System.out.println("Adjacent over Opposite is better known as this mathematical term(3-letter abbreviation, lowercase)");
				System.out.print("Enter your response ---> ");
				math500 = Input.next();
				if(math500.equals("whatiscot") == true)
				{
					System.out.println("That's correct! ");
					money = money + daily1;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - daily1;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else
			{
				System.out.println("The format in which you've typed your response is not acceptable.");
			}
		}
		i += 1;
	}
	
		public void printCats2()
	{
		System.out.println();
		System.out.println("And the categories are...");
		System.out.println();
		System.out.println("============================================================================================");
		System.out.println("Mythology		12-Letters		Before/After		Holidays		Rhyme Time		amAzing");
		System.out.println(" $600		 	 $600		   	   $600			   $600		  $600 		 $600 ");
		System.out.println(" $700		 	 $700		   	   $700			   $700		  $700 		 $700 ");
		System.out.println(" $800		 	 $800		   	   $800			   $800		  $800 		 $800 ");
		System.out.println(" $900		 	 $900		   	   $900			   $900		  $900 		 $900 ");
		System.out.println(" $1000	     $1000		   	   $1000			   $1000		  $1000 		 $1000 ");
		System.out.println("============================================================================================");
		System.out.println();
	}
	
	public void doubleJeopardyRound()
	{
		int i = 0;
		System.out.println("Today's player is " + name + " from " + home + " and one of his/her favorite things is " + fav + ".");
		System.out.println("When selecting a category, please use the following abbreviations: Mythology = myth, 12-Letters = letter, Before/After = ba, Holidays = h, Rhyme Time = rt, amAzing = A");
		System.out.println("When selecting an amount, please use the following form: $600 = 600, $700 = 700, $800 = 800, $900 = 900, $1000 = 1000");
		System.out.println("*Remember: when selecting the category and amount, type in the format of categoryamount(ex: h700 or letter1000).");
		System.out.println("*Remember: place \"whatis\" before your response.(leave as one long word, such as \"whatispizza\")");
		System.out.print("Warning: the categories board will NOT remove the ones you have used so look through the code to make sure you don't repeat.");
		System.out.println();
		System.out.print("Choose a category and amount ---> ");
		choose01 = Input.next();
		while(i <= 30)
		{
			if(choose01.equals("myth600") == true)
			{
				System.out.println("In Greek mythology, the ruler of the Gods is__(Capitalized)");
				System.out.print("Enter your response ---> ");
				myth600 = Input.next();
				if(myth600.equals("whatisZeus") == true)
				{
					System.out.print("That's correct! ");
					money = money + 600;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 600;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("myth700") == true)
			{
				System.out.println("The Gods live on Mount__(Capitalized)");
				System.out.print("Enter your response ---> ");
				myth700 = Input.next();
				if(myth700.equals("whatisOlympus") == true)
				{
					System.out.println("That's correct! ");
					money = money +700;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 700;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("myth800") == true)
			{
				System.out.println("Hades is the God of this place of the dead(Capitalized)");
				System.out.print("Enter your response ---> ");
				myth800 = Input.next();
				if(myth800.equals("whatisUnderworld") == true)
				{
					System.out.println("That's correct! ");
					money = money + 800;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 800;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("myth900") == true)
			{
				System.out.println("In Roman mythology, this God of the Sea also gives his name to a planet(Capitalized)");
				System.out.print("Enter your response ---> ");
				myth900 = Input.next();
				if(myth900.equals("whatisNeptune") == true)
				{
					System.out.println("That's correct! ");
					money = money + 900;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 900;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("myth1000") == true)
			{
				System.out.println("Term for a creature that is half human, half horse(lowercase)");
				System.out.print("Enter your response ---> ");
				myth1000 = Input.next();
				if(myth1000.equals("whatiscentaur") == true)
				{
					System.out.println("That's correct! ");
					money = money + 1000;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 1000;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("letter600") == true)
			{
				System.out.println("B: the 200th anniversary of an event(lowercase)");
				System.out.print("Enter your response ---> ");
				letter600 = Input.next();
				if(letter600.equals("whatisbicentennial") == true)
				{
					System.out.println("That's correct! ");
					money = money + 600;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 600;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("letter700") == true)
			{
				System.out.println("E: a large reference book of everthing(lowercase)");
				System.out.print("Enter your response ---> ");
				letter700 = Input.next();
				if(letter700.equals("whatisencyclopedia") == true)
				{
					System.out.println("That's correct! ");
					money = money + 700;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 700;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("letter800") == true)
			{
				System.out.println("P: corresponding in size and amount(lowercase)");
				System.out.print("Enter your response ---> ");
				letter800 = Input.next();
				if(letter800.equals("whatisproportional") == true)
				{
					System.out.println("That's correct! ");
					money = money + 800;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 800;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("letter900") == true)
			{
				System.out.println("S: one who studies earthquakes(lowercase)");
				System.out.print("Enter your response ---> ");
				letter1000 = Input.next();
				if(letter1000.equals("whatisseismologist") == true)
				{
					System.out.println("That's correct! ");
					money = money + 900;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 900;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("letter1000") == true)
			{
				System.out.println("T: branch of mathematics dealing with angles of triangles(lowercase)");
				System.out.print("Enter your response ---> ");
				letter1000 = Input.next();
				if(letter1000.equals("whatistrigonometry") == true)
				{
					System.out.println("That's correct! ");
					money = money + 1000;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 1000;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("ba600") == true)
			{
				System.out.println("cookie topping eaten by chipmunks(lowercase, make all one word)");
				System.out.print("Enter your response ---> ");
				ba600 = Input.next();
				if(ba600.equals("whatischocolatechipanddale") == true)
				{
					System.out.println("That's correct! ");
					money = money + 600;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 600;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("ba700") == true)
			{
				System.out.println("sports shirt worn by touchdown scorers on the Northeaster coast(lowercase, make all one word)");
				System.out.print("Enter your response ---> ");
				ba700 = Input.next();
				if(ba700.equals("whatisfootballjerseyshore") == true)
				{
					System.out.println("That's correct! ");
					money = money + 700;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 700;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("ba800") == true)
			{
				System.out.println("something pink and fluffy eaten at fairs molded in to a hard stick(lowercase, make all one word)");
				System.out.print("Enter your response ---> ");
				ba800 = Input.next();
				if(ba800.equals("whatiscottoncandybar") == true)
				{
					System.out.println("That's correct! ");
					money = money + 800;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 800;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("ba900") == true)
			{
				System.out.println("clasp on strap worn around space rocks' waists to hold their pants up(lowercase, make all one word)");
				System.out.print("Enter your response ---> ");
				ba900 = Input.next();
				if(ba900.equals("whatisasteroidbeltbuckle") == true)
				{
					System.out.println("That's correct! ");
					money = money + 900;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 900;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("ba1000") == true)
			{
				System.out.println("DAILY DOUBLE!");
				System.out.print("Enter your wager(integer only)(ex: 300) ---> ");
				daily2 = Input.nextInt();
				System.out.println("\"Give me liberty or give me death!\"said by the assembly line promoter and car company owner(lowercase, make all one word)");
				System.out.print("Enter your response ---> ");
				ba1000 = Input.next();
				if(ba1000.equals("whatispatrickhenryford") == true)
				{
					System.out.println("That's correct! ");
					money = money + daily2;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - daily2;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("h600") == true)
			{
				System.out.println("Sunday in April celebrated with eggs hunts(Capitalized)");
				System.out.print("Enter your response ---> ");
				h600 = Input.next();
				if(h600.equals("whatisEaster") == true)
				{
					System.out.println("That's correct! ");
					money = money + 600;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");				
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 600;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("h700") == true)
			{
				System.out.println("Celebrated on the fourth Thursday of November with a large feast(Capitalized)");
				System.out.print("Enter your response ---> ");
				h700 = Input.next();
				if(h700.equals("whatisThanksgiving") == true)
				{
					System.out.println("That's correct! ");
					money = money + 700;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");				
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 700;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("h800") == true)
			{
				System.out.println("December 7th honors the peopel involved in the bombing of this harbor(no need to put \"Harbor,\"Capitalized)");
				System.out.print("Enter your response ---> ");
				h800 = Input.next();
				if(h800.equals("whatisPearl") == true)
				{
					System.out.println("That's correct! ");
					money = money + 800;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 800;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("h900") == true)
			{
				System.out.println("Honors working men and women with a day off in September(no need to put \"Day,\"Capitalized)");
				System.out.print("Enter your response ---> ");
				h900 = Input.next();
				if(h900.equals("whatisLabor") == true)
				{
					System.out.println("That's correct! ");
					money = money + 900;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 900;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("h1000") == true)
			{
				System.out.println("DAILY DOUBLE!");
				System.out.print("Enter your wager(integer only)(ex: 300) ---> ");
				daily3 = Input.nextInt();
				System.out.println("Day dedicated to planting trees, not to be confused with Earth Day(no need to put \"Day,\"Capitalized)");
				System.out.print("Enter your response ---> ");
				h1000 = Input.next();
				if(h1000.equals("whatisArbor") == true)
				{
					System.out.println("That's correct! ");
					money = money + daily3;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - daily3;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("rt600") == true)
			{
				System.out.println("Smelly creature that says \"Whoooooo\"(lowercase, make all one word)");
				System.out.print("Enter your response ---> ");
				rt600 = Input.next();
				if(rt600.equals("whatisfoulowl") == true)
				{
					System.out.println("That's correct! ");
					money = money + 600;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 600;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("rt700") == true)
			{
				System.out.println("A peculiar back of a car or body without \"end\"(lowercase, make all one word) ");
				System.out.print("Enter your response ---> ");
				rt700 = Input.next();
				if(rt700.equals("whatisqueerrear") == true)
				{
					System.out.println("That's correct! ");
					money = money + 700;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 700;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("rt800") == true)
			{
				System.out.println("A dejected purple fruit(lowercase, make all one word) ");
				System.out.print("Enter your response ---> ");
				rt800 = Input.next();
				if(rt800.equals("whatisglumplum") == true)
				{
					System.out.println("That's correct! ");
					money = money + 800;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 800;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("rt900") == true)
			{
				System.out.println("A large brass instrument all by itself(lowercase, make all one word)");
				System.out.print("Enter your response ---> ");
				rt900 = Input.next();
				if(rt900.equals("whatislonetrombone") == true)
				{
					System.out.println("That's correct! ");
					money = money + 900;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 900;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("rt1000") == true)
			{
				System.out.println("A sad sneaker(lowercase, make all one word)");
				System.out.print("Enter your response ---> ");
				rt1000 = Input.next();
				if(rt1000.equals("whatisblueshoe") == true)
				{
					System.out.println("That's correct! ");
					money = money + 1000;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 1000;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("A600") == true)
			{
				System.out.println("Ancient civilizations were able to build brick houses made out of this material(lowercase)");
				System.out.print("Enter your response ---> ");
				A600 = Input.next();
				if(A600.equals("whatisadobe") == true)
				{
					System.out.println("That's correct! ");
					money = money + 600;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 600;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("A700") == true)
			{
				System.out.println("Part of the body intestines and stomach(lowercase)");
				System.out.print("Enter your response ---> ");
				A700 = Input.next();
				if(A700.equals("whatisabdomen") == true)
				{
					System.out.println("That's correct! ");
					money = money + 700;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 700;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("A800") == true)
			{
				System.out.println("State of social disorder due to lack of government/authority(lowercase)");
				System.out.print("Enter your response ---> ");
				A800 = Input.next();
				if(A800.equals("whatisanarchy") == true)
				{
					System.out.println("That's correct! ");
					money = money + 800;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 800;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("A900") == true)
			{
				System.out.println("Having a shape that reduces air resistance(lowercase)");
				System.out.print("Enter your response ---> ");
				A900 = Input.next();
				if(A900.equals("whatisaerodynamic") == true)
				{
					System.out.println("That's correct! ");
					money = money + 900;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 900;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else if(choose01.equals("A1000") == true)
			{
				System.out.println("small air sacs in lungs where exchange of gases takes places(lowercase, plural)");
				System.out.print("Enter your response ---> ");
				A1000 = Input.next();
				if(A1000.equals("whatisalveoli") == true)
				{
					System.out.println("That's correct! ");
					money = money + 1000;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - 1000;
					System.out.print("Your total is now $" + money);
					System.out.println(". Pick again.");
				}
				System.out.print("Choose a category and amount ---> ");
				choose01 = Input.next();
			}
			else
			{
				System.out.println("The format in which you've typed your response is not acceptable.");
			}
		}
		i += 1;
	}
	
	public void finalJeopardy()
	{
		System.out.println("Now it's time to play FINAL JEOPARDY! The category is \"Restaurants\"");
		System.out.println("Ok " + name + ", make your wager.");
		System.out.print("Enter your wager(integer only)(ex: 300) ---> ");
		daily4 = Input.nextInt();
		System.out.println("Ok, here's the clue...");
		System.out.println("This restaurant chain began making their famous roast beef sandwiches in 1964.(Capitalize, no punctuations if possessive)");
		System.out.print("Enter your response ---> ");
		finalQ = Input.next();
				if(finalQ.equals("whatisArby") == true)
				{
					System.out.println("That's correct! ");
					money = money + daily4;
					System.out.println("Your earned an extra $" + money);
					System.out.println("Thanks for playing. See you tomorrow.");					
				}
				else
				{
					System.out.println("Sorry, your response was incorrect. ");
					money = money - daily4;
					System.out.println("Your earned an extra $" + money);
					System.out.println("Thanks for playing. See you tomorrow.");
				}
	}
	
	public void getTotal(int total1, int total2, int total3)
	{
		int total = total1 + total2 + total3;
		System.out.println("Congratulations! Your won a total of $" + total + ".");  
	}
}

/*
RUN OUTPUT:

*/