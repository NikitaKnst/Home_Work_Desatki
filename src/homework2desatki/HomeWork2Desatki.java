/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2desatki;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HomeWork2Desatki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
        System.out.print("Введите трёхзначное число: ");   
        int ThreeNumber = new Scanner(System.in).nextInt();
        int AllSumma = 0;
        System.out.println("Единицы: " + ThreeNumber % 10);
        System.out.println("Десятки: " + ThreeNumber / 10 % 10);
        System.out.println("Сотни: " + ThreeNumber / 100);
        while (ThreeNumber > 0) {
            AllSumma += ThreeNumber % 10;
            ThreeNumber /= 10;
        }
        System.out.println("Сумма цифр: " + AllSumma);
    }
    }