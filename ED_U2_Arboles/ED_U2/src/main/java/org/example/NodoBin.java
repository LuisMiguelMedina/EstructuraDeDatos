package org.example;

public class NodoBin {
    protected Object dato;

    public Object getDato() {
        return dato;
    }
    public void setDato(Object dato) {
        this.dato = dato;
    }

    protected NodoBin izq;
    protected NodoBin der;
    public NodoBin(Object dato, NodoBin izq, NodoBin der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }
    public NodoBin(Object dato){
        this(dato,null,null);
    }
    public NodoBin(){
        this(null);
    }
    public NodoBin getDer() {
        return der;
    }

    public void setDer(NodoBin der) {
        this.der = der;
    }
    public NodoBin getIzq() {
        return izq;
    }

    public void setIzq(NodoBin izq) {
        this.izq = izq;
    }
    public void posOrder(){ //IDR
        if (izq!=null){
            izq.posOrder();
        }
        if (der!=null){
            der.posOrder();
        }
        System.out.println(dato);//Visitar raiz
    }
    public void preOrder(){ //RID
        //System.out.println(dato);
        if (izq!=null){
            izq.preOrder();
        }
        if (der!=null){
            der.preOrder();
        }
    }
    public void InOrder(){ //IRD
        if (izq!=null){
            izq.InOrder();
        }
        //System.out.println(dato);
        if (der!=null){
            der.InOrder();
        }
    }
}