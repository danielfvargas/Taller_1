package uniandes.dpoo.taller0.modificacion;

public class Modificacion {

	public static void main(String[] args) {
		System.out.println("Hola, mundo!");
		
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println(calc.paisConMasMedallistas());

	}

}
