package tms.qa_05.homework_3.task_1;

import java.util.Scanner;

// +
public class ArrayFirst {
    public static void main(String[] args) {
        System.out.println("Требуется ввести 3 числа массива"); // эту строку лучше поставить перед циклом
        int[] array = new int[3];
        int largestNumber = 0; // largestNumber, smallestNumber перенеси в строки 19,20
        int smallestNumber = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число массива:");
            array[i] = scanner.nextInt();
        }

        smallestNumber = array[0]; // int smallestNumber = array[0];
        largestNumber = array[0]; // int largestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (smallestNumber > array[i]) {
                smallestNumber = array[i];
            }
            if (largestNumber < array[i]) {
                largestNumber = array[i];
            }
        }
        System.out.println("сумма чисел массива = " + sum);
        System.out.println("наибольшее число массива = " + largestNumber);
        System.out.println("наименьшее число массива = " + smallestNumber);
    }
}
