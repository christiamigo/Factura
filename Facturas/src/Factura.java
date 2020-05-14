public class Factura implements FacturaI {
	public int num;
	public float base;
	public float tipoIva;
	protected Estados estado;

	public static void main (String[] args){

	}

	public void cambiarEstado(Estados estado);
	public float getTotal() {
        	return this.num + this.base;
        }
	public  float getCantidadIva() {
		return this.tipoIva;
	}
}
