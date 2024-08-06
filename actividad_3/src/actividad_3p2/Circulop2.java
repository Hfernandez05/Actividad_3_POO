package actividad_3p2;

public class Circulop2 {
	int radio;
	
	Circulop2(int radio){
		this.radio = radio;
	}
	
	double calcularArea(){		
		return Math.PI*Math.pow(radio, 2);
	}
	
	double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
	
	
}
