package tms.qa_05.homework_2.task_8;

// totalAmount -> TotalAmount
public class totalAmount {
    public static void main(String[] args) {
        int num_1 = 0; // плохие названия переменных
        int num_2 = 0;
        int num_3 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                num_1 += i;
            } else if (i % 2 != 0) {
                num_2 += i;
            }
            
            // общую сумму можно посчитать 1 раз вне цикла
            num_3 = num_1 + num_2;
        }
        System.out.println("сумма четных чисел от 0 до 100 = " + num_1);
        System.out.println("сумма нечетных чисел от 0 до 100 = " + num_2);
        System.out.println("общая сумма всех чисел от 0 до 100 = " + num_3);
    }
}
