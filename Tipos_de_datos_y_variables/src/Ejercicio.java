import java.util.Scanner;
public class Ejercicio {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		   System.out.println("Please enter your password ");
		   String str1 = s.next();
		   System.out.println("Please confirm your password ");
		   String str2 = s.next();
		   String str3 = new String(str1);
		   int var1 = str1.compareTo(str2);
		   if(var1==0) {
			   System.out.println("Registro exitoso");
		   }else {
			   System.out.println("Contraseñas diferentes");
		   }
	}
}