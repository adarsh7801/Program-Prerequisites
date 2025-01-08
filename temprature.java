import java.util.*;
public class temprature{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ystem.out.println("Enter the temprature in degree");
		double cel = sc.nextDouble();
		double far = (cel*9/5)+32;
		System.out.println("Temprature in fahrenheit is "+far);
		sc.close();
	}
}