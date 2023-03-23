package org.example;

import java.util.Random;

public class ArbolABB {
    protected NodoBin raiz;
    public ArbolABB(Object o){
        raiz = new NodoBin(o);
    }
    public ArbolABB(){
        this(null);
    }

    public void inOrder() {
        if (raiz!=null){
            raiz.preOrder();
        }
    }
    public void posOrder(){
        raiz.posOrder();
    }
    public void preOrder(){
        if(raiz!=null){
            raiz.preOrder();
        }
    }
    public void insertar(Object o){
        insertarOrdenado(raiz,o);
    }
    public void insertarOrdenado(NodoBin n, Object o){
        if((int)o<(int)n.getDato()){
            if (n.getIzq()==null){
                n.setIzq(new NodoBin(o));
            } else {
                insertarOrdenado(n.getIzq(),o);
            }
        } else {
            if ((int)o>(int)n.getDato()){
                if (n.getDer()==null){
                    n.setDer(new NodoBin(o));
                } else {
                    insertarOrdenado(n.getDer(),o);
                }
            }
        }
    }
    public void buscar(NodoBin n, Object o){
        if ((int)o<(int)n.getDato()){
            if (n.getIzq()==null)
                System.out.println("Elemento no existente");
            else
                buscar(n.getIzq(),o);
        }
        else {
            if ((int) o > (int) n.getDato()) {
                if (n.getDer() == null)
                    System.out.println("Elemento no existente");
                else
                    buscar(n.getDer(), o);
            }
            else
                System.out.println("Elemento existe");
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        long start = System.currentTimeMillis();
        ArbolABB arbol = new ArbolABB(rand.nextInt());
        for (int i=0;i<100000;i++)
            arbol.insertar(rand.nextInt());
        /* arbol.insertar(67);
        arbol.insertar(99);
        arbol.insertar(5);
        arbol.insertar(39);
        arbol.insertar(88);
        arbol.insertar(62);
        arbol.insertar(41);
        arbol.insertar(79);
        System.out.printf("Recorrido PreOrden");
        arbol.preOrder();
        System.out.printf("Recorrido PosOrder");
        arbol.posOrder();
        System.out.println("Recorrido inOrder");
        arbol.inOrder();*/
        arbol.inOrder();
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("El tiempo es de "+timeElapsed);
    }
}
