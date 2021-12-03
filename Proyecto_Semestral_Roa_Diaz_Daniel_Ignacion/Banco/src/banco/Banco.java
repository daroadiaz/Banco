package banco;

import java.util.Scanner;

public class Banco {
   
     public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);  //crear un objeto Scanner
        int op;
        
        String cuenta;
        String nombre;
        int saldoinicial;
        String nip;
                
        Cuenta obj= new Cuenta();
        
        do{    
        limpiar(10);
        System.out.println("*** MENU ***\n");
        System.out.println("1.- Crear Cuenta ");
        System.out.println("2.- Abonar ");
        System.out.println("3.- Retirar ");        
        System.out.println("4.- Consultar ");        
        System.out.println("5.- Salir ");
        
        System.out.print("\nElija la Operacion que desea Realizar: ");        
        op = input.nextInt();
        input.nextLine(); //Limpiar el buffer
        
        switch (op) {
            case 1:                
                System.out.print("Ingrese el Número de cuenta a Crear:  ");
                cuenta = input.nextLine();
                
                System.out.print("Ingrese el Nombre del Titular:  ");
                nombre = input.nextLine();
                
                System.out.print("Ingrese el Saldo Inicial:  ");
                saldoinicial = input.nextInt();
                
                input.nextLine(); //Limpiar el buffer
                
                System.out.print("Ingrese el NIP:  ");
                nip = input.nextLine();
                                                
                obj.Crear(cuenta, nombre,saldoinicial , nip);
                
                input.nextLine();
                break;
            case 2:
                do{                
                    System.out.print("Ingrese el numero de cuenta:  ");
                    cuenta = input.nextLine();                
                    System.out.print("Ingrese el numero Secreto:  ");
                    nip = input.nextLine();   

                    if (obj.Validar(cuenta, nip)){
                        System.out.print("Ingrese el monto a depositar: ");
                        int deposito=input.nextInt();
                        obj.Abonar(cuenta, deposito);                                                  
                    }               
                    else
                        System.out.print("Número de cuenta y/o NIP incorrecto \nVuelva a intentarlo \n");                    
                }while(obj.Validar(cuenta, nip)==false);
                input.nextLine();                
                input.nextLine();                
                break;
            case 3: //Retirar
                do{                
                    System.out.print("Ingrese el numero de cuenta:  ");
                    cuenta = input.nextLine();                
                    System.out.print("Ingrese el numero Secreto:  ");
                    nip = input.nextLine();   

                    if (obj.Validar(cuenta, nip)){
                        System.out.print("Ingrese el monto a retirar: ");
                        int retiro=input.nextInt();
                        obj.Retirar(cuenta,retiro);                                                  
                    }               
                    else
                        System.out.print("Número de cuenta y/o NIP incorrecto \nVuelva a intentarlo \n");                    
                }while(obj.Validar(cuenta, nip)==false);                      
                input.nextLine();                
                input.nextLine();
                break;
                
            case 4://Consultar
                do{
                System.out.print("Ingrese el numero de cuenta:  ");
                cuenta = input.nextLine();                
                System.out.print("Ingrese el numero Secreto:  ");
                nip = input.nextLine();
                
                if (obj.Validar(cuenta, nip)){                                  
                    obj.Consultar(cuenta);
                    input.nextLine();
                }else
                    System.out.print("Número de cuenta y/o NIP incorrecto \nVuelva a intentarlo \n");                    
                }while(obj.Validar(cuenta, nip)==false);
                break;
                
            case 5:                
                System.out.println("\n\nGracias por utilizar MiBanquito \nPresione una tecla para continuar");  
                input.nextLine();
                System.exit(0);
                break;
            default:               
                break;
            }              
        }while (op!=5);  
    }

    public static void limpiar(int lineas)
    {
        for (int i=0; i < lineas; i++)
            {
                System.out.println();
            }
    }
    
    
}
