package h2;

public class H2_main {

    public static void main(String[] args) {

        boolean x, y, a, b, c;
        int input = 0;

        x = (input == 10 || input == 11);

        y = (input == 11 || input == 1);

        // a: E1 UND E2
        a = (x && y);

        // b: E1 ODER E3
        b = (x || (x != y));

        if (x && y) {
            c = false;
        } else if (x && !y) {
            c = true;
        } else if (!x && y) {
            c = false;
        } else {
            c = true;
        }
    }
}