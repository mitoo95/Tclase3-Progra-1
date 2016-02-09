import java.util.Scanner;

public class Tclase32{
	public static void main(String args[]){
		Scanner rd = new Scanner(System.in);

		int num1, num2;
		num1 = 0;

		System.out.println("Ingrese cualquier valor positivo: ");
		num2 = rd.nextInt();

		while(num1 < num2){
			num1 ++;
			System.out.println(num1);
		}
	}
}