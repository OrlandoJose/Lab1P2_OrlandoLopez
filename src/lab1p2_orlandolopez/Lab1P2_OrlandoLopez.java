/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_orlandolopez;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Lab1P2_OrlandoLopez {
static Scanner leer=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=1;
        while(opcion!=0){
        System.out.println("1.-Agregar Producto");
        System.out.println("2.-Mostrar catalogo y productos");
        System.out.println("3.-Actualizar y eliminar producto");
        System.out.println("4.-Reporte General");
        System.out.println("5.-Reporte general");
        System.out.println("0.-Salir");
        System.out.println("Ingrese una opcion");
        opcion=leer.nextInt();
        switch(opcion){
            case 1:{
              ArrayList<Integer>lista=new ArrayList<>();  
              
            }break;
            case 2:{
                
            }break;
            case 3:{
                
            }break;
            case 4:{
                
            }break;
            case 5:{
                int opcion1=1;
                while(opcion1!=5){
                System.out.println("1.-Producto más caro y más barato");
                System.out.println("2.-Valor total del inventario");
                System.out.println("3.-Promedio de precio por categoría");
                System.out.println("4.-Cantidad de productos por categoría");
                System.out.println("5.-Salir");
                System.out.println("Ingrese una opcion");
                opcion1=leer.nextInt();
                switch(opcion1){
                    case 1:{
                        
                    }break;
                    case 2:{
                        
                    }break;
                    case 3:{
                        
                    }break;
                    case 4:{
                        
                    }break;
                    default:System.out.println("Ingrese una opcion valida");
                }
                }
            }
            default:System.out.println("Ingrese una opcion valida");
        }
        }  
    }   
}
