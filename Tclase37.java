import java.util.Scanner;

public class Tclase37 {

	public static void main(String[] args) {
		int num;
        int fact = 1;

		Scanner rd = new Scanner(System.in);

		System.out.println("Ingrese un numero:");
		num = rd.nextInt();

		int i = 1;

		while (i <= num) {
			fact = fact * i;
			i++;
		}

		System.out.println("El factorial es:" + fact);
	}
}