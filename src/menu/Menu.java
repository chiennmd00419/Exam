/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import PassengerController.ReservationController;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class Menu {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.createMenu();
    }

    public void createMenu() {
        menu:
        while (true) {
            System.out.println("=========Menu========");
            System.out.println("1. Add reservation.");
            System.out.println("2. Modify passenger records.");
            System.out.println("3. Display passenger records.");
            System.out.println("4. Exit.");
            System.out.println("You choice is :");
            Scanner sc = new Scanner(System.in);
            String strCh = sc.nextLine();
            int choice = 0;
            try {
                choice = Integer.parseInt(strCh);
            } catch (java.lang.NumberFormatException e) {
                System.out.println(e.getMessage());
                System.err.println("->> Please enter a number <<-");
                continue;
            }
            ReservationController rC = new ReservationController();
            if (choice == 4) {
                break;
            } else {
                switch (choice) {
                    case 1:
                        rC.addPassenger();
                        break;
                    case 2:
                        rC.Modify();
                        break;
                    case 3:
                        rC.Display();
                        break;
                    case 4:
                        break menu;
                      

                    default:
                        System.out.println("* Please enter number from 1 to 7 *");
                        break;

                }
            }
        }
    }
}
