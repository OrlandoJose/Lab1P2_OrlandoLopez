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
        System.out.println("3.-Actualizar producto");
        System.out.println("4.-Eliminar producto");
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
                        Valortotal(lista);
                    }break;
                    case 3:{
                       Promedio(lista); 
                    }break;
                    case 4:{
                      Categoria(lista);  
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
                lista.add(nombre+","+categoria+","+precio+","+cantidad);
    return s;}
    public static void imprimir(ArrayList<String>s){
            for(int i=0;i<lista.size();i++){
                System.out.println(lista.get(i));           
        }            
    }
    public static void reemplazar(ArrayList<String>s){       
        System.out.println("Ingrese el indice del producto(inician en 0): ");
        int indice=leer.nextInt();
        System.out.println("Ingrese el precio actualizado:");
        String precionuevo=leer.next();
        String l="";
        for(int i=0;i<lista.size();i++){
            l=lista.get(indice)+"";
        }     
        String[] arreglo=l.split(",");       
        String precioviejo=arreglo[2];
        arreglo[2]=precionuevo;
        String nuevalista="";
        for(int i=0;i<arreglo.length;i++){
            nuevalista+=arreglo[i]+",";
        }
        lista.set(indice,nuevalista);
        System.out.println("Lista actualizada:");
        imprimir(lista);
    }
    public static void valioso(ArrayList<String>s){
        int mayor=0;
        int menor=10000;
        String nombremayor="";
        String nombremenor="";
        for(int i=0;i<lista.size();i++){
            String list=lista.get(i); 
            String[] arreglo=list.split(",");
           int precio=Integer.parseInt(arreglo[2]);
           if(precio>mayor){
               mayor=precio;
            String list2=lista.get(i); 
            String[] arreglo2=list.split(",");
            nombremayor=arreglo2[0];
           }
           if(precio<menor){
               menor=precio;
               String list2=lista.get(i); 
               String[] arreglo2=list.split(",");
               nombremenor=arreglo2[0];
           }
        }
        System.out.println("El producto mas valioso es:"+nombremayor);
        System.out.println("El producto menos valioso es:"+nombremenor);
    }
    public static void Valortotal(ArrayList<String>s){
        int resultado=0;
        for(int i=0;i<lista.size();i++){
           String list=lista.get(i);         
           String[] arreglo=list.split(",");
           int precio=Integer.parseInt(arreglo[2]);
           int cantidad=Integer.parseInt(arreglo[3]);
           resultado+=precio*cantidad;
        }
        System.out.println("El valor total de los prodcutos es:"+resultado);
    }
    public static void Categoria(ArrayList<String>s){
        
    }
    public static void Promedio(ArrayList<String>s){
        
        for(int i=0;i<lista.size();i++){
            
        }
    }
    public static void eliminar(ArrayList<String>s){
        System.out.println("Ingrese el indice del producto(inician en 0): ");
            int indice=leer.nextInt();
            lista.remove(indice);
                System.out.println("Producto eliminado exitosamente");
                System.out.println("La nueva lista es:");
                imprimir(lista);
            }
    }

