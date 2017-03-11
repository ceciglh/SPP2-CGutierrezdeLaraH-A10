/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.a10;

import java.util.Scanner;

/**
 *
 * @author cecigutierrez
 */
public class SPP2CGutierrezdeLaraHA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int tamaño = solicitartamaño();
        int [][] a = arreglo ("A", tamaño);
        int [][] b = arreglo ("B", tamaño);
        
        restamatriz (a,b);
        multiplicacionmatriz (a,b);
       
    }
    public static int solicitartamaño(){
        Scanner kb = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Ingresa el tamaño del arreglo: ");
                a = kb.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Reingrese el tamaño del arreglo");
                kb.next();
                flag = true;
            }
        }
        while (flag);
        return a;

    }

    public static int solicitarEntero(){
        Scanner kb = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Escribe un entero: ");
                a = kb.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Variable incorrecta");
                kb.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int [][] arreglo (String a, int tamaño){
        int [][]arreglo = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + a);
        for (int i = 0; i < arreglo.length; i++){
        for (int j = 0; j < arreglo[i].length; j++){
        arreglo [i][j] = solicitarEntero();
        }
        }
        return arreglo;
    }
    public static int [][] restamatriz (int [][]a, int[][]b){
        int [][] r = new int [a.length] [a.length];
        System.out.println("Resta: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        r[i][j] = a[i][j] - b[i][j];
        System.out.println("["+r[i][j]+"]");   
    }
        System.out.println("");   
    }
        return r; 
    }
public static void multiplicacionmatriz(int[][] a,int[][] b){
        int[][]r=new int[a.length][a.length];
        System.out.println("Multiplicación: ");
        for (int i=0; i<r.length; i++){
            for (int j=0; j<r.length; j++){
                for (int z=0; z<r.length; z++){
                    r[i][j]+=(a[i][z]*b[z][j]);
                }
            System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
            }
        }
    }    
}
    
    

