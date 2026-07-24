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
static String Precio;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=1;
        while(opcion!=0){
        System.out.println("1.-Agregar Producto");
        System.out.println("2.-Mostrar catalogo y productos");
        System.out.println("3.-Actualizar y eliminar producto");
        System.out.println("4.-Eliminar");
        System.out.println("5.-Reporte General");
        System.out.println("0.-Salir");
        System.out.println("Ingrese una opcion");
        opcion=leer.nextInt();
        switch(opcion){
            case 1:{
                Agregar(lista);
            }break;
            case 2:{
                if(lista.isEmpty()==true){
                    System.out.println("No tiene productos agregados");
                    break;
                }
                imprimir(lista);
            }break;
            case 3:{
                if(lista.isEmpty()==true){
                    System.out.println("No tiene productos agregados");
                    break;}
                reemplazar(lista);
   
            }break;
            case 4:{
                if(lista.isEmpty()==true){
                    System.out.println("No tiene productos agregados");
                    break;}
                eliminar(lista);
            }break;
            case 5:{
                if(lista.isEmpty()==true){
                    System.out.println("No tiene productos agregados");
                    break;
                }
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
                        valioso(lista);
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
    public static ArrayList<String> Agregar(ArrayList<String>s){
                System.out.println("Ingrese el nombre del producto");
                String nombre=leer.next();
                System.out.println("Ingrese la categoria del producto");
                String categoria=leer.next();               
                System.out.println("Ingrese el precio del producto");
                String precio=leer.next();             
                System.out.println("Ingrese la cantidad del producto disponible");
                String cantidad=leer.next();
                lista.add("nombre:"+nombre+" categoria:"+categoria+" precio:"+precio+" cantidad:"+cantidad);
    return s;}
    public static void imprimir(ArrayList<String>s){
            for(int i=0;i<lista.size();i++){
                System.out.println(lista.get(i));           
        }            
    }
    public static void reemplazar(ArrayList<String>s){ 
        System.out.println("Ingrese el indice del producto(inician en 0): ");
        int indice=leer.nextInt();
        String lis="";
        int cont=0;
        for(int i=0;i<lista.size();i++){
            if(indice==i){
            lis=lista.get(i);
            }
            for(int j=0;j<lista.size();j++){
                char lis1=lis.charAt(i);
                if(lis.contains(":")){
                    System.out.println("Ingrese el precio actualizado:");
                    String precio=leer.next();
                    lis+=precio;        
                }
                }
            }
        System.out.println("Lista actualizada:");
        imprimir(lista);
    }
    public static void valioso(ArrayList<String>s){
        int mayor=0;
        for(int i=0;i<lista.size();i++){
            
        }
    }
    public static void eliminar(ArrayList<String>s){
        System.out.println("Ingrese el indice del producto(inician en 0): ");
            int indice=leer.nextInt();
            lista.remove(indice);
                System.out.println("Producto eliminado exitosamente");
                System.out.println("La nuev alista es:");
                imprimir(lista);
            }
    }

