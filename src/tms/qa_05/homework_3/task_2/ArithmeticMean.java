package tms.qa_05.homework_3.task_2;

public class ArithmeticMean {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 6};
        int sum = 0;
        int sumArithmeticMean = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            sumArithmeticMean = sum / 2; // среднее можно посчитать 1 раз за пределами цикла. + не забудь, что результат можно быть дробным
// пустая строка не нужна
        }
        System.out.println("среднее арефмитичесское массива: " + sumArithmeticMean);
// пустая строка не нужна
    }
}


