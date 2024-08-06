package actividad_3p2;

import actividad_3p2.Circulop2;
import actividad_3p2.Cuadradop2;
import actividad_3p2.Rectangulop2;
import actividad_3p2.Triangulop2;

public class Prueba {

	public static void main(String[] args) {
		
		Circulop2 figura1 = new Circulop2(2);
		Rectangulop2 figura2 = new Rectangulop2(1,2);
		Cuadradop2 figura3 = new Cuadradop2(3);
		Triangulop2 figura4 = new Triangulop2(3,5);
		
		System.out.println("El área del círculo es = "+ figura1.calcularArea());
		System.out.println("El perímetro del círculo es = "+figura1.calcularPerimetro());
		System.out.println();
		
		System.out.println("El area del rectángulo es = "+figura2.calcularArea());
		System.out.println("El perímetro del rectángulo es = "+figura2.calcularPerimetro());
		System.out.println();
		
		System.out.println("El área del cuadrado es = "+figura3.calcularArea());
		System.out.println("El perímetro del cuadrado es = "+figura3.calcularPerimetro());
		System.out.println();
		
		System.out.println("El área del triángulo es = "+figura4.calcularArea());
		System.out.println("El perímetro del triángulo es = "+figura4.calcularPerimetro());
		figura4.determinarTipoTriángulo();
	}

}