/*******************************************************
 Michael Czumak                                        *
 COP2250C                                              *
 Homework - Chap 7.12 - Page 296                       *
 Duplicate Elimination                                 *
 ******************************************************/

import java.util.Scanner;
public class DupeElimTest {
    public static void main(String[] args) {
        int array[] = new int[5]; //Initialize array
        int counter = 0;
        while (counter < array.length) {
            System.out.println("Please enter an integer between 10-100:");
            Scanner input = new Scanner(System.in);
            int newNumber = input.nextInt();
            switch (counter) {
                case 0:
                    if ((newNumber >= 10) && (newNumber <= 100)) {
                        array[counter] = newNumber;
                        System.out.println(array[counter]);
                        System.out.println();
                        counter++;
                    }
                    else {
                        System.out.println("Invalid number;");
                    }
                    break;
                case 1:
                    if ((newNumber >= 10) && (newNumber <= 100) && (newNumber != array[counter-1]) ) {
                        array[counter] = newNumber;
                        System.out.printf("%d %d", array[counter - 1], array[counter]);
                        System.out.println();
                        counter++;
                    }
                    else {
                        System.out.println("Invalid or Duplicate number;");
                    }
                    break;
                case 2:
                    if ((newNumber >= 10) && (newNumber <= 100) && (newNumber != array[counter-1]) && (newNumber != array[counter-2])) {
                        array[counter] = newNumber;
                        System.out.printf("%d %d %d", array[counter - 2], array[counter - 1], array[counter]);
                        System.out.println();
                        counter++;
                    }
                    else {
                        System.out.println("Invalid or Duplicate number;");
                    }
                    break;
                case 3:
                    if ((newNumber >= 10) && (newNumber <= 100) && (newNumber != array[counter-1]) && (newNumber != array[counter-2]) && (newNumber != array[counter-3])) {
                        array[counter] = newNumber;
                        System.out.printf("%d %d %d %d", array[counter - 3], array[counter-2], array[counter - 1], array[counter] );
                        System.out.println();
                        counter++;
                    }
                    else {
                        System.out.println("Invalid or Duplicate number;");
                    }
                    break;
                case 4:
                    if ((newNumber >= 10) && (newNumber <= 100) && (newNumber != array[counter-1]) && (newNumber != array[counter-2]) && (newNumber != array[counter-3]) && (newNumber != array[counter-4])) {
                        array[counter] = newNumber;
                        System.out.printf("%d %d %d %d %d", array[counter - 4], array[counter - 3], array[counter - 2], array[counter - 1], array[counter]);
                        System.out.println();
                        counter++;
                    }
                    else {
                        System.out.println("Invalid or Duplicate number;");
                    }
                    break;
            }
        }
    }
}