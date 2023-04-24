package org.arboles.avl;

import org.arboles.abb.NodoBin;

public class NodoAVL extends NodoBin {
    protected int fe;
    protected NodoAVL padre;
    public NodoAVL() {}

    public NodoAVL(Object dato){
        super(dato);
    }

    public NodoAVL(Object dato, NodoBin izq, NodoBin der){
        super(dato,izq,der);
    }

    public NodoAVL(Object dato, NodoBin izq, NodoBin der, NodoAVL padre){
        super(dato, izq, der);
        this.padre = padre;
    }

    public NodoAVL getPadre() {
        return padre;
    }

    public void setPadre(NodoAVL padre) {
        this.padre = padre;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public static int altura(NodoAVL a){
        if (a==null)
            return -1;
        else
            return 1 + Math.max(altura((NodoAVL) a.getIzq()),altura((NodoAVL) a.getDer()));
    }

    public void inOrder(){
        if (izq!=null)
            izq.inOrder();
        System.out.println(dato + ". FE:"+fe);
        if (der!=null)
            der.inOrder();
    }
    public void preOrder(){
    System.out.println(dato + ". FE:"+fe);
        if (izq!=null)
            izq.preOrder();

        if (der!=null)
            der.preOrder();
    }
    public void posOrder(){
        if (izq!=null)
            izq.posOrder();

        if (der!=null)
            der.posOrder();
    System.out.println(dato + ". FE:"+fe);
    }
}
