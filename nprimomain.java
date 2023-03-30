package Ndigitado;
import java.util.Scanner;
public class nprimomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		System.out.print("Ingrese un numero entero : ");
		int num = tc.nextInt();
		boolean esPrimo = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				esPrimo = false;
				break;
			}
		}
			if (esPrimo && num > 1) {
				System.out.println(num + " es primo");
			} else {
				System.out.println(num + " no es primo");
			}
	}
}