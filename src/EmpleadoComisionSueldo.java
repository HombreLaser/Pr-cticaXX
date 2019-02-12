class EmpleadoComisionSueldo extends EmpleadoComision{
	private String nombre;
	private int numero;
	private int ventasBrutas;
	private int sueldo;
	private int comisionPorcentual;
	private float comision;
		
	public EmpleadoComisionSueldo(String nombre, int numero, int ventasBrutas, int comisionPorcentual, int sueldo){
		setSueldo(sueldo);
	}
	
	public EmpleadoComisionSueldo(){
		setSueldo(1);
	}
	
	public void setSueldo(int sueldo){
		if(sueldo > 0)
			this.sueldo = sueldo;
	}
	
	public float calcularPago(){
		float pago;
		pago = (float) (ventasBrutas * comision + sueldo);
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