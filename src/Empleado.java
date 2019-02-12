abstract class Empleado{
	private String nombre;
	private int numero;
	
	public void setNombre(String nombre){
		if(nombre.length() > 4)
			this.nombre = nombre;
	}
	
	public void setNumeroEmp(int numero){
		if(numero >= 100 && numero <= 999)
			this.numero = numero;
	}
	
	public abstract float calcularPago();
}