package actividad_3p2;

public class Cuadradop2 {
	int lado;
	
	Cuadradop2(int lado){
		this.lado = lado;
	}
	
	double calcularArea() {
		return lado*lado;
	}
	
	double calcularPerimetro() {
		return (4*lado);
	}
}