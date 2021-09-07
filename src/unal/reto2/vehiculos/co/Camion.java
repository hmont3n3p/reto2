package unal.reto2.vehiculos.co;

public class Camion extends Vehiculo {

	Double cargaActual;

	public Camion(String nombre) {
		this.nombre=nombre;
	}


	@Override
	Boolean cargar(Double peso, Integer horaActual) {
		return true;
	}
}
