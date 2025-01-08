import java.util.*;
public class area{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of the circle");
		double radius = sc.nextDouble();
		double area = radius*radius*22/7;
		System.out.println("The area of circle is "+area);
		sc.close();
	}
}