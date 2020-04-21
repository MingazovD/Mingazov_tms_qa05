package tms.qa_05.homework_2.task_2;

public class Amoeba {
    public static void main(String[] args) {
        int beginAmoebas = 1;
        int allAmoebas = 0;
        for (int hour = 3; hour < 25; hour += 3) {
            allAmoebas = beginAmoebas *= 2;

            System.out.println("через  " + hour + " часа амеб будет " + allAmoebas);

        }
    }
}

