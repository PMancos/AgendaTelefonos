/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class PruebaClistaTfnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CPersona p1=new CPersona("Loren", "loren88@msn.com", "88");
        CPersona p2=new CPersona("Maria", "maria@msn.com", "99");
        CPersona p3=new CPersona("Irati", "irati@msn.com", "66");
        
        CListaTelefonos l1=new CListaTelefonos();
        
        l1.añadir(p1);
        l1.añadir(p2);
        l1.añadir(p3);
        
        l1.buscar("L");
        
        l1.eliminar("88");
        
        System.out.println(l1.toString());
        
        
    }
    
}
