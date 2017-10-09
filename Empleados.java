/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111.mil;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.*;
public class Empleados  {
	




private List<String> inside = new ArrayList<String>();
private List<List<String>> nodo1 = new ArrayList<List<String>>();
private static int cantEmpleados;


public Empleados(){
	inside.add("Juan Gomez");
	inside.add("34500311");
	inside.add("Direccion pibe123");
	inside.add("983-10-03");
	inside.add("018-12-31");
	inside.add("22000,00");
	inside.add("Hola 123 ");
	inside.add("senior");
				
	nodo1.add(inside);
	
	
	
			
}
					
public List<List<String>> getNodo1() {
	return nodo1;
}

public void setNodo1(List<List<String>> nodo1) {
	this.nodo1 = nodo1;
}

private static int aNumero(char c){
				int n;
				n=-1;
				switch (c) {
				case '0': n=0;break;
				case '1': n=1;break;
				case '2': n=2;break;
				case '3': n=3;break;
				case '4': n=4;break;
				case '5': n=5;break;
				case '6': n=6;break;
				case '7': n=7;break;
				case '8': n=8;break;
				case '9': n=9;break;
				}
				return n;
			}
			
private static boolean validarLetra(char c){
				if ((Character.isLetter(c))|| (Character.isWhitespace(c))){
                                    return true;
                                }else{
                                    return false;
                                }	
			}
			
private static int validaDni(String c){
				int control,i;
				control=0;
				i=0;
				if(c.length()>8 || c.length()<7){
					return 1;
				}else{
					while(i<c.length()){
						if (aNumero(c.charAt(i))==-1){
							return 1;
						}
						i++;
					}
				}
				
				return control;
			}

private static int validaDireccion(String dir){
    boolean validarL;
    int i = 0,validarN;
     
     
     while(i<dir.length()){
        validarL=validarLetra(dir.charAt(i));
        validarN=aNumero(dir.charAt(i));
        if ((validarL==false) && (validarN== -1)){
            i = dir.length();          
            return 1;
        }                                 
        i++;                 
        }
        return 0;
        
    }  

private static boolean controlRangoFecha(String dato){
        int mm,dd;
        boolean control;
        
        mm=aNumero(dato.charAt(4))*10+aNumero(dato.charAt(5));
        dd=aNumero(dato.charAt(7))*10+aNumero(dato.charAt(8));
        
        if((mm>12)&&(dd>31)){
            return false;
         }
        return true;
     }       

public static int validaFechaNac(String dato){
        int edad,control,aa,mm,dd;//aa,mm y dd correspondes a la fecha de nacimiento
        int aas,mms,dds;//aas,mms y dds correspondes a la fecha del sistema
        control=0; edad = 0;
       
        
     if((controlFormatoFecha(dato) && controlRangoFecha(dato))){

         //asignamos el valor a las variables de la fecha del sistema
        Date f=new Date();
        aas=f.getYear()+1900; 
        mms=f.getMonth();
        dds=f.getDay();
         //asignamos el valor a las variables de la fecha de nacimiento
        
         aa=(aNumero(dato.charAt(0)))*100+aNumero(dato.charAt(1))*10+aNumero(dato.charAt(2));
         mm=aNumero(dato.charAt(4))*10+aNumero(dato.charAt(5));
         dd=aNumero(dato.charAt(7))*10+aNumero(dato.charAt(8));
        
         if(dato.charAt(0)=='9'){
             aa+=1000;
         }else{
             if(dato.charAt(0)=='0'){
                 aa+=2000;
             }else{
                 return 1;
             }
         }
         
         
         edad=aas-aa;
         
         
         if (mms<mm){
             edad-=1;
         }
         
         if((mm==mms)&&(dds<dd)){
             edad-=1;
         }
         
         if(edad<18){
             return 1;
         }
     }else{
         return 1;
     } 
        return 0;
    }
public static int validaFechaIngreso (String dato){//devuelve 1 si es incorrecta la fecha sino 0
	int control, AA, MM, DD, AAS, MMS, DDS, edad;
	String fechaActual;
	
	control=0;

	if (controlFormatoFecha(dato) && controlRangoFecha(dato)){
            	Date f = new Date();
		AA=aNumero(dato.charAt(0))*100+aNumero(dato.charAt(1))*10+aNumero(dato.charAt(2));
		MM=aNumero(dato.charAt(4))*10+aNumero(dato.charAt(5));
		DD=aNumero(dato.charAt(7))*10+aNumero(dato.charAt(8));

		AAS= f.getYear()+1900;
		MMS= f.getMonth();
		DDS= f.getDay();

		if (dato.charAt(0)=='9'){
			AA+=1000;
                }else{if (dato.charAt(0)=='0'){ 
			
				AA+=2000;
                      }else{
			
				control=1;
                           }
                      }
		
                    

		if (control==0){
			if (AAS<AA){
				control=1;
                        }else{	if((AAS==AA) && (MMS<MM)){		
				
					control=1;
                                }else{
					if ((AA==AAS) && (MMS==MM) && (DDS<DD)){
						control=1;
                                        }
                                     }
                        }
                }else{
                    control=1;
                }
		
               return control;
        }
	
        return 0;
    }



public static boolean controlFormatoFecha(String dato){
				if(dato.length()!=9){
					return false;
				}else{
					if (aNumero(dato.charAt(0))==-1){
						return false;
					}else{
						if (aNumero(dato.charAt(1))==-1){
							return false;
						}else{
							if (aNumero(dato.charAt(2))==-1){
								return false;
							}else{
								if (dato.charAt(3)!='-'){
									return false;
								}else{
									if (aNumero(dato.charAt(4))==-1){
										return false;
									}else{
										if (aNumero(dato.charAt(5))==-1){
											return false;
										}else{
											if (dato.charAt(6)!='-'){
												return false;
											}else{
												if (aNumero(dato.charAt(7))==-1){
													return false;
												}else{
													if (aNumero(dato.charAt(8))==-1){
														return false;
													}
												}
											}
										}
									}
								}
							}
						}
					
				}
				return true;
				
			}
			}

private static int validaNomyAp(String dato){
	int i=0;
	while(i<dato.length()){
		if (!validarLetra(dato.charAt(i))){
			return 1;
		}
		i++;
	}
	return 0;
}

private static int validaSeniority(String dato){
	dato.toLowerCase();
	switch (dato) {
	case "trainee": return 0;
	case "junior":	return 0;
	case "semisenior":	return 0;
	case "senior":	return 0;
	case "architect":	return 0;
	default: return 1;
	}
}

private static int validaSalario(String dato){
	for(int i=0;i<(dato.length())-4;i++){
		if (aNumero(dato.charAt(i)) == -1){
			return 1;
		}
	}
	if ((dato.length()<4) || 
		(dato.charAt(dato.length()-3)!='.') || 
		((aNumero(dato.charAt(dato.length()-2))==-1) || 
		((aNumero(dato.charAt(dato.length()-1))==-1)))){
		return 1;
	}
	return 0;
}





public static int getCantEmpleados() {
	return cantEmpleados;
}

public static int controlarListaEmpleados(List<List<String>> empleados){
	boolean errorEmpleado=false;
	List<String> datos;
	int error=0;
	String[] campos={"Nombre Empleado: ","DNI: ", "Direccion: ","Fecha Nacimiento: ","Fecha Ingreso: ","Salario: ","Posicion Actual: ","Seniority: " };
	int cantConErrores=0;
	cantEmpleados=0;
	
	
	for (int i=0;i<empleados.size();i++){
		datos=empleados.get(i);
		for(int j=0;j<=(datos.size())-1;j++){
			switch (j){
			case 0: error=validaNomyAp(datos.get(j));break;
			case 1: error=validaDni(datos.get(j));break;
			case 2: error=validaDireccion(datos.get(j));break;
			case 3:	error=validaFechaNac(datos.get(j));break;
			case 4:	error=validaFechaIngreso(datos.get(j));break;
			case 5:	error=validaSalario(datos.get(j));break;
			case 6:	error=validaNomyAp(datos.get(j));break;
			case 7:	error=validaSeniority(datos.get(j));break;
			
			}
			
			if (error==1){
				System.out.println("Error "+ campos[j] + datos.get(j));
				errorEmpleado=true;
			}
		}
		cantEmpleados++;
		if(errorEmpleado){
			cantConErrores++;
			System.out.println("-----------------------------------");
			System.out.println("Empleado: "+datos.get(0));
			System.out.println("-----------------------------------");
		}
	}
	return cantConErrores;
}
}
