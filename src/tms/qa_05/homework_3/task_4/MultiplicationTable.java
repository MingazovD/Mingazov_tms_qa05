package tms.qa_05.homework_3.task_4;

import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][2];

        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {

                multiplicationTable[i][j] = i + j;

            }

            System.out.println(Arrays.toString(multiplicationTable[i]));
        }
}
}
