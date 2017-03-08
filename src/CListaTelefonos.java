
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin1
 */
public class CListaTelefonos {

    private ArrayList<CPersona> listaTelefonos;

    public CListaTelefonos() {
        listaTelefonos = new ArrayList<>();
    }

    public void añadir(CPersona objeto) {
        listaTelefonos.add(objeto);
    }

    public boolean eliminar(String tel) {
        boolean eliminado = false;
        int i = 0;
        while (eliminado == false && i < listaTelefonos.size()) {
            if (tel.equals(listaTelefonos.get(i).getTelefono())) {
                listaTelefonos.remove(i);
                eliminado = true;
            } else {
                i++;
            }
        }
//        if (eliminado == true) {
//            System.out.println("Se ha eliminado");
//        } else {
//            System.out.println("No se ha eliminado");
//        }

        return eliminado;
    }

    public int buscar(String str){
        int result=0;
        boolean encontrado=false;
        int i=0;
        while(!encontrado && i<listaTelefonos.size()){
          if(listaTelefonos.get(i).getNombre().contains(str)){
              result=i;
              encontrado=true;
          }
          else 
              i++;
        }
        if(encontrado){
            System.out.println("encontrado");
            return result;
        }
        else
            System.out.println("no encontrado");
            return -1;
    }
    
    public CPersona registro(int i){
        if(i<listaTelefonos.size()){ //size numero de contenido
            return listaTelefonos.get(i);
        }else
            return null;
    }
    
    public int longitud(){
        return listaTelefonos.size();
    }
    
    public void mostrarLista(){
        for (int i=0;i<listaTelefonos.size();i++)
            listaTelefonos.get(i).toString();
    }
    
    @Override
    public String toString() {
        return "ListaTelefonos=" + listaTelefonos;
    }

}
