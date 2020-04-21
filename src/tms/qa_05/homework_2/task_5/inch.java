package tms.qa_05.homework_2.task_5;

// inch -> Inch
public class inch {
    public static void main(String[] args) {
        double num_1 = 2.54; // так себе названия переменных
        double num_2 = 1;
        for (int num_3 = 1; num_3 <= 20; num_3++) {
            num_2 = num_3 * num_1;

            System.out.println(num_3 + " inch = " + num_2 + " centimeter ");
// пустая строка не нужна
        }
    }
}
