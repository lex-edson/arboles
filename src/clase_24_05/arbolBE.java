/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_24_05;
import java.util.*;
/**
 *
 * @author estudiante
 */
public class arbolBE {
    nodoE raiz;
    Scanner leer=new Scanner(System.in);

    public arbolBE() {
        raiz=null;
    }

    public nodoE getRaiz() {
        return raiz;
    }

    public void setRaiz(nodoE raiz) {
        this.raiz = raiz;
    }
    //recursivo algoritmos
    public void crear(nodoE r){
        if(r!=null){
            r.setNom(leer.next());
            r.setNota(leer.nextInt());
            System.out.println(r.getNom()+"tendra izq? s/n");
            String resp=leer.next();
            
            if(resp.equals("s")){
                nodoE nue=new nodoE();
                r.setIzq(nue);
                crear(r.getIzq());
            }
            System.out.println(r.getNom()+"tendra der? s/n");
            
            String resp1=leer.next();
            
            if(resp1.equals("s")){
                nodoE nue=new nodoE();
                r.setDer(nue);
                crear(r.getDer());
            }
            
        }
    }
    public void preorden(nodoE r){
        if(r!=null){
            System.out.println(r.getNom()+" "+r.getNota());
            preorden(r.getIzq());
            preorden(r.getDer());
        }
    }
    //enorden
    public void inorden(nodoE r){
        if(r!=null){
            inorden(r.getIzq());
            System.out.println(r.getNom()+" "+r.getNota());
            inorden(r.getDer());
        }
    }
    //posorden
    public void posorden(nodoE r){
        if(r!=null){
            posorden(r.getIzq());
            posorden(r.getDer());
            System.out.println(r.getNom()+" "+r.getNota());
        }
    }
    ////////
    public void completar(nodoE r){
        if(r!=null){
            if(r.getIzq()!=null && r.getDer()==null){
                nodoE nue=new nodoE();
                nue.setNom("xxx");nue.setNota(0);
                r.setDer(nue);
            }
            if(r.getIzq()==null&&r.getDer()!=null){
                nodoE nue=new nodoE();
                nue.setNom("xxx");nue.setNota(0);
                r.setIzq(nue);
            }
            completar(r.getIzq());
            completar(r.getDer());
        }
    }
   
    
    //enorden
    
    public int contar(nodoE r){
        if(r!=null){
        int c=contar(r.getIzq())+contar(r.getDer());
            if(r.getNota()>=51){
                c++;
            }
            return c;
        }else{return 0;}
    }
     public void crear(){
        pila nivel=new pila();
        pila desc=new pila();
        setRaiz(new nodoE());
         System.out.println("nombre; ");
        getRaiz().setNom(leer.next());
        System.out.println("nota ; ");
        getRaiz().setNota(leer.nextInt());
        nivel.adicionar(getRaiz());
        while(!nivel.esvacia())//paso de nivel
        {
            while(!nivel.esvacia())//procesa un nivel
            {
                nodoE r=nivel.eliminar();
                System.out.println(r.getNom()+"tendra Izq? s/n");
                String resp=leer.next();
                if(resp.equals("s"))
                {
                    nodoE nue=new nodoE();
                    nue.setNom(leer.next());
                    nue.setNota(leer.nextInt());
                    r.setIzq(nue);
                    desc.adicionar(r.getIzq());
                }
                System.out.println(r.getNom()+"tendra Der? s/n");
                resp=leer.next();
                if(resp.equals("s"))
                {
                    nodoE nue=new nodoE();
                    nue.setNom(leer.next());
                    nue.setNota(leer.nextInt());
                    r.setDer(nue);
                    desc.adicionar(r.getDer());
                }
            }
            nivel.vaciar(desc);
        }
    }
      public void niveles(){
        pila nivel=new pila();
        pila desc=new pila();
        nivel.adicionar(getRaiz());
        int c=0;
        while(!nivel.esvacia())//paso de nivel
        {
            System.out.print("Nivel : "+c+ ">> ");
            while(!nivel.esvacia())//procesa un nivel
            {
                nodoE r=nivel.eliminar();
                //.....
                System.out.print("["+r.getNom()+" "+r.getNota()+"] ");
                if(r.getIzq()!=null)
                    desc.adicionar(r.getIzq());
                if(r.getDer()!=null)
                    desc.adicionar(r.getDer());
            }
            nivel.vaciar(desc);
            c++;
            System.out.println("");
        }
    }
     

}
