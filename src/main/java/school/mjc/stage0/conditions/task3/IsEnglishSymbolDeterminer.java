package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (symbol == 'r' || symbol == 'R'){
            System.out.println("English\n");
        }else {
            System.out.println("Non English\n");
        }
    }
}
