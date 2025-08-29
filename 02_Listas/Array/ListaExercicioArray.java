import java.util.Scanner;

//Exeercicio de revisao da disciplina Estruturas de Dados (IFBA)
public class ListaExercicioArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /* 1.  Faça um programa em Java que leia um vetor de 5 números inteiros e mostre-os.

        int[] array = new int[5];
        for (int i = 0; i < 5; i ++){
            System.out.print("Digite um número: ");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++){
            System.out.println((i+1) + "º número: " + array[i]);
            }
        */

        /* 2. Faça um programa em Java que leia um vetor de 10 números reais e mostre-os na ordem inversa.
        double[] array2 = new double[10];

        for (int i = 0; i < 10; i ++){
            System.out.print("Digite um número: ");
            array2[i] = input.nextDouble();
        }
        for (int i = 0; i < 10; i ++){
            System.out.println((i+1) + "º número: " + array2[i]);
        }
        */

        /* 3. Faça um programa em Java que leia 4 notas, mostre as notas e a média na tela
        double[] array3 = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i ++){
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            array3[i] = input.nextDouble();
            soma += array3[i];
        }

        System.out.println("Notas digitadas: ");
        for (int i = 0; i < 4; i ++){
            System.out.println( (i+1) + " ª Nota: " + array3[i]);
        }

        System.out.println("Média: " + (soma/4));
        */

        /* 4. Faça um programa em Java que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
        char[] array4 = new char[10];
        
        for (int i = 0; i < 10; i ++){
            System.out.print("Digite uma letra: ");
            array4[i] = input.next().charAt(0);
        }
        
        int consoantes = 0;
        for (int i = 0; i < 10; i ++){
            if (array4[i] != 'a' && array4[i] != 'e' && array4[i] != 'i' && array4[i] != 'o' && array4[i] != 'u') {
                consoantes ++;
            }
        }
        
        System.out.print("Essa palavra tem : " + consoantes + "consoantes");
        */

        //5. Faça um programa em Java que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.
        int[] array5 = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        
    }
}