
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class Agenda {
static Scanner tc=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CListaTelefonos lista=new CListaTelefonos();
        
        int menu=0;
        
        do{
        System.out.println("1. Buscar"+
                "\n2. Mostrar agenda"+
                "\n3. Añadir"+
                "\n4. Eliminar"+
                "\n5. Salir");
        do{
        try{
        System.out.println("Introduce una opcion:(1-5) ");
            menu=tc.nextInt();
        }catch(InputMismatchException e){
            tc.nextLine();
            System.out.println("1. Buscar"+
                "\n2. Mostrar agenda"+
                "\n3. Añadir"+
                "\n4. Eliminar"+
                "\n5. Salir");
        }
        }while(menu <1 || menu >5);
            
        switch(menu){
            case 1:buscar(lista);break;
            case 2:mostrarAgenda(lista);break;
            case 3:añadir(lista);break;
            case 4:eliminar(lista);break;
            case 5:System.out.println("FIn del programa");break;
        }
        
        }while(menu!=5);
    }
    
    
    
    public static void buscar(CListaTelefonos listatfnos){
        tc.nextLine(); //Limpiar buffer
        String nombre;
        System.out.println("Introduce el nombre a buscar: ");
        nombre=tc.nextLine();
        for(int i=0;i<listatfnos.longitud();i++)
            
            if(listatfnos.registro(i).getNombre().contains(nombre)){
                System.out.println(listatfnos.toString());
            }
            else{
                System.out.println("Error, el nombre no existe");
            }
    }
    
    public static void mostrarAgenda(CListaTelefonos listatfnos){
        for(int i=0;i<listatfnos.longitud();i++)
            System.out.println(listatfnos.registro(i).toString());
    }
    
    public static void añadir(CListaTelefonos listatfnos){
        tc.nextLine();
        String nombre,email,telefono;
        System.out.println("Introduce el nombre: ");
        nombre=tc.nextLine();
        System.out.println("Introduce el email: ");
        email=tc.nextLine();
        System.out.println("Introduce el telefono: ");
        telefono=tc.nextLine();
        
        listatfnos.añadir(new CPersona(nombre, email, telefono));
        
    }
    
    public static void eliminar(CListaTelefonos listatfnos){
        tc.nextLine();
        String tel;
        System.out.println("Introduce un telefono: ");
            tel=tc.nextLine();
        boolean eliminado = false;
        int i = 0;
        while (eliminado == false && i < listatfnos.longitud()) {
            if (tel.equals(listatfnos.registro(i).getTelefono())) {
                listatfnos.eliminar(tel);
                eliminado = true;
            } else {
                i++;
            }
        }
        if (eliminado == true) {
            System.out.println("Se ha eliminado");
        } else {
            System.out.println("No se ha eliminado, el telefono no existe");
        } 
    }
    
}
