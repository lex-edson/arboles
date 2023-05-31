/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_24_05;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class pila {
    Scanner leer=new Scanner(System.in);
    int max=50;
    nodoE v[]=new nodoE[max+1];
    int tope;

    public pila() {
        tope=0;
    }
      boolean esvacia()
    {
        if(tope==0)
            return true;
        return false;
    }
    boolean esllena()
    {
        if(tope==max)
            return true;
        return false;
    }
    int nroelem()
    {
        return tope;
    }
    void adicionar(nodoE x)
    {
        if(!esllena())
        {
            tope++;
            v[tope]=x;
        }
        else
            System.out.println("Pila llena");
    }
    nodoE eliminar()
    {   nodoE dx=null;
        if(!esvacia())
        {
            dx=v[tope];
            tope--;
        }
        else
            System.out.println("Pila vacia");
        return dx;
    }
    void vaciar(pila Z)
    {
        while(!Z.esvacia())
           adicionar(Z.eliminar());
    }
   
    
    
}
