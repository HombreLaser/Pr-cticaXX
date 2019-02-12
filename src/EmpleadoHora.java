public class EmpleadoHora extends Empleado{
	private String nombre;
	private int numero;
	private int horas;
	private float pagoHora;
	
	public EmpleadoHora(String nombre, int numero, int horas, float pagoHora){
		setNombre(nombre);
		setNumeroEmp(numero);
		setHoras(horas);
		setPagoHora(pagoHora);
	}
	
		public EmpleadoHora(){
		this("AAAAA", 111, 1, 1f);
	}
	
	public void setNombre(String nombre){
		if(nombre.length() > 4)
			this.nombre = nombre;
	}
	
	public void setNumeroEmp(int numero){
		if(numero >= 100 && numero <= 999)
			this.numero = numero;
	}
	
	public void setHoras(int horas){
		if(horas >= 1 && horas <= 12)
			this.horas = horas;
	}
	
	public void setPagoHora(float pagoHora){
		if(pagoHora >= 1)
			this.pagoHora = pagoHora;
	}
	
	public float calcularPago(){
		float pago;
		pago = (float) (horas * pagoHora);
		return pago;
	}
	
	public String toString(){
		String str;
		str = "Nombre: " + nombre + "\n";
		str += "Numero de empleado: " + numero + "\n";
		str += "Pago: " + calcularPago() + "\n";
		return str;
	}
}