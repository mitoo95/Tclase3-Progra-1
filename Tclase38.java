import java.util.Scanner;

public class Tclase38{

	public static void main(String[] args) {
		int num;
        int fact = 1;

		num = 11;

		int i = 1;

		while (i < num) {
			fact = fact * i;
			i++;
			System.out.println(fact);
		}
	}
}