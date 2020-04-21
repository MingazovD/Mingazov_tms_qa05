package tms.qa_05.homework_2.task_5;

public class inch {
    public static void main(String[] args) {
        double num_1 = 2.54;
        double num_2 = 1;
        for (int num_3 = 1; num_3 <= 20; num_3++) {
            num_2 = num_3 * num_1;

            System.out.println(num_3 + " inch = " + num_2 + " centimeter ");

        }
    }
}
