package ar.edu.unahur.obj2.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args){
        int[] v = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Indice\tValor");
        for(int i=0; i<v.length; i++)
            System.out.println(i+"\t"+v[i]);
        System.out.println();
        System.out.println("Indice\tValor");
        for(int i=v.length-1; i>=0; i--)
            System.out.println(i+"\t"+v[i]);
    }
}




