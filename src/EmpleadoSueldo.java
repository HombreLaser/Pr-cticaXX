class EmpleadoSueldo extends Empleado{
	private String nombre;
	private int numero;
	private int sueldo;
	
	public EmpleadoSueldo(String nombre, int numero, int sueldo){
		setNombre(nombre);
		setNumeroEmp(numero);
		setSueldo(sueldo);
	}
	
	public EmpleadoSueldo(){
		setNombre("AAAAA");
		setNumeroEmp(111);
		setSueldo(1);
	}
	
	public void setNombre(String nombre){
		if(nombre.length() > 4)
			this.nombre = nombre;
	}
	
	public void setNumeroEmp(int numero){
		if(numero >= 100 && numero <= 999)
			this.numero = numero;
	}
	
	
	public void setSueldo(int sueldo){
		if(sueldo > 0)
			this.sueldo = sueldo;
	}
	
	public float calcularPago(){
		float pago = 0f;
		return pago;
	}
	
	public String toString(){
		String str;
		str = "Nombre: " + nombre + "\n";
		str += "Numero de empleado: " + numero + "\n";
		str += "Sueldo: " + sueldo + "\n";
		return str;
	}
}