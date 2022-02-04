import java.util.Scanner;

public class UserProfile {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
        String nombre="";
        int edad=0;
        String gender="";
        String job="";
        String preference="";
        String nationality="";
        String Bloodtype="";
        System.out.print("Ingresa tu nombre: ");
    	nombre=teclado.next();
    	System.out.print("Ingresa tu edad: ");
    	edad=teclado.nextInt();
    	System.out.print("Ingresa tu genero: ");
    	gender=teclado.next();
    	System.out.print("Ingresa tu trabajo: ");
    	job=teclado.next();
    	System.out.print("Ingresa tu preferencia: ");
    	preference=teclado.next();
    	System.out.print("Ingresa tu nacionalidad: ");
    	nationality=teclado.next();
    	System.out.print("Ingresa tu tipo de sangre: ");
    	Bloodtype=teclado.next();
    	int añonacimiento=2022-edad;
    	System.out.println(nombre);
    	System.out.println(gender);
    	System.out.println(job);
    	System.out.println(edad);
    	System.out.println(preference);
    	System.out.println(nationality);
    	System.out.println(Bloodtype);

	}
}
