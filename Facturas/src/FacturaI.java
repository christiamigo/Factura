public interface FacturaI {
	void cambiarEstado(Estados estado);
	float getTotal();
	float getCantidadIva();
}
