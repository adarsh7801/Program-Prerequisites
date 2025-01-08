import java.util.Scanner;
public class volumeOfCylinder{
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Radius of the cylinder");
		double radius = sc.nextDouble();
		System.out.println("Enter the height of the cylinder ");
		double height = sc.nextDouble();
		double volume = radius*radius*height*22/7;
		System.out.println("Ther volume of cylinder is "+volume);
		sc.close();
	}
}