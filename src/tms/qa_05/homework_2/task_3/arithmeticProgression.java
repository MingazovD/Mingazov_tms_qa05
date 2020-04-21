package tms.qa_05.homework_2.task_3;

public class arithmeticProgression {
    public static void main(String[] args) {
        int num_1 = 1;
        int sum = 0;
        // 256 в отдельную переменную
        while (num_1 <= 256) {
            sum += num_1;
            num_1 *= 2;

        }
        System.out.println("сумма прогрессии = " + sum);
    }
}

