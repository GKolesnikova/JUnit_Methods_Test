public class JUnit {
    public static void main(String[] args) {
        int number1 = 43;
        int number2 = 29;

        int sum = addieren( number1, number2 );
        System.out.println(" Die Summe: " + sum);
        // Branch2

        boolean relault = comparison(number1);
        System.out.println("Das Ergebnis ist: " + relault);
    }
    public static int addieren(int x, int y) {
        return x + y;
    }

    public static boolean comparison(int x) {
        return x > 100;
    }

}
