import java.util.Scanner;
public class Calculadora {
static double suma(double a,double b) {
	return a+b;
}
static double resta(double a,double b) {
	return a+b;
}
static double multiplicacion(double a,double b) {
	return a+b;
}
static double division(double a,double b) {
	return a+b;
}
static double raiz(double b) {
	return Math.sqrt(b);

}

static double cuadrado (double a) {
	return a*a;}
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int selector;
		do {
		System.out.print("¿que operacion quieres hacer?: "+"\n"+"1. Suma"+"\n"+"2. Resta"+"\n"+"3. Multiplicación"+"\n"+"4. División"+"\n"+"5. Potencia"+"6.Raíz cuadrada"+"\n"+"0 para finalizar");
         selector=teclado.nextInt();
         if(selector>0&&selector<=6){
        System.out.println("Ingresa el primer valor");
        double a=teclado.nextDouble();
        System.out.println("Ingresa el segundo valor");
        double b=teclado.nextDouble();
		
			switch(selector) {
			case 1: 
				System.out.println(suma(a,b));
				break;
			case 2: 
				System.out.println(resta(a,b));
				break;
			case 3: 
				System.out.println(multiplicacion(a,b));
				break;
			case 4: 
				System.out.println(division(a,b));
				break;
			case 5: 
				System.out.println(cuadrado(a));
				break;
			case 6: 
				System.out.println(raiz(b));
				break;
			}
			}else {continue;}
			
		}while(selector!=0);
	}

}
