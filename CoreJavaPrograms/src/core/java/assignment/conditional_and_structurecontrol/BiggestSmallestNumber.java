package core.java.assignment.conditional_and_structurecontrol;
import java.util.Scanner;
public class BiggestSmallestNumber {
	
	public void biggestAndSmallestNumber() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter three numbers to find smallest and biggest among them ");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int num3=sc.nextInt();
					if(num1<num2 && num1<num3) {
						System.out.println(num1+" is smallest among "+num1+", "+num2+" and "+num3);
					}
					else if(num2<num3){
							System.out.println(num2+" is smallest among "+num1+","+num2+" and "+num3);
						}
					else{
					System.out.println(num3+" is smallest among "+num1+", "+num2+" and "+num3);
					}
				if(num1 >num2 && num1>num3) {
						System.out.println(num1+" is biggest among "+num1+", "+num2+" and "+num3);
					}
				else if(num2>num3){
							System.out.println(num2+" is biggest among "+num1+","+num2+" and "+num3);
					}
				else {
					System.out.println(num3+" is biggest among "+num1+", "+num2+" and "+num3);
				}
	}
	
}
           