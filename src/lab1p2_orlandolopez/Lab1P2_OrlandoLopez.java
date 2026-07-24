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
static ArrayList<String>lista=new ArrayList<>(); 
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
        System.out.println("0.-Salir");
        System.out.println("Ingrese una opcion");
        opcion=leer.nextInt();
        switch(opcion){
            case 1:{
                System.out.println("Ingrese el nombre del producto");
                String nombre=leer.next();
                System.out.println("Ingrese la categoria del producto");
                String categoria=leer.next();               
                System.out.println("Ingrese el precio del producto");
                String precio=leer.next();             
                System.out.println("Ingrese la cantidad del producto disponible");
                String cantidad=leer.next();
                lista.add("nombre:"+nombre+" categoria:"+categoria+" precio:"+precio+" cantidad:"+cantidad);
            }break;
            case 2:{
                if(lista.isEmpty()==true){
                    System.out.println("No tiene productos agregados");
                }
                imprimir(lista);
            }break;
            case 3:{
                
            }break;
            case 4:{
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
    public static void imprimir(ArrayList<String>s){
            for(int i=0;i<lista.size();i++){
                System.out.println(lista.get(i));           
        }
    }
}
