/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seminarka;

import java.util.Arrays;
import java.util.Scanner;

public class Seminarka {

    public static void SemestralProject(String[] args) {

        String input;
        boolean pokracovat = true;
        Scanner scanner = new Scanner(System.in);
        
        

        while (pokracovat) {
            System.out.println("Pokracovat ve zpracovani (a/n):");
            input = scanner.nextLine();
            if (input.equals("a")){
            System.out.println("Zadej prvni posloupnost");
            String firstSequence = scanner.nextLine();
            int[] firstArray = CreateArray(firstSequence);
            System.out.println("Zadej druhou posloupnost");
            String secondSequence = scanner.nextLine();
            int[] secondArray = CreateArray(secondSequence);
            System.out.println("Zadej treti posloupnost");
            String thirdSequence = scanner.nextLine();
            int[] thirdArray = CreateArray(thirdSequence);
            System.out.println("Vysledna posloupnost");
            SortArray(firstArray, secondArray, thirdArray);
            System.out.println(" ");
            
            } else if (input.equals("n")) {
                pokracovat = false;
            }  
            
        }

    }

    public static int[] CreateArray(String input) {
        String[] numberString = input.split(" ");
        int negativeIndex = 0;
        int[] numbers = new int[numberString.length];

        for (int i = 0; i < numberString.length; i++) {
            numbers[i] = Integer.parseInt(numberString[i]);
            if (numbers[i] < 0) {
                negativeIndex = i;
                break;
            }
        }
        int[] numbersNegative = new int[negativeIndex];

        for (int i = 0; i < numbersNegative.length; i++) {
            numbersNegative[i] = numbers[i];
        }
        return numbersNegative;
    }

    public static void SortArray(int[] firstArray, int[] secondArray, int[] thirdArray) {
        int length = firstArray.length + secondArray.length + thirdArray.length;
        int[] mergedArray = new int[length];
        int pos = 0;
        for (int element : firstArray) {
            mergedArray[pos] = element;
            pos++;
        }
        for (int element : secondArray) {
            mergedArray[pos] = element;
            pos++;
        }
        for (int element : thirdArray) {
            mergedArray[pos] = element;
            pos++;
        }

        Arrays.sort(mergedArray);

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
