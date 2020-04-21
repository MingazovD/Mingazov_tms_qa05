package tms.qa_05.homework_2.task_7;

public class oddNumbers {
    public static void main (String[] args){
        int sum = 0;
        int num_1 = 1;
        for ( num_1 = 1; num_1 <= 99; num_1 +=2 ){
            sum += num_1;
        }
        System.out.println ( "сумма всех нечетных чисел от 1 до 99 включительно - " + sum );
    }
}
