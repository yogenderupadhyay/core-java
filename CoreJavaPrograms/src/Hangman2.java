import java.util.Scanner;
import java.util.Random;
class Hangman3
{
	public static void main(String[] a)
	{
		String word[] = {"japan","qatar","syria","mongolia","bahrain","india"};
		int len,rnd,i,count=0,flag=0;
		String choice,temp;
		Random rd=new Random();
		Scanner input=new Scanner(System.in);
		rnd=rd.nextInt(6);
		len=word[rnd].length();
		char [] newString=new char[len];
		StringBuffer wrgString=new StringBuffer();
		for(int j=0;j<len;j++)
		{
			System.out.print("_ ");
		}
		System.out.println();
		do
		{
			flag=0;
			System.out.println("\n\n Enter your quess: ");
			String ch=input.next().toLowerCase();
			count++;
			for(i=0;i<len;i++)
			{
				if(word[rnd].charAt(i)==ch.charAt(0))
				{
					newString[i]=word[rnd].charAt(i);
					flag=1;
				}
			}
			if(flag==0)
			{
				wrgString.append(ch+",");
				System.out.println("\n misses: "+wrgString);
				System.out.println(newString);
				temp=new String(newString);
				if (word[rnd].equals(temp))
				{
					System.out.println("-----------congrats you won :)--------------");
				}
					System.out.println("Do you want to play again(Y/N");
				   choice=input.next();
					if(choice.equalsIgnoreCase("Y"))
						//playGane();
				    	flag=1;
					else
					//	showMenu();
						flag=0;
				
			}
		}while(flag!=0);
	}
}