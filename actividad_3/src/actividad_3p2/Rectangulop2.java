package actividad_3p2;

public class Rectangulop2 {
	int base;
	int altura;
	
	Rectangulop2(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	
	double calcularArea() {
		return base*altura;
	}
	
	double calcularPerimetro() {
		return (2*base)+(2*altura);
	}
	
	

}
