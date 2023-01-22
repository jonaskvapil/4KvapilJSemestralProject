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
            int[] firstArray = Tools.CreateArray(firstSequence);
            System.out.println("Zadej druhou posloupnost");
            String secondSequence = scanner.nextLine();
            int[] secondArray = Tools.CreateArray(secondSequence);
            System.out.println("Zadej treti posloupnost");
            String thirdSequence = scanner.nextLine();
            int[] thirdArray = Tools.CreateArray(thirdSequence);
            System.out.println("Vysledna posloupnost");
            Tools.SortArray(firstArray, secondArray, thirdArray);
            System.out.println(" ");
            
            } else if (input.equals("n")) {
                pokracovat = false;
            }else{
                System.out.println("Nezadal jste správný parametr, zkuste to znovu.");
            }  
            
        }

    }
  
}
