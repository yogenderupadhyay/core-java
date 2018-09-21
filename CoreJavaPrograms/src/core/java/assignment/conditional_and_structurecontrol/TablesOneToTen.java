package core.java.assignment.conditional_and_structurecontrol;

public class TablesOneToTen {
	public void display() {
		for(int i=1;i<11;i++) {
			System.out.println("\n\nTABLE OF "+i);
			System.out.println("-------------");
			for(int j=1;j<11;j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
	}
}
