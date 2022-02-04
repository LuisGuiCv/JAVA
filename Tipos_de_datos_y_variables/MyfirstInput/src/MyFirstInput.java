import java.util.Scanner;
public class MyFirstInput {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
        String nombre="";
        System.out.print("Ingresa tu nombre: ");
    	nombre=teclado.next();
    	System.out.print("tu nombre es: "+nombre);

	}

}
