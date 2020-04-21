package tms.qa_05.homework_2.task_1;

public class Run {
    public static void main (String[] args) {
        double startDistance =10;
        double firstDayDistance =10;
        double allDistance =0;
        for ( int trainingDay = 1; trainingDay < 7; trainingDay++){
            startDistance = startDistance * 1.1 ;
            allDistance += startDistance ;
               }
        allDistance = allDistance + firstDayDistance;
        System.out.println ( "За 7 дней тренировок спортсмен пробежит " + allDistance + " километров");
    }
}
