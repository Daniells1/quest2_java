/*
Desafios
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 
 */
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int A;
        A = numero.nextInt();
        int i=0;
        if(A > 0){
while(i<A){
    i=i+2;
    if(i<=A) {
        System.out.println(i);
    }
            }

        }


    }
}