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
            if ((int)o>(int) n.getDato()) {
                if (n.getDer() == null)
                    System.out.println("Elemento no existente");
                else
                    buscar(n.getDer(), o);
            }
            else
                System.out.println("Elemento existe");
        }
    }
    public void buscar (Object o){
        buscar(raiz,o);
    }

    public static void main(String[] args) {
        // Dato de rapidez
        /*
        Random rand = new Random();
        long start = System.currentTimeMillis();
        ArbolABB arbolTiempo = new ArbolABB(rand.nextInt());
        for (int i=0;i<100000;i++)
            arbolTiempo.insertar(rand.nextInt());
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        */
        //System.out.println("El tiempo es de "+timeElapsed);

        //Dato de busqueda
        int numero = 100;
        ArbolABB arbolBusqueda = new ArbolABB(numero);
        arbolBusqueda.insertar(67);
        arbolBusqueda.insertar(99);
        arbolBusqueda.insertar(5);
        arbolBusqueda.insertar(39);
        arbolBusqueda.insertar(88);
        arbolBusqueda.insertar(62);
        arbolBusqueda.insertar(41);
        arbolBusqueda.insertar(79);
        arbolBusqueda.insertar(200);
        System.out.println("Buscando el elemento "+ numero);
        arbolBusqueda.buscar(200);

    }
}
