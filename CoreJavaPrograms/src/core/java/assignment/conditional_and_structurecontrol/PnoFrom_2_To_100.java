package core.java.assignment.conditional_and_structurecontrol;

public class PnoFrom_2_To_100 {
	public void display() {
		System.out.println("Prime Numbers Between 2 and 50 Are :-");
		for (int num = 2; num <= 100; num++) {
			boolean flag = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.print(num + ", ");
		}
	}
}
