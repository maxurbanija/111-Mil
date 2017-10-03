import java.util.*;
public class Aplicacion {

	public static void main(String[] args) {
		Empleados emplea=new Empleados();
		int errores,cantEmpleados;
		errores=Empleados.controlarListaEmpleados(emplea.getNodo1());
		cantEmpleados=emplea.getCantEmpleados();
		System.out.println("Cantidad de empleados con informacion incorrecta: "+errores);
		System.out.println("Porcentaje de empleados con informacion incorrecta: "+(errores/cantEmpleados)*100+"%");

	}
}
	


	

