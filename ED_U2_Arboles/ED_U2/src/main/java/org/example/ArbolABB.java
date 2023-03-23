package org.example;

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

    public static void main(String[] args) {
        ArbolABB arbol = new ArbolABB(56);
        arbol.insertar(67);
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
        arbol.inOrder();
    }
}
