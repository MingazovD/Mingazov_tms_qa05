package tms.qa_05.homework_3.task_3;

public class ArrayOdd {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) ; // у тебя в конце строки стоит ';', таким образом получается, что в операторе IF ничего не происходит
            // if () {тело оператора 'if'} - фигурные скобки очень важны
            array[i] = 0;
            {
                //  не работает, не понимаю куда посмотреть
                System.out.println(array[i]);
            }
        }
    }
}
