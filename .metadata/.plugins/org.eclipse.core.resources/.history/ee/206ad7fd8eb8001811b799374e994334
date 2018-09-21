import java.util.Scanner;
class Hangaman2
{
	public static void main(String a[])
	{
		String word ="AUSTRALIA";
		String guess;
		int i;
		boolean flag = true;
		char cont;
		Scanner scan = new Scanner (System.in);
		System.out.println("Guess a country name having 9 letters");
		guess = scan.next();

		do
		{
			for(i=0;i<=word.length();i++)
			{
				if(word.charAt(i)==guess.charAt(0))				
					flag = true;				
				else				
					flag = false;				
			}
			if(flag)			
				System.out.println("character found at place"+i);			
			else			
				System.out.println("character not found in a word");			
		
			System.out.println("press Y/y to continue and press any other alphabet to exit");
		cont = scan.next().charAt(0);
		}
		while(cont == 'y');
	} 
}