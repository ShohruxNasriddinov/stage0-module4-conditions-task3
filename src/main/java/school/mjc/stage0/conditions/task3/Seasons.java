package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month < 3 && month ==12){
            System.out.println("Winter\n");
        }else if (month>2&&month<=5){
            System.out.println("Spring\n");
        }else if (month>=6 && month<=8){
            System.out.println("Summer\n");
        }else if (month>=9 && month<=11){
            System.out.println("autumn");
        }else {
            System.out.println("wrong number!");
        }
    }
}
