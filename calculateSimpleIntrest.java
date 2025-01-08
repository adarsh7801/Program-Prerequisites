import java.util.Scanner;
public class calculateSimpleIntrest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal ");
		int principal = sc.nextInt();
		System.out.println("Enter the Rate of intrest ");
		double rate = sc.nextDouble();
		System.out.println("Enter the Time in Years ");
		double year = sc.nextDouble();
		double SI = principal*rate*year/100;
		System.out.println("The Simple Interst is "+SI);
		sc.close();
	}
}