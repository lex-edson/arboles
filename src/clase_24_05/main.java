/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_24_05;

/**
 *
 * @author estudiante
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arbolBE A=new arbolBE();
        A.setRaiz(new nodoE());
        //A.crear(A.getRaiz());
        System.out.println("xxxxxxxxxxxxxxxxx");
        
        //A.preorden(A.getRaiz());
        System.out.println("xxxxxxxxxxxxxxxxx");
        System.out.println( "cantidad: "+A.contar(A.getRaiz()));
        System.out.println("xxxxxxxxxxxxxxxxx");
        A.crear();
        System.out.println("xxxxxxxxxxxxxxxxx");
        //A.preorden(A.getRaiz());
        System.out.println("xxxxxxxxxxxxxxxxx");
        //A.inorden(A.getRaiz());
        System.out.println("xxxxxxxxxxxxxxxxx");
        //A.posorden(A.getRaiz());
        A.completar(A.getRaiz());
    }
    
}
