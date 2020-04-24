package tms.qa_05.homework_3.task_4;

import java.util.Arrays;

// не забывай форматировать код
public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][2]; // 10х2 разве хватит для всей таблицы умножени?

        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = i + j  ;
// пустая строка не нужна
            }
// пустая строка не нужна
            System.out.println(Arrays.toString(multiplicationTable[i])); // логику печати лучше вынести за пределы этих циклов
        }
}
}
