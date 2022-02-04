import java.util.Scanner;
public class Perimeter {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		   System.out.println("Please enter circle radio ");
		   int radio = i.nextInt();
		   
		   double perimetro = 2*3.1416*radio;
		   double area = 3.1416*(radio*radio);
			
			System.out.println("the perimeter is "+ perimetro);
			System.out.println("the area is "+ area);

	}

}
