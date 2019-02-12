class EmpleadoComision extends Empleado{
	private String nombre;
	private int numero;
	private int ventasBrutas;
	private int comisionPorcentual;
	private float comision;
	
	public EmpleadoComision(String nombre, int numero, int ventasBrutas, int comisionPorcentual){
		setNombre(nombre);
		setNumeroEmp(numero);
		setVentas(ventasBrutas);
		setComision(comisionPorcentual);
	}
	
	public EmpleadoComision(){
		super();
		setVentas(1);
		setComision(1);
	}
	
	public void setNombre(String nombre){
		if(nombre.length() > 4)
			this.nombre = nombre;
	}
	
	public void setNumeroEmp(int numero){
		if(numero >= 100 && numero <= 999)
			this.numero = numero;
	}
	
	
	public void setVentas(int ventasBrutas){
		if(ventasBrutas > 0)
			this.ventasBrutas = ventasBrutas;
	}
	
	public void setComision(int comisionPorcentual){
		if(comisionPorcentual > 0 && comisionPorcentual <= 70){
			this.comisionPorcentual = comisionPorcentual;
			comision = comisionPorcentual * .01f;
		}
	}
	
	public float calcularPago(){
		float pago;
		pago = (float) (ventasBrutas * comision);
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