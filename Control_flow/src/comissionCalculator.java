import java.util.Scanner;
public class comissionCalculator {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Ingresa la venta");
		double venta=teclado.nextInt();
		
		if(venta>=10000) {
         System.out.println("tu comisi�n es del 30%");
	}else if(venta>5000 && venta <=9999) {
        System.out.println("tu comisi�n es del 20%");
	}else if(venta>=1000 && venta <=5000) {
        System.out.println("tu comisi�n es del 10%");
	}else if(venta<1000) {
        System.out.println("sin comisi�n");
	}else {
		System.out.println("No esta dentro del rango");
	}
}
}