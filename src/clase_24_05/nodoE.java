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
public class nodoE {
    nodoE der,izq;
    String nom;
    int nota;

    public nodoE() {
        der=izq=null;
    }

    public nodoE getDer() {
        return der;
    }

    public void setDer(nodoE der) {
        this.der = der;
    }

    public nodoE getIzq() {
        return izq;
    }

    public void setIzq(nodoE izq) {
        this.izq = izq;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public void mostrar(){}
    
    
}
