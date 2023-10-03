package S07_20;

import java.util.Scanner;

public class Persona2 {
    //metodos con valores de retorno//
    
    //atributos
    String nombre;
    String apellido;
    int edad, b;
    
    //metodos
    public int datos(){
        return edad + b;
    }
    
    public String name(){
        return nombre + apellido;
    }
}
