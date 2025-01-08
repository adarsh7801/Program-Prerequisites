import java.lang.Math;
import java.util.Scanner;
public class PowerCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base ");
		double base = sc.nextDouble();
		System.out.println("Enter the Exponent ");
		int exponent = sc.nextInt();
		double result = Math.pow(base, exponent);
		System.out.println("The result is "+result);
		sc.close();
	}
}
