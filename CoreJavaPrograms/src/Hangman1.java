import java.util.Scanner;
import java.util.Random;
public class Hangman1
{
	public static void main(String a[])
	{
		String word[] = {"japan","australia","europe","america","africa","india"};
		String guess, temp;
		boolean flag = true;
		//char cont;		
		Random rd=new Random();
		int rnd =rd.nextInt(6);
		int len = word[rnd].length();
		char crt []=new char[len];
		StringBuffer wrg =new StringBuffer();

		do
		{	flag=false;
			Scanner scan = new Scanner (System.in);
			System.out.println("\n\nGuess a country name having "+len+" letters AND TYPE "+"end"+" To Exit");
			guess = scan.next();
			for(int i=0;i<len;i++)
			{
				if(word[rnd].charAt(i)==guess.charAt(0))
				{		
					flag = true;
					crt[i]= guess.charAt(0);
					
				}
			}
			if(flag)
			{
				System.out.println("\n\n character found at place\n\n");
				
			}
			else
			{
				wrg.append(guess+",");
				System.out.println("\n\n\n character not found in a word \n misses are :- "+wrg);
			}
			for(int i=0;i<len;i++)
				{
				if(crt[i] ==word[rnd].charAt(i))	
				System.out.print(crt[i]);
				else
					System.out.print("_ ");
				}
			temp = new String(crt);
			//System.out.println("\n\n\n press Y/y to try again and press any other key to exit");
		
			//cont = scan.next().charAt(0);
		}
		while(!word[rnd].equals(temp) && !guess.equals("end"));
		//while(cont=='y' || cont=='Y');
	}
}