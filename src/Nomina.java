import java.util.Scanner;

class Nomina{
	public static void main(String args[]){
		EmpleadoSueldo[] empleadoSueldo = new EmpleadoSueldo[3];
		EmpleadoHora[] empleadoHora = new EmpleadoHora[3];
		EmpleadoComision[] empleadoComision = new EmpleadoComision[3];
		EmpleadoComisionSueldo[] empleadoComSu = new EmpleadoComisionSueldo[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < empleadoSueldo.length; i++){
			empleadoSueldo[i] = new EmpleadoSueldo();
		}
		
		for(int x = 0; x < empleadoHora.length; x++){
			empleadoHora[x] = new EmpleadoHora();
		}
		
		for(int y = 0; y < empleadoComision.length; y++){
			empleadoComision[y] = new EmpleadoComision();
		}
		
		for(int n = 0; n < empleadoComSu.length; n++){
			empleadoComSu[n] = new EmpleadoComisionSueldo();
		}
		
		for(int r = 0; r < empleadoSueldo.length; r++){
			System.out.println("Empleado por sueldo. Introduzca su nombre");
				empleadoSueldo[r].setNombre(sc.nextLine());
			System.out.println("Introduzca su numero de empleado");
				empleadoSueldo[r].setNumeroEmp(sc.nextInt());
			System.out.println("Introduzca su sueldo base");
				empleadoSueldo[r].setSueldo(sc.nextInt());
			System.out.print(empleadoSueldo[r].toString());
				empleadoSueldo[r].setNombre(sc.nextLine());
		}
		
		for(int q = 0; q < empleadoHora.length; q++){
			System.out.println("Empleado por hora. Introduzca su nombre");
				empleadoHora[q].setNombre(sc.nextLine());
			System.out.println("Introduzca su numero de empleado");
				empleadoHora[q].setNumeroEmp(sc.nextInt());
			System.out.println("Introduzca el pago por horas");
				empleadoHora[q].setPagoHora(sc.nextInt());
			System.out.println("Introduzca las horas trabajadas");
				empleadoHora[q].setHoras(sc.nextInt());
			System.out.println(empleadoHora[q].toString());	
				empleadoHora[q].setNombre(sc.nextLine());
		}
		
		for(int e = 0; e < empleadoComision.length; e++){
			System.out.println("Empleado por comision. Introduzca su nombre");
				empleadoComision[e].setNombre(sc.nextLine());
			System.out.println("Introduzca su numero de empleado");
				empleadoComision[e].setNumeroEmp(sc.nextInt());
			System.out.println("Introduzca sus ventas brutas");
				empleadoComision[e].setVentas(sc.nextInt());
			System.out.println("Introduzca su comision porcentual");
				empleadoComision[e].setComision(sc.nextInt());
			System.out.print(empleadoComision[e].toString());
				empleadoSueldo[e].setNombre(sc.nextLine());
		}
		
		for(int w = 0; w < empleadoComSu.length; w++){
			System.out.println("Empleado por comision con sueldo. Introduzca su nombre");
				empleadoComSu[w].setNombre(sc.nextLine());
			System.out.println("Introduzca su numero de empleado");
				empleadoComSu[w].setNumeroEmp(sc.nextInt());
			System.out.println("Introduzca su sueldo base");
				empleadoComSu[w].setSueldo(sc.nextInt());
			System.out.println("Introduzca sus ventas brutas");
				empleadoComSu[w].setVentas(sc.nextInt());
			System.out.println("Introduzca su comision porcentual");
				empleadoComSu[w].setComision(sc.nextInt());
			System.out.print(empleadoSueldo[w].toString());
				empleadoComSu[w].setNombre(sc.nextLine());
		}
	}
}