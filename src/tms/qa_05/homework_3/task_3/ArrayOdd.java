package tms.qa_05.homework_3.task_3;

public class ArrayOdd {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) ;
            array[i] = 0;
            {
                //  не работает, не понимаю куда посмотреть
                System.out.println(array[i]);
            }
        }
    }
}