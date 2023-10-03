package S07v2_20;

import java.util.Scanner;

public class Persona {
    Scanner trabajo = new Scanner(System.in);
//atributos
    String nombre;
    int edad;
   
//metodos
    public void datos(){
    System.out.print("INGRESE EL NOMBRE: ");
    nombre = trabajo.nextLine();
    System.out.print("INGRESE LA EDAD: ");
    edad = trabajo.nextInt();
    }
    
    public void hablar(){
        System.out.println("hola " + nombre);
    }
    public void orden(){
        System.out.println("levantar la mn " + nombre);
    }
    
    public String datos2(String apellido){
        return nombre + apellido;
    }

}
