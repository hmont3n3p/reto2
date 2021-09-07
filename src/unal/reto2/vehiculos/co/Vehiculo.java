package unal.reto2.vehiculos.co;

import java.util.List;

public class Vehiculo  {

	Double capacidadDeCarga;
	Integer tiempoDeRespuesta;
	Double constoEnvio;
	List<String> operarios;
	Boolean enEnvio;
	Integer horaDeSalida;
	String nombre;

	Boolean cargar(Double peso, Integer horaActual) {
		return true;
	}

	void despachar() {

	}

	void finalizarEnvio() {

	}

	@Override
	public String toString() {
		return "Vehiculo [capacidadDeCarga=" + capacidadDeCarga + ", tiempoDeRespuesta=" + tiempoDeRespuesta
				+ ", constoEnvio=" + constoEnvio + ", operarios=" + operarios + ", enEnvio=" + enEnvio
				+ ", horaDeSalida=" + horaDeSalida + ", nombre=" + nombre + "]";
	}

}
