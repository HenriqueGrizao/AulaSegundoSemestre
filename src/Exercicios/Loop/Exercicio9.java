
package Exercicios.Loop;

public class Exercicio9 {
    /*Faça um programa que imprima na tela apenas os números ímpares entre 1 e 5*/
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
