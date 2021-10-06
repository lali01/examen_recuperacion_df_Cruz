package recuperacion;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		
		String opcion = "";
		do {
		System.out.println("Programa de figuras, seleccione una opcion:");
		System.out.println("1. Imagen Triangulo");
		System.out.println("2. SALIR");
		opcion = in.nextLine();
		
		switch(opcion) {
		
		case "1":
			System.out.println("Ingresar la dimension");
			int d = in.nextInt();
			
			for(int i=1; i<=d; i++){
			for(int j = 1; j<=i; j++){
				
				System.out.print("*");
			}
			System.out.println("");
		
		}
		break;
		
		case "2":
			System.out.println("Usted ha salido del sistema");
		break;
		}
		
		
		
		
		}while(!opcion.equals("2"));
		
	}

	}
