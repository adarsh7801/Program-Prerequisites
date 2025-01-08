import java.util.Scanner;
public class ConvertKilometerstoMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the kilometers ");
		double km = sc.nextDouble();
		double miles = km*0.621371;
		System.out.println(miles + " Miles");
		sc.close();
	}
}