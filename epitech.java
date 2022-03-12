/* Test technique pour école Epitech Strasbourg
réalisé par Lucas Brunner */

import java.util.Scanner;


public class Star {


    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Taille etoile: ");

        int rows = scanner.nextInt();

        System.out.println("----------");

        for (int i = 1; i <= rows; i++) {
            for (int j = rows * 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                if (k == 1 || k == i * 2 - 1 || k == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
        for (int i = 1; i <= 1; i++) {
            for (int j = i; j <= rows * 2; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (rows * 2 - 1); k++) {
                System.out.print(" ");
            }
            for (int l = i; l <= rows * 2; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int h = rows * 6 - 2;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= h; j++) {
                if (j == i || j == (h - i + 1)) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        

        int v = rows * 4+3 ;
        for (int i = 1; i <= rows-1; i++) {
            for (int j = 1; j <= v+ rows-1 ; j++) {
                if (j == rows-i || j == v +i) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        

        for (int i = 1; i <= 1; i++) {
            for (int j = i; j <= rows * 2; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (rows * 2 - 1); k++) {
                System.out.print(" ");
            }
            for (int l = i; l <= rows * 2; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = rows ; i >= 1; i--) {
            for (int j = rows *3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                if (k == 1 || k == i * 2 - 1 || k == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
        scanner.close();
    }
}