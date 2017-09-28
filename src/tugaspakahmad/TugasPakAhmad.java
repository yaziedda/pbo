/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspakahmad;

/**
 *
 * @author Dizzay
 */
public class TugasPakAhmad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cara1();
        cara2();
        cara3();
        cara4();
        cara5();
        cara6();
        cara7();
        cara8();
        cara9();
        cara10();
    }
    
    static void cara1(){
        System.out.println("Cara ke satu");
        int a = 1;
        System.out.println(a);
        a = a+1;
        System.out.println(a);
        a = a+1;
        System.out.println(a);
        a = a+1;
        System.out.println(a);
        a = a+1;
        System.out.println(a);
        a = a+1;
        System.out.println(a);
        a = a+1;
        System.out.println(a);
        a = a+1;
        System.out.println(a);
        a = a+1;
        System.out.println(a);
        a = a+1;
        System.out.println(a);
    }
    
    static void cara2(){
        System.out.println("\nCara ke dua");
        int i;
        for(i=1; i <= 10; i++){
            System.out.println(i);
        }
    }
    
    static void cara3(){
        System.out.println("\nCara ke tiga");
        int i;
        int step = 10;
        for(i=10; i <= 100; i++){
            if(i % step == 0){
                System.out.println(i/step);
            }
        }
    }
    
    static void cara4(){
        System.out.println("\nCara ke empat");
        int i;
        int step = 100;
        for(i=100; i <= 1000; i++){
            if(i % step == 0){
                System.out.println(i/step);
            }
        }
    }
    
    static void cara5(){
        System.out.println("\nCara ke lima");
        int i;
        int step = 5;
        for(i=5; i <= 50; i++){
            if(i % step == 0){
                System.out.println(i/step);
            }
        }
    }
    
    static void cara6(){
        System.out.println("\nCara ke enam");
        int i;
        int step = 7;
        for(i=7; i <= 70; i++){
            if(i % step == 0){
                System.out.println(i/step);
            }
        }
    }
    
    static void cara7(){
        System.out.println("\nCara ke tujuh");
        int i = 1;        
        do{
            System.out.println(i);
            i = i+1;
        }while(i <= 10);
    }
    
    static void cara8(){
        System.out.println("\nCara ke delapan");
        int i = 3;       
        int step = 3;
        do{
            System.out.println(i/step);
            i = i+3;
        }while(i <= 30);
    }
    
    static void cara9(){
        System.out.println("\nCara ke sembilan");
        int i = 100;       
        int step = 100;
        do{
            System.out.println(i/step);
            i = i+100;
        }while(i <= 1000);
    }
    
    static void cara10(){
        System.out.println("\nCara ke sepuluh");
        int i = 2;       
        int step = 2;
        do{
            System.out.println(i/step);
            i = i+2;
        }while(i <= 20);
    }
}
