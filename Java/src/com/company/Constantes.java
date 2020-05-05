/**
 * parte iago
 * import java.util.Scanner;
 *
 * public class Main {
 *
 *   public static void main(String[] args) {
 *
 * 		double soda = 0.45;
 * 		int etanol = 1;
 *
 * 		double s = 0;
 * 		int e = 0;
 *
 * 		int litros = 0;
 *
 * 		Scanner lt = new Scanner (System.in);
 * 		System.out.println("Quantos litros:");
 * 		litros = lt.nextInt();
 *
 * 		while(litros > 0 && litros < 201)
 *                {
 *
 * 			s += soda;
 *
 * 			e += etanol;
 *
 * 			System.out.println("Soda:" + s);//verificaçao - retirar depois
 * 			System.out.println("Etanol:" + e);//verificaçao - retirar depois
 *
 * 			litros--;
 *
 *        }
 *   }
 * }
 */
package com.company;
import java.util.Scanner;
public class Constantes {
    double soda = 0.45;
    int etanol = 1;

    double s = 0;
    int e = 0;

    int litros = 0;

    Scanner lt = new Scanner (System.in);
		System.out.println("Quantos litros:");
    litros = lt.nextInt();

		while(litros > 0 && litros < 201)
    {

        s += soda;

        e += etanol;

        System.out.println("Soda:" + s);//verificaçao - retirar depois
        System.out.println("Etanol:" + e);//verificaçao - retirar depois

        litros--;

    }
}