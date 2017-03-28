/*
 1) Escreva um programa que lê um numero entre 1 e 12
e mostre o seu dobro. valide a entrada:
 */
package validacao;
    import java.util.Scanner;
         public class Validacao {
               public static void main(String[] args) {
                   Scanner hs = new Scanner(System.in);

        int num;

        System.out.println("Digite Numero entre 1 e 12: ");
        num = hs.nextInt();

        if (num >=1 && num <= 12) {
            System.out.print("O dobro: " + (num * 2));
        }else {
            System.out.println("Seu numero não é entre 1 e 12");
        }

    }

}
