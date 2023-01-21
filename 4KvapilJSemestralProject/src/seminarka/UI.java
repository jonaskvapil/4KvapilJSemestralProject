/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seminarka;

import java.util.Scanner;

public class UI {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean pokracuj = true;
                
        while (pokracuj) {
            System.out.println("Zadejte číslo programu,který chcete spustit");
            System.out.println("1 pro spusteni vanocni ulohy");
            System.out.println("2 pro spusteni semestralni prace");
            System.out.println("0 pro ukonceni programu.");
            int vyber = sc.nextInt(); 
            switch (vyber) {
                case 1 -> {
                    System.out.println("Spousteni vanocni ulohy");
                    ChristmasJonasKvapil.christmasProject(args);
                    break;
                }
                case 2 -> {
                    System.out.println("Spousteni semestralni praci");
                    Seminarka.SemestralProject(args);
                    
                    break;
                }
                case 0 -> {
                    System.out.println("Ukoncuji program");
                    pokracuj = false;
                    break;
                }
                default -> {
                    System.out.println("Ajeje spatny parametr");
                    System.out.println("Zkus to znovu");
                    break;
                }
            }
        }
        System.out.println("UI je ukonceno");
    }
}
