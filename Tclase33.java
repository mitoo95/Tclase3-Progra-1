import java.util.Scanner;

public class Tclase33{
	public static void main(String args[]){

		Scanner rd = new Scanner(System.in);

		double conta;
		double suma;
		double prom;
		double valor;

		conta = 1;
		suma = 0;

		while(conta <= 10){
			System.out.println("Ingrese 10 valores");
			valor = rd.nextDouble();
			suma = suma + valor;
			conta = conta++;
		}
		prom = suma / 10;
		System.out.println("La suma de los numeros es: "+suma);
		System.out.println("El promedio de la suma es: "+prom);
	}
}